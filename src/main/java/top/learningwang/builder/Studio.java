package top.learningwang.builder;

/**
 * @author wangjingbiao
 * @date 2020/11/08 18:04
 * 制片厂，持有电影建造者抽象类
 */
public class Studio{
    private MovieBuilder movieBuilder;

    public void setMovieBuilder(MovieBuilder movieBuilder) {
        this.movieBuilder = movieBuilder;
    }

    public Movie makeMovie(String name, long duration, String director, String mainActor, String typeName) {
        if (this.movieBuilder == null) {
            return null;
        }

        this.movieBuilder.buildMovieName(name);
        this.movieBuilder.buildMovieDuration(duration);
        this.movieBuilder.buildMovieDirector(director);
        this.movieBuilder.buildMovieMainActor(mainActor);
        this.movieBuilder.buildMovieTypeName(typeName);
        return this.movieBuilder.makeMovie();
    }
}
