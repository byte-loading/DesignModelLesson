package top.learningwang.singleton.enumsingle;

/**
 * @author wangjingbiao
 * @date 2020/11/10 23:19
 * 枚举实现单例,替换饿汉模式,最佳实践，
 * 能避免反射攻击，无法通过反射获取到枚举类的无参构造器，也无法通过反射创建枚举对象
 * 序列化攻击也能避免掉，ObjectInputStream readEnum方法
 */
public enum EnumSingleton {
    /**
     * 单例
     */
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
