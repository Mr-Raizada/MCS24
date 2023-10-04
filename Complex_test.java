//Rerpresenting the complex numbers 
class Complex
{	
	double real;
	double imag;
	Complex(double r, double i)
	{
		real = r;
		imag = i;
	}
	/* void assignReal(double r) {
        real = r;
    }

    void assignImag(double i) {
        imag = i;
    } */
	
	
	void showComplex()
	{
		System.out.println("The Complex Numbers is :" +real +"+i"+ imag);
	}
}
class Complex_test
{
	public static void main(String args[])
	{
		Complex R1 = new Complex(5,2);
		R1.showComplex();

	}
}
  