public class CustomerEntity {
  private String name;
  private String email;
    private int age;
    private String address;
    private String phoneNumber;
    private String customerId;

    public CustomerEntity(String name, String email, int age, String address, String phoneNumber, String customerId) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerId = customerId;
    }
   
    public int getAge() {
        return age;
    }
public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
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
public String getCustomerId() {
        return customerId;
    }
    
}