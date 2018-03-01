/*
º * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import utilidades.JsfUtil;

/**
 *
 * @author jmcastellano
 */
@FacesValidator("requiredValidator")
public class RequiredValidation extends AbstractValidation {

    @Override
    public void validate(FacesContext context,UIComponent component, Object value) throws ValidatorException{
        String idComponent = component.getId();
        char[] caracteres = idComponent.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        String nameComponent = new String(caracteres);
        
        String msg = "El campo " + nameComponent + " debe ser rellenado";
        if(value instanceof String){
            String valor=(String)value;
            if(valor.length() <= 0){
                JsfUtil.addErrorMessage(msg);
                throw new ValidatorException(new FacesMessage(msg));
            }
        }
        else{
            if(value==null){
                JsfUtil.addErrorMessage(msg);
                throw new ValidatorException(new FacesMessage(msg));                
            }
        }
    }
    
}
