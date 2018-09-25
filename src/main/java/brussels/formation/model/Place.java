package brussels.formation.model;

import org.joda.time.DateTime;

/**
 * @author abajramov
 * @since 30/08/2018
 */
public class Place {
    // -------------------------------------------------------------------------------Constant(s)---
    
    // -----------------------------------------------------------------------------Property(ies)---
    private String deviceId;
    private DateTime date;
	public Place(String deviseId, DateTime date) {
		super();
		this.deviceId = deviseId;
		this.date = date;
	}
	public Place() {
		super();
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviseId) {
		this.deviceId = deviseId;
	}
	public DateTime getDate() {
		return date;
	}
	public void setDate(DateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Place [deviseId=" + deviceId + ", date=" + date + "]";
	}
 
    
    // ----------------------------------------------------------------------------Constructor(s)---
}