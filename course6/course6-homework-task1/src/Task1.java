public class Task1 {
    public static void main(String[] args) throws Exception {
        // Phones
        Phone phone1 = new Phone("80291111111", "IPhone", 3);
        Phone phone2 = new Phone("80332222222", "Sumsunng", 2);
        Phone phone3 = new Phone("80443333333", "Nothing", 11);

        // Receive call
        phone1.receiveCall("John");
        phone2.receiveCall("Chris");
        phone3.receiveCall("Mac");
        System.out.println("");

        // Receive call whit phone number
        phone1.receiveCall("John", phone1.getNumber());
        phone2.receiveCall("Chris", phone2.getNumber());
        phone3.receiveCall("Mac", phone3.getNumber());
        System.out.println("");

        // Sending message with Varargs
        phone1.sendMessage(phone2, phone3);
    }
}
