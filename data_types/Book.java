/**
 * 
 */
package data_types;

/**
 * @author pankaj
 *
 */
public enum Book {
	
	JHTP("Java how to program", "2012"),
	CHTP("C, how to program", "2014");
	
	//instance variable
	private final String title;
	private final String copyrightYear;
	
	Book(String title, String year)
	{
		this.title = title;
		this.copyrightYear = year;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getCopyRightYear()
	{
		return copyrightYear;
	}
}// end Enum/
