class box{
    double price;

}
class test3{
    public static void DISPLAYREFERENCE(Object c1){
        System.out.println(c1);
        //System.out.println(c1.price);


    }

    public static void main(String[] args) {
        DISPLAYREFERENCE(new Mini());
        DISPLAYREFERENCE(new Sedan());
        DISPLAYREFERENCE(new Luxury());
        DISPLAYREFERENCE(new box());
    }
}