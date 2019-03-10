package sda.lukaszs.jsondatasets.model.meteorites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Meteorite {
    private String fall;
    private Geolocation geolocation;
    private String id;
    private String mass;
    private String name;
    private String nametype;
    private String recclass;
    private String reclat;
    private String reclong;
    private String year;
    private String computedRegionCbhkFwbd;
    private String computedRegionNnqa25F4;

    @JsonProperty("fall")
    public String getFall() { return fall; }
    @JsonProperty("fall")
    public void setFall(String value) { this.fall = value; }

    @JsonProperty("geolocation")
    public Geolocation getGeolocation() { return geolocation; }
    @JsonProperty("geolocation")
    public void setGeolocation(Geolocation value) { this.geolocation = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("mass")
    public String getMass() { return mass; }
    @JsonProperty("mass")
    public void setMass(String value) { this.mass = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("nametype")
    public String getNametype() { return nametype; }
    @JsonProperty("nametype")
    public void setNametype(String value) { this.nametype = value; }

    @JsonProperty("recclass")
    public String getRecclass() { return recclass; }
    @JsonProperty("recclass")
    public void setRecclass(String value) { this.recclass = value; }

    @JsonProperty("reclat")
    public String getReclat() { return reclat; }
    @JsonProperty("reclat")
    public void setReclat(String value) { this.reclat = value; }

    @JsonProperty("reclong")
    public String getReclong() { return reclong; }
    @JsonProperty("reclong")
    public void setReclong(String value) { this.reclong = value; }

    @JsonProperty("year")
    public String getYear() { return year; }
    @JsonProperty("year")
    public void setYear(String value) { this.year = value; }

    @JsonProperty(":@computed_region_cbhk_fwbd")
    public String getComputedRegionCbhkFwbd() { return computedRegionCbhkFwbd; }
    @JsonProperty(":@computed_region_cbhk_fwbd")
    public void setComputedRegionCbhkFwbd(String value) { this.computedRegionCbhkFwbd = value; }

    @JsonProperty(":@computed_region_nnqa_25f4")
    public String getComputedRegionNnqa25F4() { return computedRegionNnqa25F4; }
    @JsonProperty(":@computed_region_nnqa_25f4")
    public void setComputedRegionNnqa25F4(String value) { this.computedRegionNnqa25F4 = value; }

    @Override
    public String toString() {
        return "Meteorite{" +
                "fall='" + fall + '\'' +
                ", geolocation=" + geolocation +
                ", id='" + id + '\'' +
                ", mass='" + mass + '\'' +
                ", name='" + name + '\'' +
                ", nametype='" + nametype + '\'' +
                ", recclass='" + recclass + '\'' +
                ", reclat='" + reclat + '\'' +
                ", reclong='" + reclong + '\'' +
                ", year='" + year + '\'' +
                ", computedRegionCbhkFwbd='" + computedRegionCbhkFwbd + '\'' +
                ", computedRegionNnqa25F4='" + computedRegionNnqa25F4 + '\'' +
                '}';
    }
}
