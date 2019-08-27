import reports.ReportType;
import reports.SmsSearchCriteria;
import reports.SmsTypes;

public class MfmHelper {
    public static void getSmsFromMfm(SmsSearchCriteria smsSearchCriteria, ReportType reportType, SmsTypes smsType) {
        openTab();
        login();
        reportType.openReport();
        reportType.getSmsValue(smsSearchCriteria, smsType);
        reportType.saveSmsValue();
        closeMfm();
        closeTab();
    }

    private static void closeTab() {
        System.out.println("Вкладка закрыта");
    }

    private static void closeMfm() {
        System.out.println("Mfm закрыт");
    }

    private static void login() {
        System.out.println("Логин в mfm");
    }

    private static void openTab() {
        System.out.println("Вкладка открыта");
    }
}
