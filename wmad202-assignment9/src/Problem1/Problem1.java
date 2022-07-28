package Problem1;

import java.util.function.Consumer;

public class Problem1 implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.println("===================Interface Consumer==================");
        System.out.println("Hello world, I am windows" + i);

    }

    }

