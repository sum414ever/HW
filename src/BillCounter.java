public class BillCounter implements Denominations {
    public int num;
    public int five = 0;

    public BillCounter(int num) {
        this.num = num;
    }
    public void checkOnNull(){
        if (num <= 0.00) {
            System.out.println("You don`t have money");
        } else
            System.out.print("You have " + num + " grivens");
        System.out.print("\nAnd how many bills it is: ");
    }

    public void countFiveHundredBills(){
        while (num >= FIVE_HUNDRED) {
            five = num / FIVE_HUNDRED;
            System.out.print(five + "*" + FIVE_HUNDRED + ", ");
            num = num - FIVE_HUNDRED * five;
            break;
        }
    }
    public void countTwoHundredBills(){
        while (num >= TWO_HUNDRED) {
            five = num / TWO_HUNDRED;
            System.out.print(five + "*" + TWO_HUNDRED + ", ");
            num = num - TWO_HUNDRED * five;
            break;
        }
    }
    public void countOneHundredBills(){
        while (num >= ONE_HUNDRED) {
            five = num / ONE_HUNDRED;
            System.out.print(five + "*" + ONE_HUNDRED + ", ");
            num = num - ONE_HUNDRED * five;
            break;
        }
    }
    public void countFiftyBills(){
        while (num >= FIFTY) {
            five = num / FIFTY;
            System.out.print(five + "*" + FIFTY + ", ");
            num = num - FIFTY * five;
            break;
        }
    }
    public void countTwentyBills(){
        while (num >= TWENTY) {
            five = num / TWENTY;
            System.out.print(five + "*" + TWENTY + ", ");
            num = num - TWENTY * five;
            break;
        }
    }
    public void countTenBills(){
        while (num >= TEN) {
            five = num / TEN;
            System.out.print(five + "*" + TEN + ", ");
            num = num - TEN * five;
            break;
        }
    }
    public void countFiveBills(){
        while (num >= FIVE) {
            five = num / FIVE;
            System.out.print(five + "*" + FIVE + ", ");
            num = num - FIVE * five;
            break;
        }
    }
    public void countTwoBills(){
        while (num >= TWO) {
            five = num / TWO;
            System.out.print(five + "*" + TWO + ", ");
            num = num - TWO * five;
            break;
        }
    }
    public void countOneBills(){
        while (num >= ONE) {
            five = num / ONE;
            System.out.print(five + "*" + ONE + ", ");
            num = num - ONE * five;
            break;
        }
    }
}
