package io.ooc.project.repository;

import io.ooc.project.model.Billable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
@Repository
public interface BillableRepository extends JpaRepository<Billable, Long>  {
    Billable findByBillableName(String billableName);
    Billable findByBillableId(Integer billableId);
    @Override
    List<Billable> findAll();

}
