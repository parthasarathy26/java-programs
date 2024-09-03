class truck{
    double capacity;
    int bedlength;
    private truck(double capacity){
        this.capacity=capacity;
    }
    private truck(int bedlength){
        this.bedlength=bedlength;
    }
    public static truck cargocapacity(double capacity){
        return new truck(capacity);
    }
    public static truck bedlength(int lenght){
        return new truck(lenght);
    }
}