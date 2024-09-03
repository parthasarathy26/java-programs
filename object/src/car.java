class car{
    int numseats;
    String fuels;
    car(int numseats,String fuels){
        this.numseats=numseats;
        this.fuels=fuels;
    }
    //setter
    public car setnumseats(int numseats){
        this.numseats=numseats;
        return this;

    }
    //getter
    public int getseatnum(){
        return numseats;
    }
    //setter
    public car setfuels(String fuels){
        this.fuels=fuels;
        return this;
    }
    //getter
    public String getfuels(){
        return fuels;
    }
    //properties
    public void displaycarprop(){
        if(numseats<5){
            System.out.println("we should use petrol car");
        }
        else{
            System.out.println("we should use disel car");
        }
    }
}