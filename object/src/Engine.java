class Engine{
    private double hp;
    //getter
     double getHP(){
         return hp;
     }
     //setter
     void setHP(double hp){
         this.hp=hp;
     }


     //constructor
    Engine(){

    }
    Engine(double hp){
         setHP(hp);//using this.this directly we use setter method
    }

}