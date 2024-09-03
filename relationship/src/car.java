class car{
    tyre[] t=new tyre[4];
    //create variable act as index
    int a=0;
    //helper method
    void addtyre(tyre t){
        this.t[a++]=t;
    }
}