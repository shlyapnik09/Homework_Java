package ru.mirea.lab3;
//конвертор валюты из доллара в рубль
public class CurrencyConverter {
    private double exchangeRate; // переменная для хранения курса обмена

    public CurrencyConverter(double exchangeRate) {

        this.exchangeRate = exchangeRate;
    }

    // Метод для конвертации суммы из одной валюты в другую
    public double convert(double amount) {

        return amount * exchangeRate;
    }

    public static void main(String[] args) {

        double exchangeRateUSDToRUB = 0.83; //устонавливаем курс обмена
        CurrencyConverter converter = new CurrencyConverter(exchangeRateUSDToRUB);
        double amountInUSD = 10000.0; //сумма которую нужно конвертировать (USD)

        // Конвертируйте сумму в другую валюту (RUB)
        double amountInRUB = converter.convert(amountInUSD);

        System.out.println(amountInUSD + " USD = " + amountInRUB + " RUB");
    }
}
