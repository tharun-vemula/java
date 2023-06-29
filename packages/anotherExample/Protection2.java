package anotherExample;
import example.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("Derived another package Constructor");
        //Within Package
        //System.out.println("n : "+n);
       // class only
       // System.out.println("n private : "+n_pri);
        System.out.println("n protected: "+n_pro);
        System.out.println("n : public"+n_pub);
    }
}
