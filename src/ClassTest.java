public class ClassTest {
    private int a;
    private int b;
    private char s;
    private double result;

    public ClassTest(int a, int b, char s) {
        this.a = a;
        this.b = b;
        this.s = s;
        calculate();
    }


    public void calculate(){
        if(s == '+')
            result = a + b;
        else
            result = a - b;

        return;
    }

    public double getResult() {
        return result;
    }


    @Override
    public String toString() {
        return "ClassTest{" +
                "a=" + a +
                ", b=" + b +
                ", s=" + s +
                ", result=" + result +
                '}';
    }
}