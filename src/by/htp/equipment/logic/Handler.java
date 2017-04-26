package by.htp.equipment.logic;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler  {

	@Override
	public void startDocument() throws SAXException{
		 System.out.println("Start parsing... ");
	}
	
	@Override
	public void endDocument() throws SAXException{
		 System.out.println("End parsing... ");
	}
	
	@Override
	public void startElement(String uri, String localName, String gName, Attributes attributes)throws SAXException{
		
	}
	
	@Override
	public void endElement(String uri, String localName, String gName)throws SAXException{
		
	}
	
	@Override
	public void characters(char[] ch, int start, int end)throws SAXException{
		String str = new String(ch,start,end);
		System.out.println(str);
	}
	
	/* @Override
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
	    }*/
}
