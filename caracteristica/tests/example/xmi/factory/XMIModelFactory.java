package example.xmi.factory;

import example.xmi.XMIFeatureModelTags;
import example.xmi.model.XMIModel;


public class XMIModelFactory {

	
	public static XMIModel newXmiModel(String tagName) {
		for (XMIFeatureModelTags xmiFeatureModelTags : XMIFeatureModelTags.values()) {
			if (tagName.equals(xmiFeatureModelTags.getTagName())) {
//				return xmiFeatureModelTags.getXmiModel();
			}
		}
		return null;
	}
	
}
