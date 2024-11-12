/* Alex McLaurin 11-5-2024
Radio station KJAVA wants a class to keep track of recordings it plays. 
Create a class named Recording that contains fields to hold methods for setting and getting a Recording’s title, artist, and playing time in seconds. Save the file as Recording.java.
*/

public class Recording {
	
	private String title;
	private String artist;
	private int time;
	
	
	
	public Recording(String title, String artist, int time) {
		this.setTitle(title);
		this.setTime(time);
		this.setArtist(artist);
	}
	
	void printProperties() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Artist: " + this.getArtist());
		System.out.println("Time: " + this.getTime());
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}

}
