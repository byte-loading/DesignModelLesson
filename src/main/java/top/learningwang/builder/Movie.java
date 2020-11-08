package top.learningwang.builder;

/**
 * @author wangjingbiao
 * @date 2020/11/08 17:46
 * 基础bean
 *
 * 建造者模式
 * 定义：将一个复杂对象的构建和它的表示分离，使得同样的构建过程过程可以创建不同的表示
 *
 * 适用场景：
 * 1. 一个对象有非常复杂的内部结构
 * 2. 想把复杂对象的创建和使用分离
 *
 * 优点：
 * 1. 封装性好，创建和使用分离
 * 2. 扩展性好，建造类之间独立，一定程度上解耦
 *
 * 缺点：
 * 1. 产生多余的builder对象
 * 2. 产品内部发生变化，建造者都要修改，成本较大
 */
public class Movie {
    /**
     * 电影名称
     */
    private String name;
    /**
     * 时长
     */
    private long duration;
    /**
     * 导演
     */
    private String director;
    /**
     * 主演
     */
    private String mainActor;
    /**
     * 分类名称
     */
    private String typeName;

    public Movie() {
    }

    /**
     * 注入建造者模式bean
     * @param movieInnerBuilder 建造者bean
     */
    public Movie(MovieInnerBuilder movieInnerBuilder) {
        this.name = movieInnerBuilder.name;
        this.duration = movieInnerBuilder.duration;
        this.director = movieInnerBuilder.director;
        this.mainActor = movieInnerBuilder.mainActor;
        this.typeName = movieInnerBuilder.typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", mainActor='" + mainActor + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    /**
     * 建造者模式内部实现，相比较于外部实现，内部实现的方式用的更多
     */
    public static class MovieInnerBuilder {
        /**
         * 电影名称
         */
        private String name;
        /**
         * 时长
         */
        private long duration;
        /**
         * 导演
         */
        private String director;
        /**
         * 主演
         */
        private String mainActor;
        /**
         * 分类名称
         */
        private String typeName;

        public MovieInnerBuilder buildMovieName(String name) {
            this.name = name;
            return this;
        }

        public MovieInnerBuilder buildMovieDuration(long duration) {
            this.duration = duration;
            return this;
        }

        public MovieInnerBuilder buildMovieDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieInnerBuilder buildMovieMainActor(String mainActor) {
            this.mainActor = mainActor;
            return this;
        }

        public MovieInnerBuilder buildMovieTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }

    }
}
