package org.sixthcolumn.scinet.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.jdom.Element;
import org.jdom.output.XMLOutputter;
import org.sixthcolumn.scinet.json.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author 8xo
 *
 * <SPSP>
		<SPid>SPid1</SPid>
		<Relationship>Relationship1</Relationship>
		<SPid>SPid1</SPid>
	</SPSP>
 *
 */
public class SPSP {

	private String SPid_src;
	private String relationship;
	private String SPid_dest;
	
	
	public String getSPid_src() {
		return SPid_src;
	}
	public void setSPid_src(String sPid_src) {
		SPid_src = sPid_src;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getSPid_dest() {
		return SPid_dest;
	}
	public void setSPid_dest(String sPid_dest) {
		SPid_dest = sPid_dest;
	}
	
	public Element toElement() {
        Element SPSPEl = new Element("SPSP");
        
        Element SPid_srcEl = new Element("SPid_src");
        SPid_srcEl.addContent(this.SPid_src);
        SPSPEl.addContent(SPid_srcEl);
        
        Element relationshipEl = new Element("Relationship");
        relationshipEl.addContent(this.relationship);
        SPSPEl.addContent(relationshipEl);
        
        Element SPid_destEl = new Element("SPid_dest");
        SPid_destEl.addContent(this.SPid_dest);
        SPSPEl.addContent(SPid_destEl);
        
        
        return SPSPEl;
    }
	
	public String toXML() {
        String xml = "";
        
        Element servicesEl = this.toElement();

        XMLOutputter outputter = new XMLOutputter();
        xml = outputter.outputString(servicesEl);
        
        return xml;
    }
	
	public void toFile(String file) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            out.write(new XmlFormatter().format(this.toXML()));
            out.close();
        } 
        catch (IOException e) { 
            e.printStackTrace();
            System.out.println("Exception ");

        }
    }
	
	
      
	
	public void fromFile(String file) {
		
		this.relationship = null;
        this.SPid_dest = null;
        this.SPid_src = null;
        
        File fXmlFile = new File(file);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        
        
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
            
            org.w3c.dom.Element docElement = doc.getDocumentElement();
            
            this.readHelper(docElement);

            
            
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	
	public void readHelper(org.w3c.dom.Element docElement) {
		System.out.println(docElement.getNodeName());
        if(docElement.getNodeName().equals("SPSP")) {
            
            NodeList docNodeList = docElement.getChildNodes();//doc.getDocumentElement().getChildNodes();
            
            for(int i=0;i<docNodeList.getLength();i++) {
                Node topLevelDocNode = docNodeList.item(i);
                if (topLevelDocNode.getNodeType() == Node.ELEMENT_NODE) {
                	org.w3c.dom.Element topLevelElement = (org.w3c.dom.Element) topLevelDocNode;
                    
                	if(topLevelElement.getTagName().equals("SPid_src")) {
                		this.SPid_src = topLevelElement.getTextContent();
                	} else if (topLevelElement.getTagName().equals("Relationship")) {
                		this.relationship = topLevelElement.getTextContent();
                	} else {
                		this.SPid_dest = topLevelElement.getTextContent();
                	}
                }    
            }
        
        }
    }
    
	
	
	/** Description of toJSONObject() 
     * 
     */
    public JSONObject toJSONObject() {
        JSONObject json = null;
        
        try {
            json = XML.toJSONObject(this.toXML());
        } catch (JSONException e) {
            System.out.println("Problem in toJSONObject");
            e.printStackTrace();
        }
        
        return json;
    }




    /** Description of toJSON() 
     * 
     */
    public String toJSON() {
        String json = null;
        
        try {
            json = this.toJSONObject().toString(3);
        } catch (JSONException e) {
            System.out.println("Problem in toJSON");
            e.printStackTrace();
        }
        
        return json;
    }




	
	
	public static void main(String [] args) {
		
		SPSP spsp = new SPSP();
		
		spsp.setRelationship("relationship1");
		spsp.setSPid_dest("sPid_dest1");
		spsp.setSPid_src("sPid_src1");
		
		System.out.println(spsp.toXML());
		

		SPSP spsp1 = new SPSP();
		
		spsp1.fromFile("SPSP.txt");
		
		System.out.println(spsp1.getSPid_src());
		
		System.out.println(spsp1.toJSON());
	}
	
	
}
