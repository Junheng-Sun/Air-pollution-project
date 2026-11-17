package Inhaler;

import java.time.LocalDateTime;

public class UsageRecord {

    private LocalDateTime timeUsed;
    private String note;

    public UsageRecord(LocalDateTime timeUsed, String note) {
        this.timeUsed = timeUsed;
        this.note = note;
    }

    public LocalDateTime getTimeUsed() {
        return timeUsed;
    }

    public String getNote() {
        return note;
    }
}