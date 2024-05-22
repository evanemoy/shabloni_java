package prac7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void prepare(Report report, LocalDate localDate){
        System.out.println(report.PrepareReport(localDate));
    }

    public static void main(String[] args) {

        System.out.println("Паттерн Легковес:\n");
        FlyweightFactory factory = new FlyweightFactory();

        factory.getSembol("H", "Times New Roman").
                drawSymbol(new PositionExternalContext(0,0));
        factory.getSembol("e", "Times New Roman").
                drawSymbol(new PositionExternalContext(0,1));
        factory.getSembol("l", "Times New Roman").
                drawSymbol(new PositionExternalContext(0,2));
        factory.getSembol("l", "Times New Roman").
                drawSymbol(new PositionExternalContext(0,3));
        factory.getSembol("o", "Times New Roman").
                drawSymbol(new PositionExternalContext(0,4));

        System.out.println("Паттерн Заместитель:\n");
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());

    }
}
