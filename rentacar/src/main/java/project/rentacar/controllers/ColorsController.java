package project.rentacar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.rentacar.entities.Color;
import project.rentacar.services.ColorService;

@RestController
@RequestMapping("/colors")
public class ColorsController {

	private ColorService colorService;
	
	@Autowired
	public ColorsController(ColorService colorService) {
		this.colorService = colorService;
	}
	
	@PostMapping("/create")
	public Color createColor(@RequestBody Color color) {
		return this.colorService.createColor(color);
	}
	
	@GetMapping("/getall")
	public List<Color> getAllColors() {
		return this.colorService.getAllColor();
	}
	
	@GetMapping("/getbyid/{colorId}")
	public Color getColorById(@PathVariable int colorId) {
		return this.colorService.getColorById(colorId);
	}
}
