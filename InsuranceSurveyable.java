public interface InsuranceSurveyable {
    boolean isValidClaim();
}

public class HealthInsuranceSurveyor implements InsuranceSurveyable {
    public boolean isValidClaim() { return true; }
}
