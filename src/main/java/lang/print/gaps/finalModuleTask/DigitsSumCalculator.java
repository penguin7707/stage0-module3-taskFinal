package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number/1000;
        int second = (number-first)/100;
        int third = (number-first-second)/10;
        int fourth = (number-first-second)%10;
        System.out.println(first+second+third+fourth);
    }
}
