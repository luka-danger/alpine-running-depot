package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 *
 *
 *
 */
@Controller
public class AddPartController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showPartFormForUpdate")
    public String showPartFormForUpdate(@RequestParam("partID") int theId, Model theModel){

        PartService repo = context.getBean(PartServiceImpl.class);
        OutsourcedPartService outsourcedrepo = context.getBean(OutsourcedPartServiceImpl.class);
        InhousePartService inhouserepo = context.getBean(InhousePartServiceImpl.class);

        Part tempPart = repo.findById(theId); // Get the part by ID

        if(tempPart instanceof InhousePart) {
            theModel.addAttribute("inhousepart", (InhousePart) tempPart);
            return "InhousePartForm";
        } else if(tempPart instanceof OutsourcedPart) {
            theModel.addAttribute("outsourcedpart", (OutsourcedPart) tempPart);
            return "OutsourcedPartForm";
        } else {
            // Handle the case when the part type is neither in-house nor outsourced
            return "error"; // or any appropriate error handling
        }
    }

    @GetMapping("/deletepart")
    public String deletePart(@Valid @RequestParam("partID") int theId,  Model theModel){
        PartService repo = context.getBean(PartServiceImpl.class);
        Part part=repo.findById(theId);
        if(part.getProducts().isEmpty()){
            repo.deleteById(theId);
            return "confirmationdeletepart";
        }
        else{
            return "negativeerror";
        }
    }

}

