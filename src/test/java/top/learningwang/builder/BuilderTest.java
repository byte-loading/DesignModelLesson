package top.learningwang.builder;


import org.junit.Test;

/**
 * @author wangjingbiao
 * @date 2020/11/08 18:09
 * 测试建造者模式
 */
public class BuilderTest {
    /**
     * 测试建造者模式
     */
    @Test
    public void testMovieBuilder() {
        MovieBuilder movieBuilder = new MovieActualBuilder();
        Studio studio = new Studio();
        studio.setMovieBuilder(movieBuilder);

        Movie movie = studio.makeMovie("战狼3", 120L, "吴京", "吴京", "动作片");

        System.out.println(movie);
    }

    /**
     * 测试建造者模式内部类实现
     */
    @Test
    public void testInnerBuilder() {
        // 链式调用
        Movie movie = new Movie.MovieInnerBuilder()
                .buildMovieName("让子弹飞")
                .buildMovieDirector("姜文")
                .buildMovieMainActor("姜文")
                .buildMovieDuration(120)
                .buildMovieTypeName("喜剧")
                .build();
        System.out.println(movie);
    }
}