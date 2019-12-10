/// Liskov principle of substitution
package embeddingvsinheritence;

/**
 *
 * @author Ajay
 */
public class Embeddingvsinheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.a = 10;
        c1.b = 20;
        
        C2 c2 = new C2();
        System.out.println(c1.a + " " + c1.b);
//        c2.a = 100;
//        c2.b = 200;
//        c2.c = 300;
//        c2.d = 400;
//       
     //   clientof(c1);
        clientof(c2);
        System.out.println(c1.a + " " + c1.b);
       System.out.println(c2.a + " " + c2.b + " " + c2.c + " " + c2.d);
    }

    static void clientof(C2 h) {
        h.a = 1;
        h.b = 1;
       // System.out.println(h.a+" "+h.b);
    }
   
}

class C1 {

    int a;
    int b;

}

class C2 extends C1 {

    int c;
    int d;
}
