package prac7;

import java.time.LocalDate;

public class DailyReport implements Report{
    @Override
    public String PrepareReport(LocalDate LocalDate) {
        return "Ежедневный отчет за " + LocalDate;
    }
}
