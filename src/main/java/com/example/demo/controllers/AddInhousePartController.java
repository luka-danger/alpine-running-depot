package alpine.inventory.app.controllers;

import alpine.inventory.app.domain.InhousePart;
import alpine.inventory.app.service.InhousePartService;
import alpine.inventory.app.service.InhousePartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *
 *
 *
 *
 */
@Controller
public class AddInhousePartController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showAddPartForm")
    public String showAddPartForm(Model theModel) {
        InhousePart inhousepart = new InhousePart();
        theModel.addAttribute("inhousepart", inhousepart);
        return "InhousePartForm";
    }

    @PostMapping("/showFormAddInPart")
    public String submitForm(@Valid @ModelAttribute("inhousepart") InhousePart part,
                             BindingResult theBindingResult, Model theModel) {
        if (theBindingResult.hasErrors()) {
            return "InhousePartForm";
        } else {
            // Check inventory validity
            if (!part.isInventoryValid()) {
                theBindingResult.rejectValue("inv", "invalid.inventory", "Inventory cannot exceed max inventory value");
                return "InhousePartForm";
            }

            InhousePartService repo = context.getBean(InhousePartServiceImpl.class);
            InhousePart ip = repo.findById((int) part.getId());
            if (ip != null) {
                part.setProducts(ip.getProducts());
            }
            repo.save(part);

            return "confirmationaddpart";
        }
    }
}

