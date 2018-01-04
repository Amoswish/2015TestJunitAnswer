
public class Complex {
	public int RealPart;
	public int ImaginPart;
	
	public Complex() {RealPart=ImaginPart=0;}
	public Complex(int r,int i) {RealPart=r; ImaginPart=i;}
	
	public Complex complexAdd(Complex a) {
		return new Complex(RealPart+a.RealPart,ImaginPart+a.ImaginPart);
	}
	
	public String toStringC(){
		return RealPart + "+" + ImaginPart + "i";
	}
}
