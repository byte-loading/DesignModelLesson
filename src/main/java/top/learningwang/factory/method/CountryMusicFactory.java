package top.learningwang.factory.method;

import top.learningwang.factory.common.bean.CountryMusic;
import top.learningwang.factory.common.bean.Music;

/**
 * @author wangjingbiao
 * @date 2020/11/04 23:49
 * 乡村音乐工厂
 */
public class CountryMusicFactory extends MusicFactory {
    @Override
    public Music getMusic() {
        return new CountryMusic();
    }
}
