class parent1{
    public void demo(){
        System.out.println("hello im method ");
    }
}
class child1 extends parent1{

}
class example2{
    public static void main(String[] args) {
        parent1 p1=new parent1();
        child1 c1=new child1();
        p1.demo();
        c1.demo();

    }
}