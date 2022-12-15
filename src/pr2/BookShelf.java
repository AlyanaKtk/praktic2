package pr2;

public class BookShelf
{
    Book [] books =  new Book[10];
    int a = books.length;
    public Book returnlatest()
    {
        int l = 0;
        Book latest = new Book();

        for (int i = 0; i < a; i++)
        {
            if (books[i].date >l)
            {
                l = books[i].date;
                latest = books[i];
            }

        }
        return latest;
    }
    public Book returnearliest()
    {
        int l = 2023;
        Book earliest = new Book();

        for (int i = 0; i < a; i++)
        {
            if (books[i].date < l)
            {
                l = books[i].date;
                earliest = books[i];
            }

        }
        return earliest;
    }
    public void sortbooks() {
        boolean isSorted = false;
        Book bb;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].date > books[i + 1].date) {
                    isSorted = false;

                    bb = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = bb;
                }
            }
        }
    }
}

