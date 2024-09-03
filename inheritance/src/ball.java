class ball{
    int radius;
    public void display(){
        System.out.println("radius");
    }
}
class basket extends ball{
    String game="basketball";
}
class driver1{
    public static void main(String[] args) {
    ball b1=new ball();
    basket p1=new basket();
        System.out.println(p1.radius);
        System.out.println(p1.game);

}}