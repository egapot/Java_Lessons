package lesson_9.task_2;

public class Methods {
    int a;
    int b;

    public Methods (int a, int b){
        try {


            if (a < 0 & b < 0) {
                throw new IllegalArgumentException();
            } else if (a == 0 & b != 0) {
                throw new ArithmeticException();
            } else if (a != 0 & b == 0) {
                throw new ArithmeticException();
            } else if (a == 0 & b == 0) {
                throw new IllegalArgumentException();
            } else if (a > 0 & b > 0) {
                throw new MyException("You will not pass");
            }else {
                this.a = a;
                this.b = b;
            }
        }catch (ArithmeticException | IllegalArgumentException | MyException e){
            e.printStackTrace();
        }
    }

    public int division () {
        return a/b;
    }

    public int adding (){
        return a+b;
    }

    public int multiplication (){
        return a*b;
    }

    public int subtraction (){
        return a-b;
    }
}
