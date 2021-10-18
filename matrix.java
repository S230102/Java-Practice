
import java.util.Scanner;
public class Project5 {

	public static void main(String[] args) {
		
          Scanner scan=new Scanner(System.in);
          System.out.println("Addtion of Matrix");
          System.out.println("Enter number of rows in matrix: ");
          int rows = scan.nextInt();
          System.out.println("Enter number of columns in matrix: ");
          int columns = scan.nextInt();
          
          int[][]matrix1=new int[rows][columns];
          int[][]matrix2=new int[rows][columns];
          
          System.out.println("Enter the elements in first matrix: ");
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  matrix1[i][j]=scan.nextInt();
        	  }
          }
          
          System.out.println("Enter the elements in second matrix: ");
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  matrix2[i][j]=scan.nextInt();
        	  }
          }
          
          int[][]addmatrix=new int[rows][columns];
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  addmatrix[i][j]=matrix1[i][j]+matrix2[i][j];
        	  }
          }
          
         
          System.out.println("First Matrix:");
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  System.out.println(matrix1[i][j]+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("Second Matrix:");
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  System.out.println(matrix2[i][j]+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("The sum of the two matrices is: ");
          for(int i=0;i<rows;i++){
        	  for(int j=0;j<columns;j++){
        		  System.out.println(addmatrix[i][j]+" ");
        	  }
        	  System.out.println();
          }
          
          System.out.println("Multiplication of matrix");
          System.out.println("Enter number of rows in first matrix:");
          int rowsmatrix3=scan.nextInt();
          System.out.println("Enter number of columns in first matrix/rows in matrix2");
          int columnsmatrix3rowsmatrix4=scan.nextInt();
          System.out.println("Enter number of columns in second matrix:");
          int columnsmatrix4 = scan.nextInt();
          
          int[][]matrix3=new int[rowsmatrix3][columnsmatrix3rowsmatrix4];
          int[][]matrix4=new int[columnsmatrix3rowsmatrix4][columnsmatrix4];
          System.out.println("Enter the third matrix in elements: ");
          for(int i=0;i<matrix3.length;i++){
        	  for(int j=0;j<matrix3[0].length;j++){
        		  matrix3[i][j]=scan.nextInt();
        	  }
          }
          System.out.println("Enter the fourth matrix in element:");
          for(int i=0;i<matrix4.length;i++){
        	  for(int j=0;j<matrix4[0].length;j++){
        		  matrix4[i][j]=scan.nextInt();
        	  }
          }
          
          int[][]mulmatrix=new int[rowsmatrix3][columnsmatrix4];
          for(int i=0;i<rowsmatrix3;i++){
        	  for(int j=0;j<columnsmatrix4;j++){
        		  for(int k=0;k<columnsmatrix3rowsmatrix4;k++){
        			  mulmatrix[i][j]=mulmatrix[i][j]+matrix1[i][k]*matrix2[k][j];
        		  }
        	  }
          }
          
          System.out.println("Third Matrix");
          for(int i=0;i<rowsmatrix3;i++){
        	  for(int j=0;j<columnsmatrix3rowsmatrix4;j++){
        		  System.out.println(matrix3[i][j]+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("Fourth matrix is");
          for(int i=0;i<columnsmatrix3rowsmatrix4;i++){
        	  for(int j=0;j<columnsmatrix4;j++){
        		  System.out.println(matrix4[i][j]+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("Multiplication of matrix1 and matrix2");
          for(int i=0;i<rowsmatrix3;i++){
        	  for(int j=0;j<columnsmatrix4;j++){
        		  System.out.println(mulmatrix[i][j]+" ");
        	  }
        	  System.out.println();
          }
	}

}
