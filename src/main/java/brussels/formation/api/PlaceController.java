package brussels.formation.api;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import brussels.formation.application.PlaceAction;
import brussels.formation.model.Place;

/**
 * @author abajramov
 * @since 30/08/2018
 */
@RestController("/places")
public class PlaceController {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    private final PlaceAction placeAction;
    // ----------------------------------------------------------------------------Constructor(s)---
    @Autowired
    public PlaceController(PlaceAction placeAction) {
        this.placeAction = placeAction;
    }
    
    // -------------------------------------------------------------------------------Override(s)---
  
    // --------------------------------------------------------------------------------Method(s)---
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Place getPlace(HttpServletResponse response, @RequestParam("placeId") String placeId) {
        Place place = placeAction.getPlace("S");
        if (place == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
        
        return place;
    }
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
