public class Occurance {
    private final String name;
    private final int occurance;

    public Occurance(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    @Override
    public String toString() {
        return "Occurance{" +
                "name='" + name + '\'' +
                ", occurance=" + occurance +
                '}';
    }
}
