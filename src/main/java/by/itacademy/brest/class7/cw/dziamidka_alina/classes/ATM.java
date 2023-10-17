package by.itacademy.brest.class7.cw.dziamidka_alina.classes;

import java.util.List;

public class ATM {

    //Названия переменных ни о чем не говорят если ты не знаешь о чем речь (пишем для других!!!) nominal20
    // В таких случаях используется класс объекты
    private List<Banknote> banknotes;
//
//    public ATM(int n20, int n50, int n100) {
//        addBanknote(n20, Nominal.TWENTY);
//        addBanknote(n50, Nominal.FIFTY);
//        addBanknote(n100, Nominal.ONE_HUNDRED);
//    }
//
//    private void addBanknote(int n20, Nominal nominal) {
//        for (int i = 0; i < n20; i++) {
//            banknotes.add(new Banknote(nominal));
//        }
//    }
//
//    public boolean isValid(Integer amount) {
//        int n20Count = 1;
//        int newAmount = amount - 20;
//        boolean isValid = false;
//
//        if (amount % 20 == 0 || amount % 50 == 0) {
//            return true;
//        }
//
//        while (n20Count <= n20) {
//            if (isValid) {
//                return true;
//            }
//            while (!isValid) {
//                isValid = true;
//                // If не нужен isValid = newAmount % 50 == 0;
//                if ((newAmount) % 50 != 0) {
//                    isValid = false;
//                }
//                newAmount -= 20;
//                n20Count += 1;
//                if (newAmount < 0) {
//                    return false;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean validBanknote(int amount) {
//        int count = 0;
//        int minN100 = Math.min(amount / 100, n100);
//        int minN50 = Math.min((amount - (minN100 * 100)) / 50, n50);
//        int newN20 = (amount - (minN100 * 100 + minN50 * 50)) / 20;
//
//        if ((amount - (minN100 * 100 + minN50 * 50 + newN20 * 20)) % 20 == 0) {
//            count = 1;
//        } else if (amount < 100 && amount % 50 != 0 || amount % (minN100 * 100) != 50) {
//            if (amount < 100 || amount % (minN100 * 100) <= n20 * 20 && amount % (minN100 * 100) > 40) {
//                count = 2;
//            } else {
//                if ((amount - 60) / 50 <= 1) {
//                    minN100 = 0;
//                } else if ((amount - 60 - minN100 * 100) / 50 <= 1) {
//                    minN100 -= 1;
//                }
//                minN50 = (amount - minN100 * 100 - 60) / 50;
//                count = 3;
//            }
//        }
//
//        if (isValid(amount)) {
//            switch (count) {
//                case 1 -> {
//                    System.out.println(minN100 + "*100, " + minN50 + "*50, " + newN20 + "*20");
//                    issueBanknotes(newN20, minN50, minN100);
//                }
//                case 2 -> {
//                    System.out.println(minN100 + "*100, " + (amount - (minN100 * 100)) / 20 + "*20");
//                    issueBanknotes((amount - (minN100 * 100)) / 20, 0, minN100);
//                }
//                case 3 -> {
//                    if ((amount - minN100 * 100 - minN50 * 50) % 20 != 0) {
//                        System.out.println("Not enough banknote");
//                        return false;
//                    }
//                    System.out.println(minN100 + "*100, " + minN50 + "*50, " +
//                            (amount - minN100 * 100 - minN50 * 50) / 20 + "*20");
//                    issueBanknotes((amount - minN100 * 100 - minN50 * 50) / 20, minN50, minN100);
//                }
//            }
//        }
//        return true;
//    }
//
//    public int getN20() {
//        return n20;
//    }
//
//    public int getN50() {
//        return n50;
//    }
//
//    public int getN100() {
//        return n100;
//    }
//
//    public int getATMbalance() {
//        return n20 * 20 + n50 * 50 + n100 * 100;
//    }
}
