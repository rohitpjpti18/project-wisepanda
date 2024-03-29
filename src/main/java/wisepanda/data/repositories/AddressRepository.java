package wisepanda.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import wisepanda.data.entities.contact.Address;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query(value = "FROM Address a WHERE a.contact.id = :id")
    List<Address> findByContactId(@Param(value="id") Long id);
}
