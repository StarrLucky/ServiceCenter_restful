package starrlabs.konnekt.repos;

import org.springframework.data.repository.CrudRepository;
import starrlabs.konnekt.domain.Repair;
import java.util.List;



public interface RepairRepo extends CrudRepository <Repair, Integer> {

    List<Repair> findByUsername(String username);

    List<Repair> findByKv(int kv);
   // List<Repair> findByKvAndUsernameContainingIgnoreCase(Integer kv, String username);
    Repair findByKvAndUsernameContainingIgnoreCase(int kv, String username);
}
