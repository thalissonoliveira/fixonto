package example.xmi;

public enum XMIFeatureModelTags {

	UML_TAGGED_VALUE_DATA_VALUE("UML:TaggedValue.dataValue", null, null),
	UML_TAGGED_VALUE("UML:TaggedValue", new XMIFeatureModelTags[]{UML_TAGGED_VALUE_DATA_VALUE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION}),
	UML_MODEL_ELEMENT_TAGGED_VALUE("UML:ModelElement.taggedValue", new XMIFeatureModelTags[]{UML_TAGGED_VALUE}, null),
	UML_NODE("UML:Node", new XMIFeatureModelTags[]{UML_MODEL_ELEMENT_TAGGED_VALUE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION, XMIAttributesFixture.IS_ROOT, XMIAttributesFixture.IS_LEAF, XMIAttributesFixture.IS_ABSTRACT}),
	XMI_CONTENT("XMI.content", new XMIFeatureModelTags[]{UML_NODE}, null);
	
	private String tagName;
	private XMIFeatureModelTags[] childrenTags;
	private XMIAttributesFixture[] attributes;
	
	private XMIFeatureModelTags(String tagName, XMIFeatureModelTags[] childrenTags, XMIAttributesFixture[] attributes) {
		this.tagName = tagName;
		this.childrenTags = childrenTags;
		this.attributes = attributes;
	}
	
	public String getTagName() {
		return tagName;
	}

	public XMIFeatureModelTags[] getChildrenTags() {
		return childrenTags;
	}

	public XMIAttributesFixture[] getAttributes() {
		return attributes;
	}
	
}
