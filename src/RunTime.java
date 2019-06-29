import java.util.ArrayList;

public class RunTime {

    public long timeStartApp = 0;
    public long runTime = 0;
    public long a = 0;
    public long minWorkTime = 0;
    public long maxWorkTime = 0;
    public long averageWorkTime = 0;

    public void oneRun(long num) {

        timeStartApp = System.currentTimeMillis();
        NumberOfBills n = new NumberOfBills(num);
        n.NumberOfBills();
        runTime = System.currentTimeMillis() - timeStartApp;
        System.out.println("\nThe app work " + runTime + " miliseconds\n");
    }

    public void diapasonRun(long minInDiapason, long maxInDiapason) {

        ArrayList<Long> timerArray = new ArrayList<>();

        for (int i = 0; i < maxInDiapason - minInDiapason + 1; i++) {
            a = minInDiapason + i;
            oneRun(a);
            timerArray.add(runTime);
            if (a > maxInDiapason) break;
        }
        for (int i = 0; i < timerArray.size(); i++) {
            long sum = 0;
            if (minWorkTime > timerArray.get(i)) {
                minWorkTime = timerArray.get(i);
            }
            if (maxWorkTime < timerArray.get(i)) {
                maxWorkTime = timerArray.get(i);
            }
            sum += sum + timerArray.get(i);
            averageWorkTime = sum / timerArray.size();
        }
        System.out.println("Minimal work time is " + minWorkTime);
        System.out.println("Maximal work time is " + maxWorkTime);
        System.out.println("Average work time is " + averageWorkTime);
    }

}


