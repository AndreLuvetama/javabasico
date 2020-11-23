package br.com.dao.inter;
import java.util.ArrayList;
import 	sabado.exercicios.Animal;

public interface AnimalDaoInterface {
	
	public Animal buscarAnimal(Integer identificador);
	public Animal buscarAnimalPorNome(String nome);	
	public int  deletarAnimal(Animal animal);
	public int cadastrarAnimal(Animal animal);	
	public ArrayList<Animal> consultarAnimais();
	public int deletarAnimal(ArrayList<Animal> animais);
	
	
	
	
	

}
