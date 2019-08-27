package reports;

public class ReportByLastAction implements ReportType {
    @Override
    public void openReport() {
        System.out.println("Открыт отчет по последнему ДЕЙСТВИЮ");
    }

    @Override
    public void getSmsValue(SmsSearchCriteria number, SmsTypes smsType) {
        System.out.println("Выбрана последняя смс типа " + smsType.getSmsType() + " для номера " + number );
    }

    @Override
    public void saveSmsValue() {
        System.out.println("Значение смс сохранено в переменную");
    }
}
