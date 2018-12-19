package cz.secda1.studentWeb.db.repositories;

import cz.secda1.studentWeb.model.Admin;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface AdminRepository extends EntityRepository<Admin, Long> {


}
