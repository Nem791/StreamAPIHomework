import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieRepo movieRepo = new MovieRepo();
//        movieRepo.printList();

        List<Movie> list = movieRepo.movieArrayList;
        // Hiển thị tất cả các bộ phim
//        list.stream().forEach(m -> {
//            System.out.println(m);
//        });

//        Lấy ra 3 bộ phim có lượt xem cao nhất
        list.stream()
                .sorted(Comparator.comparingInt(Movie::getViews).reversed())
                .limit(3)
                .forEach(System.out::println);

//        Liệt kê phim theo category
        Scanner sc = new Scanner(System.in);
        System.out.print("Category: ");
        String category = sc.nextLine();
        list.stream()
                .filter(m -> m.getCategory().getValue().equals(category))
                .forEach(System.out::println);

//        Liệt kê phim theo thể loại
        System.out.print("Genre: ");
        String genre = sc.nextLine();
        list.stream()
                .filter(m -> m.getGenre().toLowerCase().equals(genre.toLowerCase()))
                .forEach(System.out::println);
    }
}
