package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    //Тест на сумму всех продаж
    @Test
    public void shouldFindAllSalesSum() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.allSalesSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    //Тест на среднюю сумму продаж в месяц
    @Test
    public void shouldFindAverageSaleSum() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = (int) service.averagSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    //Тест на номер месяца, в котором был пик продаж
    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    //Тест на номер месяца, в котором был минимум продаж
    @Test
    public void shouldFindInSales() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    //Тест на количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindUnderAverageSale() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.underAverageSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    //Тест на количество месяцев, в которых продажи были выше среднего
    @Test
    public void shouldFindOverAverageSake() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.overAverageSale(sales);

        Assertions.assertEquals(expected, actual);
    }
}
