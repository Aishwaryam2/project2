class alphap10{
	public static void main(String[] args){
		  int alphabet = 65; 
		for (int i= 0; i<= 6-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print((char) (alphabet + j)+ " ");
            }
            for (int k=i-1; k>=0; k--)
            {
                System.out.print((char) (alphabet + k)+ " ");
            }
            System.out.println("");
        }
}
}