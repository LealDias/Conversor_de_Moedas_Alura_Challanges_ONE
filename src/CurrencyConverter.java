// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.io.IOException;

public class CurrencyConverter {

    private ExchangeRateService exchangeRateService;
    private History history;

    public CurrencyConverter(ExchangeRateService exchangeRateService, History history) {
        this.exchangeRateService = exchangeRateService;
        this.history = history;
    }

    public double convertCurrency(String baseCurrencyCode, String targetCurrencyCode, double amount) throws IOException {
        double exchangeRate = exchangeRateService.getExchangeRate(baseCurrencyCode, targetCurrencyCode);
        double convertedAmount = amount * exchangeRate;
        history.addRecord(baseCurrencyCode, targetCurrencyCode, amount);
        return convertedAmount;
    }
}