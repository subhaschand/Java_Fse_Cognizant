package week1.weekone.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1==s2){
            System.out.println("It is Singleton");
        }else {
            System.out.println("It is not a Singleton");
        }
    }
}
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
