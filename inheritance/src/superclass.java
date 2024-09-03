class superclass{
    //static member
    static int age=18;
    //static method
    public static void test(){
        System.out.println("test demo method");
    }
}
class subclass extends superclass{

}
class example3{
    public static void main(String[] args) {
        superclass s1= new subclass();
        subclass s2=new subclass();
        System.out.println(superclass.age);
        System.out.println(subclass.age);
        superclass.test();
        subclass.test();
    }
}