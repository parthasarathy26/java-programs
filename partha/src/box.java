class box{
    double lenght;
    double area;
    double widht;
    box(){
        System.out.println("box getting rdy");
    }
    box( double length){
        this();
       this.lenght=length;
        System.out.println("length is initialized");
    }
    box(double length, double widht){
      this(length);
      this.widht=widht;
        System.out.println("widht is intialized");
    }
    box(double length, double widht, double area){
        this(length,widht);
        this.area=area;
        System.out.println("area is initialized");

    }

}