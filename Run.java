import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<MLModel> modelList = new ArrayList<>();

        // Farklı alt sınıflardan nesneleri tek bir listede topluyoruz (Polimorfizm)
        modelList.add(new DecisionTree(5));
        modelList.add(new LinearRegression(0.01));
        modelList.add(new NeuralNetwork(10));

        System.out.println("=== MODELLERİN EĞİTİMİ VE ÇALIŞTIRILMASI ===\n");

        for (MLModel model : modelList) {
            // 1. Modeli eğit
            model.train();

            // 2. Tahmin yap
            String result = model.predict("Müşteri_Verisi_2026");
            System.out.println(result);

            // 3. Modeli ve durumunu yazdır
            model.printSummary();

            System.out.println("----------------------------------------------");
        }
    }
}