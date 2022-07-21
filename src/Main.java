import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
// Необходимо реализовать следующий метод:
//    1. На вход получаем список названий книг
//    2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
//    3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
//    4. Количество полок константное - 5 штук
//    5. Вернуть книги распределенные по полкам

    private static void distributeBooks(List<String> books) {
        if (books != null) {
            List<String> newBooks = books.stream().sorted().collect(Collectors.toList());
            //здесь пытаюсь округлить до целого
            int shelfSize = (int) Math.round(newBooks.size() / 5);

            List<String> shelf1 = newBooks.subList(0, shelfSize);
            List<String> shelf2 = newBooks.subList(shelfSize, shelfSize * 2);
            List<String> shelf3 = newBooks.subList(shelfSize * 2, shelfSize * 3);
            List<String> shelf4 = newBooks.subList(shelfSize * 3, shelfSize * 4);
            List<String> shelf5 = newBooks.subList(shelfSize * 4, newBooks.size());
            System.out.println("shelf1 = " + shelf1);
            System.out.println("shelf2 = " + shelf2);
            System.out.println("shelf3 = " + shelf3);
            System.out.println("shelf4 = " + shelf4);
            System.out.println("shelf5 = " + shelf5);
        } else {
            throw new IllegalArgumentException("List is empty");
        }

    }

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            books.add("book " + (i + 1));
        }
        books.add(1, "yandex");
        books.add(25, "alfa");
        books.add(15, "bank");

        distributeBooks(books);

    }
}
