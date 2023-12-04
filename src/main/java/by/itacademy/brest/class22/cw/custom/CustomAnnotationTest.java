package by.itacademy.brest.class22.cw.custom;

public class CustomAnnotationTest {

        public static void main(String[] args) {
            One one = new One();
            Two two = new Two();
            VersionPostProcessor.processAnnotation(one);
            VersionPostProcessor.processAnnotation(two);

            System.out.println(one.getVersion());
            System.out.println(two.getVersion());

            System.out.println("---------------------");

            VersionPostProcessor.methodProcessing(one);

            System.out.println(one.getVersion());
        }
}
