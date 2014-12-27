package models;

import com.google.code.morphia.annotations.Entity;

@Entity
public enum AlarmSeverity {

	NOT_ALARMED, 
	WARNING,
	MINOR,
	MAJOR,
	CRITICAL
}
