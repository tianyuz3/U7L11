public class Address {
    private String numberOfStreet;
    private String nameOfStreet;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address (String number, String name, String apartmentNum , String city , String state ,String zipCode){
        numberOfStreet = number;
        nameOfStreet = name;
        aptNumber = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address a){
        numberOfStreet = a.getNumberOfStreet();
        nameOfStreet = a.getNameOfStreet();
        aptNumber = a.getAptNumber();
        city = a.getCity();
        state = a.getState();
        zipCode = a.getZipCode();
    }
    public Address(String address){
       numberOfStreet = address.substring(0,address.indexOf(" "));
       address = address.substring(address.indexOf(" "));
       nameOfStreet = address.substring(1,address.indexOf("A")-1);
      address = address.substring(address.indexOf("t")+1);
      aptNumber = address.substring(1,address.indexOf(","));
      address = address.substring(address.indexOf(", ")+1);
      city = address.substring(1,address.indexOf(","));
      address = address.substring(address.indexOf(",")+2);
      state = address.substring(0,address.indexOf(" "));
      zipCode = address.substring(address.indexOf(" ") + 1);



    }
    public String getNumberOfStreet() {
        return numberOfStreet;
    }

    public void setNumberOfStreet(String numberOfStreet) {
        this.numberOfStreet = numberOfStreet;
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String toString(){
      return  numberOfStreet + " " + nameOfStreet + " " + "Apt " + aptNumber + ", " + city + ", " + state
 + " " + zipCode;
    }

}
