import java.util.ArrayList;
import java.util.List;

public class LaunchCreator implements Denominations{

    public long timeStartApp;
    public long runTime;
    public long minWorkTime;
    public long maxWorkTime;
    public int sum;

    public void createOneRun(long num) {
        timeStartApp = System.currentTimeMillis();
        BillCounter n = new BillCounter((int) num);
        n.checkOnNull();
        n.countBills();
        runTime = System.currentTimeMillis() - timeStartApp;
        System.out.println("\nThe app work " + runTime + " miliseconds\n");
    }
    public void createDiapasonRun(int minInDiapason, int maxInDiapason) {

        List<Long> timerArray = new ArrayList<>();
        for (int i = 0; i < maxInDiapason - minInDiapason + 1; i++) {
            createOneRun(minInDiapason + i);
            timerArray.add(runTime);
            sum += runTime;
            if (minWorkTime > runTime) {
                minWorkTime = runTime;
            }
            if (maxWorkTime < runTime) {
                maxWorkTime = runTime;
            }
        }
        System.out.println("Minimal work time is " + minWorkTime);
        System.out.println("Maximal work time is " + maxWorkTime);
        System.out.println("Average work time is " + sum / timerArray.size());
    }
}


