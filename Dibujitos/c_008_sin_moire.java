
public class c_008_sin_moire {
	public static void main(String[] args) {
		for (int y = 50;y>-50;y--) {
			for (int x = -120;x<120;x++) {
				double f = Math.abs(x-y) * Math.sin( Math.abs(y*0.002) );
				f = (f%1<0.5?f%1:-f%1+1);
				if (f < 0.05) {
					System.out.print("@");
				}
				else if (f < 0.1) {
					System.out.print("#");
				}
				else if (f < 0.15) {
					System.out.print("*");
				}
				else if (f < 0.2) {
					System.out.print(":");
				}
				else if (f < 0.3) {
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
