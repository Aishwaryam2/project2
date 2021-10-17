class alphap6{
	public static void main(String[] args){
		int alphabet = 65; 

        for (int i= 0; i<= 6-1 ; i++)
        {
            for (int j=i; j<=6-1; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            for (int k=6-2; k>=i; k--)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
    }
}
