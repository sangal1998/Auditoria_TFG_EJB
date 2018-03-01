package converters;

import Entidades.Fichero;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@ManagedBean(name = "ficheroConverter")
public class FicheroConverter implements Converter {

    private static final Map<Object, Integer> ENTITIES = new WeakHashMap<Object, Integer>();

    @Override
   public String getAsString(FacesContext context, UIComponent component, Object entity) {
       synchronized (ENTITIES) {
           if (!ENTITIES.containsKey(entity)) {
           	Integer id;
           	if(entity!=null)
           		id = ((Fichero)entity).getIdFichero();
           	else
           		id = 0;
               ENTITIES.put(entity, id);
               return id.toString();
           } else {
               return ENTITIES.get(entity).toString();
           }
       }
   }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String uuid) {
        for (Entry<Object, Integer> entry : ENTITIES.entrySet()) {
            if (entry.getValue().toString().equals(uuid)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    java.lang.String getKey(String value) {
        java.lang.String key;
        key = value;
        return key;
    }

    String getStringKey(java.lang.String value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }

}

