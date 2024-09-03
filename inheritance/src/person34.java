class person34{
    String name;
    person34(){

    }
    person34(String name){
      this.name=name;
    }
}
class Student extends person34{
    int sid;
    Student(int sid,String name ){
        super(name);
        this.sid=sid;

    }
}
class driver{
    public static void main(String[] args) {
        person34 p1=new person34("san");
        Student s1=new Student(173,"sarathy");
        System.out.println(p1.name);
        System.out.println(s1.name);
        System.out.println(s1.sid);
    }
}