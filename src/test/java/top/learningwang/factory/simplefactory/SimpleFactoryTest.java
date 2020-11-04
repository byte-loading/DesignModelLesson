package top.learningwang.factory.simplefactory;

import org.junit.Test;
import top.learningwang.factory.common.bean.CountryMusic;
import top.learningwang.factory.common.bean.Music;
import top.learningwang.factory.common.bean.RapMusic;


/**
 * @author wangjingbiao
 * @date 2020/11/03 23:51
 * 简单工厂测试用例
 */
public class SimpleFactoryTest {
    /**
     * 如果不使用简单工厂，直接注入类，可能会导致依赖泛滥，修改名称时，也不好统一处理
     */
    @Test
    public void ifNotSimpleFactory() {
        Music music = new CountryMusic();
        music.play();

        Music music2 = new RapMusic();
        music2.play();
    }

    /**
     * 使用简单工厂，只需要注入工厂bean即可生产不同类型的实例
     */
    @Test
    public void useSimpleFactory() {
        MusicFactory musicFactory = new MusicFactory();
        Music music = musicFactory.getMusic("country");
        music.play();

        Music music2 = musicFactory.getMusic("rap");
        music2.play();
    }

    /**
     * 使用简单工厂反射生产不同类型的实例
     */
    @Test
    public void useSimpleFactoryInvoke() {
        MusicFactory musicFactory = new MusicFactory();
        Music music = musicFactory.getMusicByInvoke(CountryMusic.class);
        music.play();

        Music music2 = musicFactory.getMusicByInvoke(RapMusic.class);
        music2.play();
    }

}