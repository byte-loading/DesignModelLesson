package top.learningwang.factory.simplefactory;

import top.learningwang.factory.common.bean.CountryMusic;
import top.learningwang.factory.common.bean.Music;
import top.learningwang.factory.common.bean.RapMusic;

/**
 * @author wangjingbiao
 * @date 2020/11/04 00:01
 * 简单工厂，实现获取不同类型的音乐实现
 */
public class MusicFactory {
    /**
     * 根据传递的type，生产不同种类的音乐对象
     *
     * 简单工厂的缺点：每新加一种类型，都需要修改此方法，增加不同的类型，不符合开闭原则
     * @param type 类型
     * @return 音乐类型
     */
    public Music getMusic(String type) {
        switch (type) {
            case "country":
                return new CountryMusic();
            case "rap":
                return new RapMusic();
            default:
                return new Music() {
                    @Override
                    public void play() {
                        System.out.println("default Music...");
                    }
                };
        }
    }

    /**
     * 通过反射来实现简单工厂，避免每次修改
     * @param c 类类型
     * @return 音乐类型
     */
    public Music getMusicByInvoke(Class c){
        Music music = null;
        try {
            music = (Music) Class.forName(c.getName()).newInstance();
            return music;
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        // 默认返回值
        return new Music() {
            @Override
            public void play() {
                System.out.println("default Music...");
            }
        };
    }
}
