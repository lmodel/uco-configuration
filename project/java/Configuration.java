package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A configuration is a grouping of characteristics unique to a set of parameters or initial settings for the use of a tool, application, software, or other cyber object.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Configuration extends UcoObject {

  private List<ConfigurationEntry> configurationEntry;
  private List<Dependency> dependencies;
  private List<String> usageContextAssumptions;

}