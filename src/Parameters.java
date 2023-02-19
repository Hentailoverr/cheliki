public class Parameters {
    private String name;
    private String surname;
    private int age;
    private String sex;

 public void setName(String name){
     this.name = name;
 }
 public void setSex(String sex){
     this.sex = sex;
 }
 public void setSurname(String surname){
     this.surname = surname;
 }
    public void setAge(int age){
     this.age = age;
    }
    public String getName(){
     return name;
    }
    public String getSurname(){
     return surname;
    }
    public String getSex(){
     return sex;
    }
    public int getAge(){
     return age;
    }

}
