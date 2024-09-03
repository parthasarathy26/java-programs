class Cab{

}
class mini extends Cab{
    int priceperklm=70;
    mini(int priceperklm){
        this.priceperklm=priceperklm;
    }
}
class sedan extends mini{
    int priceperklm=60;
    int beta=2;
    sedan( int priceperklm,int beta){
        super(priceperklm);
        this.beta=beta;
    }
}
class driver{
    public static void main(String[] args) {
        Cab c=new mini(90);
        //mini m=new sedan(60,2);//upcasting
        //System.out.println(((mini )c).priceperklm);//downcasting
        if(c instanceof mini){
            mini m1=(mini)c;
            System.out.println(m1.priceperklm);
        }
        else{
            sedan s=(sedan)c;
            System.out.println(s.priceperklm);
        }
    }
}