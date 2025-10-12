import java.util.Scanner;
import java.math.*;
public class Vjezbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Scanner unos = new Scanner(System.in); 
		
		float x1, x2;
		
		System.out.println("Unesite prvi broj: ");
		x1 = unos.nextFloat();
		
		System.out.println("Unesite drugi broj: ");
		x2 = unos.nextFloat();
		
		if (x1>x2) {
			System.out.println("Prvi broj je veći");
		} else if (x2>x1) {
			System.out.println("Drugi broj je veći");
		} else {
			System.out.println("Jednaki su.");
		}
	} */
		
		
		/* Scanner unos = new Scanner(System.in);
		
		float a, b, povrsina, obim;
		
		System.out.println("Unesite dužine stranica pravugaonika");
		a= unos.nextFloat();
		b= unos.nextFloat();
		
		povrsina=a*b;
		obim=2*(a+b);
		
		System.out.printf("Površina pravugaonika je %.2f, a obim je %.2f", povrsina, obim);
		*/
		
		/* int x1, x2, y1, y2, a, b, p, o;
		
		x1=2;
		y1=5;
		x2=7;
		y2=10;
		
		a=x2-x1;
		b=y2-y1;
		
		p=a*b;
		o=2*a+2*b;
		
		System.out.printf("Površina zida je %d, a obim %d.", p, o);
		*/
		
		/* float x1, x2, y1, y2, rastojanje_od_h_do_k, pozBlagaX, pozBlagaY, rastojanje_od_h_do_blaga;
		
		x1=2;
		y1=5;
		x2=7;
		y2=10;
		
		// pozicija Hrasta(x1,y1), pozicija Kuće (x2,y2)
		
		rastojanje_od_h_do_k=(float)Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		pozBlagaX=x2+2;
		pozBlagaY=y2-3;
		
		rastojanje_od_h_do_blaga= (float) Math.sqrt(Math.pow(pozBlagaX-x1, 2)+Math.pow(pozBlagaY-y1, 2));
		
		System.out.printf("Rastojanje od hrasta do kuće je %.2f, a od hrasta do blaga %.2f", rastojanje_od_h_do_k,
		rastojanje_od_h_do_blaga);
		*/
		
		/* Scanner sc = new Scanner(System.in);
		int N, br_sati, zarada;
		
		zarada=0;
		N=3;
		
		for (int i=1; i<=N; i++) {
			System.out.println("Unesite koliko je sati auto bilo na parkingu:");
			br_sati = sc.nextInt();
			
			if (br_sati>5)
				zarada+=10 + (br_sati-5);
			else
				zarada+=2*br_sati;
		}
		sc.close(); // kad se zavrsi sa unosima ovako se zatvara scanner, radi se za neke kompleksnije stvari
		System.out.printf("Ukupna zarada je %d EUR.", zarada);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int x_poz_drona=1;
		int y_poz_drona=1;
		int N, x_poz_paketa, y_poz_paketa, predjeni_put_drona=0;
		
		System.out.print("Unesite broj paketa: ");
		N= sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.printf("Unesite koordinate paketa %d", i);
			x_poz_paketa= sc.nextInt();
			y_poz_paketa= sc.nextInt();
			
			if (x_poz_paketa > 0 && y_poz_paketa>0) 
				predjeni_put_drona+= (float) (Math.sqrt(Math.pow(x_poz_drona-x_poz_paketa, 2)+
				Math.pow(y_poz_drona-y_poz_paketa, 2)))*2;
			else
				continue;
			
			
			
		}
	}
}

