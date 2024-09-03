class bottle{
    String color;
    double capacity;
    bottle(String color,double capacity){
        this.color=color;
        this.capacity=capacity;
    }
    //setter
    public bottle setcolor(String color){
        this.color=color;
        return this;
    }
    //getter
    public String getcolor(){
        return color;
    }
    //setter
    public bottle setcapacity(double capacity){
        this.capacity=capacity;
        return this;
    }
    //getter
    public double getcapacity(){
        return capacity;
    }
    //method for display prop
    public bottle displayproperties(){
        System.out.println("color:"+color);
        System.out.println("capacity:"+capacity);
        return this;

    }
}