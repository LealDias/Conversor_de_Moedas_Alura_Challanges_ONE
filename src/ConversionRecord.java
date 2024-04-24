import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversionRecord {

    private LocalDateTime timestamp;
    private String baseCurrencyCode;
    private String targetCurrencyCode;
    private double amount;

    public ConversionRecord(String baseCurrencyCode, String targetCurrencyCode, double amount) {
        this.timestamp = LocalDateTime.now();
        this.baseCurrencyCode = baseCurrencyCode;
        this.targetCurrencyCode = targetCurrencyCode;
        this.amount = amount;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return String.format("%s - Convertido de %s para %s: %.2f", formattedTimestamp, baseCurrencyCode, targetCurrencyCode, amount);
    }
}