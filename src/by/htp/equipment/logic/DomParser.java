package by.htp.equipment.logic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.equipment.entity.Equipment;

public class DomParser {

	public static void domParse(String path){
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = factory.newDocumentBuilder();
			Document doc = documentBuilder.parse(new File(path));
			
			NodeList nodeList1 = doc.getElementsByTagName("equipment");
			NodeList nodeList2 = doc.getElementsByTagName("accessory");
			 
            List<Equipment> equipList = new ArrayList<Equipment>();
            for (int i = 0; i < nodeList1.getLength(); i++) {
            	equipList.add(getEquipment(nodeList1.item(i)));
            }
        
            for (Equipment equip : equipList) {
                System.out.println(equip.toString());
			}
            
            List<Equipment> accessList = new ArrayList<Equipment>();
            for (int i = 0; i < nodeList2.getLength(); i++) {
            	accessList.add(getAccessory(nodeList2.item(i)));
            }
    
            for (Equipment acces : accessList) {
                System.out.println(acces.toString());
			}
		}
            catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static Equipment getEquipment(Node node) {
		Equipment equip = new Equipment();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
           
            equip.setTitle(getTagValue("title", element));
            equip.setPrice(Double.valueOf(getTagValue("price", element)));
            equip.setGender(getTagValue("gender", element));
        }
        return equip;
    }
 
	private static Equipment getAccessory(Node node) {
		Equipment access = new Equipment();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
           
            access.setTitle(getTagValue("title", element));
            access.setPrice(Double.valueOf(getTagValue("price", element)));
            access.setGender(getTagValue("gender", element));
        }
        return access;
    }
	
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
	
}

