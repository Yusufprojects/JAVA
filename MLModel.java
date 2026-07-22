public abstract class MLModel {
    private String modelName;
    private double accuracy;
    private boolean isTrained;

    // Constructor: Nesne ilk üretildiğinde model adını alır
    public MLModel(String modelName) {
        this.modelName = modelName;
        this.accuracy = 0.0;
        this.isTrained = false;
    }

    // Alt sınıfların doldurması ZORUNLU olan soyut metot
    public abstract void train();

    // Genel tahmin metodu (Alt sınıflar isterse Override edebilir)
    public String predict(String inputData) {
        if (!isTrained) {
            return "[" + modelName + "] HATA: Model eğitilmeden tahmin yapılamaz!";
        }
        return "[" + modelName + "] Tahmin Sonucu: " + inputData;
    }

    public void printSummary() {
        System.out.println("Model Adı: " + modelName + " | Eğitildi mi: " + isTrained + " | Doğruluk: %" + accuracy);
    }

    // --- Getter ve Setter Metotları (Encapsulation) ---
    public String getModelName() {
        return modelName;
    }

    public boolean isTrained() {
        return isTrained;
    }

    protected void setTrained(boolean trained) {
        this.isTrained = trained;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        if (accuracy >= 0.0 && accuracy <= 100.0) {
            this.accuracy = accuracy;
        } else {
            System.out.println("Hata: Doğruluk oranı 0 ile 100 arasında olmalıdır!");
        }
    }
}
