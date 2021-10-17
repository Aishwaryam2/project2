class alphap7{
	public static void main(String[] args){
		int alphabet = 65; 

        for (int i= 0; i<= 7-1 ; i++)
        {
            for (int j=7-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
        for (int i= 0; i<= 7-1 ; i++)
        {
            for (int j=-1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=7-2-i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
}}