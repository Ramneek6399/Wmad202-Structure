package ca.ciccc.wmad.assignment2.Question8;

public class Question8 {
    public static void test(){
        final int TRIES= 10000;
        int hits=0;

        for ( int  i=1; i<TRIES;i++) {
            double r = Math.random();
            double x= -1+2*r;
            r= Math.random();
            double y= -1+2*r;

            if(x*x +y*y <=1){
                hits++;
            }
            if (i==100){
                double PIestimate= 4.0*hits/TRIES;
                System.out.println("estimate of PI for "+TRIES+"tries is"+PIestimate);

            }
            if (i == 1000){
                double PIestimate =4.0*hits /TRIES;
                System.out.println("estimate of PI for "+TRIES+"tries is"+PIestimate);

            }
        }
        double PIestimate =4.0*hits /TRIES;
        System.out.println("estimate of PI for "+TRIES+"tries is"+PIestimate);
    }
}
