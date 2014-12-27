package models;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
//import com.google.code.morphia.annotations.Reference;
//import com.sun.corba.se.spi.ior.ObjectId;


import controllers.MorphiaObject;

@Entity
public class AlarmType {
	
	@Id
	public ObjectId id;
	
	int index;
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getEventTypeString() {
		return eventTypeString;
	}

	public void setEventTypeString(String eventTypeString) {
		this.eventTypeString = eventTypeString;
	}

	public String getTL1() {
		return TL1;
	}

	public void setTL1(String tL1) {
		TL1 = tL1;
	}

	public String getTMF() {
		return TMF;
	}

	public void setTMF(String tMF) {
		TMF = tMF;
	}

	public AlarmEventType getEventType() {
		return eventType;
	}

	public void setEventType(AlarmEventType eventType) {
		this.eventType = eventType;
	}

	String eventTypeString;
	String TL1;//Doubt
	String TMF;//Doubt
	
	
	AlarmEventType eventType;
	
	public void setAlarmTypeData(AlarmType alarmTypeObj) {
		MorphiaObject.datastore.save(alarmTypeObj);
	}

}
