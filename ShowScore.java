import java.io.*;
import java.util.*;

public class ShowScore implements Sortable {
	private ArrayList<String> list = new ArrayList<String>();

	public ShowScore() throws IOException {
		File f = new File("Score.txt");
		Scanner out = new Scanner(f);
		while (out.hasNext()) {
			list.add(out.nextLine());
		}
		out.close();

	}

	public ArrayList<String> getList() {
		return list;
	}

	public ArrayList<String> sort() {
		Collections.sort(list);
		
		return list;
	}
	public void eraseFile()throws IOException {
		File f=new File("Score.txt");
		PrintWriter input=new PrintWriter(f);
		input.print("");
		
	}
	

}
