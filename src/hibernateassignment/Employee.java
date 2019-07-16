package hibernateassignment;
// Generated Jul 1, 2019 1:11:19 PM by Hibernate Tools 4.3.1



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer employeeId;
     private String name;
     private int age;
     private String adress;
     private Double income;

    public Employee() {
    }

	
    public Employee(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    public Employee(String name, int age, String adress, Double income) {
       this.name = name;
       this.age = age;
       this.adress = adress;
       this.income = income;
    }
   
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public String getAdress() {
        return this.adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Double getIncome() {
        return this.income;
    }
    
    public void setIncome(Double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "\nID: " + employeeId + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Adress: " + adress + "\n" + "Income: " + income + "\n";
    }




}

