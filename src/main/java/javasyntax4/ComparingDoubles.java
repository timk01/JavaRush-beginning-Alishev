package javasyntax4;

public class ComparingDoubles {
    public static void main(String[] args) {
        double d1 = 0;
        for (int i = 1; i <= 8; i++) {
            d1 += 0.1;
        }

        double d2 = 0.1 * 8;

        System.out.println(d1); //0.7999999999999999
        System.out.println(d2);

        //верно с оговорками
        double epsilon = 0.000001d;
        if(Math.abs(d1 - d2) < epsilon) {
            System.out.println("more or less equals");
        }

        //org.apache.commons.math3.util.Precision (better)
        //Precision.equals(d1, d2)

        //com.google.common.math (guava)
        //DoubleMath.fuzzyEquals(d1, d2, epsilon)

        //junit
        /*
        double epsilon = 0.000001d;
        assertEquals(d1, d2, epsilon);
         */
    }
}
