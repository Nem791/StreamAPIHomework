import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MovieRepo {
    public List<Movie> movieArrayList;

    Random random = new Random();

    public MovieRepo() {
        movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Hanh dong", Category.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", Category.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", Category.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Kinh di", Category.TV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Hanh dong", Category.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Vien tuong", Category.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Vien tuong", Category.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
        movieArrayList.add(new Movie(random.nextInt(100 - 1 + 1) + 1, "Phim " + String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Dao dien " +  String.valueOf(random.nextInt(100 - 1 + 1) + 1), "Drama", Category.MV, random.nextInt(1000 - 1 + 1) + 1, random.nextInt(500 - 1 + 1) + 1));
    }


}
