package top.learningwang.factory.abstractfac;

import top.learningwang.factory.common.bean.ArtFeature;
import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/05 23:09
 * 音乐CD抽象工厂
 *
 * 抽象工厂:
 * 提供一个创建一系列相关或相互依赖对象的接口
 *
 * 适用场景：
 * 1. 应用层不依赖于产品类实例如何被创建、实现等细节
 * 2. 强调一系列相关的产品对象（属于同一产品族）一起适用创建对象需要大量重复的代码
 * 3. 提供一个产品类的库，所有的产品以一个标准出现，从而使应用层能方便的替换产品
 *
 * 优点：
 * 1. 具体产品在应用层代码隔离，无需关心创建细节
 * 2. 将一个系列的产品族统一到一起创建
 *
 * 缺点：
 * 1. 规定了产品的所有组成特性，想扩展新的组成成本较高，需要改动所有的产品实现
 * 2. 增加了系统的抽象性和理解难度
 *
 */
public interface MusicCDFactory {
    /**
     * 音乐
     * @return 音乐实体
     */
    Music getMusic();

    /**
     * 艺术特性
     * @return 音乐的艺术特性
     */
    ArtFeature getArtFeature();
}
