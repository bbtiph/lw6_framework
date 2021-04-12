package kz.iitu.lw6_fw.lw6_fw;

//import kz.iitu.lw6_fw.lw6_fw.config.SpringConfig;
//import kz.iitu.lw6_fw.lw6_fw.controller.Controller;
//import kz.iitu.lw6_fw.lw6_fw.entities.Book;
//import kz.iitu.lw6_fw.lw6_fw.entities.Users;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        Controller controller = context.getBean("controller", Controller.class);
//        Scanner in = new Scanner(System.in);
//        while (true) {
//
//            if (controller.validationUser()==null) {
//                System.out.println("Password or login is not correct!");
//            } else {
//                Users user = controller.validationUser();
//                while(true) {
//                    System.out.println("Welcome!\n" +
//                            "1. Make issue\n" +
//                            "2. List requests\n" +
//                            "3. Find book by title, author, description\n" +
//                            "4. List available books\n" +
//                            "5. Return book\n" +
//                            "6. Books in your basket\n" +
//                            "0. Exit\n");
//                    int choise = in.nextInt();
//                    switch (choise) {
//                        case 1:
//                            System.out.println("Available books:");
//                            controller.availableBooks();
//                            System.out.println("Enter ID of book:");
//                            int idBook = in.nextInt();
//                            controller.issueBook(user, controller.getById(idBook));
//                            break;
//
//                        case 2:
//                            controller.findAll();
//                            break;
//
//                        case 4:
//                            System.out.println("Available books:");
//                            controller.availableBooks();
//                            break;
//
//                        case 5:
//                            controller.booksInBasket(user);
//                            System.out.println("Enter ID of book:");
//                            int id = in.nextInt();
//                            controller.returnBook(user, controller.getById(id));
//                            break;
//                        case 6:
//                            System.out.println("The books you borrowed from us: ");
//                            controller.booksInBasket(user);
//                            break;
//                        case 0:
//                            return;
//                    }
//                }
//            }
//        }
    }
}
