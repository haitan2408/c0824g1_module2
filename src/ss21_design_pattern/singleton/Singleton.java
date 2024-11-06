package ss21_design_pattern.singleton;

public class Singleton {

    //    Eager
//    private static final Singleton instance = new Singleton();
// hàm constructor là private để tránh các client-application sử dụng

//    private Singleton() {
//    }
//    public static Singleton getInstance() {
//        return instance;
//    }

//    Lazy
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

//    Thread Safe Singleton
//    private static Singleton instance;
//    private Singleton() {
//    }
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

}
