class father{

}
class mother extends father{

}
class son extends mother{

}
class wife extends son{

}
class test13{
    public static void main(String[] args) {
        Object o1=new father();
        System.out.println(o1 instanceof Object);
        System.out.println(o1 instanceof father);
        System.out.println(o1 instanceof mother);
        System.out.println(o1 instanceof son);
        System.out.println(o1 instanceof wife);
    }
}