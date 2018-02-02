package macias.nelson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Rectangulo perimetro = new Rectangulo(4, 5);
        Rectangulo area = new Rectangulo(4, 5);


        int num = perimetro.calcularPerimetro();
        System.out.println(num);

        int num1=area.calcularArea();
        System.out.println(num1);


    }
}
