package ca.ciccc.wmad202.Assignment6.main;

import ca.ciccc.wmad202.Assignment6.Problem1.Cloth;
import ca.ciccc.wmad202.Assignment6.Problem1.Drink;
import ca.ciccc.wmad202.Assignment6.Problem1.Food;
import ca.ciccc.wmad202.Assignment6.Problem1.Material;
import ca.ciccc.wmad202.Assignment6.Problem2.Cart;
import ca.ciccc.wmad202.Assignment6.Problem2.ShoppingCart;
import ca.ciccc.wmad202.Assignment6.problem0.Product;

import java.util.ArrayList;

public class Assignment6Driver {
    public static void run() {
        Product product = new Product(110, "Deit Pepsi", 2, "USA");
        System.out.println(product.toString());

        System.out.println("===========Drink============");

        Drink drink = new Drink(12, "pepsi", 4, "USA", true, 4);
        System.out.println(drink.toString());

        System.out.println("==============Food===========");
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Chicken Breast");
        ingredients.add("oil");
        ingredients.add("Cream");
        ingredients.add("Spices");

        Food food= new Food(
                12,
                "Butter Chicken",
                20,
                "Canada",
                500,
                ingredients,
                4
                );
        System.out.println(food.toString());
        System.out.println("=============Cloth==========");
        ArrayList<Material> clothMAterial= new ArrayList<>();
        Material M=new Material(123,"Cotton");
        Material M1= new Material(545,"Rayon");
        clothMAterial.add(M);
        clothMAterial.add(M1);
        Cloth cloth= new Cloth(12,
                "Pant",
                30,
                "Korea",
                clothMAterial
                );
        System.out.println(cloth.toString());



       // Cloth cloth= new Cloth();
        //System.out.println();

        Drink drink1= new Drink(412,"Pepsi", 2,"USA",false, 150);
        Drink drink2= new Drink(412,"Pepsi", 2,"USA",false, 150);
        Drink drink3= new Drink(412,"Pepsi", 2,"USA",false, 150);
        Drink drink4=new Drink(183,"Ginder zero",3,"Canada",true,200);
        ArrayList<String> f= new ArrayList<>();
        f.add("Chicken");
        f.add("Cheese");
        f.add("oil");
        Food food1= new Food(100,"Chichen",85,"Canada",350,f,4);
        Food food2= new Food(100,"Chichen",85,"Canada",350,f,4);
        ArrayList<String> g= new ArrayList<>();
        g.add("Pasta");
        g.add("meet");
        g.add("spinach");
        Food food3=new Food(101,"Pasta",18,"Canada",250,g,2);
        Food food4=new Food(101,"Pasta",18,"Canada",250,g,2);
        Material m1= new Material(10, "Cotton");
        Material m2= new Material(11,"Nylon");
        ArrayList<Material> m= new ArrayList<>();
        m.add(m1);
        m.add(m2);
        Cloth cloth1= new Cloth(701,"T-shirt",15,"China",m);

        ShoppingCart s= new ShoppingCart();

        s.addProducts(drink1);
        s.addProducts(drink2);

        s.addProducts(drink3);
        s.addProducts(drink4);
        s.addProducts(food1);
        s.addProducts(food2);
        s.addProducts(food3);
        s.addProducts(food4);
        s.addProducts(cloth1);
        System.out.println("=======================ShoppingCart==============");
        System.out.println("Total Price: " +s.TotalPrice());
        s.printReciept();
        s.printRecieptInDetail();








    }
}