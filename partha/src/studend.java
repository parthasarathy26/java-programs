class student {
    int id;
    String name;
    int age;

    student() {}
        student( int id) {
            this.id = id;
        }
        student( int id,String name){
             this(id);
             this.name=name;

        }
        student(int id,String name,int age){
             this(id,name);
             this.age=age;

    }
}