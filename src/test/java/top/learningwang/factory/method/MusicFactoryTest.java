package top.learningwang.factory.method;

import org.junit.Test;

/**
 * @author wangjingbiao
 * @date 2020/11/04 23:50
 * 工厂方法测试实例
 */
public class MusicFactoryTest {

    @Test
    public void testMethodFactory(){
        MusicFactory factory = new RapMusicFactory();
        factory.getMusic().play();
    }

}