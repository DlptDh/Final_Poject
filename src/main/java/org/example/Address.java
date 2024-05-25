package org.example;


public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public Address(int streetNo, String street, String city, String province, String postalCode, String country) {
        if (isPostalCodeValid(postalCode)) {
            this.streetNo = streetNo;
            this.street = street;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode.toUpperCase();
            this.country = country;
        } else {
            this.streetNo = 0;
            this.street = null;
            this.city = null;
            this.province = null;
            this.postalCode = null;
            this.country = null;
        }
    }

    public static boolean isPostalCodeValid(String postalCode) {
        postalCode = postalCode.toUpperCase();
        if (postalCode.length() == 6) {
            return postalCode.matches("[A-Z][0-9][A-Z][0-9][A-Z][0-9]");
        } else if (postalCode.length() == 7) {
            return postalCode.matches("[A-Z][0-9][A-Z] [0-9][A-Z][0-9]");
        }
        return false;
    }

    @Override
    public String toString() {
        return streetNo + " " + street + ", " + city + ", " + province + ", " + postalCode + ", " + country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return streetNo == address.streetNo && street.equals(address.street) && city.equals(address.city)
                && province.equals(address.province) && postalCode.equals(address.postalCode)
                && country.equals(address.country);
    }

    // Getters and Setters
    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        if (isPostalCodeValid(postalCode)) {
            this.postalCode = postalCode.toUpperCase();
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
