public class OperadoresRacionais {
    public static void main(String[] args) throws Exception {
        
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Adriano";
        String s2 = "Leo";
        String s3 = "Guilherme";
        boolean b1 = true;
        boolean b2 = false;
        
        long l1 = 1597;
        long l2 = 8997;
        byte y1 = 1;
        byte y2 = 25;

        //# int
        System.out.println("i1 == i2 " + (i1 == i2) );
        System.out.println("i1 != i2 " + (i1 != i2) );
        System.out.println("i1 >= i2 " + (i1 >= i2) );
        System.out.println("i1 <= i2 " + (i1 <= i2) );

        //# float
        System.out.println("f1 == f2 " + (f1 == f2) );
        System.out.println("f1 != f2 " + (f1 != f2) );
        System.out.println("f1 >= f2 " + (f1 >= f2) );
        System.out.println("f1 <= f2 " + (f1 <= f2) );

        //# char
        System.out.println("c1 == c2 " + (c1 == c2) );
        System.out.println("c1 != c2 " + (c1 != c2) );
        System.out.println("c1 >= c2 " + (c1 >= c2) );
        System.out.println("c1 <= c2 " + (c1 <= c2) );

        //# String
        System.out.println("s1 == s2 " + (s1 == s2) );
        System.out.println("s1 == s3 " + (s1 == s3) );
        System.out.println("s1 != s2 " + (s1 != s2) );
        //System.out.println("s1 >= s3 " + (s1 >= s3) ); Não tem como fazer maior ou menor com string.
       // System.out.println("s1 <= s2 " + (s1 <= s2) );

       //# boolean
       System.out.println("b1 == b2 " + (b1 == b2) );
       System.out.println("b1 != b2 " + (b1 != b2) );
       //System.out.println("b1 >= b2 " + (b1 >= b2) ); Não tem como fazer maior ou menor com string.
       // System.out.println("b1 <= b2 " + (b1 <= b2) );


       // Não conseguimos comparar tamanhos entre String e valores numerios.
    }  // Com o 'char' conseguimos comparar com numeros, por conta de ser baixo nivel é um byte(numerico).
}
