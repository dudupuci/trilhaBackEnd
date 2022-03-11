package trilhabackend;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/api")
@Api(value = "API Financys")
@CrossOrigin(origins = "*")
public class IndexControllerCategory {

	@Autowired
	Category newCategory;

	private ArrayList<Category> listCategory = new ArrayList<Category>();
	Category categoryFinancys = new Category(12, "New Financys", "New page of financys");
	Category categoryEmployee = new Category(12, "Employees", "All employes you can find on this page.");

	@ApiOperation(value = "Method POST, setting two category like challenge3 needed.")
	@PostMapping("/categorias")
	int newCategory(@RequestBody Category newCategory) {
		// f) List the category.
		listCategory.add(categoryFinancys);
		listCategory.add(categoryEmployee);
		return listCategory.indexOf(newCategory);

	}

	@ApiOperation(value = "Metodo GET Categorias")
	@GetMapping("/categorias")
	public ArrayList<Category> listCategory() {
		return newCategory.findAll();
	}

	@ApiOperation(value = "Method GET, finding by id.")
	@GetMapping("/categorias/{id}")
	public ArrayList<Category> listCategory(@PathVariable(value = "id") long id) {
		return newCategory.findById(id);

	}

	// Can i create the two objects of the type "Category" here?.

}
