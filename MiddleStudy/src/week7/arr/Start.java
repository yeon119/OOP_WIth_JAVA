package week7.arr;

public class Start {
    public static void main(String[] args) {
        int[] s1 = new int[3];
        int[] s2 = new int[]{1, 2, 3};
        int[] s3 = {1, 2, 3};

        s1[1] = 4;
        int temp = s1[2];

        int len = s1.length;

        for (int i = 0; i < len; i++) {
            System.out.println(s1[i]);
        }
        len = s1.length > s2.length ?
                s2.length : s1.length;
        System.arraycopy(s2, 0, s1, 0, len);
        for (int s : s1) {
            System.out.println(s);
        }
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "");
            }
            System.out.println();
        }
        for (var d1 : arr) {
            for (var d2 : d1) {
                System.out.print(d2 + "");
            }

        }


        Book[] books = new Book[2];
        books[1] = new Book("태백산백", "조정래");
        for (var book : books) {
            System.out.println(book);
            if (book != null) {
                System.out.println(book.getInfo());
            }
        }

        books[0] = new Book("향수","쥐스킨트");

        Book[] books2 = new Book[books.length];

        System.arraycopy(books,0,books2,0,books.length);




    }
}
