public class DecisionTree extends MLModel {
    private int maxDepth;

    public DecisionTree(int maxDepth) {
        super("Karar Ağacı (Decision Tree)"); // super kullanımı
        this.maxDepth = maxDepth;
    }

    @Override
    public void train() {
        System.out.println(getModelName() + ": " + maxDepth + " derinliğinde düğümler ve dallar oluşturularak kuruldu.");
        setTrained(true);
        setAccuracy(88.5); // Örnek doğruluk oranı
    }
}
