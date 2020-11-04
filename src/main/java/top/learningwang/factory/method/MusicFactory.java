package top.learningwang.factory.method;

import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/04 23:46
 * 定义抽象工厂方法
 * 定义：定义创建对象的接口，让实现这个接口的类来决定实例化哪个类，将实例化推迟到子类中进行
 *
 * 适用场景：
 * 1. 创建对象需要大量重复的代码
 * 2. 客户端不依赖于产品类实例如何被创建、实现等细节
 * 3. 一个类通过其子类来指定创建哪个对象
 *
 * 优点：
 * 1. 用户只需要关心所需产品对应的工厂，无须关心创建新界
 * 2. 加入新产品符合开闭原则，提高可扩展性
 *
 * 缺点：
 * 1. 类的个数容易过多，增加复杂度
 * 2. 增加了系统的抽象性和理解难度
 */
public abstract class MusicFactory {
    /**
     * 抽象工厂方法
     * @return 音乐bean
     */
    public abstract Music getMusic();
}
