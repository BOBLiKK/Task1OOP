import java.util.Objects;
public class Task1 {
    private int temp1;
    private int temp2;

    public Task1(){
    }
    public Task1(int temp1, int temp2) {
        this.temp1 = temp1;
        this.temp2 = temp2;
    }
    public int getTemp1() {
        return temp1;
    }
    public int getTemp2() {
        return temp2;
    }
    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }
    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }
    public void showVariables(){
        System.out.println("First variable: " + getTemp1());
        System.out.println("Second variable: " + getTemp2());
    }
    public void findSum(){
        int sum;
        sum = getTemp1() + getTemp2();
        System.out.println("Sum of variables: " + sum);
    }
    public void findMaxValue(){
        if(getTemp1() > getTemp2()){
            System.out.println("Max value: " + getTemp1());
        }
        if(getTemp2() > getTemp1()){
            System.out.println("Max value: " + getTemp2());
        }
        if(getTemp2() == getTemp1()){
            System.out.println("Variables have the same value: " + getTemp1());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task1 task1)) return false;
        return getTemp1() == task1.getTemp1() && getTemp2() == task1.getTemp2();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTemp1(), getTemp2());
    }
}
