package domain_driven_design;

public class Address {
    private String Address2;
    private String Address1;
    private String Zipcode;

    public Address(String address2, String address1, String zipcode) {
        Address2 = address2;
        Address1 = address1;
        Zipcode = zipcode;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getZipcode() {
        return Zipcode;
    }
}
