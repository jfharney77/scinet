package org.sixthcolumn.scinet.model;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;

public class SDSDs {

	private List<SDSD> sdsds;
	
	public SDSDs() {
		this.setSdsds(new ArrayList<SDSD>());
	}

	public List<SDSD> getSdsds() {
		return sdsds;
	}

	public void setSdsds(List<SDSD> sdsds) {
		this.sdsds = sdsds;
	}
	
	/*
	public Element toElement() {
        Element SPSPsEl = new Element("SPSPs");
        
        for(int i=0;i<this.sdsds.size();i++) {
        	SPSPsEl.addContent(this.sdsds.get(i));
        }
        
        return SPSPsEl;
    }
	*/
	
}
