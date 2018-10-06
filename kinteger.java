import java.io.*; 
class kinteger
{  
static int binomialCoeff(int n,int k) 
{ 
    int []C = new int[k + 1]; 
    C[0] = 1;
  
    for (int i = 1; i <= n; i++)  
    {
        for (int j = Math.min(i, k); j > 0; j--) 
            C[j] = C[j] + C[j - 1]; 
    } 
    return C[k]; 
} 
static int countArray(int N, int K) 
{ 
    return binomialCoeff(K - 1, N - 1); 
}  
public static void main (String[] args)  
{ 
        int N = 2, K = 3; 
  
System.out.println( countArray(N, K)); 
} 
} 