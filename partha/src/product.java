class product{
    private double price;
    private int quantity;

    product(double price){
        this.price=price;
    }
    product(int quantity){
        this.quantity = quantity;

    }
    public void setprice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("invalid price");
        }
    }
    public void setQuantity(int quantity){
        if(quantity>0){
            this.quantity =quantity;
        }
        else{
            System.out.println("invalid quantity");
        }
    }
    public double getprice(){
            return price;

        }
    public long getquantity(){
        return quantity;
    }


    }
