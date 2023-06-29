package example;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("SamePackage Constructor");
        System.out.println("n : "+p.n);
       // class only
       // System.out.println("n private : "+n_pri);
        System.out.println("n protected: "+p.n_pro);
        System.out.println("n : public"+p.n_pub);
    }
}
