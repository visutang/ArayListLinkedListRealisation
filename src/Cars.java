public class Cars {
    private String model;

    public Cars(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                '}';
    }
}
