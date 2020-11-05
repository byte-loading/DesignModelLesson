package top.learningwang.factory.abstractfac;

import top.learningwang.factory.common.bean.ArtFeature;
import top.learningwang.factory.common.bean.CountryMusic;
import top.learningwang.factory.common.bean.CountryMusicFeature;
import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/05 23:21
 * 乡村CD 工厂
 */
public class CountryMusicCDFactory implements MusicCDFactory{
    @Override
    public Music getMusic() {
        return new CountryMusic();
    }

    @Override
    public ArtFeature getArtFeature() {
        return new CountryMusicFeature();
    }
}
