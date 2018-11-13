
public class c_009_mandelbrot {
	public static void main(String[] args) {
		int size = 60;
		int iterations = 100000;
		for (int y = size;y>-size;y--) {
			float miniy = (float)y/size;
			for (int x = -2*size;x<2*size;x++) {
				float minix = (float)x/(2*size) - 0.5f;
				float in_x=0;
				float in_y=0;
				int iteration = 0;
				while (in_x*in_x + in_y*in_y < 4 && iteration<iterations) {
					float xtmp = in_x*in_x - in_y*in_y + minix;
					in_y = 2*in_x*in_y + miniy;
					in_x = xtmp;
					iteration++;
				}
				if (iteration<iterations) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.printf("\n");
		}
		System.out.println("Done.");
	}

}