import java.util.ArrayList;
import java.util.List;

public class History {

    private List<ConversionRecord> records;

    public History() {
        this.records = new ArrayList<>();
    }

    public void addRecord(String baseCurrencyCode, String targetCurrencyCode, double amount) {
        ConversionRecord record = new ConversionRecord(baseCurrencyCode, targetCurrencyCode, amount);
        records.add(record);
    }

    public void displayHistory() {
        if (records.isEmpty()) {
            System.out.println("Histórico de conversões está vazio.");
        } else {
            System.out.println("Histórico de conversões:");
            for (ConversionRecord record : records) {
                System.out.println(record);
            }
        }
    }
}