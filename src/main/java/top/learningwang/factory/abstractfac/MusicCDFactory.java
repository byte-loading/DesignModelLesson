package top.learningwang.factory.abstractfac;

import top.learningwang.factory.common.bean.ArtFeature;
import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/05 23:09
 * 音乐CD抽象工厂
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
