class father{
    String name="sambanthan";
}
class son extends father{
    String name="sarathy";
    void sondata(){
        System.out.println("father name:"+super.name);
    }
}
class family{
    public static void main(String[] args) {
        father f1=new father();
        son s1=new son();
        s1.sondata();
    }
}