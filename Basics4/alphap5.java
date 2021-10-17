class alphap5{
	public static void main(String[] args){
		 int alphabet = 65; 
		for (int i= 0; i<= 6-1 ; i++)
        {
            for (int j=5-1; j>i; j--)
            {
                System.out.printf("A"+" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println("");
}
    }
}