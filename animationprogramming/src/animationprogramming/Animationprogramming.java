package animationprogramming;

import com.rajeshpatkar.*;

public class Animationprogramming {

    public static void main(String[] args) {
        Anim a1 = new Anim();
        a1.vl(0, 0, '*');
        a1.sl(0, 0, '*');
        a1.vl(0, 4, '*');
        a1.sl(4, 0, '*');

    }
}

class Anim {

    void vl(int x, int y, char s) {
        for (int i = 0; i < 5; i++) {
            Console.gotoxy(x, y + i);
            Console.putchar(s);
            Console.sleep(1000);
        }
    }

    void sl(int x, int y, char s) {

        for (int j = 0; j < 5; j++) {
            Console.gotoxy(x + j, y);
            Console.putchar(s);
            Console.sleep(1000);

        }
    }
}
