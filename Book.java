import java.util.*;

class BookStore
{
    public int Price;
    public String Name;
    public String Author;

    public BookStore(int i, String j)
    {
        this.Price = i;
        this.Name = j;
    }

    void Accept()
    {

    }

    void Display()
    {
        System.out.println("Book name is:"+this.Name+ "Book price is :"+this.Price);
        System.out.println("Succes");
    }


}

class  Book
{
    public static void main(String a[])
    {
        LinkedList <BookStore> lobj = new LinkedList<BookStore>();

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many book details u entered at thiss time:");
        int iSize = sobj.nextInt();

        for(int i=0; i<=iSize; i++)
        {
            System.out.println("Enter Book Name:");
            String Name = sobj.nextLine();

            System.out.println("Enter Book price:");
            int Price = sobj.nextInt();
        }

            BookStore bobj = new BookStore(Price,Name);

        lobj.add(bobj);
        

    }
}
