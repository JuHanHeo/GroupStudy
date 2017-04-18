package study02;

public class Main {
	public static void main(String[] args) {
		double a[] = {4,3,5,0};
		double b[] = {3,1,0,2,1};
		
		Polynomial A = new Polynomial(a);
		Polynomial B = new Polynomial(b);
		OperatePoly opt = new OperatePoly();
		Polynomial C = opt.addPoly(A, B);
		A.printPoly();
		B.printPoly();
		C.printPoly();
	}
}
