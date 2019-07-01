public class BillCounter {
    public int num;

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

    public void countBills(int denomination) {
        if (num >= denomination) {
            System.out.print(num / denomination + "*" + denomination + ", ");
            num = num - denomination * (num / denomination);
        }
    }
}
