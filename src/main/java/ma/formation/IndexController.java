package ma.formation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class IndexController {
  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String getIndex(ModelMap modelMap){
// ModelMap pour passer des données à la vue
    modelMap.addAttribute("msg", "Premier exemple de Spring MVC");
// retourne le nom de la vue
    return "index";
  }
}
