
class sp{
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        int[][] array2 = {{10, 20,9}, {10, 20,90},{90,80,70}};
        System.out.println("matrix 2*2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("transpose");
        for(int i=0;i<array2 .length; i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array2[j][i]+" ");
            }
            System.out.println();
        }
    }

}