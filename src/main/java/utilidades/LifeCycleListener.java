/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author jmcastellano
 */
public class LifeCycleListener implements PhaseListener {

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("START PHASE " + event.getPhaseId());
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println("END PHASE " + event.getPhaseId());
    }

}
