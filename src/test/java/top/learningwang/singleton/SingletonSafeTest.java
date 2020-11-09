package top.learningwang.singleton;

import org.junit.Test;
import top.learningwang.singleton.hungry.HungrySingleton;

import java.io.*;

/**
 * @author wangjingbiao
 * @date 2020/11/09 22:33
 * 测试序列化、反序化、反射对单例的破坏
 */
public class SingletonSafeTest {

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
}
