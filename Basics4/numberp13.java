import java.util.*;
class numberp13{
	public static void main(String[] args){
	 for (int i = 1; i <= 5; i++)
        {
            int temp = i;
            for (int j = i; j >= 1; j--)
            {
                System.out.print(temp + " ");
                temp = temp + 5;
            }
            System.out.println();
        }
    }
}