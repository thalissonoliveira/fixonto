package example.xmi;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Reader {
	
	public static void main(String[] args) throws Exception {
		
		new Reader().read(XMIUtils.CONTEXT_MODEL_PATH);
		
	}

	public void read(String fileAddress) throws Exception {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(fileAddress));

		// normalize text representation
		doc.getDocumentElement().normalize();
		System.out.println("==============================");
		System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
		
		
		NodeList childNodes = doc.getChildNodes();
		
		
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node item = childNodes.item(i);
			NodeList childNodes2 = item.getChildNodes();
			for (int j = 0; j < childNodes2.getLength(); j++) {
				System.out.println(childNodes2.item(j));
			}
		}
		
		NodeList listClass = doc.getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
		
		int totalClass = listClass.getLength();
		System.out.println("Total Class : " + totalClass);
		
		Node item = listClass.item(0);
		
		System.out.println();
//		NodeList listAttributes = item.getElementsByTagName(XMIAttributesFixture.XMI_ID.getAttribute());
//		int totalAttributes = listAttributes.getLength();
//		System.out.println("Total Attribute : " + totalAttributes);
//
//		NodeList linksAtributesHiding = doc
//				.getElementsByTagName(ATTRIBUTES);
//		for (int i = 0; i < linksAtributesHiding.getLength(); i++) {
//
//			Element link = (Element) linksAtributesHiding.item(i);
//
//			System.out.println("attribute value = "
//					+ link.getAttribute("visibility"));
//
//		}
//
//	} catch (SAXParseException err) {
//		System.out.println("** Parsing error" + ", line "
//				+ err.getLineNumber() + ", uri " + err.getSystemId());
//		System.out.println(" " + err.getMessage());
//
//	} catch (SAXException e) {
//		Exception x = e.getException();
//		((x == null) ? e : x).printStackTrace();
//
//	} catch (Throwable t) {
//		t.printStackTrace();
//	}
	}
}
