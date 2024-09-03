class pancard{
    static pancard p;
    static int id;
    private pancard(int id){
        this.id=id;

    }
    public static pancard getpancard(){
        if(p==null){
            p=new pancard(123);

        }
        return p;
    }
}