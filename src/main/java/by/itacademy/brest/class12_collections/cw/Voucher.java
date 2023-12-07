package by.itacademy.brest.class12_collections.cw;

class Voucher {

    private String store;

    Voucher(String store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Voucher)) {
            return false;
        }
        Voucher other = (Voucher) o;
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return storeEquals;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(store);
//    }

    @Override
    public String toString() {
        return "Voucher{" +
                "store='" + store + '\'' +
                '}';
    }
}
