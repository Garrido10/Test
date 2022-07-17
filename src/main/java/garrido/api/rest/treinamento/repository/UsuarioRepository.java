package garrido.api.rest.treinamento.repository;

import garrido.api.rest.treinamento.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
