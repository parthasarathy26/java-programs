class studentexp{
    public static void main(String[] args) {
        student s1= new student();
        student s2=new student(4567);
        student s3=new student(1234,"sarathy" );
        student s4=new student(1234,"san",14);
        System.out.println(s1);
        System.out.println(s2.id);
        System.out.println(s3.id+s3.name);

        System.out.println(s4.name +" "+s4.id+" "+s4.age);

    }
}
