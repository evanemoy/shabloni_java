package prac7;

import java.time.LocalDate;
import java.util.HashMap;

public class ProxyDailyReport implements Report{

    private DailyReport dailyReport;
    private static HashMap<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String PrepareReport(LocalDate localDate) {
        if (cache.get(localDate) == null) {
            String report = dailyReport.PrepareReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
