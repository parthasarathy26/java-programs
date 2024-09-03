class simdriver{
    public static void main(String[] args) {
        Sim s1=new Sim();
        Sim s2=new Sim();
        s1.setSim_no(1234567890);
        System.out.println(s1.getSim_no());
        s2.setSim_provider("vodafone");
        System.out.println(s2.getSim_provider());


    }


}