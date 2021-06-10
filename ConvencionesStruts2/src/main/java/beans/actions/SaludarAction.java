package beans.actions;

import org.apache.logging.log4j.*;

public class SaludarAction {
   
    Logger log=LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;

    public String execute(){
        log.info("Ejecutando método execute desde Struts2");
        this.saludosAtr="Hola desde Struts2 con Convenciones";
        return "exito";
    }
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
}
