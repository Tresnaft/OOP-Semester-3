class Floating_Point{
	public static void main(String[] args) {
		double x = 92.98;
//		int nx = (int) x;
		int nx = (int) Math.round(x);
		System.out.println("nx = " + nx);
	}
}