package coursemanagementsystem;

public class Dut_instructor extends instructor
{
    private int Dut_id ;
    private String Dut_email ;
    private String Dut_name ;
    
    public Dut_instructor( String n , String a ,int ID )
    {
        super( n , a , ID);
    }
    
    
    public Dut_instructor ()
    {
        this.Dut_id= 2 ;
        this.Dut_name = "mohamed" ;
        this.Dut_email = "mohamed@gmail.com" ;
    }
                
    public Dut_instructor (String dut_name , int dut_id ,String dut_email)
    {
        this.Dut_id= dut_id ;
        this.Dut_name = dut_name ;
        this.Dut_email = dut_email ;
    }
    
    
    public void dut_info ()
    {
        System.out.println("--------Deutsch : [" + this.Dut_name + "] informationss --------");
        System.out.println("instructor ID : " + this.Dut_id );
        System.out.println("instructor email  : " + this.Dut_email );
    }
    //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    public void setDut_id(int Dut_id) {

        this.Dut_id = Dut_id;
    }

    public void setDut_email(String Dut_email) {

        this.Dut_email = Dut_email;
    }

    public void setDut_name(String Dut_name) {

        this.Dut_name = Dut_name;
    }
    //////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    public int getDut_id()
    {

        return Dut_id;
    }

    public String getDut_email() {

        return Dut_email;
    }

    public String getDut_name() {

        return  Dut_name;
    }
}
