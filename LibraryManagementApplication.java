import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Fetch the BookService bean
        BookService service = context.getBean("bookService", BookService.class);

        // Call method to check if dependency is injected
        service.displayBooks();
    }
}
