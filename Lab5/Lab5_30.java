//addition of 2*2 matrices
public class Lab5_30{  
    public static void main(String args[]){  
       
    int a[][]={{2,3},{8,5}};    
    int b[][]={{0,4},{1,7}};    
   
    int c[][]=new int[2][2];  
    
    for(int i=0;i<2;i++){    
    for(int j=0;j<2;j++){    
    c[i][j]=a[i][j]+b[i][j];    
    System.out.print(c[i][j]+" ");    
    }    
    System.out.println();  
    }    
    }
}