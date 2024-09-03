class Sim{

    private String sim_provider;
    private long sim_no;
    int count = 0;

    public void setSim_provider(String sim_provider){
        if (sim_provider.equalsIgnoreCase("jio") || (sim_provider.equalsIgnoreCase("Airtel"))){
            this.sim_provider = sim_provider;
        }
        else{
            System.out.println("Invalid sim provider");
            this.sim_provider = sim_provider;
        }
    }

    public String getSim_provider(){
        return sim_provider;
    }

    public void setSim_no(long sim_no){
        long sim = sim_no;
        while (sim_no != 0){
            count++;
            sim_no /= 10;
        }
        if (count == 10){
            this.sim_no = sim;
        }
        else{
            System.out.println("Invalid sim no");
            this.sim_no = sim;
        }
    }

    public long getSim_no(){
        return sim_no;
    }
}