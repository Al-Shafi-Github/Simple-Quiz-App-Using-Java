import java.io.*;

public class InternationalAffairs extends Player {
	File file = new File("IA.txt");
	private String q1;
	private String q2;
	private String q3;
	private String o1;
	private String o2;
	private String o3;
	private String a1;
	private String a2;
	private String a3;

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
	}

	public String getO1() {
		return o1;
	}

	public void setO1(String o1) {
		this.o1 = o1;
	}

	public String getO2() {
		return o2;
	}

	public void setO2(String o2) {
		this.o2 = o2;
	}

	public String getO3() {
		return o3;
	}

	public void setO3(String o3) {
		this.o3 = o3;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public InternationalAffairs(String name)throws IOException {
		super(name);
		BufferedReader in=new BufferedReader(new FileReader(file));
		q1=in.readLine();
		o1=in.readLine();
		a1=in.readLine();
		q2=in.readLine();
		o2=in.readLine();
		a2=in.readLine();
		q3=in.readLine();
		o3=in.readLine();
		a3=in.readLine();
	}

	public InternationalAffairs()throws IOException{
		super();
		BufferedReader in=new BufferedReader(new FileReader(file));
		q1=in.readLine();
		o1=in.readLine();
		a1=in.readLine();
		q2=in.readLine();
		o2=in.readLine();
		a2=in.readLine();
		q3=in.readLine();
		o3=in.readLine();
		a3=in.readLine();
	}

}
