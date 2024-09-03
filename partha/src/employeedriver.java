class employeedriver{
    public static void main(String[] args) {
        employee4 e1= new employee4("sarathy");
        employee4 e2= new employee4(123);
        employee4 e3= new employee4(3454656l);
        e2=e1;
        e1=e2;
        e3=e2;
        System.out.println(e2);
        System.out.println(e1);
        System.out.println(e3);


    }
}