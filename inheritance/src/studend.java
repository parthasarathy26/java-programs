class Studend extends person{
    public void displaystudentdetails(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Studend s=new Studend();
        System.out.println("planet name:"+planet_name);
        s.displaystudentdetails();
    }
}