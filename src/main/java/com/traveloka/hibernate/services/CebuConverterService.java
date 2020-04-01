package com.traveloka.hibernate.services;

import org.springframework.stereotype.Service;

@Service
public class CebuConverterService {
  final static char keySeparator = '#';
  final static String keySplitter = "~";
  final static char dotSeparator = '.';

  //protected String getSpecKeyForCompare(ManageRetrieval manageRetrieval) throws ParseException {
  //    String cebuSpecKey = "";
  //    if (manageRetrieval == null || manageRetrieval.getBookings() == null
  //            || manageRetrieval.getBookings().size() == 0)
  //        return cebuSpecKey;
  //
  //    List<Booking> bookings = manageRetrieval.getBookings();
  //    Booking booking = bookings.get(0);
  //    if (booking.getJourneys() == null || booking.getJourneys().size() == 0)
  //        return cebuSpecKey;
  //
  //    List<Journey> journeys = booking.getJourneys();
  //    if (journeys.size() >= 2) {
  //        return cebuRoundTripKey(journeys);
  //    }
  //    return cebuOneWayKey(journeys.get(0));
  //}
  //
  ////input: replace pattern `~~ ~` or `~~` or `~ `  with `~`
  ////output: only ~ seperated string
  //public String sanitizeInputKey(String input) {
  //    String sanitizedKey = "";
  //    if (input == null || input.isEmpty())
  //        return sanitizedKey;
  //    sanitizedKey = input.replaceAll("(~\\s~~|~~|~\\s)", keySplitter);
  //    return sanitizedKey;
  //}
  //
  //// remove the last separator delimiter like '#'
  //public String trimSeparator(String key) {
  //    if ((key != null) && (key.length() > 0) && key.charAt(key.length() - 1) == keySeparator) {
  //        key = key.substring(0, key.length() - 1);
  //    }
  //    if((key != null) && (key.length() > 0) && key.charAt(key.length() - 1) == dotSeparator) {
  //        key = key.substring(0, key.length() - 1);
  //    }
  //    return key;
  //}
  //
  //// convert source date string into target date dd-mm-yyyy format
  //public String convertStringDateIntoAnotherFormat(String inputDate, String sourceFormat, String targetFormat) throws ParseException {
  //    Date d = new SimpleDateFormat(sourceFormat).parse(inputDate);
  //    return new SimpleDateFormat(targetFormat).format(d);
  //}
  //
  //public String cebuKeyMakerUtil(String inputKey) throws ParseException {
  //    StringBuilder sb = new StringBuilder();
  //    String input = sanitizeInputKey(inputKey);
  //    String[] specArray = input.split("~");
  //    sb.append(specArray[2]).append('.');
  //    sb.append(specArray[4]).append('.');
  //    sb.append("5J").append('.');
  //    sb.append(specArray[0]).append('-').append(specArray[1]).append('.');
  //    String[] departureDateTimeStamp = specArray[3].split("\\s");
  //    sb.append(convertStringDateIntoAnotherFormat(departureDateTimeStamp[0], "mm/dd/yyyy", "dd-mm-yyyy"))
  //            .append('.');
  //    sb.append(departureDateTimeStamp[1]);
  //    return sb.toString();
  //}
  //
  ////"5J~ 653~ ~~MNL~12/13/2019 16: 05~TAC~12/13/2019 17: 45~~^0~W~ ~5J~WRP~5300~~0~0~~X"
  ////5J~ 660~ ~~TAC~01/10/2020 14:00~MNL~01/10/2020 15:35~~^0~E~ ~5J~ERP~5310~~0~0~~X
  //public String cebuOneWayKey(Journey journey) throws ParseException {
  //    if (journey.getFlightType() != null) {
  //        if ("Connecting".equals(journey.getFlightType())) {
  //            return cebuMultiCityKey(journey);
  //        } else if ("Direct".equals(journey.getFlightType()))
  //            return cebuKeyMakerUtil(journey.getJourneySellKey());
  //    }
  //    return "";
  //}
  //
  //public String cebuRoundTripKey(List<Journey> journeys) throws ParseException {
  //    StringBuilder sb = new StringBuilder();
  //    String tempKey = "";
  //    for (Journey journey : journeys) {
  //        if ("Connecting".equals(journey.getFlightType())) {
  //            tempKey = cebuMultiCityKey(journey);
  //        } else if ("Direct".equals(journey.getFlightType())) {
  //            tempKey = cebuOneWayKey(journey);
  //        }
  //        System.out.println(tempKey);
  //        sb.append(tempKey).append(keySeparator);
  //    }
  //    return trimSeparator(sb.toString());
  //}
  //
  //public String cebuMultiCityKey(Journey journey) throws ParseException {
  //    List<Segment> segments = journey.getSegments();
  //    StringBuilder sb = new StringBuilder();
  //    for (Segment segment : segments) {
  //        String segmentKey = segment.getSegmentSellKey();
  //        sb.append(cebuKeyMakerUtil(segmentKey)).append(keySeparator);
  //    }
  //    return trimSeparator(sb.toString());
  //}
  //
  //public String tvlkOneWayKey() {
  //    return null;
  //}
  //
  //public String tvlkRoundTripKey() {
  //    return null;
  //}
  //
  //public String tvlkMultiCityKey() {
  //    return null;
  //}
}
