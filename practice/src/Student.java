class Student extends person{
    int sid;
    Student(){

    }
    Student(int sid,String name){
        super(name);
        this.sid=sid;
    }
}
class Engineering extends Student{
     String Stream;
     Engineering(){

     }
     Engineering(String name,String Stream,int sid){
       super(sid, name);
       this.Stream=Stream;
     }
}
class upcasting1{
    public static void main(String[] args) {
        Student S1=new Student(21,"sarathy");
        person p= S1;// p belongs to parent type s belongs to child type
        System.out.println(p);
        System.out.println(S1);
        System.out.println(p==S1);
        System.out.println(S1.sid);
        System.out.println(S1.name);
        System.out.println(p.name );
        //System.out.println(p.sid);// error not possible
    }
}