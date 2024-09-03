class Doctor{
    String Name="sarathy";
    int Dlno=122;
    int pulserate;
    public void checkpulse(int pulserate){
        if(pulserate>90){
            System.out.println("pulse is normal");

        }
        else{
            System.out.println("not normal");
        }
    }
}
class cardiologist extends Doctor{
    public void bypasssurgery(){
        System.out.println("bypass surgery in progrees");
    }
}
class driverdoctor{
    public static void main(String[] args) {
        Doctor d1=new Doctor();
        cardiologist c1=new cardiologist();
        d1.checkpulse(90);
        System.out.println("doctor name:"+c1.Name);
        System.out.println("doctor lno:"+c1.Dlno);
        c1.bypasssurgery();
    }
}