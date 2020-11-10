package top.learningwang.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjingbiao
 * @date 2020/11/10 23:41
 * 容器实现单例模式，常用于系统初始化时，创建好单例对象，后续直接取用
 * 有一定的适用场景，存在线程安全性问题
 */
public class ContainerSingleton {
    public static Map<String, Object> singletonMap = new HashMap<>();

    /**
     * 放置单例对象
     */
    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotEmpty(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    /**
     * 获取单例对象
     */
    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
