package com.blueprint.repository;

import java.util.List;

import com.blueprint.domain.Address;

public interface AddressSearchRepository {

    /**
     * 
     * @param searchTerm
     * @return
     */
    List<Address> addressFuzzySearch(String searchTerm);

}
