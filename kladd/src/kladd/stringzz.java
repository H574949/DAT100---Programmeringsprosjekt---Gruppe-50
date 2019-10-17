package kladd;
import java.text.DecimalFormat;
public class stringzz {

	public static void main(String[] args) {
		
		//String timestr = "abcdefgdposakdposak";
		
		
		double x = Math.pow(5, 2);
		//System.out.print(hour+" "+minutes+" "+sekunder+x);
		
		int hours = 15;
		int mins = 15;
		int seconds = 7;
		double d = 1.412;
		System.out.print("uten endring:"+d);
		
		double time = 200.3456;
		DecimalFormat df = new DecimalFormat("#.##");      
		d = Double.valueOf(df.format(d)); 
		
		String dis = Double.toString(d);
		
		
		System.out.print("med endring: "+dis);
		
	}
}
