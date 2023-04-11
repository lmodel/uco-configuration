package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A dependency is a grouping of characteristics unique to something that a tool or other software relies on to function as intended.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Dependency extends UcoInherentCharacterizationThing {

  private String dependencyDescription;
  private String dependencyType;

}