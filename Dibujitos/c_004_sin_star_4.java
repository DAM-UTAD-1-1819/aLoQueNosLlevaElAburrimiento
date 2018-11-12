
public class c_004_sin_star_4 {
	public static void main(String[] args) {
		for (int y = 50;y>-50;y--) {
			for (int x = -120;x<120;x++) {
				double f = Math.abs(x) * Math.sin( Math.abs(y*0.002) );
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
					if (y<0) {
						System.out.print(":");
					}
					else {
						System.out.print(";");
					}
				}
				else if (f < 0.2) {
					if (y<0) {
						System.out.print("'");
					}
					else {
						System.out.print(".");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}

	}

}
