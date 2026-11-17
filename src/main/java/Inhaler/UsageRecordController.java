package Inhaler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsageRecordController {

    private UsageService usageService = new UsageService();

    @GetMapping("/api/usage-records") //get all records
    public ArrayList<UsageRecord> getUsageRecords() {
        return usageService.getRecords();
    }

    @GetMapping("/api/usage-records/today/count") //get records number
    public int getTodayUsageCount() {
        return usageService.getNumberOfUsesToday();
    }

    @PostMapping("/api/usage-records") //add new record
    public void createUsageRecord(@RequestBody CreateUsageRecordRequest request) {
        usageService.recordUse(request.getNote());
    }
}