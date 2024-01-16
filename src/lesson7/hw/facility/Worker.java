package lesson7.hw.facility;

class Worker implements PrintingJobTitle {
    String jobTitle = "worker";

    public Worker(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String printJobTitle() {
        return jobTitle;
    }
}

