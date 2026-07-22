public class LinearRegression extends MLModel {
    private double learningRate;

    public LinearRegression(double learningRate) {
        super("Lineer Regresyon (Linear Regression)");
        this.learningRate = learningRate;
    }

    @Override
    public void train() {
        System.out.println(getModelName() + ": Öğrenme oranı (" + learningRate + ") ile Gradiyan İnişi tamamlandı.");
        setTrained(true);
        setAccuracy(92.0);
    }
}
