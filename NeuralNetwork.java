public class NeuralNetwork extends MLModel {
    private int numberOfLayers;

    public NeuralNetwork(int numberOfLayers) {
        super("Yapay Sinir Ağı (Neural Network)");
        this.numberOfLayers = numberOfLayers;
    }

    @Override
    public void train() {
        System.out.println(getModelName() + ": " + numberOfLayers + " katman ile İleri/Geri Yayılım tamamlandı.");
        setTrained(true);
        setAccuracy(95.8);
    }
}
