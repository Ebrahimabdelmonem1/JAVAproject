package coursemanagementsystem;

public abstract class instructor
{
    protected String Instname ;
    private String email ;
    private int id ;
    protected boolean is_open  ;
    public instructor ()
    {

    }
    public instructor (String n , String a ,int ID )
    {
        this.Instname  = "ahmed"  ;
        this.email = "3a@gmail.com"  ;
        this.id    =  2 ;
        this.is_open = false ;
    }
    
    public void avi_inst()
        {
               if (is_open)
                   System.out.println("instructor is not available");
               else
               {   
                   is_open = true ;
                   System.out.println("insructor is available now");
               }
        }
    public void avi_not_inst()
        {
               if (is_open)
               { this.is_open = false ;
                   System.out.println("instructor is not available");
               }
               else
                   System.out.println("insructor is available now");
        }
/////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
    public void setName(String name)
    {

        this.Instname = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setId(int id)
    {

        this.id = id;
    }

    public void setIsopen(boolean is_open)
    {

        this.is_open = is_open;
}
////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////

    public String getname() {

        return Instname;
    }
    public int getid() {

        return id;
    }


    public String getEmail()
    {

        return email;
    }
}
