package top.learningwang.builder;

/**
 * @author wangjingbiao
 * @date 2020/11/08 17:52
 * 抽象建造者
 */
public abstract class MovieBuilder {
    /**
     * 为电影构建名称属性
     * @param name 名称
     */
    public abstract void buildMovieName(String name);

    /**
     * 为电影构建时长属性
     * @param duration 时长
     */
    public abstract void buildMovieDuration(long duration);

    /**
     * 为电影构建导演属性
     * @param director 导演
     */
    public abstract void buildMovieDirector(String director);

    /**
     * 为电影构建主演属性
     * @param mainActor 主演
     */
    public abstract void buildMovieMainActor(String mainActor);

    /**
     * 为电影构建分类属性
     * @param typeName 分类名称
     */
    public abstract void buildMovieTypeName(String typeName);

    /**
     * 构建电影
     * @return 构建结果
     */
    public abstract Movie makeMovie();
}
