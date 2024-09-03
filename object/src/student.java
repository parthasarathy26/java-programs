class student {
    private static String name;
    private int standard;
    private int[] marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;

    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public static void main(String[] args) {
        student s = new student();
        s.setMarks(new int[] {2,3,4,5});


    }
}