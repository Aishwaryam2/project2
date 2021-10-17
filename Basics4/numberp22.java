class numberp22{
	public static void main(String[] args){
	for (int i = 1; i <= 6; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("0 ");
            }
            System.out.print(i + " ");
            for (int k = i; k < 6; k++)
            {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}