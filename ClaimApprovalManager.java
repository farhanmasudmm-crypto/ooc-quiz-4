public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyable surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("Claim approved.");
        }
    }
}
