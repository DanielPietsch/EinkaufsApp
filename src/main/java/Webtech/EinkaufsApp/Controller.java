package Webtech.EinkaufsApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {

  @GetMapping("/items")
  public List<Item> getItems() {
    return List.of(
      new Item(1L, "Milch", false),
      new Item(2L, "Brot", false),
      new Item(3L, "Eier", false)
    );
  }
}