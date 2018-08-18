class AssertTest
{
   static int n=5;
   static int m1()
   {
       return --n;
   }
   public static void main( String args[])
   {
        for(int i=1; i<=10 ; i++)
        {
            int ans=m1();
             //assert ans>0;
             // or
            assert(ans>0): "0 or negative number";
            System.out.println(ans);
        }
   }
}