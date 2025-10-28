public class CustomerEntity {
  
    private int age;
    private String address;
    private String phoneNumber;

    public CustomerEntity( int age, String address, String phoneNumber) {
   
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
   
    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
