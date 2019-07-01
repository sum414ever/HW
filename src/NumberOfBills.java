public class NumberOfBills implements Denominations {
    public int num;
    public int five = 0;

    public NumberOfBills(int num) {
        this.num = num;
    }
    public void checkOnNull(){
        if (num <= 0.00) {
            System.out.println("You don`t have money");
        } else
            System.out.print("You have " + num + " grivens");
        System.out.print("\nAnd how many bills it is: ");
    }

    public void countBills() {
        while (num >= FIVE_HUNDRED) {
            five = num / FIVE_HUNDRED;
            System.out.print(five + "*" + FIVE_HUNDRED + ", ");
            num = num - FIVE_HUNDRED * five;
            break;
        }
        while (num >= TWO_HUNDRED) {
            five = num / TWO_HUNDRED;
            System.out.print(five + "*" + TWO_HUNDRED + ", ");
            num = num - TWO_HUNDRED * five;
            break;
        }
        while (num >= ONE_HUNDRED) {
            five = num / ONE_HUNDRED;
            System.out.print(five + "*" + ONE_HUNDRED + ", ");
            num = num - ONE_HUNDRED * five;
            break;
        }
        while (num >= FIFTY) {
            five = num / FIFTY;
            System.out.print(five + "*" + FIFTY + ", ");
            num = num - FIFTY * five;
            break;
        }
        while (num >= TWENTY) {
            five = num / TWENTY;
            System.out.print(five + "*" + TWENTY + ", ");
            num = num - TWENTY * five;
            break;
        }
        while (num >= TEN) {
            five = num / TEN;
            System.out.print(five + "*" + TEN + ", ");
            num = num - TEN * five;
            break;
        }
        while (num >= FIVE) {
            five = num / FIVE;
            System.out.print(five + "*" + FIVE + ", ");
            num = num - FIVE * five;
            break;
        }
        while (num >= TWO) {
            five = num / TWO;
            System.out.print(five + "*" + TWO + ", ");
            num = num - TWO * five;
            break;
        }
        while (num >= ONE) {
            five = num / ONE;
            System.out.print(five + "*" + ONE + ", ");
            num = num - ONE * five;
            break;
        }
    }
}
