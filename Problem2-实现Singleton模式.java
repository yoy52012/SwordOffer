/**
 * 线程不安全-懒汉模式
 */
public class Singleton{
    private static Singleton instance=null;

    private Singleton(){
        
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * 线程安全-懒汉模式
 */
public class Singleton{
    private static Singleton instance=null;

    private Singleton(){

    }

    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}


/**
 * 线程不安全-饿汉模式
 */
public class Singleton{
    private static Singleton instance=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

}

/**
 * 双重校验锁方式
 */
public class Singleton{
    private volatile staic  Singleton instance=null;

    private Singleton() {

    }

    public static getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }

}

/**
 * 静态内部类的方式
 */
public class Singleton{

    private Singleton(){

    }

    private static class SingletonHolder{
        private static final Singleton instance=new Singleton();
    }

    public static final Singleton getInstance(){

        return SingletonHolder.instance;
    }


}

/**
 * 枚举方式
 * 1.线程安全 2.不会因为序列化而产生新实例 3.防止反射攻击
 */
public enum Singleton{
    INSTANCE;

    private Singleton(){

    }

}
