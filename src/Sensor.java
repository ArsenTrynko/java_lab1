public class Sensor {

    private String name;
    private String type;
    private String descryption;
    private int price;
    protected static int frequency;
    protected String color;

    public Sensor(String name, String type, String descryption) {

        this(name, type, descryption, null);
    }

    public Sensor(String name, String type, String descryption, String frequency) {

    }

    public Sensor(String name, String type, String descryption, int price, String color) {
        setName(name);
        setType(type);
        setDescryption(descryption);
        setPrice(price);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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