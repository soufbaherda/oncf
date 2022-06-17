package emi.oncf.Repository;

import emi.oncf.Model.Rapport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportRepository extends MongoRepository<Rapport,String> {
}
