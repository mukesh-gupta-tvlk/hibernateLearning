package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Remark", namespace = "")
public class RemarkRS {
  @XmlElement(name = "booking_remark_id", namespace = "")
  private String bookingRemarkId;

  @XmlElement(name = "remark_type_rcd", namespace = "")
  private String remarkTypeRcd;

  @XmlElement(name = "timelimit_date_time", namespace = "")
  private String timelimitDateTime;

  @XmlElement(name = "temp_timelimit_date_time", namespace = "")
  private String tempTimelimitDateTime;

  @XmlElement(name = "complete_flag", namespace = "")
  private String completeFlag;

  @XmlElement(name = "remark_text", namespace = "")
  private String remarkText;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "added_by", namespace = "")
  private String addedBy;

  @XmlElement(name = "client_profile_id", namespace = "")
  private String clientProfileId;

  @XmlElement(name = "agency_code", namespace = "")
  private String agencyCode;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "system_flag", namespace = "")
  private String systemFlag;

  @XmlElement(name = "utc_timelimit_date_time", namespace = "")
  private String utcTimelimitDateTime;

  @XmlElement(name = "protected_flag", namespace = "")
  private String protectedFlag;

  @XmlElement(name = "warning_flag", namespace = "")
  private String warningFlag;

  @XmlElement(name = "process_message_flag", namespace = "")
  private String processMessageFlag;

  @XmlElement(name = "split_booking_id", namespace = "")
  private String splitBookingId;

  @XmlElement(name = "display_name", namespace = "")
  private String displayName;

  @XmlElement(name = "create_name", namespace = "")
  private String createName;

  @XmlElement(name = "updateName", namespace = "")
  private String updateName;

}
