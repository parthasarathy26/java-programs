class truckdriver{
    public static void main(String[] args) {
        truck t1= truck.cargocapacity(20.00);
        truck t2=truck.bedlength(20);
        System.out.println("cargocapacity:"+t1.capacity);
        System.out.println("bedlength:" +t2.bedlength);
    }
}