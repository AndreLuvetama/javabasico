package br.com.dao.inter;
import java.util.ArrayList;
import 	sabado.exercicios.*;

public interface AnimalDaoInterface1 {
	
	public Animal buscarAnimal(Integer identificador);
	public Animal buscarAnimalPorNome(String nome);	
	public int  deletarAnimal(Animal animal);
	public int cadastrarAnimal(Animal animal);	
	public ArrayList<animal> consultarAnimais();
	public int deletarAnimal(ArrayList<Animal> animais);
	
	
	
	
	

}
