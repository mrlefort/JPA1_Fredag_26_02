package Entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-25T10:16:23")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, Long> hoursUsed;
    public static volatile SingularAttribute<Task, String> name;
    public static volatile SingularAttribute<Task, String> description;
    public static volatile SingularAttribute<Task, Long> hoursAssigned;
    public static volatile SingularAttribute<Task, Long> id;

}