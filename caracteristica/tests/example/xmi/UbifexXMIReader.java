package example.xmi;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import example.xmi.factory.XMIModelFactory;
import example.xmi.model.UMLModelElementTaggedValue;
import example.xmi.model.UMLNode;
import example.xmi.model.UMLTaggedValue;
import example.xmi.model.UMLTaggedValueDataValue;
import example.xmi.model.XMI;
import example.xmi.model.XMIContent;
import example.xmi.model.XMIModel;

public class UbifexXMIReader {
	
	private Map<XMIContent, Map<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>> xmiMap;
	
	private class ParentNode {
		
		private Node node;
		private XMIModel xmiModel;
		
		public ParentNode(Node node, XMIModel xmiModel) {
			this.node = node;
			this.xmiModel = xmiModel;
		}

		public Node getNode() {
			return node;
		}

		public XMIModel getXmiModel() {
			return xmiModel;
		}
		
	}
	
	
	private XMI xmi;
	
	public static void main(String[] args) throws Exception {
		new UbifexXMIReader().read(XMIUtils.FEATURE_MODEL_PATH);
	}
	
	private void processNode(Node node, ParentNode xmiParentNode) {
		
		XMIModel xmiModel = XMIModelFactory.newXmiModel(node.getNodeName());
		
		if (xmiParentNode != null) {
			refreshMap(xmiModel, xmiParentNode);
		} else {
			if (xmiModel.isXmi()) {
				xmi = (XMI) xmiModel;
			} else {
				throw new RuntimeException();
			}
		}
		
		NodeList childNodes = node.getChildNodes();
		int nodeLength = childNodes.getLength();
		
		if (nodeLength > 0) {
			for (int i = 0; i < nodeLength; i++) {
				Node childNode = childNodes.item(i);
				String nodeName = childNode.getNodeName();
				XMIModel newXmiModel = XMIModelFactory.newXmiModel(nodeName);
				processNode(childNode, new ParentNode(childNode, xmiModel));
			}
		} else {
			Set<UMLTaggedValueDataValue> values = new LinkedHashSet<UMLTaggedValueDataValue>();
			UMLTaggedValueDataValue value = new UMLTaggedValueDataValue();
			value.setValue(node.getTextContent());
			values.add(value);
		}
		
	}

	private void refreshMap(XMIModel xmiModel, ParentNode xmiParentNode) {
		if (xmiModel.isXmi()) {
			if (xmiParentNode == null) {
				
			}
		} else if (xmiModel.isXmiContent()) {
			
		}
	}

	public void read(String fileAddress) throws Exception {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(fileAddress));
		
		Element documentElement = doc.getDocumentElement();
		documentElement.normalize();
		
		
		processNode(documentElement, null);
		
		
		//Build Node
//		NodeList elementsUMLNode = doc.getElementsByTagName(XMIFeatureModelTags.UML_NODE.getTagName());
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

//	private Set<UMLTaggedValueDataValue> processDataValue(NodeList nodeList) {
//		
//		int nodeListLength = nodeList.getLength();
//		
//		if (nodeListLength == 0) {
//			return null;
//		}
//		
//		Set<UMLTaggedValueDataValue> values = new LinkedHashSet<UMLTaggedValueDataValue>();
//		
//		UMLTaggedValueDataValue value;
//		for (int i = 0; i < nodeListLength; i++) {
//			value = new UMLTaggedValueDataValue();
//
//		}
//		
//		return values;
//		
//	}
//
//	private void processarNodeList(NodeList elementsXMIContext) {
//		for (int i = 0; i < elementsXMIContext.getLength(); i++) {
//			Node item = elementsXMIContext.item(i);
//			System.out.println("%%% " + item.getNodeName() + " " + item.getTextContent());
//			NamedNodeMap attributes = item.getAttributes();
//			for (int j = 0; j < attributes.getLength(); j++) {
//				System.out.println("### " + attributes.item(j));
//			}
//		}
//	}
}
