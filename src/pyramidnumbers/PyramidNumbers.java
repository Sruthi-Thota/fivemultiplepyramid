
package pyramidnumbers;

public class PyramidNumbers 
{

    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {
          for(int j=5;j<=i*5-1;j+=5)
          {
            System.out.print(j+" ");
          }
           System.out.println();
        }   
    }
 }
