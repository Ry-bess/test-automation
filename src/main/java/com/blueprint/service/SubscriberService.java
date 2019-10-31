package com.blueprint.service;

import com.blueprint.dto.AddressDTO;
import com.blueprint.dto.SubscriberDTO;

/**
 * 
 * @author Rayene
 *
 */
public interface SubscriberService {

    /**
     * 
     * @param id: the id of subscriber
     * @return SubscriberDTO found in database
     */
    public SubscriberDTO findById(Long id);

    /**
     * 
     * @param user
     * @return
     */
    public SubscriberDTO saveOrUpdate(SubscriberDTO user);

    /**
     * 
     * @param id
     * @param address
     * @return
     */
    public SubscriberDTO updateSubscriberAddress(long id, AddressDTO address);
    

}
