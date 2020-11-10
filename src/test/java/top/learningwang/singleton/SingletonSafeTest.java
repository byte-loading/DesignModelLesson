package top.learningwang.singleton;

import org.junit.Test;
import top.learningwang.singleton.hungry.HungrySingleton;
import top.learningwang.singleton.innerclass.StaticInnerClassSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wangjingbiao
 * @date 2020/11/09 22:33
 * 测试序列化、反序化、反射对单例的破坏
 */
public class SingletonSafeTest {
    /**
     * 序列化、反序列化下的单例模式
     */
    @Test
    public void testSerial() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);
        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton_file")));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    /**
     * 测试反射下的单例模式
     */
    @Test
    public void testInvoke() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        // 测试饿汉模式
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 放开私有构造方法
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton object = (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(object);
        System.out.println(instance == object);

        //测试静态内部类模式
        Class objectClass2 = StaticInnerClassSingleton.class;
        Constructor constructor2 = objectClass2.getDeclaredConstructor();
        // 放开私有构造方法
        constructor2.setAccessible(true);
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton object2 = (StaticInnerClassSingleton) constructor2.newInstance();
        System.out.println(instance2);
        System.out.println(object2);
        System.out.println(instance2 == object2);

        // 懒汉模式无法避免反射攻击，无法确定反射与初始化的调用时机
    }
}
