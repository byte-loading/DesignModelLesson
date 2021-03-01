package top.learningwang.singleton.enumsingle;

/**
 * @author wangjingbiao
 * @date 2020/11/10 23:19
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
