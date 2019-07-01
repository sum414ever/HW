import java.util.ArrayList;
import java.util.List;

public class LaunchCreator {

    public long timeStartApp = 0;
    public long runTime = 0;
    public long minWorkTime = 0;
    public long maxWorkTime = 0;
    public int a = 0;
    public int sum = 0;

    public void createOneRun(long num) {
        timeStartApp = System.currentTimeMillis();
        BillCounter n = new BillCounter((int) num);
        n.checkOnNull();
        n.countFiveHundredBills();
        n.countTwoHundredBills();
        n.countOneHundredBills();
        n.countFiftyBills();
        n.countTwentyBills();
        n.countTenBills();
        n.countFiveBills();
        n.countTwoBills();
        n.countOneBills();
        runTime = System.currentTimeMillis() - timeStartApp;
        System.out.println("\nThe app work " + runTime + " miliseconds\n");
    }
    public void createDiapasonRun(int minInDiapason, int maxInDiapason) {

        List<Long> timerArray = new ArrayList<>();
        for (int i = 0; i < maxInDiapason - minInDiapason + 1; i++) {
            a = minInDiapason + i;
            createOneRun(a);
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


