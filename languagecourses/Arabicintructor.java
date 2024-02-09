package coursemanagementsystem;

public class Arabicintructor extends instructor {

    private int Arabic_id;
    private String Arabic_email;
    private String Arabic_name;


    public Arabicintructor(String n, String a, int ID) {

        super(n, a, ID);
    }

    public Arabicintructor() {
        this.Arabic_id = 1;
        this.Arabic_email = "sanad@gmail.com";
        this.Arabic_name = "sanad";
    }

    public void Arabic_intructor(String A_name, int A_id, String A_email) {
        this.Arabic_id = A_id;
        this.Arabic_email = A_name;
        this.Arabic_name = A_email;
    }
////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void Arabic_info() {
        System.out.println("--------Arabic instructor : [" + this.Arabic_name + "] informationss --------");
        System.out.println("instructor ID : " + this.Arabic_id);
        System.out.println("instructor email : " + this.Arabic_email);
    }
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
    public void setArabic_id(int Arabic_id) {

        this.Arabic_id = Arabic_id;
    }

    public void setArabic_email(String Arabic_email) {

        this.Arabic_email = Arabic_email;
    }

    public void setArabic_name(String Arabic_name)
    {

        this.Arabic_name = Arabic_name;
    }
//////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
    public int getArabic_id()
    {

        return Arabic_id;
    }

    public String getArabic_email()
    {

        return Arabic_email;
    }

    public String getArabic_name()
    {

        return Arabic_name;
    }

}