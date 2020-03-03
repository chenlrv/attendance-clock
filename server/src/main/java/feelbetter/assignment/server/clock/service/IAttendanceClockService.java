package feelbetter.assignment.server.clock.service;

import feelbetter.assignment.model.MonthReport;

public interface IAttendanceClockService {
    MonthReport getMonthReport(String userId, int month);

    void checkIn(String userId);

    void checkOut(String userId);

}