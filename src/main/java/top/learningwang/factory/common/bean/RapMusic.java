package top.learningwang.factory.common.bean;

/**
 * @author wangjingbiao
 * @date 2020/11/03 23:49
 * rap音乐
 */
public class RapMusic extends Music {
    @Override
    public void play() {
        System.out.println("幺幺，切克闹，我说rap，你说要！");
    }
}
