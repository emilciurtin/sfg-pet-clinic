package guru.springframework.services;

import guru.springframework.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitService extends CrudService<Visit,Long> {
}
