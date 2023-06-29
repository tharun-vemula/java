package anotherExample;

public class OtherPackage {
    OtherPackage(){
        example.Protection p = new example.Protection();
        System.out.println("Other Package Constructor");
        //Package only
        //System.out.println("n : "+n);
       // class only
       // System.out.println("n private : "+n_pri);
       //class or subclass or package only
        //System.out.println("n protected: "+p.n_pro);
        System.out.println("n : public"+p.n_pub);
    }
}
