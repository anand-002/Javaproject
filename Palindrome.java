 
class Palindrome
{
    public static void main(String[] args)
    {
        int n=999;
        int rem=0;
        int rev=0;
        int temp=n;

        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        
        if(rev==temp)
        {
            System.out.println("PALINDROME");

        }
        else
            {
              System.out.println("NOT PALINDROME");  
            }
    }
}