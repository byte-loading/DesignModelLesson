/**
 * @author jingbiao.wang
 * @date 2021/3/1 6:47 下午
 * desc:
 * <p>
 * 枚举实现单例,替换饿汉模式,最佳实践，
 * 能避免反射攻击，无法通过反射获取到枚举类的无参构造器，也无法通过反射创建枚举对象
 * 序列化攻击也能避免掉，ObjectInputStream readEnum方法
 */
package top.learningwang.singleton.enumsingle;