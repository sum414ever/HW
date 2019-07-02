public class BillCounter implements Denominations {
    public int num;

    public BillCounter(int num) {
        this.num = num;
    }
    public void checkOnNull(){
        if (num <= 0.00) {
            System.out.println("You don`t have money");
        } else
            System.out.print("You have " + num + " UAH");
        System.out.print("\nAnd how many bills it is: ");
    }

    public void countBills() {

        int[] denominations = new int[]{FIVE_HUNDRED, TWO_HUNDRED, ONE_HUNDRED, FIFTY, TWENTY, TEN, FIVE, TWO, ONE};
        int[] denominationCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (num >= denominations[i]) {
                denominationCounter[i] = num / denominations[i];
                num = num - denominationCounter[i] * denominations[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (denominationCounter[i] != 0) {
                System.out.print(denominations[i] + "*"
                        + denominationCounter[i] + " ,");
            }
        }
    }
}

