package rest.api.springboot.java.repository;

import org.springframework.data.repository.CrudRepository;
import rest.api.springboot.java.model.UsuarioModel;

//Definir a model desta interface e o tipo do Id da model
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
