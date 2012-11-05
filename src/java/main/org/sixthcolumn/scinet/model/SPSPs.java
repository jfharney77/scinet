package org.sixthcolumn.scinet.model;

import java.util.List;

import org.jdom.Element;

public class SPSPs {

	private List<SPSP> spsps;

	public List<SPSP> getSpsp() {
		return spsps;
	}

	public void setSpsp(List<SPSP> spsps) {
		this.spsps = spsps;
	}
	
	public Element toElement() {
		Element SPSPsEl = new Element("SPSPs");
        
		for(int i=0;i<spsps.size();i++) {
			SPSPsEl.addContent(spsps.get(i).toElement());
		}
        
        return SPSPsEl;
	}
	
	
}
