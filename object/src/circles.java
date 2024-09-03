class circles{
    public static double computediameter(circle c){
        return 2* c.getradius();
    }
    public static double computearea(circle c){
        return 22.0/7.0 *(c.getradius() *c.getradius());
    }
    public static double computecircumference(circle c){
        return 2* (22.0/7.0) *(c.getradius());
    }
}
class circletest2{
    public static void main(String[] args) {
        circle c1 =new circle(2);
        circle c2=new circle(3);
        System.out.println("diameter :" +circles.computediameter(c1));
        System.out.println("diameter :" +circles.computediameter(c2));
        System.out.println("area:" +circles.computearea(c1));
        System.out.println("area:" +circles.computearea(c2));
        System.out.println( "circum:" +circles.computecircumference(c1));
        System.out.println("circum:"+circles.computecircumference(c2));
    }
}