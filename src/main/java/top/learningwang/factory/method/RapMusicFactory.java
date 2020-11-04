package top.learningwang.factory.method;

import top.learningwang.factory.common.bean.Music;
import top.learningwang.factory.common.bean.RapMusic;

/**
 * @author wangjingbiao
 * @date 2020/11/04 23:48
 * rap音乐工厂
 */
public class RapMusicFactory extends MusicFactory{
    @Override
    public Music getMusic() {
        return new RapMusic();
    }
}
