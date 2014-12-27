package models;

import java.util.Date;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;
//import com.google.code.morphia.Datastore;
import controllers.MorphiaObject;

@Entity
public class AlarmAcknowledgement {
	@Id
	public ObjectId id;
	
	int index;
	String userName;
	Date timeStamp;
	AutoAck ackType;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public AutoAck getAckType() {
		return ackType;
	}
	public void setAckType(AutoAck ackType) {
		this.ackType = ackType;
	}
	public void insertAlarmAck(AlarmAcknowledgement alarmData) {
		MorphiaObject.datastore.save(alarmData);
	}

}
