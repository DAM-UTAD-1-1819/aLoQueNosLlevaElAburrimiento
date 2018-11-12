import java.util.Scanner;

public class median_generator {

	private static Scanner in;
	
	public static int iterations = 0;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("introduce a positive integer: ");
		int num = in.nextInt();
		System.out.println(generate_median_expression(num));
		System.out.println("iterations: " + iterations);
	}
	
	static String generate_median_expression(int a) {
		if (a > 0) {
			String s = "";
			for (int i = 0;i<a;i++) {
				s = s + "1";
			}
			return find_high(s,s);
		}
		else {
			return "Error: you must introduce a positive integer";
		}
		
	}
	
	static String remove_selected(String total, String substracted) {
		int toremove = find_nth(0,substracted);
		String forward = "";
		for (int i = 0;i<total.length();i++) {
			if (i == toremove) {
				forward = forward + "0";
			}
			else {
				forward = forward + total.charAt(i);
			}
		}
		return (forward);
	}

	static String find_high(String a,String original) {
		iterations++;
		int sum = 0;
		int last_i = 0;
		for (int i = 0;i<a.length();i++) {
			if(a.charAt(i) == '1') {
				sum++;
				last_i = i;
			}
		}
		if (sum == 1) {
			if (a.equals(original)) {
				return "v" + Integer.toString(last_i);
			}
			else {
				return find_low(remove_selected(original,a),remove_selected(original,a));
			}
		}
		else {
			return ("( v" + find_nth(0,a) + "<v" + find_nth(1,a) + " ? " + find_high(remove_nth(0,a),original) + " : " + find_high(remove_nth(1,a),original) + " )");
		}
		
	}
	
	static String find_low(String a,String original) {
		iterations++;
		int sum = 0;
		int last_i = 0;
		for (int i = 0;i<a.length();i++) {
			if(a.charAt(i) == '1') {
				sum++;
				last_i = i;
			}
		}
		if (sum == 1) {
			if (a.equals(original)) {
				return "v" + Integer.toString(last_i);
			}
			else {
				return find_high(remove_selected(original,a),remove_selected(original,a));
			}
		}
		else {
			return ("( v" + find_nth(0,a) + ">v" + find_nth(1,a) + " ? " + find_low(remove_nth(0,a),original) + " : " + find_low(remove_nth(1,a),original) + " )");
		}
		
	}
	
	static String remove_nth(int n,String ones) {
		int pos = 0;
		int count = 0;
		while (count <= n) {
			if(ones.charAt(pos) == '1') {
				count++;
			}
			pos++;
			//System.out.println(count + " " + pos);
		}
		String fixed_ones = "";
		for (int i = 0;i<ones.length();i++) {
			if (i == pos - 1) {
				fixed_ones = fixed_ones + "0";
			}
			else {
				fixed_ones = fixed_ones + ones.charAt(i);
			}
		}
		return (fixed_ones);
		
	}
	
	static int find_nth(int n,String ones) {
		int pos = 0;
		int count = 0;
		while (count <= n) {
			if(ones.charAt(pos) == '1') {
				count++;
			}
			pos++;
		}
		return (pos - 1);
	}
}
