public class Main {

    public static void main(String[] args) {

        Task1 test = new Task1(1, 2);
        System.out.println(test.getTemp1());
        System.out.println(test.getTemp2());
        test.findMaxValue();
        test.showVariables();
        test.findSum();
        test.setTemp1(10);
        test.setTemp2(9);
        System.out.println(test.getTemp1());
        System.out.println(test.getTemp2());
        test.findMaxValue();
        test.showVariables();
        test.findSum();
        test.setTemp1(5);
        test.setTemp2(5);
        System.out.println(test.getTemp1());
        System.out.println(test.getTemp2());
        test.findMaxValue();
        test.showVariables();
        test.findSum();
    }
}