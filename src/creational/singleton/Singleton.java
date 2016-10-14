package creational.singleton;

/**
 * @author derek
 * @version 1.0
 */
class Singleton {
    private Singleton() {}
    private static Singleton instance = null;
    private static final Object object = new Object();
    static Singleton getInstance(){
        if (null == instance){
            synchronized (object){
                if (null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
