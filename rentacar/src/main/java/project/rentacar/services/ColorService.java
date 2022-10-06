package project.rentacar.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.rentacar.entities.Color;
import project.rentacar.repositories.ColorRepository;

@Service
public class ColorService {

	private ColorRepository colorRepository;
	
	@Autowired
	public ColorService(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

	public Color createColor(Color color) {
		return this.colorRepository.save(color);
	}

	public List<Color> getAllColor() {
		return this.colorRepository.findAll();
	}

	public Color getColorById(int colorId) {
		return this.colorRepository.findById(colorId).orElse(null);
	}
	
	
}
