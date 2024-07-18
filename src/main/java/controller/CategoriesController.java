package controller;

import model.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.CategoriesService;

@RequestMapping
@Controller
public class CategoriesController {
    @Autowired
    CategoriesController catagoriescontroller= new CategoriesController();

    @GetMapping
    public list<Categories> getallCategories(){
        return CategoriesService.gettallcategories(guide);
    }

    @PostMapping
    public Categories addCategories(Categories categories) {
        return CategoriesService.addcategorie(categories);
    }

    @PutMapping
    public Categories updateCategories(Categories categories) {
        return CategoriesService.updatecategorie(categories);
    }

    @DeleteMapping
    public Categories deleteCategories(Categories categories) {
        return CategoriesService.deletecategorie(categories);
    }
}
