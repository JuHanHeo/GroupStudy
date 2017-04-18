package study02;

public class OperatePoly {
	
	public Polynomial addPoly(Polynomial a, Polynomial b){
		double[] result = new double[(a.getDegree()>=b.degree)?a.getDegree():b.getDegree()];
		
		int aDegree = a.getDegree();
		int bDegree = b.getDegree();
		int maxDegree = result.length;
		int apoint = 0;
		int bpoint = 0;
		int rpoint = 0;
		
		do {
			if(aDegree == bDegree){
				result[rpoint] = a.getNum(apoint)+b.getNum(bpoint);
				apoint++;bpoint++;rpoint++;
				aDegree--;bDegree--;
			}
			else if(aDegree>bDegree){
				result[rpoint] = a.getNum(apoint);
				apoint++;rpoint++;
				aDegree--;

			}
			else if(aDegree<bDegree){
				result[rpoint] = b.getNum(bpoint);
				bpoint++;rpoint++;
				bDegree--;
			}
		} while (aDegree!=0 && bDegree!=0);
			
		
		return new Polynomial(result);
	}

}
