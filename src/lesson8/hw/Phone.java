package lesson8.hw;

class Phone {
    private Integer number;
    private String model;
    private Integer weight;

    public Phone(Integer number, String model, Integer weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(Integer number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    String reciveCall(String name) {
        return name + " " + "is calling";
    }

    Integer getNumber() {
        return number;
    }

    String reciveCall(String name, Integer number) {
        return name + " " + "is calling." + " " + "Number of the caller: " + number;
    }

    static void sendMessage(int[] phones, String message) {
        for (int i = 0; i < phones.length; i++) {
            System.out.println(String.valueOf(phones[i] + " " + message));
        }

    }

}
