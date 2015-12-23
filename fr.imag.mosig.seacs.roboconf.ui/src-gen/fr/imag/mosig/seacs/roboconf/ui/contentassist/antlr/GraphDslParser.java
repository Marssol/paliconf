/*
 * generated by Xtext
 */
package fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.imag.mosig.seacs.roboconf.services.GraphDslGrammarAccess;

public class GraphDslParser extends AbstractContentAssistParser {
	
	@Inject
	private GraphDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr.internal.InternalGraphDslParser createParser() {
		fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr.internal.InternalGraphDslParser result = new fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr.internal.InternalGraphDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentOrFacetAccess().getAlternatives(), "rule__ComponentOrFacet__Alternatives");
					put(grammarAccess.getOptionalPropertyAccess().getAlternatives(), "rule__OptionalProperty__Alternatives");
					put(grammarAccess.getExportsVariableAccess().getAlternatives(), "rule__ExportsVariable__Alternatives");
					put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getFacetAccess().getGroup(), "rule__Facet__Group__0");
					put(grammarAccess.getPropertiesAccess().getGroup(), "rule__Properties__Group__0");
					put(grammarAccess.getInstallerPropertyAccess().getGroup(), "rule__InstallerProperty__Group__0");
					put(grammarAccess.getChildrenPropertyAccess().getGroup(), "rule__ChildrenProperty__Group__0");
					put(grammarAccess.getChildrenPropertyAccess().getGroup_4(), "rule__ChildrenProperty__Group_4__0");
					put(grammarAccess.getExportsPropertyAccess().getGroup(), "rule__ExportsProperty__Group__0");
					put(grammarAccess.getExportsPropertyAccess().getGroup_4(), "rule__ExportsProperty__Group_4__0");
					put(grammarAccess.getExportsVariableAccess().getGroup_1(), "rule__ExportsVariable__Group_1__0");
					put(grammarAccess.getImportsPropertyAccess().getGroup(), "rule__ImportsProperty__Group__0");
					put(grammarAccess.getImportsPropertyAccess().getGroup_4(), "rule__ImportsProperty__Group_4__0");
					put(grammarAccess.getImportsVariableAccess().getGroup(), "rule__ImportsVariable__Group__0");
					put(grammarAccess.getImportsVariableAccess().getGroup_0(), "rule__ImportsVariable__Group_0__0");
					put(grammarAccess.getImportsVariableAccess().getGroup_4(), "rule__ImportsVariable__Group_4__0");
					put(grammarAccess.getFacetsPropertyAccess().getGroup(), "rule__FacetsProperty__Group__0");
					put(grammarAccess.getFacetsPropertyAccess().getGroup_4(), "rule__FacetsProperty__Group_4__0");
					put(grammarAccess.getExtendsPropertyAccess().getGroup(), "rule__ExtendsProperty__Group__0");
					put(grammarAccess.getExtendsPropertyAccess().getGroup_4(), "rule__ExtendsProperty__Group_4__0");
					put(grammarAccess.getGraphAccess().getComponentsAssignment_1(), "rule__Graph__ComponentsAssignment_1");
					put(grammarAccess.getComponentOrFacetAccess().getComponentAssignment_0(), "rule__ComponentOrFacet__ComponentAssignment_0");
					put(grammarAccess.getComponentOrFacetAccess().getFacetAssignment_1(), "rule__ComponentOrFacet__FacetAssignment_1");
					put(grammarAccess.getComponentAccess().getNameAssignment_0(), "rule__Component__NameAssignment_0");
					put(grammarAccess.getComponentAccess().getPropertiesAssignment_4(), "rule__Component__PropertiesAssignment_4");
					put(grammarAccess.getFacetAccess().getNameAssignment_2(), "rule__Facet__NameAssignment_2");
					put(grammarAccess.getFacetAccess().getPropertiesAssignment_6(), "rule__Facet__PropertiesAssignment_6");
					put(grammarAccess.getPropertiesAccess().getInstallerPropertyAssignment_0(), "rule__Properties__InstallerPropertyAssignment_0");
					put(grammarAccess.getPropertiesAccess().getOptionalPropertiesAssignment_1(), "rule__Properties__OptionalPropertiesAssignment_1");
					put(grammarAccess.getOptionalPropertyAccess().getChildrenPropertyAssignment_0(), "rule__OptionalProperty__ChildrenPropertyAssignment_0");
					put(grammarAccess.getOptionalPropertyAccess().getExportsPropertyAssignment_1(), "rule__OptionalProperty__ExportsPropertyAssignment_1");
					put(grammarAccess.getOptionalPropertyAccess().getImportsPropertyAssignment_2(), "rule__OptionalProperty__ImportsPropertyAssignment_2");
					put(grammarAccess.getOptionalPropertyAccess().getFacetsPropertyAssignment_3(), "rule__OptionalProperty__FacetsPropertyAssignment_3");
					put(grammarAccess.getOptionalPropertyAccess().getExtendsPropertyAssignment_4(), "rule__OptionalProperty__ExtendsPropertyAssignment_4");
					put(grammarAccess.getInstallerPropertyAccess().getNameAssignment_2(), "rule__InstallerProperty__NameAssignment_2");
					put(grammarAccess.getChildrenPropertyAccess().getNameAssignment_2(), "rule__ChildrenProperty__NameAssignment_2");
					put(grammarAccess.getChildrenPropertyAccess().getNameAssignment_4_2(), "rule__ChildrenProperty__NameAssignment_4_2");
					put(grammarAccess.getExportsPropertyAccess().getExportsVariablesAssignment_2(), "rule__ExportsProperty__ExportsVariablesAssignment_2");
					put(grammarAccess.getExportsPropertyAccess().getExportsVariablesAssignment_4_2(), "rule__ExportsProperty__ExportsVariablesAssignment_4_2");
					put(grammarAccess.getExportsVariableAccess().getNameAssignment_0(), "rule__ExportsVariable__NameAssignment_0");
					put(grammarAccess.getExportsVariableAccess().getNameAssignment_1_0(), "rule__ExportsVariable__NameAssignment_1_0");
					put(grammarAccess.getExportsVariableAccess().getValueAssignment_1_4(), "rule__ExportsVariable__ValueAssignment_1_4");
					put(grammarAccess.getImportsPropertyAccess().getImportsVariablesAssignment_2(), "rule__ImportsProperty__ImportsVariablesAssignment_2");
					put(grammarAccess.getImportsPropertyAccess().getImportsVariablesAssignment_4_2(), "rule__ImportsProperty__ImportsVariablesAssignment_4_2");
					put(grammarAccess.getImportsVariableAccess().getIsExternalAssignment_0_0(), "rule__ImportsVariable__IsExternalAssignment_0_0");
					put(grammarAccess.getImportsVariableAccess().getComponentNameAssignment_1(), "rule__ImportsVariable__ComponentNameAssignment_1");
					put(grammarAccess.getImportsVariableAccess().getComponentPropertyAssignment_3(), "rule__ImportsVariable__ComponentPropertyAssignment_3");
					put(grammarAccess.getImportsVariableAccess().getIsOptionalAssignment_4_1(), "rule__ImportsVariable__IsOptionalAssignment_4_1");
					put(grammarAccess.getFacetsPropertyAccess().getFacetsNamesAssignment_2(), "rule__FacetsProperty__FacetsNamesAssignment_2");
					put(grammarAccess.getFacetsPropertyAccess().getFacetsNamesAssignment_4_2(), "rule__FacetsProperty__FacetsNamesAssignment_4_2");
					put(grammarAccess.getExtendsPropertyAccess().getExtendsNamesAssignment_2(), "rule__ExtendsProperty__ExtendsNamesAssignment_2");
					put(grammarAccess.getExtendsPropertyAccess().getExtendsNamesAssignment_4_2(), "rule__ExtendsProperty__ExtendsNamesAssignment_4_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr.internal.InternalGraphDslParser typedParser = (fr.imag.mosig.seacs.roboconf.ui.contentassist.antlr.internal.InternalGraphDslParser) parser;
			typedParser.entryRuleGraph();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GraphDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GraphDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}