package Problem3;


import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;


public class TestExceptions2<T> {

    public static class Container<T> {
        List<T> list;

        Container(List<T> list){
            this.list = list;
        }

        List<T> getList(){
            return list;
        }
    }
    public static <T> int evaluateList(Container<T> container, Predicate<T>
            predicate1, Predicate<T> predicate2 ) throws Predicate2{

        int count = 0;

        for(T t: container.getList()){
            if (predicate1.test(t)) {
                if(predicate2.test(t)) {
                    count++;
                } else {
                    throw new Predicate2("Predicate2 Exception");
                }
            } else {
                throw new Predicate1("Predicate1 Exception");
            }
            }
        return count;
        }
    public static void test(){

        ArrayList<String> list = new ArrayList<String>
                (Arrays.asList("Exceptions", "are", "not", "fun", "kidding", "they", "are",
                        "fun"));

        Container<String> container = new Container<>(list);
        try {
            TestExceptions2.evaluateList(container, s->s.length()>4, s->s.contains("a"));

        }
        catch ( Predicate1| Predicate2 e){
            System.out.println(e.getMessage());
        }

    }


}