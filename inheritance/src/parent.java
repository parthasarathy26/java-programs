class parent{
    int age=20;
}
class child extends parent{

}
class example{
    public static void main(String[] args) {
        parent p1=new parent();
        child c1=new child();
        System.out.println(p1.age);
        System.out.println(c1.age);
    }
}