class alphap8{
	public static void main(String[] args){
		int alphabet = 65; 
		for (int i= 0; i<= 6-1 ; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=6-1; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
        for (int i= 6-1; i>= 0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=6-1; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
    }
}