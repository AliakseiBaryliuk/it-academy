package by.itacademy.brest.class11.cw.interfaceexml;

public class DeliveryProcessor {
    private static int routNumber;
    private static DeliveryDetails[] deliverables = new DeliveryDetails[10];

    static {
        deliverables[0] = new DeliveryDetails(new PlaneRoute(), "plane");
        deliverables[1] = new DeliveryDetails(new ShipRoute(), "ship");
    }

    public void deliver(String by) {
        Deliverable delivery = getDelivery(by);

        if (delivery != null) {
            delivery.deliver();
        } else {
            System.out.println("No delivery for this type");
        }
    }

    private Deliverable getDelivery(String by) {
        for (DeliveryDetails deliverable : deliverables) {
            if (deliverable != null && deliverable.getBy().equals(by)) {

                System.out.println("Rout number is " + deliverable.order);
                return deliverable.getDeliverable();
            }
        }
        return null;
    }

    static class DeliveryDetails {
        private Deliverable deliverable;
        private String by;
        private int order;

        public DeliveryDetails(Deliverable deliverable, String by) {
            this.deliverable = deliverable;
            this.by = by;
            order = ++routNumber;
        }

        public Deliverable getDeliverable() {
            return deliverable;
        }

        public String getBy() {
            return by;
        }

        public int getOrder() {
            return order;
        }
    }

    public static void addDeliverables(Deliverable deliverable, String by) {
        for (int i = 0; i < deliverables.length; i++) {
            if (deliverables[i] == null){
                deliverables[i] = new DeliveryDetails(deliverable, by);
                return;
            }
        }
        System.out.println("Delivery types exceeded");
    }
}
