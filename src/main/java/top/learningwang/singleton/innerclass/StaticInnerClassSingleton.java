package top.learningwang.singleton.innerclass;

/**
 * @author wangjingbiao
 * @date 2020/11/09 22:11
 * 使用静态内部类实现单例模式
 * <p>
 * 原理：
 * 1. Class对象加载的时候，会加初始化锁，类加载时是安全的
 * 2. 调用外部类的getInstance,此时会加载InnerClass，加载时，对象会初始化出来
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            // 避免反射破坏单例
            throw new RuntimeException("单例模式，不允许反射调用");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
