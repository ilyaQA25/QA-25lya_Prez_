package lesson7.hw.facility;

class Director implements PrintingJobTitle{


    String jobTitle = "director";

    public Director(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String printJobTitle() {
        return jobTitle;
    }
}
