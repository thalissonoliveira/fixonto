package example.xmi;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import example.xmi.model.UMLTaggedValueDataValue;
import example.xmi.model.XMI;
import example.xmi.model.XMIContent;

public class UbifexXMIReader {
	
	private XMI xmi;
	
	public static void main(String[] args) throws Exception {
		new UbifexXMIReader().read(XMIUtils.FEATURE_MODEL_PATH);
	}

	public void read(String fileAddress) throws Exception {
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(fileAddress));
		doc.getDocumentElement().normalize();
		
		//Build XMI
		xmi = new XMI();
		
		//Build Content
		NodeList elementsUMLNode = doc.getElementsByTagName(XMIFeatureModelTags.UML_NODE.getTagName());
		
		
		NodeList childNodes = doc.getDocumentElement().getChildNodes();
		
		for (int i = 0; i < childNodes.getLength(); i++) {
			String nodeName = childNodes.item(i).getNodeName();
			System.out.println(nodeName);
		}
		
		
		XMIContent xmiContent;
		int contentLength = elementsUMLNode.getLength();
		
		for (int i = 0; i < contentLength; i++) {
			xmiContent = new XMIContent();
			xmi.getXmiContents().add(xmiContent);
		}
		
		//Build Node
//		NodeList elementsXMIContent = doc.getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
//		NodeList elementsUMLTaggedValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE.getTagName());
//		NodeList elementsUMLModelElementTaggedValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_MODEL_ELEMENT_TAGGED_VALUE.getTagName());
//		NodeList elementsUMLTaggedValueDataValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE_DATA_VALUE.getTagName());
//		
//		Set<UMLTaggedValueDataValue> processDataValue = processDataValue(elementsUMLTaggedValueDataValue);
		
//		System.out.println(elementsXMIContent.getLength());
//		System.out.println(elementsUMLNode.getLength());
//		System.out.println(elementsUMLTaggedValue.getLength());
//		System.out.println(elementsUMLModelElementTaggedValue.getLength());
//		System.out.println(elementsUMLTaggedValueDataValue.getLength());
		
//		NodeList childFromDocumentElements = doc.getDocumentElement().getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
		
//		NodeList childNodes = doc.getChildNodes();
//		
//		for (int i = 0; i < childNodes.getLength(); i++) {
//			Node item = childNodes.item(i);
//			NodeList childNodes2 = item.getChildNodes();
//			for (int j = 0; j < childNodes2.getLength(); j++) {
//				System.out.println(childNodes2.item(j));
//			}
//		}
		
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

	private Set<UMLTaggedValueDataValue> processDataValue(NodeList nodeList) {
		
		int nodeListLength = nodeList.getLength();
		
		if (nodeListLength == 0) {
			return null;
		}
		
		Set<UMLTaggedValueDataValue> values = new LinkedHashSet<UMLTaggedValueDataValue>();
		
		UMLTaggedValueDataValue value;
		for (int i = 0; i < nodeListLength; i++) {
			value = new UMLTaggedValueDataValue();
			Node item = nodeList.item(i);
			value.setValue(item.getTextContent());
			values.add(value);
		}
		
		return values;
		
	}

	private void processarNodeList(NodeList elementsXMIContext) {
		
		for (int i = 0; i < elementsXMIContext.getLength(); i++) {
			Node item = elementsXMIContext.item(i);
			System.out.println("%%% " + item.getNodeName() + " " + item.getTextContent());
			NamedNodeMap attributes = item.getAttributes();
			for (int j = 0; j < attributes.getLength(); j++) {
				System.out.println("### " + attributes.item(j));
			}
		}
	}
}
