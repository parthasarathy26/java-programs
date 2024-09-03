class bike{
    private String ModelName;
    //getter
    String getModelName(){
        return ModelName;
    }
    //setter
    void setModelName(String ModelName){
        this.ModelName=ModelName;
    }
    //achieve has a relationsihp bike has a engine
    private Engine e=new Engine(1000);
    //getter
    Engine getEngine(){
        return e;
    }


    //future also no modify so we not need setter
    //constructor
    bike(String ModelName){
        this.ModelName=ModelName;
    }
}