package entryCourseLogicalExercises.stackAndQueue.factorio;

public class FactorioProduct {

    private String name;
    private String processingLineInitialTime;
    private String processingStartTime;

    public FactorioProduct(String name, String processingLineInitialTime) {
        this.name = name;
        this.processingLineInitialTime = processingLineInitialTime;

    }

    public String getProcessingStartTime() {
        return processingStartTime;
    }

    public void setProcessingStartTime(int processingStartTimeInSeconds) {

        String[] hms = this.processingLineInitialTime.split(":");
        int hour = Integer.parseInt(hms[0]);
        int minutes = Integer.parseInt(hms[1]);
        int seconds = Integer.parseInt(hms[2]);

        seconds += processingStartTimeInSeconds % 60;
        minutes += processingStartTimeInSeconds / 60;

        if (seconds > 59) {
            int currentTotalSeconds = seconds;
            minutes += currentTotalSeconds / 60;
            seconds = seconds % 60;

        }

        if (minutes > 59) {
            int totalMinutes = minutes;
            hour += minutes / 60;
            minutes = totalMinutes % 60;
        }

        if (hour > 23) {
            hour = 0;
        }

        this.processingStartTime = String.format("%02d:%02d:%02d", hour, minutes, seconds);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
