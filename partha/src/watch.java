class watch{

}
class strap{

}
class example{
    public static void displayreference(watch obj_ref){
        System.out.println(obj_ref);
    }
    public static void displayreference(strap obj_ref){
        System.out.println(obj_ref);
    }

    public static void main(String[] args) {
        watch w1=new watch();
        displayreference(w1);
        displayreference(new strap());
    }
}
