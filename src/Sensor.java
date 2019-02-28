public class Sensor {

    private String name;
    private String type;
    private String descryption;
    private int price;
    protected static int frequency;
    protected String color;


    void SetName(String Name) {
        this.name = Name;
    }


    void SetPrice(int Price) {
        this.price = Price;
    }

    void SetType(String Type) {
        this.type = Type;
    }

    void SetColor(String Color) {
        this.color = Color;
    }

    void SetDescryption(String descryption) { this.descryption = descryption; }

    void SetFrequency(int Frequency) {
        this.frequency = Frequency;
    }

    String getName() {
        return name;
    }

    String getdescryption() {
        return descryption;
    }

    int getfrequency() {
        return frequency;
    }

    int getPrice() {
        return price;
    }

    String getType() {
        return type;
    }

    String getColor() {
        return color;
    }

    public Sensor(String name, String type, String descryption) {

        this(name, type, descryption, null);
    }

    public Sensor(String name, String type, String descryption, String frequency) {

    }

    public Sensor(String name, String type, String descryption, int price, int frequency, String color) {
        SetName(name);
        SetType(type);
        SetDescryption(descryption);
        SetPrice(price);
        SetFrequency(frequency);
        SetColor(color);
    }


    public static void printStaticElements() {

        frequency = 10;
        System.out.println("Static method:" + frequency);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", descryption='" + descryption + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Sensor bt11 = new Sensor("BT11", "optical", "Determinates power of light", 250, 150, "blue");
        System.out.println("Name:  " + bt11.getName());
        System.out.println("type:  " + bt11.getType());
        System.out.println("descryption:  " + bt11.getdescryption());
        System.out.println("frequency:  " + bt11.getfrequency());
        System.out.println("Price:  " + bt11.getPrice());
        System.out.println("color:  " + bt11.getColor() + "\n\n");

        Sensor bt24 = new Sensor("BT24", "wheather", "Determinates humidity", 125, 50, "green");
        System.out.println("Name:  " + bt24.getName());
        System.out.println("type:  " + bt24.getType());
        System.out.println("descryption:  " + bt24.getdescryption());
        System.out.println("frequency:  " + bt24.getfrequency());
        System.out.println("Price:  " + bt24.getPrice());
        System.out.println("color:  " + bt24.getColor() + "\n\n");

        printStaticElements();


    }


}