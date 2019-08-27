package reports;

public class ReportTypeFactory {
    private static ReportType reportType = null;

    public static ReportType createReportType (ReportTypes type) {
        if (type.equals(ReportTypes.BY_NUMBER)) {
            reportType = new ReportByNumber();
        }
        if (type.equals(ReportTypes.BY_LAST_ACTION)) {
            reportType = new ReportByLastAction();
        }
        if (type.equals(ReportTypes.BY_SYSTEM)) {
            reportType = new ReportBySystem();
        }
        return reportType;

    }
}
