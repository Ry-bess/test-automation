package com.blueprint.service;

import java.util.List;

import com.blueprint.dto.ContractDTO;

/**
 * 
 * @author Rayene
 *
 */
public interface ContractService {

    /**
     * 
     * @param id : the subscriber id
     * @return list of ContractDTO  of the given subscriber id
     */
    public List<ContractDTO> findBySubscriberId(Long id);
}
