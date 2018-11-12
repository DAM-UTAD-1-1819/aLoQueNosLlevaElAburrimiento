
public class c_005_sin_star_6 {
	public static void main(String[] args) {
		for (int y = 50;y>-50;y--) {
			for (int x = -120;x<120;x++) {
				double a = Math.abs(x-y) * Math.sin( Math.abs(y*0.002) );
				double b = Math.abs(x+y) * Math.sin( Math.abs(y*0.002) );
				double f = (a<b?a:b);
				if (f < 0.02) {
					System.out.print("@");
				}
				else if (f < 0.05) {
					System.out.print("#");
				}
				else if (f < 0.10) {
					System.out.print("*");
				}
				else if (f < 0.15) {
					System.out.print(":");
				}
				else if (f < 0.2) {
					System.out.print("·");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}

	}

}
