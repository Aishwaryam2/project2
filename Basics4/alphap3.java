class alphap3{
	public static void main(String[] args){
		int alphabet = 65; 
        for (int i= 0; i<= 5-1 ; i++)
        {
            for (int j=5-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alphabet+k));
            }
            for(int l=i-1; l>=0 ;l--)
            {
                System.out.print((char) (alphabet+l));
            }
            System.out.println();
        }
      } } 