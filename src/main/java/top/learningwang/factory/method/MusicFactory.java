package top.learningwang.factory.method;

import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/04 23:46
 */
public abstract class MusicFactory {
    /**
     * 抽象工厂方法
     *
     * @return 音乐bean
     */
    public abstract Music getMusic();
}
