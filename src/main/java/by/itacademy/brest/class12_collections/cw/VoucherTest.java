package by.itacademy.brest.class12_collections.cw;

import java.util.HashMap;
import java.util.Map;

public class VoucherTest {
    public static void main(String[] args) {
        Map<Voucher, String> vouchers = new HashMap<>();

        Voucher voucher1 = new Voucher("1");
        vouchers.put(voucher1, "one");
        vouchers.put(new Voucher("2"), "two");
        vouchers.put(new Voucher("3"), "three");

        Voucher voucher2 = new Voucher("1");

        System.out.println(voucher1.equals(voucher2));


        System.out.println(vouchers.get(voucher2));
    }
}
