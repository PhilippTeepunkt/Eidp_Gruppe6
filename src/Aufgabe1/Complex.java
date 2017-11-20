package Aufgabe1;
public class Complex {

	private final float a;
	private final float b;

	public Complex(float A, float B) {
		// init
		a = A;
		b = B;
	}

	// static calculation methods
	public static Complex add(Complex s1, Complex s2) {

		float sum1;
		float sum2;

		// (a,b)+(c,d)=(a+c,b+d)
		sum1 = s1.a + s2.a;
		sum2 = s1.b + s2.b;

		Complex Ergebnis = new Complex(sum1, sum2);
		return Ergebnis;
	}

	public static Complex mult(Complex fak1, Complex fak2) {

		float pro1;
		float pro2;

		// (a,b)*(c,d) = (a*c - b*d , a*d+b*c)
		pro1 = fak1.a * fak2.a;
		pro1 = pro1 - fak1.b * fak2.b;

		pro2 = fak1.a * fak2.b;
		pro2 += fak1.b * fak2.a;

		Complex Ergebnis = new Complex(pro1, pro2);
		return Ergebnis;
	}

	// type conversation for better output
	public String toString() {
		String output = "(" + this.a + "," + this.b + ")";
		return output;
	}

	// comparison
	public boolean equals(Complex z) {

		if (z.a == this.a && z.b == this.b) {
			return true;
		} else {
			return false;
		}
	}
}
