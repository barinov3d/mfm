import reports.*;

public class Main {
    public static void main(String[] args) {
        MfmHelper.getSmsFromMfm(SmsSearchCriteria.BY_NUMBER, ReportTypeFactory.createReportType(ReportTypes.BY_NUMBER), SmsTypes.DSS);
        System.out.println("");
        MfmHelper.getSmsFromMfm(SmsSearchCriteria.BY_NUMBER, ReportTypeFactory.createReportType(ReportTypes.BY_LAST_ACTION), SmsTypes.SIMPLE_OTP);
        System.out.println("");
        MfmHelper.getSmsFromMfm(SmsSearchCriteria.BY_SYSTEM, ReportTypeFactory.createReportType(ReportTypes.BY_SYSTEM), SmsTypes.SIMPLE_OTP);
    }
}
