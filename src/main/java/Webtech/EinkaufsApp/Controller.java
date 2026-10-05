package Webtech.EinkaufsApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/")
  public String index() {
    Einkaufsliste liste = new Einkaufsliste("Meine Liste");
    liste.addItem("Milch");
    liste.addItem("Brot");
    return "Willkommen bei der EinkaufsApp!" + "\n" + liste.getName() + ": " + liste.getListe();
  }

}