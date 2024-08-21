import java.io.Serializable;

public class Phone implements Serializable {
    private String number;
    private String model;
    private int weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + "\nNumber " + number);
    }

    public void sendMessage(Phone... phones) {
        for (Phone phone : phones) {
            System.out.println(phone.getNumber());
        }
    }

}
