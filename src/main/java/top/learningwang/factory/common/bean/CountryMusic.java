package top.learningwang.factory.common.bean;

/**
 * @author wangjingbiao
 * @date 2020/11/03 23:49
 * 乡村音乐
 */
public class CountryMusic extends Music{
    @Override
    public void play() {
        System.out.println("我的老家，就住在这个屯儿...");
    }
}
