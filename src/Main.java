public class Main {
    public static void main(String[] args) {
        Parameters usr1 = new Parameters();
        Parameters usr2 = new Parameters();
        usr1.setName("man");
        usr1.getName();
        usr1.setAge(70);
        usr1.getAge();
        usr1.setSex("m");
        usr1.getSex();
        usr1.setSurname("malkovich");
        usr1.getSurname();
        usr2.setName("man");
        usr2.getName();
        usr2.setAge(70);
        usr2.getAge();
        usr2.setSex("m");
        usr2.getSex();
        usr2.setSurname("malkovich");
        usr2.getSurname();
        System.out.println(usr1.getName() + " " + usr1.getSurname() + " " + usr1.getSex() + " " + usr1.getAge());
        System.out.println(usr2.getName() + " " + usr2.getSurname() + " " + usr2.getSex() + " " + usr2.getAge());
        }
    }