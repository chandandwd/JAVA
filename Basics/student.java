import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of stu:");
        String a = sc.nextLine();
        System.out.println("Enter the ID of stu: ");
        int b = sc.nextInt();
        System.out.println("enetr the phone num of Stu:");
        long c = sc.nextLong();

        System.out.println("enter the email of stu:");
        String e = sc.next();
        System.out.println("enter the marks of stu");
        System.out.println("SUB 1 ");
        int sub1 = sc.nextInt();
        System.out.println("SUB 2 ");
        int sub2 = sc.nextInt();
        System.out.println("SUB 3 ");
        int sub3 = sc.nextInt();
        System.out.println("SUB 4");
        int sub4 = sc.nextInt();
        System.out.println("SUB 5 ");
        int sub5 = sc.nextInt();
        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        int avg = sum/5;
        System.out.println("Student Name:"+a);
        System.out.println("Student ID:"+b);
        System.out.println("Total Marks"+sum);
        System.out.println("Average"+avg);


        if (sub1 > 35 && sub2 > 35 && sub3 > 35 && sub4 > 35 && sub5 > 35){
            System.out.println("PASS");
            switch (avg){
                case 100 , 90:
                    System.out.println("Grade A");
                    break;
                case 89 , 70:
                    System.out.println("Grade B");
                    break;
                case 69 , 50:
                    System.out.println("Grade C");
                    break;
                default:
                    System.out.println("Grade D");

            }

    }
        else {
            System.out.println("Grade F");
            System.out.println("Fail");
        }
        }
    }

