package controllers;

import java.util.Date;

import models.ActiveAlarm;
import models.AlarmAcknowledgement;
import models.AlarmEventType;
import models.AlarmServiceEffect;
import models.AlarmSeverity;
import models.AlarmType;
import models.AutoAck;
//import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  
	  
	 AlarmAcknowledgement alarmAckObj = new AlarmAcknowledgement();
	 alarmAckObj.setIndex(45);
	 alarmAckObj.setAckType(AutoAck.MANUAL);
	 alarmAckObj.setTimeStamp(new Date());
	 alarmAckObj.setUserName("Kushang");
	 
	 alarmAckObj.insertAlarmAck(alarmAckObj);
	  
	  AlarmType alarmTypeObj = new AlarmType();
	  
	  alarmTypeObj.setEventTypeString("Alaram Event4");
	  alarmTypeObj.setIndex(456);
	  alarmTypeObj.setTL1("T");
	  alarmTypeObj.setTMF("TTest1");
	  alarmTypeObj.setEventType(AlarmEventType.NE_ALARM);
	  alarmTypeObj.setAlarmTypeData(alarmTypeObj);
	  
	  
	  ActiveAlarm actAlarmObj = new ActiveAlarm();
	  actAlarmObj.setAlarmType(alarmTypeObj);
	  actAlarmObj.setAcknowledgement(alarmAckObj);
	  actAlarmObj.setModuleOrIfIndex(7857);
	  actAlarmObj.setNEDBAcessID(2222);
	  actAlarmObj.setSeqNum(78);
	  actAlarmObj.setTimeStamp(new Date());
	  actAlarmObj.setSeverity(AlarmSeverity.NOT_ALARMED);
	  actAlarmObj.setServiceEffect(AlarmServiceEffect.SERVICE_NOT_AFFECTED);
	  actAlarmObj.createActiveAlarm(actAlarmObj);
	  actAlarmObj.setIsActive(false);
	  actAlarmObj.setAdditionalInfo("Circutes are not working");
	  actAlarmObj.setNEAlarmTimeStamp(new Date());
	  actAlarmObj.setClearedTimeStamp(new Date());
	  actAlarmObj.setComments("Design is ok");
	  actAlarmObj.setIndex(1234567);
	  actAlarmObj.setNEDBAcessID(12312312);
	  actAlarmObj.setModule(45);
	  actAlarmObj.setPhysicalLoc(987456321);
	  System.out.println("Im pushing to gitHub");
	  //actAlarmObj.setAcknowledgement(acknowledgement);
    return ok(index.render("Your new application is ready."));
  }
  
}