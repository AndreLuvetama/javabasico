package br.com.dao;


import java.util.ArrayList;

import br.com.dao.inter.AnimalDaoInterface;
import 	sabado.exercicios.*;
import java.util.ArrayList;

public class AnimalDao implements AnimalDaoInterface {
	private ArrayList<Animal> animais;
	
	public void animalDao() {
		this.animais = new ArrayList<>();
	}
	
	public ArrayList<Animal> getAnimais(){
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	
	
	public Animal buscarAnimal(Long identificador) {
		Animal retorno = null;
		for(Animal a : animais) {
			if(a.getIdentificador().equals(identificador)) {
				retorno a;
			}
		}
		retorno rertono;
	} 
	
	public int deletarAnimal(AnimalList<Animal> animais) {
		if(animais.size()>0) {
			this.animais.removeAll(animais);
			
		}
	}
	
	public int cadastrarAnimal(Animal animal) {
		if(animal != null) {
			this.animais.add(animal);
			return 1;
		}
		return 0;
	}
	
	public int cadastrarAnimal(ArrayList<Animal> animais) {
		if (animais.size()>0) {
			for(Animal a: animais) {
				a.setIdentificador(this.identificador++);
			}
			this.animais(animais);
		}
	}
	
	public int cadastrarAnimal(ArrayList<Animal> animais) {
		if(animais.size()>0) {
			this.animais.addAll(animais);
			return 1;
		}
		return 0;
	}
	
	public ArrayList<Animal> consultarAnimais(){
		return null;
	}

	

}
