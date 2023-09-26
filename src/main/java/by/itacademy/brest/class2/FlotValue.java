package by.itacademy.brest.class2;

public class FlotValue {
    public static void main(String []args){
//        float piValue = (float)Math.PI;
//        double piValueExt = Math.PI;
//        System.out.println("Float value: " + piValue );
//        System.out.println("Double value: " + piValueExt );

        float amount = 1.0000005F;
        float avalue = 0.0000004F;
        float result = amount - avalue;
        System.out.println(result);

//        double sqrt = Math.sqrt(-4);
//        System.out.println(sqrt + 1);
//        if (Double.isNaN(sqrt)) {
//            System.out.println("So sad");
//        }
//        System.out.println(Double.NaN == sqrt);
    }
}
/*
    Вот что ещё должно быть важно и интересно: даже в документации сказано:
    «This data type should never be used for precise values, such as currency.
    For that, you will need to use the java.math.BigDecimal class instead.Numbers
    and Strings covers BigDecimal and other useful classes provided by the Java platform.».
    То есть деньги в float и double не надо вычислять.
 */