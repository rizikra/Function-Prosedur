import java.util.Scanner;

public class TugasPilihanMenu{
    public static void println(Object obj){
        System.out.println(obj);
    }
    public static void baris(Object obj){
        System.out.print(obj);
    }

    public static double LuasSegitiga(double a,double t){
        double hasil = (a*t)/2;
        return hasil;
    }
    public static double VolumeBalok(double p, double l, double t){
        double hasil = p*l*t;
        return hasil;
    }
    public static double VolumePrismaSegitiga(double p, double l, double t){
        double hasil = (p*l*t)/2;
        return hasil;
    }
    public static double VolumeKerucut(double r, double t){
        double pi = 3.1415926;
        double hasil = (pi*r*r*t)/3;
        return hasil;
    }

    public static void main(String[] args){
        boolean CekHasil = true;
        while(CekHasil == true){
            menu();
        }

    }
    public static void menu(){
        try{
            Scanner input = new Scanner (System.in);
            println ("=============================");
            println ("SELAMAT DATANG DI PROGRAM MATEMATIKA");
            println ("1. Hitung Luas Segitiga");
            println ("2. Hitung Volume Balok");
            println ("3. Hitung Volume Prisma Segitiga");
            println ("4. Hitung Volume Kerucut");
            println ("5. Keluar");
            println ("Silakan pilih menu yang kamu mau : ");
            int pilih = input.nextInt();
			
            switch(pilih){
                case 1:
                baris ("alas = ");double a = input.nextDouble();
                baris ("tinggi = ");double t = input.nextDouble();
                println("Hasil = " +LuasSegitiga(a,t));
				println("");
				println("Selanjutnya, Silakan pilih menu yang kamu mau : ");
				println("");
                break;
                case 2:
                baris ("panjang = "); double p = input.nextDouble();
                baris ("lebar = "); double l = input.nextDouble();
                baris ("tinggi = "); double t1 = input.nextDouble();
                println("Hasil =" +VolumeBalok(p,l,t1));
				println("");
				println("Selanjutnya, Silakan pilih menu yang kamu mau : ");
				println("");
                break;
                case 3:
                baris ("panjang = "); double p1 = input.nextDouble();
                baris ("lebar = "); double l1 = input.nextDouble();
                baris ("tinggi = "); double t2 = input.nextDouble();
                println("Hasil =" +VolumePrismaSegitiga(p1,l1,t2));
				println("");
				println("Selanjutnya, Silakan pilih menu yang kamu mau : ");
				println("");
                break;
                case 4:
                baris ("jari-jari = "); double r = input.nextDouble();
                baris ("tinggi = ");  double t3 = input.nextDouble();
                println("Hasil =" +VolumeKerucut(r,t3));
				println("");
				println("Selanjutnya, Silakan pilih menu yang kamu mau : ");
				println("");
                break;
                default:
                System.exit(0);
            }
        }
        catch (Exception e){
            println("Data haruslah angka");
        }
    }
}