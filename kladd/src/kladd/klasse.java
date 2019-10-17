package kladd;

public class klasse {
	int personnr;
	String navn;
	String hobby;

	public klasse(int persnr, String forn, String hob) {
	personnr = persnr;
	navn = forn;
	hobby = hob;
	
	
	}
	
	public void skrivut() { 
		System.out.print(personnr+" "+ navn+" "+ hobby);
	}
	
	
}
