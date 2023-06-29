package example;

public class Derived extends Protection {
    Derived(){
        System.out.println("Derived Constructor");
        System.out.println("n : "+n);
       // class only
       // System.out.println("n private : "+n_pri);
        System.out.println("n protected: "+n_pro);
        System.out.println("n : public"+n_pub);
    }
}
