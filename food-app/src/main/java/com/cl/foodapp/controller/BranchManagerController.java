package com.cl.foodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl.foodapp.entity.BranchManager;
import com.cl.foodapp.service.BranchManagerService;
import com.cl.foodapp.responseStructure.ResponseStructure;

@RestController
public class BranchManagerController {
	
	@Autowired
	private BranchManagerService branchManagerService;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/savemanager")
	public ResponseEntity<ResponseStructure<BranchManager>> saveManager(@RequestBody BranchManager manager){
		return branchManagerService.saveManager(manager);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getmanager/{id}")
	public ResponseEntity<ResponseStructure<BranchManager>> getby(@PathVariable int id){
		return branchManagerService.getby(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deletemanager/{id}")
	public ResponseEntity<ResponseStructure<BranchManager>> delete(@PathVariable int id){
		return branchManagerService.delete(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updatemanager/{id}")
	public ResponseEntity<ResponseStructure<BranchManager>> update(@RequestBody BranchManager manager,@PathVariable int id){
		return branchManagerService.update(manager,id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getallmanagers")
	public ResponseEntity<ResponseStructure<List<BranchManager>>> getall(){
		return branchManagerService.getall();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getbymanager")
	public BranchManager get(@RequestBody BranchManager manager) throws Exception {
		return branchManagerService.findbyEmailnPassword(manager);
	}
}
