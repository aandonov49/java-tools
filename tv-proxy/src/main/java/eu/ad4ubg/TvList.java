package eu.ad4ubg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TvList {
  @JsonProperty("num")
  private int num;

  @JsonProperty("name")
  private String name;

  @JsonProperty("stream_type")
  private String stream_type;

  @JsonProperty("stream_id")
  private int stream_id;

  @JsonProperty("stream_icon")
  private String stream_icon;

  @JsonProperty("epg_channel_id")
  private String epg_channel_id;

  @JsonProperty("added")
  private String added;

  @JsonProperty("category_id")
  private String category_id;

  @JsonProperty("custom_sid")
  private String custom_sid;

  @JsonProperty("tv_archive")
  private int tv_archive;

  @JsonProperty("direct_source")
  private String direct_source;

  @JsonProperty("tv_archive_duration")
  private int tv_archive_duration;

  @JsonIgnore
  private TvCategory tvCategory;

  public int getNum() {
    return num;
  }

  public String getName() {
    return name;
  }

  public String getStream_type() {
    return stream_type;
  }

  public int getStream_id() {
    return stream_id;
  }

  public String getStream_icon() {
    return stream_icon;
  }

  public String getEpg_channel_id() {
    return epg_channel_id;
  }

  public String getAdded() {
    return added;
  }

  public String getCategory_id() {
    return category_id;
  }

  public String getCustom_sid() {
    return custom_sid;
  }

  public int getTv_archive() {
    return tv_archive;
  }

  public String getDirect_source() {
    return direct_source;
  }

  public int getTv_archive_duration() {
    return tv_archive_duration;
  }

  public TvCategory getTvCategory() {
    return tvCategory;
  }

  public void setTvCategory(TvCategory tvCategory) {
    this.tvCategory = tvCategory;
  }

  @Override
  public String toString() {
    return "TvList{"
        + "num="
        + num
        + ", name='"
        + name
        + '\''
        + ", stream_type='"
        + stream_type
        + '\''
        + ", stream_id="
        + stream_id
        + ", stream_icon='"
        + stream_icon
        + '\''
        + ", epg_channel_id='"
        + epg_channel_id
        + '\''
        + ", added='"
        + added
        + '\''
        + ", category_id='"
        + category_id
        + '\''
        + ", custom_sid='"
        + custom_sid
        + '\''
        + ", tv_archive="
        + tv_archive
        + ", direct_source='"
        + direct_source
        + '\''
        + ", tv_archive_duration="
        + tv_archive_duration
        + '}';
  }
}
