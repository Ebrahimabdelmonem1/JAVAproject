
package coursemanagementsystem;

import java.util.Scanner;

public class Course {
    private int Cid;
    private String Cname;
    private String Cfield;
    private int no_ofStu;
    private boolean available;
    private String Ctime;
    private boolean check = true;
    private Scanner b = new Scanner(System.in);
    protected boolean open = false ;
    public Course()
    {
        this.Cid= 0 ;
        this.Cname = "None" ;
        this.Cfield = "None" ;
        this.no_ofStu = 0 ;
        this.available = false ;
        this.Ctime = "0:0h" ;
    }
                
    public Course(String cname, int cid, String ctime, String cfield, int noofstu, boolean avail)
    {
        this.Cid= cid ;
        this.Cname = cname ;
        this.Cfield = cfield ;
        this.no_ofStu = noofstu ;
        this.available = avail ;
        this.Ctime = ctime ;
    }
    protected void opencourse()
            {
               if (open)
                   System.out.println("is open");
               else
               {   
                   open = true ;
                   System.out.println("course is already open");
               }
            }
    protected void Closecourse()
            {
               if (open)
               { this.open = false ;
                   System.out.println("th course is closed");
               }
               else
                   System.out.println("is close");
            }
    public void course_date ()
    {
        
        System.out.println("choose suitable date ");
        System.out.println("press 1 to sat  10:00 am ");
        System.out.println("press 2 to mon  11:00 am ");
        System.out.println("press 3 to Wedn 12:00 am ");
            
        int[] arr ={10 , 11 , 12};
        
            while (this.check) 
            {
                int a = b.nextInt();
            if (  1> a || a > 3 ) {
                System.out.println("please re-enter course number");
                System.out.println("course number for example [1 <= x <= 3]");
            } else {
                this.check =! this.check;
            }

                   switch (a) 
            {
            case 1:
                    System.out.println("u are registered successfully");
                    System.out.println("please come next week at "+ arr[0] + ":00 am ");
                                        break;
            case 2:
                    System.out.println("u are registered successfully");
                    System.out.println("please come next week at "+ arr[1] + ":00 am ");
                                        break;
            case 3:
                    System.out.println("u are registered successfully");
                    System.out.println("please come next week at "+ arr[2] + ":00 am ");
                                        break;                
            
            }
            }
            
            
            
    }
    
    public void Courseinfo1()
    {
        System.out.println("--------Course : [" + this.Cname + "] informations      --------");
        System.out.println("Course ID                             : [" + this.Cid       + "]");
        System.out.println("Time of Course                        : [" + this.Ctime     + "]");
        System.out.println("Number of student registed the Course : [" + this.no_ofStu  + "]");
        System.out.println("Are the Course available Now          : [" + this.available + "]");
    }

    //////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////

    public void setCid(int Cid) {

          this.Cid = Cid;
      }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public void setCfield(String Cfield) {
        this.Cfield = Cfield;
    }

    public void setNo_ofStu(int no_ofStu) {
        this.no_ofStu = no_ofStu;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCtime(String Ctime) {
        this.Ctime = Ctime;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    public int getCid() {

        return Cid;
    }

    public String getCname() {

        return Cname;
    }

    public String getCfield() {

        return Cfield;
    }


    public int getNo_ofStu() {

        return no_ofStu;
    }

    public boolean getAvailability() {

        return available;
    }
    public String getCtime() {

        return Ctime;
    }
    public boolean getisOpen() {

        return open;
    }

}
 