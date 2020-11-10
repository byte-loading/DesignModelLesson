package top.learningwang.singleton.hungry;

import java.io.Serializable;

/**
 * @author wangjingbiao
 * @date 2020/11/09 22:23
 * 饿汉模式
 * <p>
 * 缺点：无法延迟加载，可能会未被使用到，也加载了类
 * 资源浪费少的话，可以使用饿汉模式，更加方便
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        if (hungrySingleton != null) {
            // 避免反射破坏单例模式，类加载时已经初始化好了，直接在构造方法中判断即可
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 重写该方法，能保证反序列化得到的也是同一个bean
     * 原理：
     * ObjectInputStream下，会判断是否有readResolve方法，有的话，会返回该方法的返回值
     * if (obj != null &&
     * handles.lookupException(passHandle) == null &&
     * desc.hasReadResolveMethod()){
     * Object rep = desc.invokeReadResolve(obj);
     * }
     */
    public Object readResolve() {
        return hungrySingleton;
    }
}
