class bikedriver{
    public static void main(String[] args) {
        bike b1=new bike("duke 200");
        System.out.println("model:"+b1.getModelName());
        System.out.println("hp:"+b1.getEngine().getHP());
    }
}