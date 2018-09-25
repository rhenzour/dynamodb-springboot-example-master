package brussels.formation.infrastructure;

import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

import brussels.formation.model.Place;
import brussels.formation.model.PlaceRepository;

/**
 * @author abajramov
 * @since 30/08/2018
 */
@Repository
public class DynamodbPlaceRepository extends DynamodbRepository implements PlaceRepository {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    
    // ----------------------------------------------------------------------------Constructor(s)---
    
    // -------------------------------------------------------------------------------Override(s)---
    @Override
    public Place getPlace(String placeId) {
        DynamoDB dynamodb = new DynamoDB(getDynamodbClient());
        Table    table    = dynamodb.getTable("Team2");
//        Item item = table.getItem("deviceId", placeId);
        ItemCollection<ScanOutcome> scan = table.scan();
        Place place = null;
        
        scan.forEach(p->{System.out.println(p);});
        
//        if (item != null) {
//             place = new Place();
//             place.setDeviceId(item.getString("deviceId"));
//            
//        }

        return null;
    }
    
    // ---------------------------------------------------------------------------------Method(s)---
    
    // -----------------------------------------------------------------------Getter(s)/Setter(s)---
}
