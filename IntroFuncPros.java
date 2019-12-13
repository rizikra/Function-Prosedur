public class IntroFuncPros {
	public static void main (String[] args){ //Prosedur
		int a = 5;
		int b = 2; //a=15, b=2 itu adalah argumen
		
		//prosedur HitungLuasSegitiga () digunakan.
		HitungLuasSegitiga (a,b);
		HitungLuasSegitiga (15,2);
		double LuasLingkaran1 = HitungLuasLingkaran(7);
		System.out.println(LuasLingkaran1);
		HitungVolumeTabung(7, 2);
	}

	//membuat prosedur
	public static void HitungLuasSegitiga (int alas, int tinggi){ //alas dan tinggi adalah parameter
		double Luas = (alas * tinggi)/2;
		System.out.println(Luas);
	}
	
	public static double HitungLuasLingkaran(double r){//function
		final double pi = 3.14;
		double Luas = r*r*pi;
		return Luas;
	}
	
	public static void HitungVolumeTabung(double r, double t){
		double LuasLingkaran = HitungLuasLingkaran(r);
		double Volume = LuasLingkaran * t;
		System.out.println(Volume);
	}
}	