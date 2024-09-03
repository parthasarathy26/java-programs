import java.util.ArrayList;

class studentdriver{
    public static void main(String[] args) {
        //studentdriver s1=new studentdriver();
        ArrayList<Integer>s1=new ArrayList<>();
        s1.add(10);
        ArrayList<String>s2=new ArrayList<>();
        s2.add("sarathy");
        ArrayList<Integer>s3=new ArrayList<>();
        s3.add(20);
        Object []a=s1.toArray();
        Object []b=s2.toArray();
        Object []c=s3.toArray();

       // System.out.println(Arrays.toString(a));
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);

    }
}