package tryMyself.dataStuctures.sparseArray;


public class SparseArray {
    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];
        chessArr1[2][5] = 1;
        chessArr1[5][7] = 2;
        chessArr1[1][4] = 2;
        System.out.println("origin array is: ");
        for(int[]row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i<11; i++){
            for (int j = 0; j<11;j++){
                if(chessArr1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

        int sparseArry[][] = new int[sum+1][3];
        sparseArry[0][0] = 11;
        sparseArry[0][1] = 11;
        sparseArry[0][2] = sum;
        int count = 0;
        for(int i = 0; i<11; i++){
            for(int j = 0; j<11; j++){
                if(chessArr1[i][j]!=0) {
                    count++;
                    sparseArry[count][0] = i;
                    sparseArry[count][1] = j;
                    sparseArry[count][2] = chessArr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("sArray is");
        for(int i = 0; i<sparseArry.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArry[i][0],sparseArry[i][1],sparseArry[i][2]);
        }
        System.out.println();

        int recoverArry[][]= new int[sparseArry[0][0]][sparseArry[0][1]];
        for(int i =1; i<sparseArry.length; i++){
            recoverArry[sparseArry[i][0]][sparseArry[i][1]]=sparseArry[i][2];
        }
        for(int[]row : recoverArry){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
}
