package models;
import java.util.Date;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

import org.bson.types.ObjectId;

import controllers.MorphiaObject;
import models.AlarmType;
@Entity
public class ActiveAlarm {
	@Id
	public ObjectId id;
	long NEDBAcessID;
	public long getNEDBAcessID() {
		return NEDBAcessID;
	}

	public void setNEDBAcessID(long nEDBAcessID) {
		NEDBAcessID = nEDBAcessID;
	}

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public long getModuleOrIfIndex() {
		return moduleOrIfIndex;
	}

	public void setModuleOrIfIndex(long moduleOrIfIndex) {
		this.moduleOrIfIndex = moduleOrIfIndex;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public AlarmType getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(AlarmType alarmType) {
		this.alarmType = alarmType;
	}

	int seqNum;
	long moduleOrIfIndex; //Need to find What it is?
	Date timeStamp;
	
	@Reference("ReffCollction") 
	AlarmType alarmType;
	
	public void createActiveAlarm(ActiveAlarm activeAlarmData) {
		MorphiaObject.datastore.save(activeAlarmData);
	}
	
	
	public AlarmSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(AlarmSeverity severity) {
		this.severity = severity;
	}

	AlarmSeverity severity;
	AlarmServiceEffect serviceEffect;
	
	@Reference("AlarmAckReff")
	AlarmAcknowledgement acknowledgement;
	public AlarmAcknowledgement getAcknowledgement() {
		return acknowledgement;
	}

	public void setAcknowledgement(AlarmAcknowledgement acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	
	String additionalInfo;
	Boolean isActive;
	String comments;
	Date clearedTimeStamp;
	Date NEAlarmTimeStamp; //Why there are two timestamp
	
	long index;
	int module;//Change when creating Module class
	long physicalLoc;//Change when creating class
	/*//int activeAlarmFlag; REDUNDANT
	Date NEAlarmClearTimeStamp;//Two cleared TimeStamps are there
	
	String externalCondition;
	long modelType;//Change when creating class
	long objectType;//Change when creating class
	String strObjInstance;//What it is?
	String direction;//TL1 direction ?
	String location;//TL1 Location
*/
	public AlarmServiceEffect getServiceEffect() {
		return serviceEffect;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getClearedTimeStamp() {
		return clearedTimeStamp;
	}

	public void setClearedTimeStamp(Date clearedTimeStamp) {
		this.clearedTimeStamp = clearedTimeStamp;
	}

	public Date getNEAlarmTimeStamp() {
		return NEAlarmTimeStamp;
	}

	public void setNEAlarmTimeStamp(Date nEAlarmTimeStamp) {
		NEAlarmTimeStamp = nEAlarmTimeStamp;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public long getPhysicalLoc() {
		return physicalLoc;
	}

	public void setPhysicalLoc(long physicalLoc) {
		this.physicalLoc = physicalLoc;
	}

	public void setServiceEffect(AlarmServiceEffect serviceEffect) {
		this.serviceEffect = serviceEffect;
	}
}
