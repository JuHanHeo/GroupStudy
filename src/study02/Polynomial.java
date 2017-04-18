package study02;

public class Polynomial {
	
	double[] poly;
	int degree;
	
	public Polynomial(double[] p) {
		// TODO Auto-generated constructor stub
		this.poly = p;
		this.degree = p.length;
	}
	
	public int getDegree(){
		return degree;
	}
	
	public double[] getPoly(){
		return poly;
	}
	public double getNum(int i){
		return poly[i];
	}
	public void printPoly(){
		
		int tmp=degree;
		
		for(int i=0;i<tmp;i++){
			System.out.print(poly[i] + "x^" + (tmp-i)+"  ");
		}
		System.out.println();
		
	}

}
