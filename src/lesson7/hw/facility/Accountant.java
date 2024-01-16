package lesson7.hw.facility;

class Accountant implements PrintingJobTitle{
    String jobTitle = "Accountant";

    public Accountant(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String printJobTitle() {
        return jobTitle;
    }
}
