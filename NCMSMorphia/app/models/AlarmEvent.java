package models;

import java.util.Date;

public class AlarmEvent {
	
	long NEDBAccessId;
	long modelType;//Change when creating class

	int index;
	
	AlarmType type;
	Date timeStamp;
	AlarmEventCause eventCause;
	AlarmSeverity severity;
	AlarmServiceEffect serviceEffect;
	
	String otherInfo;
	long physicalLoc;
	Date NEEventTimestamp;
	long objectType;//Change when creating class
	String strObjInstance;//What it is?
	String direction;//TL1 direction ?
	String location;//TL1 Location
	

}
