package newProject;

public class helloWorld {

	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println(str);
		String[] prod = str.split(" ",2);
		for(String s :prod)
		System.out.println(s);
		StringBuffer sa = new StringBuffer(str);
		System.out.println(sa);

	}

}
