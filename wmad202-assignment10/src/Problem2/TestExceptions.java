package Problem2;

public class TestExceptions {

    class ExceptionA1 extends Exception{
        ExceptionA1(String message){
            super(message);
        }
    }

    class ExceptionA2 extends ExceptionA1{
        ExceptionA2(String message){
            super(message);
        }
    }

    class ExceptionA3 extends ExceptionA2{
        ExceptionA3(String message){
            super(message);
        }
    }

    class A {

        public void methodA1() throws ExceptionA1 {
            System.out.println("MethodA1 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA1("Exception A1 raised!");
            }
        }

        public void methodA2() throws ExceptionA2 {
            System.out.println("MethodA2 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA2("Exception A2 raised!");
            }

        }

        public void methodA3() throws ExceptionA3 {

            System.out.println("MethodA3 running");

            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA3("Exception A3 raised!");
            }

        }
    }

    public void testExceptions1(){
        A a= new A();
        try {
            a.methodA1();
        }
        catch (ExceptionA1 e){
            System.out.println(e.getMessage());
        }
    }
    public void testExceptions2(){
        int exceptions= 0;
        A a= new A();
        try {
            a.methodA1();
        }
        catch (ExceptionA1 e){
            exceptions++;
            System.out.println(e.getMessage());
        }

        try {
            a.methodA2();
        }
        catch (ExceptionA2 e){
            exceptions++;
            System.out.println( e.getMessage());
        }

        try {
            a.methodA3();
        }
        catch (ExceptionA3 e){
            exceptions++;
            System.out.println(e.getMessage());
        }
        System.out.println("Total: "+ exceptions);
    }
    public static void main(String[] args) {
        Problem1.TestExceptions test= new Problem1.TestExceptions();
        test.testExceptions1();
        test.testExceptions2();

    }

}

