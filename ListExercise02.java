import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();
        list.add(new Book("三国演义", 234.5, "罗贯中"));
        list.add(new Book("红楼梦", 534.5, "曹雪芹"));
        list.add(new Book("西游记", 135.5, "吴承恩"));

        //对集合进行排序
        sort(list);


        for (Book book : list) {
            System.out.println(book);

        }
    }



    public static void sort(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }

            }
        }
    }

static class Book {
        private String name;
        private double price;
        private String author;

        public Book(String name, double price, String saka) {
            this.name = name;
            this.price = price;
            this.author = saka;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSaka() {
            return author;
        }

        public void setSaka(String saka) {
            this.author = saka;
        }

        @Override
        public String toString() {
            return "名称：" + name + "\t\t价格：" + price +
                    "\t\t作者:" + author;
        }
    }
}
