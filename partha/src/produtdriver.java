class produtdriver{
    public static void main(String[] args) {
        product p1=new product(80.9);
        product p2=new product(1);
        p1.setprice(80.9);
        p2.setQuantity(1);
        double result=p1.getprice();
        System.out.println(result);
        long res=p2.getquantity();
        System.out.println(res);

    }
}