import java.util.Scanner;
public class UserValidationMain
{
    public  void validateUserData() {
        UserValidation uservalidation = new UserValidation();
        Scanner scanner = new Scanner(System.in);


        boolean check = true;
        while (check)
        {
            System.out.println("1.First Name  2.Last Name  3.EMail  4.PnoneNo 5.Password  6.Quit");
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter First Name");
                    String firstName = scanner.next();
                    System.out.println(uservalidation.validateFirstName(firstName));
                    break;

                case 2:
                    System.out.println("Enter Last Name");
                    String lastName = scanner.next();
                    System.out.println(uservalidation.validateLastName(lastName));
                    break;

                case 3:
                    System.out.println("Enter Valid Email");
                    String eMail = scanner.next();
                    System.out.println(uservalidation.validateEMail(eMail));
                    break;

                case 4:
                    System.out.println("Enter Phone No");
                    String phoneNo = scanner.next();
                    System.out.println(uservalidation.validatePhoneNo(phoneNo));
                    break;

                case 5:
                    System.out.println("Enter Password");
                    String password = scanner.next();
                    System.out.println(uservalidation.validatePassword(password));
                    break;

                case 6:
                    check = false;

            }
        }
    }

    public static void main(String[] args)
    {
        UserValidationMain uservalidationmain = new UserValidationMain();
        uservalidationmain.validateUserData();
    }
    }

