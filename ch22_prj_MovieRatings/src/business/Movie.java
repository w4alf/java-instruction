package business;

public class Movie {
	
	private String title;
	private int year;
	private double rating;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, int year, double rating) {
		super();
		this.title = title;
		this.year = year;
		this.rating = rating;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", rating=" + rating + "]";
	}
	
	
	
}
