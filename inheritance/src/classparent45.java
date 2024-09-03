class parent45{
    static {
        System.out.println("parent  loadig");
    }
    static void nurture(){
        System.out.println("nurture kids");
    }
}
class child45 extends parent45{
    static{
        System.out.println("child is loading");
    }
    static void respect(){
        System.out.println("respect the parents");
    }

}
class example45{
    public static void main(String[] args) {

        child45.respect();
    }
}