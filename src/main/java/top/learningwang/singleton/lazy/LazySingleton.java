package top.learningwang.singleton.lazy;

/**
 * @author wangjingbiao
 * @date 2020/11/09 20:45
 * 懒汉模式,使用时再进行创建
 * 注：本代码用于演示几种单例模式的创建方式，实际使用中，只会用一种方法实现单例
 */
public class LazySingleton {
    /**
     * 使用volatile禁止指令重排序
     */
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        // 此处是线程不安全的，可能会创建两个对象出来
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 静态方法上增加 synchronized关键字，相当于锁的对应的class
     */
    public synchronized static LazySingleton getInstance2(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 等同于上面的写法
     */
    public static LazySingleton getInstance3(){
        synchronized (LazySingleton.class){
            if(lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }
    }

    /**
     * 每次都加锁性能不好，可以使用局部加锁，提升性能
     */
    public static LazySingleton getInstanceDoubleCheck(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                // 初始化对象，实际是三步
                // 1.分配内存给这个对象
                // 2.初始化对象
                // 3.指向刚分配的内存地址
                // 2和3可能会指令重排序，导致其他线程获取到未完成实例化的对象，使用时出错
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
