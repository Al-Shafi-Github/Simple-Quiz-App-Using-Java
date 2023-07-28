import java.io.*;
public class Player {
	private String name;
	private int score;
	private java.util.Date date;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Player() {
		super();
		date=new java.util.Date();
	}
	public Player(String name) {
		super();
		this.name = name;
		date=new java.util.Date();
	}
	@Override
	public String toString() {
		return score+" - "+name+"  -  "+date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFile()throws IOException{
		File file = new File("Score.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter in=new BufferedWriter(fr);
		in.write(toString());
		in.write("\r\n");
		in.close();
	}
	
	

}
