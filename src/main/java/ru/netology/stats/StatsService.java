package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public int allSalesSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    //Средняя сумма продаж в месяц
    public long averagSale(long[] sales) {
        int average = allSalesSum(sales) / 12;
        return average;
    }

    //Номер месяца, в котором был пик продаж
    public int maxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; //следующий рассматриваемый месяц имеет номер на 1 больше
        }
         return maxMonth + 1;

    }


    //Номер месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales ) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month +1; //следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    //Кол-во месяцев, в которых продажи были ниже среднего
    public int underAverageSale(long[] sales) {
        // i номер ячейки массива
        int x = 0; // счетчик месяцев
        for (long sale : sales) {
            if (sale < averagSale(sales)) {
                x++;
            }
        }
           return x;
    }


    //Кол-во месяцев, в которых продажи были выше среднего
    public int overAverageSale(long[] sales) {
        // i номер ячейки массива
        int x =0; // счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averagSale(sales)) {
                x++;
            }
        }
        return x;
    }
}


