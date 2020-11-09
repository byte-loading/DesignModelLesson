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
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
