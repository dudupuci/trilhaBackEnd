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

import com.mysql.jdbc.MysqlIO;

import entities.Category;
import entities.Entry;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/api")
@Api(value = "API Financys")
@CrossOrigin(origins = "*")
public class IndexControllerEntrys {

	@Autowired
	Entry newEntry;

	private ArrayList<Entry> listEntry = new ArrayList<Entry>();
	Entry newFunctions = new Entry(19, "New Functions in the System", "More functions for users", "Function", "$450",
			"22/05/2021", true, 6);
	Entry vacationAllowance = new Entry(20, "Vacation Allowance", "Take here your help to relax", "Allowance", "$900",
			"23/05/2021", false, 5);

	@ApiOperation(value = "Method POST Entrys, setting two like the challenge 3")
	@PostMapping("/lancamentos")
	int newEntry(@RequestBody Entry newEntry) {
		// Listing by Data.
		listEntry.add(newFunctions);
		listEntry.add(vacationAllowance);
		return listEntry.indexOf(newEntry);

	}

	@GetMapping("/lancamentos")
	public ArrayList<Entry> getListEntry() {
		return listEntry;

	}

	@GetMapping("/lancamentos/{id}")
	public ArrayList<Entry> listEntry(@PathVariable(value = "id") long id) {
		return null;

	}

	public void Create(MysqlIO db) {
		// @PostMapping("/lancamentos")

	}

	public void Read(MysqlIO db) {
		// @GetMapping("/lancamentos")

	}

	public long Update(MysqlIO db, int version) {
		// @PutMapping("/lancamentos/{id}")
		return version;

	}

	public String Delete(String table, String local) {
		// @DeleteMapping("/lancamentos/{id}")
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

}
