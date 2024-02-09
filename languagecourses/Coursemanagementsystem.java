
package coursemanagementsystem;
import java.util.Scanner ;
import java.lang.*;

public class Coursemanagementsystem {

        
        public static void administrator ()
        {
            Scanner scan = new Scanner (System.in );
            Scanner scan1 = new Scanner (System.in );
            System.out.println("enter admin user name and press enter --> admin username : ebrahim ");
            System.out.println("enter admin password                  --> admin password : abdelmonem ");
        
            String inpUser = scan.nextLine();
            String inpPass = scan1.nextLine(); // gets input from user
            
            while (!("ebrahim".equals(inpUser) && "abdelmonem".equals(inpPass)))
            {
                System.out.println("you enterd error password ");
                System.out.println("enter admin user name and press enter --> admin username : ebrahim ");
                System.out.println("enter admin password                  --> admin password : abdelmonem");
        
                inpUser = scan.nextLine();
                inpPass = scan1.nextLine();
            }
                System.out.println("you logged in successfully ");
                System.out.println("   ");
        }
        
    public static void main(String[] args) {
        
        Scanner input  = new Scanner (System.in);
        Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        Scanner input3 = new Scanner (System.in);
        Scanner input4 = new Scanner (System.in);
        Scanner input5 = new Scanner (System.in);
        Scanner input6 = new Scanner (System.in);

        administrator ();

          int max_stu = 7 ;
        Student []stu_data = new Student[max_stu];
        int max_corse = 30;
        Course []course_d = new Course[max_corse];

        for (int j=0 ; j < max_stu ; j++)

        {
            stu_data[j] = new Student();
        }

        
        Course          crs = new Course ()        ;
        Dut_instructor  Dut = new Dut_instructor() ;
        Arabicintructor Ara = new Arabicintructor();
        Course          d   = new Course()         ;

        int i = 0 ;

    do{  
        i++;
        
        System.out.println("choose your operation");
        System.out.println("-------------------------");
        System.out.println("[1] : for sign up press 1");        
        System.out.println("[2] : for display account that registerd press number 2 ");
        System.out.println("[3] : for check instructor is avaialble or not available press number 3 ");
        System.out.println("[4] : to open  course press 4  ");
        System.out.println("[5] : to close course press 5  ");
        System.out.println("[6] : enroll the course press 6  ");
        System.out.println("[7] : to delete account press 7  ");
        System.out.println("[8] : to add a new account to list press 8");
        System.out.println("[9] : to display instructor information press 9");
        System.out.println("[10]: to setting instructor information as  admin press 10 ");
        System.out.println("[11]: to set / adding a new Course just for admin press 11");
        System.out.println("[12]: if u want to exit press 12  ");        

        System.out.println("=========================================================================");
        int x = input.nextInt();
        
    switch(x) {
           case 1:
                
                System.out.println("by default its only one account : ");
                System.out.println("note that #no of account must be in range [ 0 > and < 7 ] : "); 
                
                max_stu =input.nextInt();
                while(max_stu > 7 || max_stu < 0)
                {
                    System.out.println("  : ");
                    System.out.println(" please enter the right number : ");

                    max_stu =input.nextInt();
                }

                for (int j = 0 ; j < max_stu ; j++)
                {
                    System.out.println("please enter Student number ["+(j+1)+"]         ID : ");
                    stu_data[j].setId(input1.nextInt());
                    System.out.println("good Job now enter Student number ["+(j+1)+"] Name : ");
                    stu_data[j].setName(input2.nextLine());
                    System.out.println("good,now set student phone number");
                    stu_data[j].setNumber(input5.nextLine());

                }
                
                    System.out.println("if you want display Student Account's list press [1]");
                    System.out.println("if you want to continue press any number ");
                    
                int show = input.nextInt();
                if ( show == 1)
                {
                for(int j = 0 ; j < max_stu ; j++)
                {
                    System.out.println("------------------------------------------------------------------");                    
                    System.out.println("Student number ["+(j+1)+"] ID    : {" + stu_data[j].getid() +"]"   );
                    System.out.println("Student number ["+(j+1)+"] Name  : {" + stu_data[j].getname() +"]" );
                    System.out.println("Student number ["+(j+1)+"] Number : {" + stu_data[j].getNumber() +"]");
                    System.out.println("------------------------------------------------------------------");
                }
                }
                    else
                        {

                        }
                    
                
                break;

           case 2:
                
                System.out.println("enter number of account that you want to display ");
                    int show1 = input.nextInt();

                while(show1 > 7 || show1 < 0)
                {
                    System.out.println(" number of student mut be in range [ 0 > and < 7 ] : ");
                    System.out.println(" please enter the right number : ");
                    
                    show1 = input.nextInt();
                }
                for(int j = 0 ; j < show1 ; j++)
                {
                    System.out.println("------------------------------------------------------------------");                    
                    System.out.println("Student number ["+(j+1)+"] ID    : {" + stu_data[j].getid() +"]"   );
                    System.out.println("Student number ["+(j+1)+"] Name  : {" + stu_data[j].getname() +"]" );
                    System.out.println("Student number ["+(j+1)+"] Email : {" + stu_data[j].getNumber() +"]");
                    System.out.println("---e---------------------------------------------------------------");
                }

               
                break;
                
           case 3:
                boolean n = true ;

                if (Ara.is_open)
                { Ara.avi_not_inst();}
                else
                {
                Ara.is_open =! Ara.is_open ;
                Ara.avi_inst();
                }    
                
                break;
           case 4:
               if (!(d.open))
                {
                d.opencourse();
                System.out.println("Course is opened");
                }
                else
                {
                System.out.println("Course is already opened");
                }
               break;
           case 5:
               if (d.open)
               {
                   System.out.println("Course is already closed");
               }
               else
               {
                   d.Closecourse();
                   System.out.println("Course is closed");
               }    
                break;
        case 6:
                Course c = new Course();

                System.out.println("To show all available corses press 1 \n to go to main page press any number");
                int show_course_data = input.nextInt();
                if (show_course_data ==1){
                    for (int j=0 ;j<max_corse;j++){
                    System.out.println("  Course number  ["+(j+1)+"] ID {"+crs.getCid()+"] ");
                    System.out.println("  Course number   ["+(j+1)+"]  name ["+crs.getCname()+"]");
                    System.out.println(" Course number ["+(j+1)+"]  field   ["+crs.getCfield()+"] ");
                    System.out.println(" number of students in course number  ["+(j+1)+"] :["+crs.getNo_ofStu()+"] ");
                    System.out.println(" Course number   ["+(j+1)+"] : Time ["+crs.getCtime()+"]h");
                    c.course_date();
                }
                }
                else {}
                break; 
           case 7:
                    System.out.println("enter the id of account that you need to delete ");
                    int check_id = input1.nextInt();
                    
                    while(check_id != stu_data[0].getid() && check_id != stu_data[1].getid() && check_id != stu_data[2].getid() && check_id != stu_data[3].getid() && check_id != stu_data[4].getid() && check_id != stu_data[5].getid() && check_id != stu_data[6].getid())
                    {
                    System.out.println(" please enter the right id that you inserted before : ");
                    
                    check_id =input.nextInt();
                    }
                    int qq = 0;
                    for (int j =0 ; j < 7 ; j++)
                    {
                        if ( check_id == stu_data[j].getid() )
                        {
                            qq = stu_data[j].getid();
                            stu_data[j].setId(0);
                            stu_data[j].setName("null");
                            
                        }
                        else
                        {
                        }
                    }
                    System.out.println("Account of ID ["+ qq +"] deleted Successfully");
                    break;
           case 8 :
                        for (int j =0 ; j < max_stu ; j++)
                        {
                        if ( stu_data[j].getid() == 0 )
                        {
                            System.out.println("enter new Student ID   : ");
                            stu_data[j].setId(input3.nextInt());
                            System.out.println("enter new Student Name : ");
                            stu_data[j].setName(input4.nextLine());
                            System.out.println("enter new Student Number : ");
                            stu_data[j].setNumber(input6.nextLine());
                            break;
                        }
                        else if (j == 6 )
                        {
                            System.out.println("account list if full");
                            System.out.println("please delete at least one account to add a new");
                            break;
                        }
                        else
                        {
                            
                        }
                        }
                        
                    break;
           case 9  :
                System.out.println(" for Deutsch press 1 ");
                System.out.println(" for Arabic press 2 ");
                int inist1 = input.nextInt();
                if (inist1 == 1)
                {
                    Dut.dut_info();
                }
                else if (inist1 == 2)
                {
                    Ara.Arabic_info();
                }
                else
                    break;
               
               break;
           case 10:
                administrator ();

                System.out.println("this step for admins only ");
                System.out.println(" for Deutsch press 1 ");
                System.out.println(" for Arabic press 2 ");
                int nis = input.nextInt();
                if (nis == 1)
                {    
                System.out.println(" please enter Deutsch instructor ID");
                Dut.setDut_id(input.nextInt());
                System.out.println(" Enter Deutsch instructor Name ");
                Dut.setDut_name(input.next());
                System.out.println("Enter Deutsch instructor email for commuincations with");
                Dut.setDut_email(input.next());
                System.out.println("If u want to display Deutsch instructor press 1");
                System.out.println("for cotinue press 2");
                int dut = input.nextInt();
                if (dut == 1)
                {
                    Dut.dut_info();
                }
                else
                {
                    break;
                }
                }
                else if ( nis == 2)
                {
                    System.out.println(" please enter Arabic instructor ID");
                    Ara.setArabic_id(input.nextInt());
                    System.out.println(" Enter Arabic instructor Name ");
                    Ara.setArabic_name(input.next());
                    System.out.println("Enter Arabic instructor email for commuincations with");
                    Ara.setArabic_email(input.next());
                    System.out.println("If u want to display Arabic instructor press 1");
                    System.out.println("for cotinue press 2");
                    int ara = input.nextInt();
                        if (ara ==1)
                        {
                            Ara.Arabic_info();
                        }
                        else
                        {
                            break;
                        }
                }
                else
                break;
               // break;
                
           case 11:
                    administrator ();

                    System.out.println("Enter nuumber of courses you will insert     <0 || >30");
                    max_corse = input.nextInt();
                    while (max_corse>30 || max_corse<0){
                     System.out.println("Enter number between  0 and 30");
                        max_corse = input.nextInt();
                    }
               for (int j = 0 ; j < max_corse ; j++){
                    System.out.println(" please enter Course number  ["+(j+1)+"] :ID ");
                    crs.setCid(input.nextInt());
                    System.out.println(" Enter Course number   ["+(j+1)+"]  :name ");
                    crs.setCname(input.next());
                    System.out.println("Enter Course number ["+(j+1)+"]  : field");
                    crs.setCfield(input.next());
                    System.out.println("insert number of students in course number  ["+(j+1)+"] : ");
                    crs.setNo_ofStu(input.nextInt());
                    System.out.println("Enter Course number   ["+(j+1)+"] : Time ");
                    crs.setCtime(input.next());
                    crs.setAvailable(true);}
                    
                    crs.Courseinfo1();
               
                    break;
           case 12: 
               i = 51;
               break;
               
           default:
               System.out.println("choose the right number ");
                }
    }
    while( i<=50 );

    }
}
