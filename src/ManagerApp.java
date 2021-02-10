public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Rafi");
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
        vp.sayHello("Budi");

        System.out.println(manager);
        System.out.println(vp);

    }
}
