package data_types;

public class EnumTest {

	public static void main(String[] args) {
		
		for (Book book: Book.values())
		{
			System.out.println(book.getTitle());
			System.out.println(book.getCopyRightYear());
		}

	}
}