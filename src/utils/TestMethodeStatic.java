package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "15";
		int chiffre = Integer.parseInt(chaine);
		
		int a = 99;
		int b = 25;
		
		int appelMethodeMax = Integer.max(a, b);
		System.out.println(appelMethodeMax);

	}

}
