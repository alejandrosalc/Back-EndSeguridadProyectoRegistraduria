package proyecto.misiontic.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import proyecto.misiontic.seguridad.Modelos.PermisosRoles;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
