import java.util.ArrayList;

public class RunTime<minWorkTime> {

    public long timeStartApp = 0;
    public long runTime = 0;
    public long a = 0;
    public long minWorkTime = 0;
    public long maxWorkTime = 0;
    public long sum = 0;

    public void oneRun(long num) {

        timeStartApp = System.currentTimeMillis();
        NumberOfBills n = new NumberOfBills(num);
        n.countBills();
        runTime = System.currentTimeMillis() - timeStartApp;
        System.out.println("\nThe app work " + runTime + " miliseconds\n");
    }

    public void diapasonRun(long minInDiapason, long maxInDiapason) {

        ArrayList<Long> timerArray = new ArrayList<>();


        for (int i = 0; i < maxInDiapason - minInDiapason + 1; i++) {
            a = minInDiapason + i;

            oneRun(a);
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


