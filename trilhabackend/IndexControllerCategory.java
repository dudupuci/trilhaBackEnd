package trilhabackend;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ch.qos.logback.core.net.SyslogOutputStream;

import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.MysqlIO;
import com.mysql.jdbc.log.Log;

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

	private final String CNT_LOG = "DBAcess";
	private ArrayList<Category> createCategory;
	private MysqlIO db;

	public void Create(MysqlIO db) {
		// @PostMapping("/categorias")

	}

	public void Read(MysqlIO db) {
        //@GetMapping("/categorias")
		
	}

	public long Update(MysqlIO db, int version) {
		//@PutMapping("/categorias/{id}")
		return version;

	}

	public String Delete(String table, String local) {
		//@DeleteMapping("/categorias/{id}")
		int excluded = 0;
		if (table.contains(local)) {
			table(excluded);
		} else {
			return null;
		}
		return "Has been excluded: " + excluded;

	}

	private void table(int excluded) {
		// TODO Auto-generated method stub

	}
 
	
	
	
	// Can i create the two objects of the type "Category" here?.
	
	

}
