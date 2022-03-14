package com.example.demo.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userid}")
	public String getCatalog(@PathVariable("userid") String userId){
//		return Collections.singletonList(
//				(T) new CatalogItem(name:"T",desc:"T",rating:4));
		return "success";
		
	}
}
