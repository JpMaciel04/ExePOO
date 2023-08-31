// import java.io.IDException;

public class Exemplo {
    public static void main(String[] args) {
        System.out.println ("Olá, mundo!");

        char ch;
        ch = 'X';

        System.out.println("ch contais " +ch );
        ch ++;

        System.out.println("ch is now "+ch);
        ch = 90;


        System.out.println("ch is now "+ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807l;
        boolean tipoBoolean = true;

        System.out.println("Valor do tipoByte = "+tipoByte);
        System.out.println("Valor do tipoShort = "+tipoShort);
        System.out.println("Valor do tipoChar = "+tipoChar);
        System.out.println("Valor do tipoFloat = "+tipoFloat);
        System.out.println("Valor do tipoDouble = "+tipoDouble);
        System.out.println("Valor do tipoInt = "+tipoInt);
        System.out.println("Valor do tipoLong = "+tipoLong);
        System.out.println("Valor do tipoBoolean = "+tipoBoolean);

        //Demonstra sequencia de escape em strings
        System.out.println("\nFirt Line \nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        //Desmonstra valores booleanos
        boolean b;

        b = false;
        //boolean b = false

        System.out.println("b is "+b);
        b = true;
        System.out.println("b is "+b);

        //um valor booleano pode controlar a intrução if
        if (b) System.out.println("This is executed");
        // if (b == true)
        b = false;
        if (b) System.out.println("This is not executed");

        int m;
        m = 10;
        if (m == 10) {
            int n = 20;
            System.out.println("m and n:" + m +""+n);
            m = n * 2;
        }

        System.out.println("m is " + m );

        for (int i = 0; i < 3; i++){
            int j = -1;
            System.out.println("j is :" + j );
            j = 100;
            System.out.println("j is now : "+ j);
        }

        int iresult, irem;
        double dresult, drem;
        iresult = 10/3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("\nResult and remainder of 10 / 3:" + iresult + "" + irem);
        System.out.println("Result and remainder of 10.0 / 3.0" + iresult + "" +irem );

        int i, j; boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("\ni < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("this wont execute");
        if (i >= j) System.out.println("this wont execute");
        if (i > j) System.out.println("this wont execute");
        
    }
}
