package kr.ac.hansung.cse.repo;

import org.springframework.data.repository.CrudRepository;
import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
