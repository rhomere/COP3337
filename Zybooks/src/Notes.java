
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer t = mystery(1,5); 
		System.out.println(t);
	}
	
	public static int mystery(int n, int m) 
	{
	   if (n == 0)
	   {
	      return 0;
	   }
	   if (n == 1)
	   {
	      return m;
	   }
	   return m + mystery(n - 1, m);
	}
	

}
