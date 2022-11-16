package proyecto.misiontic.seguridad.Repositorios;
import proyecto.misiontic.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends
        MongoRepository<Rol,String> {
}
