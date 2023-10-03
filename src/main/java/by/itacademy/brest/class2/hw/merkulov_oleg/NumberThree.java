package by.itacademy.brest.class2.hw.merkulov_oleg;

public class NumberThree {
    public static void main(String[] args) {
        int a = 3689;
        int b = a / 1000;
        int c = a % 1000 / 100;
        int d = a % 100 / 10;
        int e = a % 10;

        int temp = Integer.MIN_VALUE;
        temp = setTemp(b, temp);
        temp = setTemp(c, temp);
        temp = setTemp(d, temp);
        //Have you tried this number 3689?
        /*
        The problem is that primitives are passed by value
        and in this case nothing will happen to the temp variable.
        In this solution you need to write the same as in the previous lines temp = setTemp(e , temp);
         */
        setTemp(e, temp);
        // empty line for better readability
        if (temp % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("not even");
        }
    }


    private static int setTemp(int c, int temp) {
        if (c > temp) {
            temp = c;
        }
        return temp;
    }
}
//score
//6