package groupActivity;
/*
groupActivity.TelephoneNumber
-------
phoneNumber : String
---------
+ Telephone(phoneNumber : String)
+ getPhoneNumber() : String
+ setPhoneNumber(phoneNumber : String) : void
+ getAreaCode() : String
+ toString() : String
+ equals(other : Object) : boolean
*/

/**
 * A class encapsulating the concept of a telephone number
 *
 * @author Alyssa Trinidad [atrinidad4@academic.rrc.ca], Yulin Liu [yulinliu@academic.rrc.ca], Luping Xing [lxing2@rrc.ca]
 * @version 1.0.0
 */
public class TelephoneNumber {

    /**
     * an attribute represents phone number
     */
    private String phoneNumber;

    /**
     * constructor of class groupActivity.TelephoneNumber
     *
     * @param phoneNumber: phone number for initialization
     */
    public TelephoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * accessor for phoneNumber attribute
     *
     * @return the value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * mutator of phoneNumber attribute
     *
     * @param phoneNumber target value of phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * returning the area code
     *
     * @return the area code of the phone number
     */
    public String getAreaCode() {
        if (phoneNumber.length() >= 3) {
            // phone number length is more than or equal to 3
            boolean hasValidAreaCode = true;
            for (int i = 0; i < 3; i++) {
                if (phoneNumber.charAt(i) > 57 || phoneNumber.charAt(i) < 48) {
                    hasValidAreaCode = false;
                    break;
                }
            }
            if (hasValidAreaCode) return phoneNumber.substring(0, 3);
        }
        return "unknown area code";
    }

    /**
     * determine if two groupActivity.TelephoneNumber object is the same or have the same value
     *
     * @param o the other object to compare
     * @return the result of this comparison
     */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TelephoneNumber)) return false;
        TelephoneNumber t2 = (TelephoneNumber) o;
        if (t2.getPhoneNumber() == null) {
            return this.getPhoneNumber() == null;
        } else {
            return t2.getPhoneNumber().equals(this.getPhoneNumber());
        }

    }

    /**
     * turn the information inside this object into a string
     *
     * @return the string value of this object
     */
    public String toString() {
        return "Phone#: " + phoneNumber;
    }
}
