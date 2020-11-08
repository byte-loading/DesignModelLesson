package top.learningwang.builder;

/**
 * @author wangjingbiao
 * @date 2020/11/08 18:00
 * 电影类建造者,放到外部来实现
 */
public class MovieActualBuilder extends MovieBuilder {
    private Movie movie = new Movie();

    @Override
    public void buildMovieName(String name) {
        movie.setName(name);
    }

    @Override
    public void buildMovieDuration(long duration) {
        movie.setDuration(duration);
    }

    @Override
    public void buildMovieDirector(String director) {
        movie.setDirector(director);
    }

    @Override
    public void buildMovieMainActor(String mainActor) {
        movie.setMainActor(mainActor);
    }

    @Override
    public void buildMovieTypeName(String typeName) {
        movie.setTypeName(typeName);
    }

    @Override
    public Movie makeMovie() {
        return movie;
    }
}
