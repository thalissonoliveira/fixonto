package fixture.owl.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;

import fixture.owl.model.SPL;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.intefaces.Element;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Rule;

public class Utils {

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String HOME_FOLDER = System.getProperty("user.home");
	public static final String TEMP_FOLDER = HOME_FOLDER + FILE_SEPARATOR + "fixturetmp";
	public static final String OUTPUT_FOLDER = HOME_FOLDER + FILE_SEPARATOR + "fixtureoutput";
	public static final String META_ONTOLOGY_TEMP_PATH = TEMP_FOLDER + FILE_SEPARATOR + "MetaOntologyFixture2.owl";
	public static final String SPLiSEM_OUTPUT_PATH = OUTPUT_FOLDER + FILE_SEPARATOR + "SPLiSEM2.owl";
	public static final String SHARP = "#";
	public static final String META_ONTOLOGY_BASE_URL = "http://www.semanticweb.org/2014/8/FeaToOntoFixture2";
	public static final String META_ONTOLOGY_BASE_URL_SHARP = META_ONTOLOGY_BASE_URL + SHARP;
	public static final String BUILT_IN_BASE_URL = Utils.META_ONTOLOGY_BASE_URL + ":" + "fix" + Utils.SHARP;
	
	@Deprecated
	public static File getOntologyXML(String pathLoad) {
		refreshTempFolderInUserHome();
		return new File(META_ONTOLOGY_TEMP_PATH);
	}
	
	public static <O> Set<Class<? extends O>> getSubclassesOf(Class<O> klassO, String packageName) {

		Reflections reflections = new Reflections(new ConfigurationBuilder().addUrls(ClasspathHelper.forPackage(packageName)));

		Set<Class<? extends O>> subTypesOf = reflections.getSubTypesOf(klassO);
		
		Set<Class<? extends O>> subTypesFinal = new HashSet<Class<? extends O>>();
		
		for (Class<? extends O> class1 : subTypesOf) {
			if (!class1.getName().contains("$")) {
				subTypesFinal.add(class1);
			}
		}
		
		return subTypesFinal.isEmpty() ? null : subTypesFinal;
	}

	public static <O>Set<Class<? extends O>> getSubclassesOf(Class<O> klassO) {
		return getSubclassesOf(klassO, "");
	}

	// TODO Para profissionalizar, NO FUTURO, colocar isso numa thread para
	// tratar a concorrência de instâncias de OWLWriter.
	public static void refreshTempFolderInUserHome() {
		deleteTempFolder();
		createTempFolder();
	}

	public static boolean createTempFolder() {
		return (new File(TEMP_FOLDER)).mkdirs(); // Cria a pasta temporária
	}

	public static boolean refreshOutputFolder() {
		return (new File(OUTPUT_FOLDER)).mkdirs(); // Cria a pasta temporária
	}

	public static boolean deleteTempFolder() {
		File tempFolder = new File(TEMP_FOLDER);
		return deleteDir(tempFolder);
	}

	private static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}

		// Agora o diretório está vazio, restando apenas deletá-lo.
		return dir.delete();
	}

	public static MandatoryFeature getMandatoryFeatureOf(Element element) {
		if (element == null || !element.isMandatoryFeature()) {
			return null;
		}
		return (MandatoryFeature) element;
	}

	public static OptionalFeature getOptionalFeatureOf(Element element) {
		if (element == null || !element.isOptionalFeature()) {
			return null;
		}
		return (OptionalFeature) element;
	}

	public static VariationTwo getVariationTwoFeatureOf(Element element) {
		if (element == null || !element.isVariatioTwoFeature()) {
			return null;
		}
		return (VariationTwo) element;
	}

	public static RootFeature getRootFeatureOf(Element element) {
		if (element == null || !element.isRootFeature()) {
			return null;
		}
		return (RootFeature) element;
	}

	public static Feature getFeatureOf(Element element) {

		if (element != null) {
			if (element.isMandatoryFeature()) {
				return getMandatoryFeatureOf(element);
			}
			if (element.isOptionalFeature()) {
				return getOptionalFeatureOf(element);
			}
			if (element.isVariatioTwoFeature()) {
				return getVariationTwoFeatureOf(element);
			}
			if (element.isRootFeature()) {
				return getRootFeatureOf(element);
			}
		}

		return null;
	}
	
	public static ContextRoot getContextRootOf(Element element) {
		if (element == null || !element.isContextRoot()) {
			return null;
		}
		return (ContextRoot) element;
	}
	
	public static CompositionRule getCompositionRuleOf(Rule rule) {
		if (rule == null || !rule.isCompositionRule()) {
			return null;
		}
		return (CompositionRule) rule;
	}
	
	public static ContextRule getContextRuleOf(Rule rule) {
		if (rule == null || !rule.isContextRule()) {
			return null;
		}
		return (ContextRule) rule;
	}

	public static void showFileContentOnConsole(File file) {
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("[ERROR] Utils.showFileContentOnConsole(File file). File no found. See log.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("[ERROR] Utils.showFileContentOnConsole(File file). IO problem. See log.");
		}

	}
	
	public static void printOntologyInfo(OntoHelper ontoHelper) {
		Set<OWLClass> classesInSignature = ontoHelper.getMetaOntology().getClassesInSignature();

		System.out.println("PRINTING ONTOLOGY INFO");
		System.out.println(classesInSignature.size());
		
		Set<OWLAxiom> axioms = ontoHelper.getMetaOntology().getAxioms();
		for (OWLAxiom owlAxiom : axioms) {
			System.out.println(owlAxiom);
		}
	}
	
	public static void printSPLInfo(SPL spl) {
		System.out.println("######## PRINTING SPL INFO #########");
		System.out.println("SPL: " + spl.getName());
		System.out.println("System: " + spl.getSystem().getName());
		System.out.println("Elements:");
		for (Element element : spl.getElements()) {
			boolean isFeature = element.isGroupedFeature() || element.isMandatoryFeature() || element.isOptionalFeature() || element.isRootFeature() || element.isVariatioTwoFeature();
			if (isFeature) { 
				System.out.println(">> " + element.getName());
				Feature f = (Feature) element;
				System.out.println(f.getChildrenFeatures().size() != 0 ? "Children:::" : "No children");
				for (Feature ft : f.getChildrenFeatures()) {
					System.out.println(ft.getName());
				}
				System.out.println("---------------------");
			} else {
				System.out.println(element);
				System.out.println("-.-.-.-.-.-.-.-.-.-.-.");
			}
		}
		System.out.println("Rules:");
		System.out.println("Name - isCompositionRule - isContextRule");
		for (Rule rule : spl.getRules()) {
			System.out.println(rule.getName() + " - " + rule.isCompositionRule() + " - " + rule.isContextRule());
			if (rule.isCompositionRule()) {
				CompositionRule compoRule = (CompositionRule) rule;
				System.out.println(compoRule.getAntecedent());
				System.out.println(compoRule.getConsequent());
			} else if(rule.isContextRule()) {
				ContextRule contRule = (ContextRule) rule;
				System.out.println(contRule);
			}
			System.out.println("_._._._._._._._._._._._");
		}
	}

}
