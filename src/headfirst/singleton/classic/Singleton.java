package headfirst.singleton.classic;

/*
 *
 * 在程序初始化的时候生成单例，即 “饿汉”模式
 * 可以保证线程安全
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }

}
