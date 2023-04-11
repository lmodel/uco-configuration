package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A configuration entry is a grouping of characteristics unique to a particular parameter or initial setting for the use of a tool, application, software, or other cyber object.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ConfigurationEntry extends UcoInherentCharacterizationThing {

  private List<UcoObject> itemObject;
  private String itemDescription;
  private String itemName;
  private String itemType;
  private List<String> itemValue;

}