package io.ooc.project.Service;

import io.ooc.project.Model.Billable;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
public interface BillableServiceTest {
    public List<Billable> getAll();

    public Billable get(Integer billableId);

    public Billable getBillableByName(String billableName);

    public void add(Billable bill);

    public void delete(Integer billableId);

    public void edit(Billable bill);
}
