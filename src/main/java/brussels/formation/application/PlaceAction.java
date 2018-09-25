package brussels.formation.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import brussels.formation.model.Place;
import brussels.formation.model.PlaceRepository;

/**
 * @author abajramov
 * @since 30/08/2018
 */
@Component
public class PlaceAction {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    private PlaceRepository placeRepository;
    
    // ----------------------------------------------------------------------------Constructor(s)---
    @Autowired
    public PlaceAction(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }
    
    // -------------------------------------------------------------------------------Override(s)---
    
    // ---------------------------------------------------------------------------------Method(s)---
    public Place getPlace(String id) {
        return placeRepository.getPlace(id);
    }
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
