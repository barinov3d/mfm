package reports;

public class ReportBySystem implements ReportType {
    @Override
    public void openReport() {
        System.out.println("Открыт отчет по СИСТЕМАМ");
    }

    @Override
    public void getSmsValue(SmsSearchCriteria system, SmsTypes smsType) {
        System.out.println("Выбрана последняя смс типа " + smsType.getSmsType() + " для системы " + system );
    }

    @Override
    public void saveSmsValue() {
        System.out.println("Значение смс сохранено в переменную");
    }
}
