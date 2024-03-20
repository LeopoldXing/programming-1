package groupActivity;

public class TelephoneNumberTests {

    public static void main(String[] args) {
        // Constructor method
        TelephoneNumber telephoneNumber = new TelephoneNumber("4317851258");
        // getting object's Class
        Class<? extends TelephoneNumber> telephoneNumberClass = telephoneNumber.getClass();
        // get object's Class name
        String className = telephoneNumberClass.getName();
        System.out.println(className);

        // Mutator method
        System.out.println("phone number before change -> " + telephoneNumber.getPhoneNumber());
        telephoneNumber.setPhoneNumber("4311111111");
        System.out.println("phone number after change -> " + telephoneNumber.getPhoneNumber());

        // The method that returns the area code
        System.out.println("area code of 4311111111 -> " + telephoneNumber.getAreaCode());
        System.out.println("area code of 43 -> " + new TelephoneNumber("43").getAreaCode());
        System.out.println("area code of abc -> " + new TelephoneNumber("abc").getAreaCode());

        // The toString method
        System.out.println(telephoneNumber);
    }

}
