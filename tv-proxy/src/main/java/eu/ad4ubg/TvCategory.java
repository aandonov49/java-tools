package eu.ad4ubg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TvCategory {
  @JsonProperty("category_id")
  private String category_id;

  @JsonProperty("category_name")
  private String category_name;

  @JsonProperty("parent_id")
  private int parent_id;

  public String getCategory_id() {
    return category_id;
  }

  public String getCategory_name() {
    return category_name;
  }

  public int getParent_id() {
    return parent_id;
  }

  @Override
  public String toString() {
    return "TvCategory{"
        + "category_id="
        + category_id
        + ", category_name='"
        + category_name
        + '\''
        + ", parent_id="
        + parent_id
        + '}';
  }
}
