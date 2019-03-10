package sda.lukaszs.jsondatasets.model.meteorites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
public class Geolocation {

    private String type;
    private double[] coordinates;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("coordinates")
    public double[] getCoordinates() { return coordinates; }
    @JsonProperty("coordinates")
    public void setCoordinates(double[] value) { this.coordinates = value; }

    @Override
    public String toString() {
        return String.format("%s%s", type, Arrays.toString(coordinates));
    }
}
