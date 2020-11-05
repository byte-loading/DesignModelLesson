package top.learningwang.factory.abstractfac;

import top.learningwang.factory.common.bean.ArtFeature;
import top.learningwang.factory.common.bean.Music;
import top.learningwang.factory.common.bean.RapMusic;
import top.learningwang.factory.common.bean.RapMusicFeature;

/**
 * @author wangjingbiao
 * @date 2020/11/05 23:21
 * rap CD 工厂
 */
public class RapMusicCDFactory implements MusicCDFactory{
    @Override
    public Music getMusic() {
        return new RapMusic();
    }

    @Override
    public ArtFeature getArtFeature() {
        return new RapMusicFeature();
    }
}
