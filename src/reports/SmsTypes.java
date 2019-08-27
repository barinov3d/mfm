package reports;

public enum SmsTypes {
    DSS ("DSS_dbo_pro"),
    SIMPLE_OTP ("dbo_pro");

    private String title;

    SmsTypes(String smsType) {
        this.title = smsType;
    }

    public String getSmsType() {
        return title;
    }

}
