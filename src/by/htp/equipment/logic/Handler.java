package by.htp.equipment.logic;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.equipment.entity.Equipment;


public class Handler extends DefaultHandler  {

	/*private List<Equipment> dataFromXML = new ArrayList<Equipment>();
	Equipment equip = new Equipment();
	private String element;
	private String title;
	private double price;
	private String gender;
	
	
	
	public List<Equipment> getDataFromXML() {
		return dataFromXML;
	}

	public void setDataFromXML(List<Equipment> dataFromXML) {
		this.dataFromXML = dataFromXML;
	}

	public Equipment getEquip() {
		return equip;
	}

	public void setEquip(Equipment equip) {
		this.equip = equip;
	}

	@Override
	public void startDocument() throws SAXException{
		 System.out.println("Start parsing... ");
	}
	
	@Override
	public void endDocument() throws SAXException{
		 System.out.println("End parsing... ");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException{
		element = qName;
		if(element.equals("equipment")){
			Equipment equip = new Equipment();
			setEquip(equip);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String gName)throws SAXException{
		//title = "";
		//id = -1;
	}
	
	@Override
	public void characters(char[] ch, int start, int end)throws SAXException{
		if(element.equals("title")){
			String ttl = new String(ch,start,end);
			equip.setTitle(ttl);
		}
		if(element.equals("price")){
			
			//String p = new String(ch,start,end);
			//Double prc = new Double(p);
			equip.setPrice(Double.parseDouble("8"));
		}
		if(element.equals("gender")){
			String gndr = new String(ch,start,end);
			equip.setCategory(gndr);
		}
		
		dataFromXML.add(equip);
		
		
		//if(element.equals("title")){
			String ttl = new String(ch,start,end);
		//}
		//if(element.equals("price")){
			String s = new String(ch,start,end);
			double prc = Double.parseDouble(s);
			//double prc = (double) k;
			//double prc=Double.parseDouble(s.replaceAll(" ","").replace(',','.'));
		//}
		//if(element.equals("gender")){
			String gndr = new String(ch,start,end);
			
		//}
		
		//Equipment equipment = new Equipment(ttl,prc,gndr);
		//System.out.println(equipment.toString());
		//String str = new String(ch,start,end);
		//System.out.println(str);
	}*/
	
	 @Override
	    public void startDocument() throws SAXException {
	        System.out.println("Начало разбора документа!");
	        super.startDocument();
	    }

	    @Override
	    public void endDocument() throws SAXException {
	        super.endDocument();
	        System.out.println("Разбор документа окончен!");

	    }
	    
	    public void startElement(String uri, String localName, String qName,
	            Attributes attributes) throws SAXException {
	        System.out.println("Тег: "+qName);
	        if(qName.equals("book"))
	            System.out.println("id книги "+attributes.getValue("id"));
	  //      System.out.println(attributes.getLength());
	        super.startElement(uri, localName, qName, attributes);

	        
	    }
	    
	    @Override
	    public void endElement(String uri, String localName, String qName) 
	                                                    throws SAXException {
	        
	        System.out.println("Тег разобран: "+qName);
	        super.endElement(uri,localName, qName);
	    }
	    
	    @Override
	    public void characters(char[] c, int start, int length) 
	                                                 throws SAXException {
	        super.characters(c, start,  length);
	        for(int i=start;i< start+length;++i)
	            System.err.print(c[i]);
	    }
}
