package uek.dev.morfer.sample;

import org.hibernate.validator.constraints.NotBlank;

public class Sample {

    @NotBlank(message = "Entry object should have [sample] property.")
    private String sample;

    public Sample() {
    }

    public Sample(String sample) {
        this.sample = sample;
    }

    public String getSample() {
        return this.sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }
}
