public class LinearEquation{
	test test1 = new test(a,b,c,d,e,f);
	int c =0;
	int d =0;
	int e =0;
	int f =0;
	boolean ii = test1.isSolvable();
	double x;
	double y;
	
	if(ii==true){
		x = test1.X_answer();
		y = test1.Y_answer();
		System.out.println("x:" + x + "  y:"+y);
	}
	else{
	System.out.println("The equation has no solution");
	}
	
	}

	
	}
	class test{
	
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	
	
	test(int a,int b,int c,int d,int e,int f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public int geta(){
		return  a;
	}
	public int getb(){
		return  b;
	}
	public int getc(){
		return  c;
	}
	public int getd(){
		return d;
	}
	public int gete(){
		return  e;
	}
	public int getf(){
		return  f;
	}
	boolean isSolvable(){
		if (a*d - b*c != 0)
		return true;
	}
	public double X_answer(){
		return (gete()*getd()-getb()*getf())/(geta()*getd()-getb()*getc());
	}
	public double Y_answer(){
		return (geta()*getf()-gete()*getc())/(geta()*getd()-getb()*getc());
	}
	}
