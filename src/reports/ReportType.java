package reports;

public interface ReportType {
    void openReport();
    void getSmsValue(SmsSearchCriteria smsSearchCriteria, SmsTypes smsType);
    void saveSmsValue();
}
