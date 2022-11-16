package proyecto.misiontic.seguridad.Repositorios;
import proyecto.misiontic.seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends
        MongoRepository<Permiso,String> {

}
