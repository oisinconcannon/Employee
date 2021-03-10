/*
Oisin Concannon
Group A
G00347603
In Class Test
10/03/21
 */
package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private int PPS;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(){


    }
    public void setTitle(String title) {
        if((title.equalsIgnoreCase("Mr") || (title.equalsIgnoreCase("Mrs") || (title.equalsIgnoreCase("Ms")))))
            {
                this.title = title;
            }
            else
            {
                throw new IllegalArgumentException("Invalid title provided");
            }
        }
    public String getTitle() { return title; }

    public void setName(String name) {
        if(name.length() <= 25 )
        {
            if(name.length() >= 3) {
                this.name = name;
            }
            else{
                throw new IllegalArgumentException("Name too short");
            }
        }
        else
        {
            throw new IllegalArgumentException("Name too long");
        }
    }
    public String getName() { return name; }

    public void setPPS(int PPS) {
        if(String.valueOf(PPS).length()==8)
        {
            this.PPS = PPS;
        }
        else
        {
            throw new IllegalArgumentException("Invalid PPS provided");
        }
    }
    public int getPPS() { return PPS; }

    public void setPhone(String phone) {
        if(phone.length()==9)
        {
            this.phone = phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Phone provided");
        }
    }
    public String getPhone() { return phone; }

    public void setEmploymentType(String employmentType) {
        if((employmentType.equalsIgnoreCase("Full time") || (employmentType.equalsIgnoreCase("Part time") || (employmentType.equalsIgnoreCase("Contract")))))
        {
            this.employmentType = employmentType;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Employment Type provided");
        }
    }
    public String getEmploymentType() { return employmentType; }

    public void setAge(int age) {
        if(age>16)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Age provided");
        }
    }
    public int getAge() { return age; }


}

