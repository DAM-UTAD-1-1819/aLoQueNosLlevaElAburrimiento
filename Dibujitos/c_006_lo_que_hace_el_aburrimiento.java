
public class c_006_lo_que_hace_el_aburrimiento {
	public static void main(String[] args) {
		for (int y = 50;y>-50;y--) {
			//System.out.printf("%3.0f",(double)y);
			for (int x = -60;x<60;x++) {
				double glans = (Math.abs(x*0.014) - Math.sqrt((-y+45)*0.005)) * (Math.abs(x*0.09)+0.3 - 6 * Math.sqrt((y-25)*0.0009));
				double shaft = (Math.abs(Math.pow(x*0.04,8)) + 2 + Math.signum(y-35) - Math.signum(y+25));
				double balls = Math.pow(Math.pow((Math.abs(x)-25)*0.03,2) + Math.pow((y+25)*0.05,2),4);
				double f = 1;
				f = (f<glans?f:glans);
				f = (f<shaft?f:shaft);
				f = (f<balls?f:balls);
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
