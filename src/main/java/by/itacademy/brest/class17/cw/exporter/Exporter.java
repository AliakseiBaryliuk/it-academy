package by.itacademy.brest.class17.cw.exporter;

public class Exporter {
//    private String name;
//
//    public Exporter(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {

        TestInterface t1 = Exporter::prepareExport;

//        TestInterfaceExtra t2 = new Exporter();
        TestInterfaceExtra t2 = Exporter::new;

        final Exporter exporter = t2.doSmth();
//        final Exporter exporter = t2.doSmth("Outside");

        TestInterface t3 = new TestInterface() {
            @Override
            public void doSmth() {
                exporter.export();
            }
        };
//
//        TestInterface t3 = () -> exporter.export();
//
//        TestInterface t3 = exporter::export;


        t3.doSmth();
    }


    static void prepareExport() {
        System.out.println("Export has been prepared");
    }

    void export() {
        System.out.println("Export has been exported");
    }

    interface TestInterface {
        void doSmth();
    }

    interface TestInterfaceExtra {
        Exporter doSmth();
    }

//    interface TestInterfaceExtra {
//        Exporter doSmth(String name);
//    }

}
