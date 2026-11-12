package Inhaler;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;

public class UsageService {

    private ArrayList<UsageRecord> records = new ArrayList<>();

    public void recordUse(String note) {
        LocalDateTime timeUsed = LocalDateTime.now();
        UsageRecord record = new UsageRecord(timeUsed, note);

        records.add(record);
    }

    public int getNumberOfUses() {
        return records.size();
    }

    public int getNumberOfUsesToday() {
        LocalDate today = LocalDate.now();
        int count = 0;

        for (UsageRecord record : records) {
            LocalDate recordDate = record.getTimeUsed().toLocalDate();

            if (recordDate.equals(today)) {
                count++;
            }
        }

        return count;
    }


    public ArrayList<UsageRecord> getRecords() {
        return records;
    }
}