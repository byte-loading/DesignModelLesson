package top.learningwang.factory.abstractfac;


import org.junit.Test;

/**
 * @author wangjingbiao
 * @date 2020/11/05 23:25
 * 抽象工厂测试类
 */
public class AbstractFactoryTest {
    MusicCDFactory cdFactory;

    @Test
    public void testRapCD() {
        cdFactory = new RapMusicCDFactory();
        System.out.println("下面请欣赏一首: " + cdFactory.getArtFeature().feature() + "的音乐");
        cdFactory.getMusic().play();
    }

    @Test
    public void testCountryCd() {
        cdFactory = new CountryMusicCDFactory();
        System.out.println("下面请欣赏一首: " + cdFactory.getArtFeature().feature() + "的音乐");
        cdFactory.getMusic().play();
    }


}