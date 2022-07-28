package Problem2;

public class Problem2 {
public static void main(String[] args) {
    greet<String> T= (i)-> "Hello " + i +". Thank you for visiting us";
    System.out.println(T.greet("Ramneek"));

    greet<Integer> H=(j) -> j;
    System.out.println("My age is "+(H.greet(20)));

}

    }

