package proyecto.misiontic.seguridad.Repositorios;
import proyecto.misiontic.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends
        MongoRepository<Usuario,String> {
}
