class staticbook{
    String title;
    staticbook(String title){
        this.title=title;
    }
    static int count;

}
class bookdriver{
    public static void main(String[] args) {
        staticbook b1=new staticbook(("java"));
        staticbook b2=new staticbook(("python"));
        staticbook b3=new staticbook(("c++"));
        b1.count=0;
        System.out.println(b1.count);
        System.out.println(b3.count);
    }

}