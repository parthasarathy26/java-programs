class parent49{
    int j=90;
    parent49(){
        super();
        System.out.println("parent class is loading");
    }
}
 class child54 extends parent49{
    int j=99;
    child54(){
        System.out.println("child class is loading");
    }

 }
 class example34{
     public static void main(String[] args) {
         parent49 p1=new parent49();
         child54 c1=new child54();
         System.out.println(p1.j);
     }
 }