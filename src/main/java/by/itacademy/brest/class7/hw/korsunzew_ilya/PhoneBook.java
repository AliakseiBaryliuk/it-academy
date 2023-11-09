package by.itacademy.brest.class7.hw.korsunzew_ilya;

import java.util.Objects;

public class PhoneBook {
    private Record[] records;

    public PhoneBook(int recordCount) {
        this.records = new Record[recordCount];
    }

    public void addRecord(Record record) {
        for (int i = 0; i < records.length; i++) {
            if (Objects.isNull(records[i])) {
                records[i] = record;
                break;
            } else if (i == records.length - 1) {
                System.out.println("Не возможно ");
            }
        }
    }

    public void   findRecordByName(String name) {
        for (int i = 0; i < records.length; i++) {
            if (Objects.nonNull(records[i]) && records[i].getName().equals(name)) {
                System.out.println("PhoneNumber=" + records[i].getPhoneNumber());
            }


        }
    }
}