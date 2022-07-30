package Problem1;

public class TestExceptions {

    class ExceptionA1 extends Exception{
        ExceptionA1(String message){
            super(message);
        }
    }

    class ExceptionA2 extends Exception{
        ExceptionA2(String message){
            super(message);
        }
    }

    class ExceptionA3 extends Exception{
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
        TestExceptions.A a= new TestExceptions.A();
        try {
            a.methodA1();
        }
        catch ( TestExceptions.ExceptionA1 e){
            System.out.println(e.getMessage());
        }
    }
    public void testExceptions2(){
        int exceptions= 0;
        TestExceptions.A a= new TestExceptions.A();
        try {
            a.methodA1();
        }
        catch ( TestExceptions.ExceptionA1 e){
            exceptions++;
            System.out.println(e.getMessage());
        }

        try {
            a.methodA2();
        }
        catch (TestExceptions.ExceptionA2 e){
            exceptions++;
            System.out.println( e.getMessage());
        }

        try {
            a.methodA3();
        }
        catch (TestExceptions.ExceptionA3 e){
            exceptions++;
            System.out.println(e.getMessage());
        }
        System.out.println("Total: "+ exceptions);
    }
    public static void main(String[] args) {
        TestExceptions test= new TestExceptions();
        test.testExceptions1();
        test.testExceptions2();

    }

}
