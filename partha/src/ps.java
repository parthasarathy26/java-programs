class ps {
    public static int[] gensequence(int n) {
        int[] result = new int[n];
        for (int index = 0; index < result.length; index++) {
            result[index] = (index + 1) * (index + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] seq=gensequence(10);
        for(int index=0; index<seq.length; index++){
            System.out.print(seq[index]+" ,");
        }
    }
    }