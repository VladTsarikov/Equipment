package by.htp.equipment.logic;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParser {

	public static void saxParse(){
	 SAXParserFactory parserF = SAXParserFactory.newInstance();
	 Handler handler = new Handler();
	 try {
		SAXParser saxparser = parserF.newSAXParser();
		try {
			saxparser.parse(new File("resources/Equipments.xml"),handler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (ParserConfigurationException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	}
	}
}
