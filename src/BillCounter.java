public class BillCounter {
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

    public void countBills(int den) {
        if (num >= den) {
            five = num / den;
            System.out.print(five + "*" + den + ", ");
            num = num - den * five;
        }
    }
}
