class cardrivertyre{
    public static void main(String[] args) {
        cartyre c1=new cartyre();
        System.out.println("No of tyre:"+c1.getTyres().length);
        //loop
        for (int i=0;i<c1.getTyres().length;i++){
            System.out.println(c1.getTyres()[i].getBrand());
        }
    }

}