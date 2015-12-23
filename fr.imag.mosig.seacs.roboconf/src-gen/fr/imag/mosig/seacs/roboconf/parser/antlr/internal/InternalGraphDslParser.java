package fr.imag.mosig.seacs.roboconf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imag.mosig.seacs.roboconf.services.GraphDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "'}'", "'facet'", "'installer:'", "';'", "'children:'", "','", "'exports:'", "'ip'", "'='", "'imports:'", "'external'", "'.'", "'(optional)'", "'facets:'", "'extends:'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGraphDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g"; }



     	private GraphDslGrammarAccess grammarAccess;
     	
        public InternalGraphDslParser(TokenStream input, GraphDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Graph";	
       	}
       	
       	@Override
       	protected GraphDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraph"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:67:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:68:2: (iv_ruleGraph= ruleGraph EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:69:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph75);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:76:1: ruleGraph returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_components_1_0= ruleComponentOrFacet ) ) (this_WS_2= RULE_WS )? )* ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        EObject lv_components_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:79:28: ( ( (this_WS_0= RULE_WS )? ( (lv_components_1_0= ruleComponentOrFacet ) ) (this_WS_2= RULE_WS )? )* )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:80:1: ( (this_WS_0= RULE_WS )? ( (lv_components_1_0= ruleComponentOrFacet ) ) (this_WS_2= RULE_WS )? )*
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:80:1: ( (this_WS_0= RULE_WS )? ( (lv_components_1_0= ruleComponentOrFacet ) ) (this_WS_2= RULE_WS )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_WS && LA3_0<=RULE_ID)||LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:80:2: (this_WS_0= RULE_WS )? ( (lv_components_1_0= ruleComponentOrFacet ) ) (this_WS_2= RULE_WS )?
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:80:2: (this_WS_0= RULE_WS )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_WS) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:80:3: this_WS_0= RULE_WS
            	            {
            	            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleGraph122); 
            	             
            	                newLeafNode(this_WS_0, grammarAccess.getGraphAccess().getWSTerminalRuleCall_0()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:84:3: ( (lv_components_1_0= ruleComponentOrFacet ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:85:1: (lv_components_1_0= ruleComponentOrFacet )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:85:1: (lv_components_1_0= ruleComponentOrFacet )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:86:3: lv_components_1_0= ruleComponentOrFacet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getComponentsComponentOrFacetParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponentOrFacet_in_ruleGraph144);
            	    lv_components_1_0=ruleComponentOrFacet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_1_0, 
            	            		"ComponentOrFacet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:102:2: (this_WS_2= RULE_WS )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==RULE_WS) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:102:3: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleGraph156); 
            	             
            	                newLeafNode(this_WS_2, grammarAccess.getGraphAccess().getWSTerminalRuleCall_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleComponentOrFacet"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:114:1: entryRuleComponentOrFacet returns [EObject current=null] : iv_ruleComponentOrFacet= ruleComponentOrFacet EOF ;
    public final EObject entryRuleComponentOrFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOrFacet = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:115:2: (iv_ruleComponentOrFacet= ruleComponentOrFacet EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:116:2: iv_ruleComponentOrFacet= ruleComponentOrFacet EOF
            {
             newCompositeNode(grammarAccess.getComponentOrFacetRule()); 
            pushFollow(FOLLOW_ruleComponentOrFacet_in_entryRuleComponentOrFacet194);
            iv_ruleComponentOrFacet=ruleComponentOrFacet();

            state._fsp--;

             current =iv_ruleComponentOrFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentOrFacet204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOrFacet"


    // $ANTLR start "ruleComponentOrFacet"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:123:1: ruleComponentOrFacet returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) | ( (lv_facet_1_0= ruleFacet ) ) ) ;
    public final EObject ruleComponentOrFacet() throws RecognitionException {
        EObject current = null;

        EObject lv_component_0_0 = null;

        EObject lv_facet_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:126:28: ( ( ( (lv_component_0_0= ruleComponent ) ) | ( (lv_facet_1_0= ruleFacet ) ) ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:127:1: ( ( (lv_component_0_0= ruleComponent ) ) | ( (lv_facet_1_0= ruleFacet ) ) )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:127:1: ( ( (lv_component_0_0= ruleComponent ) ) | ( (lv_facet_1_0= ruleFacet ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:127:2: ( (lv_component_0_0= ruleComponent ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:127:2: ( (lv_component_0_0= ruleComponent ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:128:1: (lv_component_0_0= ruleComponent )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:128:1: (lv_component_0_0= ruleComponent )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:129:3: lv_component_0_0= ruleComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOrFacetAccess().getComponentComponentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComponent_in_ruleComponentOrFacet250);
                    lv_component_0_0=ruleComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOrFacetRule());
                    	        }
                           		set(
                           			current, 
                           			"component",
                            		lv_component_0_0, 
                            		"Component");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:146:6: ( (lv_facet_1_0= ruleFacet ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:146:6: ( (lv_facet_1_0= ruleFacet ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:147:1: (lv_facet_1_0= ruleFacet )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:147:1: (lv_facet_1_0= ruleFacet )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:148:3: lv_facet_1_0= ruleFacet
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOrFacetAccess().getFacetFacetParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFacet_in_ruleComponentOrFacet277);
                    lv_facet_1_0=ruleFacet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOrFacetRule());
                    	        }
                           		set(
                           			current, 
                           			"facet",
                            		lv_facet_1_0, 
                            		"Facet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOrFacet"


    // $ANTLR start "entryRuleComponent"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:172:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:173:2: (iv_ruleComponent= ruleComponent EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:174:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent313);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent323); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:181:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? otherlv_2= '{' (this_WS_3= RULE_WS )? ( (lv_properties_4_0= ruleComponentProperties ) ) (this_WS_5= RULE_WS )? otherlv_6= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_WS_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:184:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? otherlv_2= '{' (this_WS_3= RULE_WS )? ( (lv_properties_4_0= ruleComponentProperties ) ) (this_WS_5= RULE_WS )? otherlv_6= '}' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:185:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? otherlv_2= '{' (this_WS_3= RULE_WS )? ( (lv_properties_4_0= ruleComponentProperties ) ) (this_WS_5= RULE_WS )? otherlv_6= '}' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:185:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? otherlv_2= '{' (this_WS_3= RULE_WS )? ( (lv_properties_4_0= ruleComponentProperties ) ) (this_WS_5= RULE_WS )? otherlv_6= '}' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:185:2: ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? otherlv_2= '{' (this_WS_3= RULE_WS )? ( (lv_properties_4_0= ruleComponentProperties ) ) (this_WS_5= RULE_WS )? otherlv_6= '}'
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:185:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:186:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:186:1: (lv_name_0_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:187:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent365); 

            			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:203:2: (this_WS_1= RULE_WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:203:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleComponent382); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getComponentAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleComponent395); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:211:1: (this_WS_3= RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:211:2: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleComponent407); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getComponentAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:215:3: ( (lv_properties_4_0= ruleComponentProperties ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:216:1: (lv_properties_4_0= ruleComponentProperties )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:216:1: (lv_properties_4_0= ruleComponentProperties )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:217:3: lv_properties_4_0= ruleComponentProperties
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getPropertiesComponentPropertiesParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleComponentProperties_in_ruleComponent429);
            lv_properties_4_0=ruleComponentProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"properties",
                    		lv_properties_4_0, 
                    		"ComponentProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:233:2: (this_WS_5= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:233:3: this_WS_5= RULE_WS
                    {
                    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleComponent441); 
                     
                        newLeafNode(this_WS_5, grammarAccess.getComponentAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleComponent454); 

                	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleFacet"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:249:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:250:2: (iv_ruleFacet= ruleFacet EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:251:2: iv_ruleFacet= ruleFacet EOF
            {
             newCompositeNode(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet490);
            iv_ruleFacet=ruleFacet();

            state._fsp--;

             current =iv_ruleFacet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacet500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacet"


    // $ANTLR start "ruleFacet"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:258:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= '{' (this_WS_5= RULE_WS )? ( (lv_properties_6_0= ruleFacetProperties ) ) (this_WS_7= RULE_WS )? otherlv_8= '}' ) ;
    public final EObject ruleFacet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_name_2_0=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:261:28: ( (otherlv_0= 'facet' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= '{' (this_WS_5= RULE_WS )? ( (lv_properties_6_0= ruleFacetProperties ) ) (this_WS_7= RULE_WS )? otherlv_8= '}' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:262:1: (otherlv_0= 'facet' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= '{' (this_WS_5= RULE_WS )? ( (lv_properties_6_0= ruleFacetProperties ) ) (this_WS_7= RULE_WS )? otherlv_8= '}' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:262:1: (otherlv_0= 'facet' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= '{' (this_WS_5= RULE_WS )? ( (lv_properties_6_0= ruleFacetProperties ) ) (this_WS_7= RULE_WS )? otherlv_8= '}' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:262:3: otherlv_0= 'facet' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= '{' (this_WS_5= RULE_WS )? ( (lv_properties_6_0= ruleFacetProperties ) ) (this_WS_7= RULE_WS )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFacet537); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:266:1: (this_WS_1= RULE_WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:266:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacet549); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getFacetAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:270:3: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:271:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:271:1: (lv_name_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:272:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacet567); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:288:2: (this_WS_3= RULE_WS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:288:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacet584); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getFacetAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleFacet597); 

                	newLeafNode(otherlv_4, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:296:1: (this_WS_5= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:296:2: this_WS_5= RULE_WS
                    {
                    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacet609); 
                     
                        newLeafNode(this_WS_5, grammarAccess.getFacetAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:300:3: ( (lv_properties_6_0= ruleFacetProperties ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:301:1: (lv_properties_6_0= ruleFacetProperties )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:301:1: (lv_properties_6_0= ruleFacetProperties )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:302:3: lv_properties_6_0= ruleFacetProperties
            {
             
            	        newCompositeNode(grammarAccess.getFacetAccess().getPropertiesFacetPropertiesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFacetProperties_in_ruleFacet631);
            lv_properties_6_0=ruleFacetProperties();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFacetRule());
            	        }
                   		set(
                   			current, 
                   			"properties",
                    		lv_properties_6_0, 
                    		"FacetProperties");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:318:2: (this_WS_7= RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:318:3: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacet643); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getFacetAccess().getWSTerminalRuleCall_7()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleFacet656); 

                	newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFacet"


    // $ANTLR start "entryRuleComponentProperties"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:334:1: entryRuleComponentProperties returns [EObject current=null] : iv_ruleComponentProperties= ruleComponentProperties EOF ;
    public final EObject entryRuleComponentProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentProperties = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:335:2: (iv_ruleComponentProperties= ruleComponentProperties EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:336:2: iv_ruleComponentProperties= ruleComponentProperties EOF
            {
             newCompositeNode(grammarAccess.getComponentPropertiesRule()); 
            pushFollow(FOLLOW_ruleComponentProperties_in_entryRuleComponentProperties692);
            iv_ruleComponentProperties=ruleComponentProperties();

            state._fsp--;

             current =iv_ruleComponentProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentProperties702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentProperties"


    // $ANTLR start "ruleComponentProperties"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:343:1: ruleComponentProperties returns [EObject current=null] : ( ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )* (this_WS_1= RULE_WS )? ( (lv_installerProperty_2_0= ruleInstallerProperty ) ) (this_WS_3= RULE_WS )? ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )* ) ;
    public final EObject ruleComponentProperties() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_WS_3=null;
        EObject lv_optionalProperties_0_0 = null;

        EObject lv_installerProperty_2_0 = null;

        EObject lv_optionalProperties_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:346:28: ( ( ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )* (this_WS_1= RULE_WS )? ( (lv_installerProperty_2_0= ruleInstallerProperty ) ) (this_WS_3= RULE_WS )? ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )* ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:347:1: ( ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )* (this_WS_1= RULE_WS )? ( (lv_installerProperty_2_0= ruleInstallerProperty ) ) (this_WS_3= RULE_WS )? ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )* )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:347:1: ( ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )* (this_WS_1= RULE_WS )? ( (lv_installerProperty_2_0= ruleInstallerProperty ) ) (this_WS_3= RULE_WS )? ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )* )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:347:2: ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )* (this_WS_1= RULE_WS )? ( (lv_installerProperty_2_0= ruleInstallerProperty ) ) (this_WS_3= RULE_WS )? ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )*
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:347:2: ( (lv_optionalProperties_0_0= ruleOptionalProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==18||LA12_0==21||(LA12_0>=25 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:348:1: (lv_optionalProperties_0_0= ruleOptionalProperty )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:348:1: (lv_optionalProperties_0_0= ruleOptionalProperty )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:349:3: lv_optionalProperties_0_0= ruleOptionalProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentPropertiesAccess().getOptionalPropertiesOptionalPropertyParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalProperty_in_ruleComponentProperties748);
            	    lv_optionalProperties_0_0=ruleOptionalProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentPropertiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optionalProperties",
            	            		lv_optionalProperties_0_0, 
            	            		"OptionalProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:365:3: (this_WS_1= RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:365:4: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleComponentProperties761); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getComponentPropertiesAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:369:3: ( (lv_installerProperty_2_0= ruleInstallerProperty ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:370:1: (lv_installerProperty_2_0= ruleInstallerProperty )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:370:1: (lv_installerProperty_2_0= ruleInstallerProperty )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:371:3: lv_installerProperty_2_0= ruleInstallerProperty
            {
             
            	        newCompositeNode(grammarAccess.getComponentPropertiesAccess().getInstallerPropertyInstallerPropertyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInstallerProperty_in_ruleComponentProperties783);
            lv_installerProperty_2_0=ruleInstallerProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentPropertiesRule());
            	        }
                   		set(
                   			current, 
                   			"installerProperty",
                    		lv_installerProperty_2_0, 
                    		"InstallerProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:387:2: (this_WS_3= RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:387:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleComponentProperties795); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getComponentPropertiesAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:391:3: ( (lv_optionalProperties_4_0= ruleOptionalProperty ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16||LA15_0==18||LA15_0==21||(LA15_0>=25 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:392:1: (lv_optionalProperties_4_0= ruleOptionalProperty )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:392:1: (lv_optionalProperties_4_0= ruleOptionalProperty )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:393:3: lv_optionalProperties_4_0= ruleOptionalProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentPropertiesAccess().getOptionalPropertiesOptionalPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionalProperty_in_ruleComponentProperties817);
            	    lv_optionalProperties_4_0=ruleOptionalProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentPropertiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"optionalProperties",
            	            		lv_optionalProperties_4_0, 
            	            		"OptionalProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentProperties"


    // $ANTLR start "entryRuleFacetProperties"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:417:1: entryRuleFacetProperties returns [EObject current=null] : iv_ruleFacetProperties= ruleFacetProperties EOF ;
    public final EObject entryRuleFacetProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetProperties = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:418:2: (iv_ruleFacetProperties= ruleFacetProperties EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:419:2: iv_ruleFacetProperties= ruleFacetProperties EOF
            {
             newCompositeNode(grammarAccess.getFacetPropertiesRule()); 
            pushFollow(FOLLOW_ruleFacetProperties_in_entryRuleFacetProperties854);
            iv_ruleFacetProperties=ruleFacetProperties();

            state._fsp--;

             current =iv_ruleFacetProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacetProperties864); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacetProperties"


    // $ANTLR start "ruleFacetProperties"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:426:1: ruleFacetProperties returns [EObject current=null] : ( (this_WS_0= RULE_WS )? ( (lv_properties_1_0= ruleFacetProperty ) ) (this_WS_2= RULE_WS )? )* ;
    public final EObject ruleFacetProperties() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:429:28: ( ( (this_WS_0= RULE_WS )? ( (lv_properties_1_0= ruleFacetProperty ) ) (this_WS_2= RULE_WS )? )* )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:430:1: ( (this_WS_0= RULE_WS )? ( (lv_properties_1_0= ruleFacetProperty ) ) (this_WS_2= RULE_WS )? )*
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:430:1: ( (this_WS_0= RULE_WS )? ( (lv_properties_1_0= ruleFacetProperty ) ) (this_WS_2= RULE_WS )? )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==16||LA18_1==18) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==16||LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:430:2: (this_WS_0= RULE_WS )? ( (lv_properties_1_0= ruleFacetProperty ) ) (this_WS_2= RULE_WS )?
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:430:2: (this_WS_0= RULE_WS )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_WS) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:430:3: this_WS_0= RULE_WS
            	            {
            	            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetProperties901); 
            	             
            	                newLeafNode(this_WS_0, grammarAccess.getFacetPropertiesAccess().getWSTerminalRuleCall_0()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:434:3: ( (lv_properties_1_0= ruleFacetProperty ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:435:1: (lv_properties_1_0= ruleFacetProperty )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:435:1: (lv_properties_1_0= ruleFacetProperty )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:436:3: lv_properties_1_0= ruleFacetProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFacetPropertiesAccess().getPropertiesFacetPropertyParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFacetProperty_in_ruleFacetProperties923);
            	    lv_properties_1_0=ruleFacetProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFacetPropertiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_1_0, 
            	            		"FacetProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:452:2: (this_WS_2= RULE_WS )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_WS) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:452:3: this_WS_2= RULE_WS
            	            {
            	            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetProperties935); 
            	             
            	                newLeafNode(this_WS_2, grammarAccess.getFacetPropertiesAccess().getWSTerminalRuleCall_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFacetProperties"


    // $ANTLR start "entryRuleFacetProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:464:1: entryRuleFacetProperty returns [EObject current=null] : iv_ruleFacetProperty= ruleFacetProperty EOF ;
    public final EObject entryRuleFacetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:465:2: (iv_ruleFacetProperty= ruleFacetProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:466:2: iv_ruleFacetProperty= ruleFacetProperty EOF
            {
             newCompositeNode(grammarAccess.getFacetPropertyRule()); 
            pushFollow(FOLLOW_ruleFacetProperty_in_entryRuleFacetProperty973);
            iv_ruleFacetProperty=ruleFacetProperty();

            state._fsp--;

             current =iv_ruleFacetProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacetProperty983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacetProperty"


    // $ANTLR start "ruleFacetProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:473:1: ruleFacetProperty returns [EObject current=null] : ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) ) ;
    public final EObject ruleFacetProperty() throws RecognitionException {
        EObject current = null;

        EObject lv_childrenProperty_0_0 = null;

        EObject lv_exportsProperty_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:476:28: ( ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:477:1: ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:477:1: ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            else if ( (LA19_0==18) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:477:2: ( (lv_childrenProperty_0_0= ruleChildrenProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:477:2: ( (lv_childrenProperty_0_0= ruleChildrenProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:478:1: (lv_childrenProperty_0_0= ruleChildrenProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:478:1: (lv_childrenProperty_0_0= ruleChildrenProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:479:3: lv_childrenProperty_0_0= ruleChildrenProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getFacetPropertyAccess().getChildrenPropertyChildrenPropertyParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChildrenProperty_in_ruleFacetProperty1029);
                    lv_childrenProperty_0_0=ruleChildrenProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFacetPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"childrenProperty",
                            		lv_childrenProperty_0_0, 
                            		"ChildrenProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:496:6: ( (lv_exportsProperty_1_0= ruleExportsProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:496:6: ( (lv_exportsProperty_1_0= ruleExportsProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:497:1: (lv_exportsProperty_1_0= ruleExportsProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:497:1: (lv_exportsProperty_1_0= ruleExportsProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:498:3: lv_exportsProperty_1_0= ruleExportsProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getFacetPropertyAccess().getExportsPropertyExportsPropertyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExportsProperty_in_ruleFacetProperty1056);
                    lv_exportsProperty_1_0=ruleExportsProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFacetPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"exportsProperty",
                            		lv_exportsProperty_1_0, 
                            		"ExportsProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFacetProperty"


    // $ANTLR start "entryRuleOptionalProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:522:1: entryRuleOptionalProperty returns [EObject current=null] : iv_ruleOptionalProperty= ruleOptionalProperty EOF ;
    public final EObject entryRuleOptionalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:523:2: (iv_ruleOptionalProperty= ruleOptionalProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:524:2: iv_ruleOptionalProperty= ruleOptionalProperty EOF
            {
             newCompositeNode(grammarAccess.getOptionalPropertyRule()); 
            pushFollow(FOLLOW_ruleOptionalProperty_in_entryRuleOptionalProperty1092);
            iv_ruleOptionalProperty=ruleOptionalProperty();

            state._fsp--;

             current =iv_ruleOptionalProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalProperty1102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalProperty"


    // $ANTLR start "ruleOptionalProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:531:1: ruleOptionalProperty returns [EObject current=null] : ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) | ( (lv_importsProperty_2_0= ruleImportsProperty ) ) | ( (lv_facetsProperty_3_0= ruleFacetsProperty ) ) | ( (lv_extendsProperty_4_0= ruleExtendsProperty ) ) ) ;
    public final EObject ruleOptionalProperty() throws RecognitionException {
        EObject current = null;

        EObject lv_childrenProperty_0_0 = null;

        EObject lv_exportsProperty_1_0 = null;

        EObject lv_importsProperty_2_0 = null;

        EObject lv_facetsProperty_3_0 = null;

        EObject lv_extendsProperty_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:534:28: ( ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) | ( (lv_importsProperty_2_0= ruleImportsProperty ) ) | ( (lv_facetsProperty_3_0= ruleFacetsProperty ) ) | ( (lv_extendsProperty_4_0= ruleExtendsProperty ) ) ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:535:1: ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) | ( (lv_importsProperty_2_0= ruleImportsProperty ) ) | ( (lv_facetsProperty_3_0= ruleFacetsProperty ) ) | ( (lv_extendsProperty_4_0= ruleExtendsProperty ) ) )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:535:1: ( ( (lv_childrenProperty_0_0= ruleChildrenProperty ) ) | ( (lv_exportsProperty_1_0= ruleExportsProperty ) ) | ( (lv_importsProperty_2_0= ruleImportsProperty ) ) | ( (lv_facetsProperty_3_0= ruleFacetsProperty ) ) | ( (lv_extendsProperty_4_0= ruleExtendsProperty ) ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt20=1;
                }
                break;
            case 18:
                {
                alt20=2;
                }
                break;
            case 21:
                {
                alt20=3;
                }
                break;
            case 25:
                {
                alt20=4;
                }
                break;
            case 26:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:535:2: ( (lv_childrenProperty_0_0= ruleChildrenProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:535:2: ( (lv_childrenProperty_0_0= ruleChildrenProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:536:1: (lv_childrenProperty_0_0= ruleChildrenProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:536:1: (lv_childrenProperty_0_0= ruleChildrenProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:537:3: lv_childrenProperty_0_0= ruleChildrenProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalPropertyAccess().getChildrenPropertyChildrenPropertyParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChildrenProperty_in_ruleOptionalProperty1148);
                    lv_childrenProperty_0_0=ruleChildrenProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"childrenProperty",
                            		lv_childrenProperty_0_0, 
                            		"ChildrenProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:554:6: ( (lv_exportsProperty_1_0= ruleExportsProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:554:6: ( (lv_exportsProperty_1_0= ruleExportsProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:555:1: (lv_exportsProperty_1_0= ruleExportsProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:555:1: (lv_exportsProperty_1_0= ruleExportsProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:556:3: lv_exportsProperty_1_0= ruleExportsProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalPropertyAccess().getExportsPropertyExportsPropertyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExportsProperty_in_ruleOptionalProperty1175);
                    lv_exportsProperty_1_0=ruleExportsProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"exportsProperty",
                            		lv_exportsProperty_1_0, 
                            		"ExportsProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:573:6: ( (lv_importsProperty_2_0= ruleImportsProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:573:6: ( (lv_importsProperty_2_0= ruleImportsProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:574:1: (lv_importsProperty_2_0= ruleImportsProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:574:1: (lv_importsProperty_2_0= ruleImportsProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:575:3: lv_importsProperty_2_0= ruleImportsProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalPropertyAccess().getImportsPropertyImportsPropertyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImportsProperty_in_ruleOptionalProperty1202);
                    lv_importsProperty_2_0=ruleImportsProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"importsProperty",
                            		lv_importsProperty_2_0, 
                            		"ImportsProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:592:6: ( (lv_facetsProperty_3_0= ruleFacetsProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:592:6: ( (lv_facetsProperty_3_0= ruleFacetsProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:593:1: (lv_facetsProperty_3_0= ruleFacetsProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:593:1: (lv_facetsProperty_3_0= ruleFacetsProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:594:3: lv_facetsProperty_3_0= ruleFacetsProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalPropertyAccess().getFacetsPropertyFacetsPropertyParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFacetsProperty_in_ruleOptionalProperty1229);
                    lv_facetsProperty_3_0=ruleFacetsProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"facetsProperty",
                            		lv_facetsProperty_3_0, 
                            		"FacetsProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:611:6: ( (lv_extendsProperty_4_0= ruleExtendsProperty ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:611:6: ( (lv_extendsProperty_4_0= ruleExtendsProperty ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:612:1: (lv_extendsProperty_4_0= ruleExtendsProperty )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:612:1: (lv_extendsProperty_4_0= ruleExtendsProperty )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:613:3: lv_extendsProperty_4_0= ruleExtendsProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionalPropertyAccess().getExtendsPropertyExtendsPropertyParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExtendsProperty_in_ruleOptionalProperty1256);
                    lv_extendsProperty_4_0=ruleExtendsProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionalPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"extendsProperty",
                            		lv_extendsProperty_4_0, 
                            		"ExtendsProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalProperty"


    // $ANTLR start "entryRuleInstallerProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:637:1: entryRuleInstallerProperty returns [EObject current=null] : iv_ruleInstallerProperty= ruleInstallerProperty EOF ;
    public final EObject entryRuleInstallerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstallerProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:638:2: (iv_ruleInstallerProperty= ruleInstallerProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:639:2: iv_ruleInstallerProperty= ruleInstallerProperty EOF
            {
             newCompositeNode(grammarAccess.getInstallerPropertyRule()); 
            pushFollow(FOLLOW_ruleInstallerProperty_in_entryRuleInstallerProperty1292);
            iv_ruleInstallerProperty=ruleInstallerProperty();

            state._fsp--;

             current =iv_ruleInstallerProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstallerProperty1302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstallerProperty"


    // $ANTLR start "ruleInstallerProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:646:1: ruleInstallerProperty returns [EObject current=null] : (otherlv_0= 'installer:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= ';' ) ;
    public final EObject ruleInstallerProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_name_2_0=null;
        Token this_WS_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:649:28: ( (otherlv_0= 'installer:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:650:1: (otherlv_0= 'installer:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:650:1: (otherlv_0= 'installer:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:650:3: otherlv_0= 'installer:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleInstallerProperty1339); 

                	newLeafNode(otherlv_0, grammarAccess.getInstallerPropertyAccess().getInstallerKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:654:1: (this_WS_1= RULE_WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_WS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:654:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleInstallerProperty1351); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getInstallerPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:658:3: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:659:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:659:1: (lv_name_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:660:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstallerProperty1369); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInstallerPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstallerPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:676:2: (this_WS_3= RULE_WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_WS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:676:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleInstallerProperty1386); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getInstallerPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInstallerProperty1399); 

                	newLeafNode(otherlv_4, grammarAccess.getInstallerPropertyAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstallerProperty"


    // $ANTLR start "entryRuleChildrenProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:692:1: entryRuleChildrenProperty returns [EObject current=null] : iv_ruleChildrenProperty= ruleChildrenProperty EOF ;
    public final EObject entryRuleChildrenProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildrenProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:693:2: (iv_ruleChildrenProperty= ruleChildrenProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:694:2: iv_ruleChildrenProperty= ruleChildrenProperty EOF
            {
             newCompositeNode(grammarAccess.getChildrenPropertyRule()); 
            pushFollow(FOLLOW_ruleChildrenProperty_in_entryRuleChildrenProperty1435);
            iv_ruleChildrenProperty=ruleChildrenProperty();

            state._fsp--;

             current =iv_ruleChildrenProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildrenProperty1445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChildrenProperty"


    // $ANTLR start "ruleChildrenProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:701:1: ruleChildrenProperty returns [EObject current=null] : (otherlv_0= 'children:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) ;
    public final EObject ruleChildrenProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_name_2_0=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_name_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:704:28: ( (otherlv_0= 'children:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:705:1: (otherlv_0= 'children:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:705:1: (otherlv_0= 'children:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:705:3: otherlv_0= 'children:' (this_WS_1= RULE_WS )? ( (lv_name_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleChildrenProperty1482); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenPropertyAccess().getChildrenKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:709:1: (this_WS_1= RULE_WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_WS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:709:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChildrenProperty1494); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getChildrenPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:713:3: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:714:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:714:1: (lv_name_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:715:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChildrenProperty1512); 

            			newLeafNode(lv_name_2_0, grammarAccess.getChildrenPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChildrenPropertyRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:731:2: (this_WS_3= RULE_WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_WS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:731:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChildrenProperty1529); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getChildrenPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:735:3: (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:735:5: otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_name_6_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleChildrenProperty1543); 

            	        	newLeafNode(otherlv_4, grammarAccess.getChildrenPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:739:1: (this_WS_5= RULE_WS )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_WS) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:739:2: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChildrenProperty1555); 
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getChildrenPropertyAccess().getWSTerminalRuleCall_4_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:743:3: ( (lv_name_6_0= RULE_ID ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:744:1: (lv_name_6_0= RULE_ID )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:744:1: (lv_name_6_0= RULE_ID )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:745:3: lv_name_6_0= RULE_ID
            	    {
            	    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChildrenProperty1573); 

            	    			newLeafNode(lv_name_6_0, grammarAccess.getChildrenPropertyAccess().getNameIDTerminalRuleCall_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChildrenPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:761:4: (this_WS_7= RULE_WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:761:5: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleChildrenProperty1592); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getChildrenPropertyAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleChildrenProperty1605); 

                	newLeafNode(otherlv_8, grammarAccess.getChildrenPropertyAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChildrenProperty"


    // $ANTLR start "entryRuleExportsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:777:1: entryRuleExportsProperty returns [EObject current=null] : iv_ruleExportsProperty= ruleExportsProperty EOF ;
    public final EObject entryRuleExportsProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportsProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:778:2: (iv_ruleExportsProperty= ruleExportsProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:779:2: iv_ruleExportsProperty= ruleExportsProperty EOF
            {
             newCompositeNode(grammarAccess.getExportsPropertyRule()); 
            pushFollow(FOLLOW_ruleExportsProperty_in_entryRuleExportsProperty1641);
            iv_ruleExportsProperty=ruleExportsProperty();

            state._fsp--;

             current =iv_ruleExportsProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportsProperty1651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportsProperty"


    // $ANTLR start "ruleExportsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:786:1: ruleExportsProperty returns [EObject current=null] : (otherlv_0= 'exports:' (this_WS_1= RULE_WS )? ( (lv_exportsVariables_2_0= ruleExportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) ;
    public final EObject ruleExportsProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        EObject lv_exportsVariables_2_0 = null;

        EObject lv_exportsVariables_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:789:28: ( (otherlv_0= 'exports:' (this_WS_1= RULE_WS )? ( (lv_exportsVariables_2_0= ruleExportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:790:1: (otherlv_0= 'exports:' (this_WS_1= RULE_WS )? ( (lv_exportsVariables_2_0= ruleExportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:790:1: (otherlv_0= 'exports:' (this_WS_1= RULE_WS )? ( (lv_exportsVariables_2_0= ruleExportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:790:3: otherlv_0= 'exports:' (this_WS_1= RULE_WS )? ( (lv_exportsVariables_2_0= ruleExportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleExportsProperty1688); 

                	newLeafNode(otherlv_0, grammarAccess.getExportsPropertyAccess().getExportsKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:794:1: (this_WS_1= RULE_WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:794:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsProperty1700); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getExportsPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:798:3: ( (lv_exportsVariables_2_0= ruleExportsVariable ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:799:1: (lv_exportsVariables_2_0= ruleExportsVariable )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:799:1: (lv_exportsVariables_2_0= ruleExportsVariable )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:800:3: lv_exportsVariables_2_0= ruleExportsVariable
            {
             
            	        newCompositeNode(grammarAccess.getExportsPropertyAccess().getExportsVariablesExportsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExportsVariable_in_ruleExportsProperty1722);
            lv_exportsVariables_2_0=ruleExportsVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExportsPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"exportsVariables",
                    		lv_exportsVariables_2_0, 
                    		"ExportsVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:816:2: (this_WS_3= RULE_WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_WS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:816:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsProperty1734); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getExportsPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:820:3: (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:820:5: otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_exportsVariables_6_0= ruleExportsVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleExportsProperty1748); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExportsPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:824:1: (this_WS_5= RULE_WS )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==RULE_WS) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:824:2: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsProperty1760); 
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getExportsPropertyAccess().getWSTerminalRuleCall_4_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:828:3: ( (lv_exportsVariables_6_0= ruleExportsVariable ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:829:1: (lv_exportsVariables_6_0= ruleExportsVariable )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:829:1: (lv_exportsVariables_6_0= ruleExportsVariable )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:830:3: lv_exportsVariables_6_0= ruleExportsVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExportsPropertyAccess().getExportsVariablesExportsVariableParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExportsVariable_in_ruleExportsProperty1782);
            	    lv_exportsVariables_6_0=ruleExportsVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExportsPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exportsVariables",
            	            		lv_exportsVariables_6_0, 
            	            		"ExportsVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:846:4: (this_WS_7= RULE_WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_WS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:846:5: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsProperty1796); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getExportsPropertyAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExportsProperty1809); 

                	newLeafNode(otherlv_8, grammarAccess.getExportsPropertyAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportsProperty"


    // $ANTLR start "entryRuleExportsVariable"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:862:1: entryRuleExportsVariable returns [EObject current=null] : iv_ruleExportsVariable= ruleExportsVariable EOF ;
    public final EObject entryRuleExportsVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportsVariable = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:863:2: (iv_ruleExportsVariable= ruleExportsVariable EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:864:2: iv_ruleExportsVariable= ruleExportsVariable EOF
            {
             newCompositeNode(grammarAccess.getExportsVariableRule()); 
            pushFollow(FOLLOW_ruleExportsVariable_in_entryRuleExportsVariable1845);
            iv_ruleExportsVariable=ruleExportsVariable();

            state._fsp--;

             current =iv_ruleExportsVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportsVariable1855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExportsVariable"


    // $ANTLR start "ruleExportsVariable"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:871:1: ruleExportsVariable returns [EObject current=null] : ( ( (lv_name_0_0= 'ip' ) ) | ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleExportsVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:874:28: ( ( ( (lv_name_0_0= 'ip' ) ) | ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:875:1: ( ( (lv_name_0_0= 'ip' ) ) | ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:875:1: ( ( (lv_name_0_0= 'ip' ) ) | ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:875:2: ( (lv_name_0_0= 'ip' ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:875:2: ( (lv_name_0_0= 'ip' ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:876:1: (lv_name_0_0= 'ip' )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:876:1: (lv_name_0_0= 'ip' )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:877:3: lv_name_0_0= 'ip'
                    {
                    lv_name_0_0=(Token)match(input,19,FOLLOW_19_in_ruleExportsVariable1898); 

                            newLeafNode(lv_name_0_0, grammarAccess.getExportsVariableAccess().getNameIpKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExportsVariableRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "ip");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:891:6: ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:891:6: ( ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:891:7: ( (lv_name_1_0= RULE_ID ) ) (this_WS_2= RULE_WS )? otherlv_3= '=' (this_WS_4= RULE_WS )? ( (lv_value_5_0= RULE_INT ) )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:891:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:892:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:892:1: (lv_name_1_0= RULE_ID )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:893:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExportsVariable1935); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getExportsVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExportsVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:909:2: (this_WS_2= RULE_WS )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_WS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:909:3: this_WS_2= RULE_WS
                            {
                            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsVariable1952); 
                             
                                newLeafNode(this_WS_2, grammarAccess.getExportsVariableAccess().getWSTerminalRuleCall_1_1()); 
                                

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExportsVariable1965); 

                        	newLeafNode(otherlv_3, grammarAccess.getExportsVariableAccess().getEqualsSignKeyword_1_2());
                        
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:917:1: (this_WS_4= RULE_WS )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_WS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:917:2: this_WS_4= RULE_WS
                            {
                            this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExportsVariable1977); 
                             
                                newLeafNode(this_WS_4, grammarAccess.getExportsVariableAccess().getWSTerminalRuleCall_1_3()); 
                                

                            }
                            break;

                    }

                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:921:3: ( (lv_value_5_0= RULE_INT ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:922:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:922:1: (lv_value_5_0= RULE_INT )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:923:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExportsVariable1995); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getExportsVariableAccess().getValueINTTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExportsVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportsVariable"


    // $ANTLR start "entryRuleImportsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:947:1: entryRuleImportsProperty returns [EObject current=null] : iv_ruleImportsProperty= ruleImportsProperty EOF ;
    public final EObject entryRuleImportsProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportsProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:948:2: (iv_ruleImportsProperty= ruleImportsProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:949:2: iv_ruleImportsProperty= ruleImportsProperty EOF
            {
             newCompositeNode(grammarAccess.getImportsPropertyRule()); 
            pushFollow(FOLLOW_ruleImportsProperty_in_entryRuleImportsProperty2037);
            iv_ruleImportsProperty=ruleImportsProperty();

            state._fsp--;

             current =iv_ruleImportsProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportsProperty2047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportsProperty"


    // $ANTLR start "ruleImportsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:956:1: ruleImportsProperty returns [EObject current=null] : (otherlv_0= 'imports:' (this_WS_1= RULE_WS )? ( (lv_importsVariables_2_0= ruleImportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) ;
    public final EObject ruleImportsProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        EObject lv_importsVariables_2_0 = null;

        EObject lv_importsVariables_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:959:28: ( (otherlv_0= 'imports:' (this_WS_1= RULE_WS )? ( (lv_importsVariables_2_0= ruleImportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:960:1: (otherlv_0= 'imports:' (this_WS_1= RULE_WS )? ( (lv_importsVariables_2_0= ruleImportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:960:1: (otherlv_0= 'imports:' (this_WS_1= RULE_WS )? ( (lv_importsVariables_2_0= ruleImportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:960:3: otherlv_0= 'imports:' (this_WS_1= RULE_WS )? ( (lv_importsVariables_2_0= ruleImportsVariable ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImportsProperty2084); 

                	newLeafNode(otherlv_0, grammarAccess.getImportsPropertyAccess().getImportsKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:964:1: (this_WS_1= RULE_WS )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_WS) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:964:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsProperty2096); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getImportsPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:968:3: ( (lv_importsVariables_2_0= ruleImportsVariable ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:969:1: (lv_importsVariables_2_0= ruleImportsVariable )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:969:1: (lv_importsVariables_2_0= ruleImportsVariable )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:970:3: lv_importsVariables_2_0= ruleImportsVariable
            {
             
            	        newCompositeNode(grammarAccess.getImportsPropertyAccess().getImportsVariablesImportsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleImportsVariable_in_ruleImportsProperty2118);
            lv_importsVariables_2_0=ruleImportsVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportsPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"importsVariables",
                    		lv_importsVariables_2_0, 
                    		"ImportsVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:986:2: (this_WS_3= RULE_WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:986:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsProperty2130); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getImportsPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:990:3: (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==17) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:990:5: otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_importsVariables_6_0= ruleImportsVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleImportsProperty2144); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImportsPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:994:1: (this_WS_5= RULE_WS )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_WS) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:994:2: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsProperty2156); 
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getImportsPropertyAccess().getWSTerminalRuleCall_4_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:998:3: ( (lv_importsVariables_6_0= ruleImportsVariable ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:999:1: (lv_importsVariables_6_0= ruleImportsVariable )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:999:1: (lv_importsVariables_6_0= ruleImportsVariable )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1000:3: lv_importsVariables_6_0= ruleImportsVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportsPropertyAccess().getImportsVariablesImportsVariableParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportsVariable_in_ruleImportsProperty2178);
            	    lv_importsVariables_6_0=ruleImportsVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportsPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"importsVariables",
            	            		lv_importsVariables_6_0, 
            	            		"ImportsVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1016:4: (this_WS_7= RULE_WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_WS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1016:5: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsProperty2192); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getImportsPropertyAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleImportsProperty2205); 

                	newLeafNode(otherlv_8, grammarAccess.getImportsPropertyAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportsProperty"


    // $ANTLR start "entryRuleImportsVariable"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1032:1: entryRuleImportsVariable returns [EObject current=null] : iv_ruleImportsVariable= ruleImportsVariable EOF ;
    public final EObject entryRuleImportsVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportsVariable = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1033:2: (iv_ruleImportsVariable= ruleImportsVariable EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1034:2: iv_ruleImportsVariable= ruleImportsVariable EOF
            {
             newCompositeNode(grammarAccess.getImportsVariableRule()); 
            pushFollow(FOLLOW_ruleImportsVariable_in_entryRuleImportsVariable2241);
            iv_ruleImportsVariable=ruleImportsVariable();

            state._fsp--;

             current =iv_ruleImportsVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportsVariable2251); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportsVariable"


    // $ANTLR start "ruleImportsVariable"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1041:1: ruleImportsVariable returns [EObject current=null] : ( ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )? ( (lv_componentName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_componentProperty_4_0= RULE_ID ) ) (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )? ) ;
    public final EObject ruleImportsVariable() throws RecognitionException {
        EObject current = null;

        Token lv_isExternal_0_0=null;
        Token this_WS_1=null;
        Token lv_componentName_2_0=null;
        Token otherlv_3=null;
        Token lv_componentProperty_4_0=null;
        Token this_WS_5=null;
        Token lv_isOptional_6_0=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1044:28: ( ( ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )? ( (lv_componentName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_componentProperty_4_0= RULE_ID ) ) (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )? ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:1: ( ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )? ( (lv_componentName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_componentProperty_4_0= RULE_ID ) ) (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )? )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:1: ( ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )? ( (lv_componentName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_componentProperty_4_0= RULE_ID ) ) (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )? )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:2: ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )? ( (lv_componentName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_componentProperty_4_0= RULE_ID ) ) (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )?
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:2: ( ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:3: ( (lv_isExternal_0_0= 'external' ) ) this_WS_1= RULE_WS
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1045:3: ( (lv_isExternal_0_0= 'external' ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1046:1: (lv_isExternal_0_0= 'external' )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1046:1: (lv_isExternal_0_0= 'external' )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1047:3: lv_isExternal_0_0= 'external'
                    {
                    lv_isExternal_0_0=(Token)match(input,22,FOLLOW_22_in_ruleImportsVariable2295); 

                            newLeafNode(lv_isExternal_0_0, grammarAccess.getImportsVariableAccess().getIsExternalExternalKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportsVariableRule());
                    	        }
                           		setWithLastConsumed(current, "isExternal", true, "external");
                    	    

                    }


                    }

                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsVariable2319); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getImportsVariableAccess().getWSTerminalRuleCall_0_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1064:3: ( (lv_componentName_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1065:1: (lv_componentName_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1065:1: (lv_componentName_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1066:3: lv_componentName_2_0= RULE_ID
            {
            lv_componentName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportsVariable2337); 

            			newLeafNode(lv_componentName_2_0, grammarAccess.getImportsVariableAccess().getComponentNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportsVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"componentName",
                    		lv_componentName_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleImportsVariable2354); 

                	newLeafNode(otherlv_3, grammarAccess.getImportsVariableAccess().getFullStopKeyword_2());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1086:1: ( (lv_componentProperty_4_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1087:1: (lv_componentProperty_4_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1087:1: (lv_componentProperty_4_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1088:3: lv_componentProperty_4_0= RULE_ID
            {
            lv_componentProperty_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportsVariable2371); 

            			newLeafNode(lv_componentProperty_4_0, grammarAccess.getImportsVariableAccess().getComponentPropertyIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportsVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"componentProperty",
                    		lv_componentProperty_4_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1104:2: (this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_WS) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==24) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1104:3: this_WS_5= RULE_WS ( (lv_isOptional_6_0= '(optional)' ) )
                    {
                    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleImportsVariable2388); 
                     
                        newLeafNode(this_WS_5, grammarAccess.getImportsVariableAccess().getWSTerminalRuleCall_4_0()); 
                        
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1108:1: ( (lv_isOptional_6_0= '(optional)' ) )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1109:1: (lv_isOptional_6_0= '(optional)' )
                    {
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1109:1: (lv_isOptional_6_0= '(optional)' )
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1110:3: lv_isOptional_6_0= '(optional)'
                    {
                    lv_isOptional_6_0=(Token)match(input,24,FOLLOW_24_in_ruleImportsVariable2405); 

                            newLeafNode(lv_isOptional_6_0, grammarAccess.getImportsVariableAccess().getIsOptionalOptionalKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportsVariableRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "(optional)");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportsVariable"


    // $ANTLR start "entryRuleFacetsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1131:1: entryRuleFacetsProperty returns [EObject current=null] : iv_ruleFacetsProperty= ruleFacetsProperty EOF ;
    public final EObject entryRuleFacetsProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetsProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1132:2: (iv_ruleFacetsProperty= ruleFacetsProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1133:2: iv_ruleFacetsProperty= ruleFacetsProperty EOF
            {
             newCompositeNode(grammarAccess.getFacetsPropertyRule()); 
            pushFollow(FOLLOW_ruleFacetsProperty_in_entryRuleFacetsProperty2456);
            iv_ruleFacetsProperty=ruleFacetsProperty();

            state._fsp--;

             current =iv_ruleFacetsProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFacetsProperty2466); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacetsProperty"


    // $ANTLR start "ruleFacetsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1140:1: ruleFacetsProperty returns [EObject current=null] : (otherlv_0= 'facets:' (this_WS_1= RULE_WS )? ( (lv_facetsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) ;
    public final EObject ruleFacetsProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_facetsNames_2_0=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_facetsNames_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1143:28: ( (otherlv_0= 'facets:' (this_WS_1= RULE_WS )? ( (lv_facetsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1144:1: (otherlv_0= 'facets:' (this_WS_1= RULE_WS )? ( (lv_facetsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1144:1: (otherlv_0= 'facets:' (this_WS_1= RULE_WS )? ( (lv_facetsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1144:3: otherlv_0= 'facets:' (this_WS_1= RULE_WS )? ( (lv_facetsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFacetsProperty2503); 

                	newLeafNode(otherlv_0, grammarAccess.getFacetsPropertyAccess().getFacetsKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1148:1: (this_WS_1= RULE_WS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_WS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1148:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetsProperty2515); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getFacetsPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1152:3: ( (lv_facetsNames_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1153:1: (lv_facetsNames_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1153:1: (lv_facetsNames_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1154:3: lv_facetsNames_2_0= RULE_ID
            {
            lv_facetsNames_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacetsProperty2533); 

            			newLeafNode(lv_facetsNames_2_0, grammarAccess.getFacetsPropertyAccess().getFacetsNamesIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFacetsPropertyRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"facetsNames",
                    		lv_facetsNames_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1170:2: (this_WS_3= RULE_WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1170:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetsProperty2550); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getFacetsPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1174:3: (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==17) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1174:5: otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_facetsNames_6_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFacetsProperty2564); 

            	        	newLeafNode(otherlv_4, grammarAccess.getFacetsPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1178:1: (this_WS_5= RULE_WS )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_WS) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1178:2: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetsProperty2576); 
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getFacetsPropertyAccess().getWSTerminalRuleCall_4_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1182:3: ( (lv_facetsNames_6_0= RULE_ID ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1183:1: (lv_facetsNames_6_0= RULE_ID )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1183:1: (lv_facetsNames_6_0= RULE_ID )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1184:3: lv_facetsNames_6_0= RULE_ID
            	    {
            	    lv_facetsNames_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFacetsProperty2594); 

            	    			newLeafNode(lv_facetsNames_6_0, grammarAccess.getFacetsPropertyAccess().getFacetsNamesIDTerminalRuleCall_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFacetsPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"facetsNames",
            	            		lv_facetsNames_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1200:4: (this_WS_7= RULE_WS )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_WS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1200:5: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFacetsProperty2613); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getFacetsPropertyAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFacetsProperty2626); 

                	newLeafNode(otherlv_8, grammarAccess.getFacetsPropertyAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFacetsProperty"


    // $ANTLR start "entryRuleExtendsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1216:1: entryRuleExtendsProperty returns [EObject current=null] : iv_ruleExtendsProperty= ruleExtendsProperty EOF ;
    public final EObject entryRuleExtendsProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsProperty = null;


        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1217:2: (iv_ruleExtendsProperty= ruleExtendsProperty EOF )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1218:2: iv_ruleExtendsProperty= ruleExtendsProperty EOF
            {
             newCompositeNode(grammarAccess.getExtendsPropertyRule()); 
            pushFollow(FOLLOW_ruleExtendsProperty_in_entryRuleExtendsProperty2662);
            iv_ruleExtendsProperty=ruleExtendsProperty();

            state._fsp--;

             current =iv_ruleExtendsProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendsProperty2672); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsProperty"


    // $ANTLR start "ruleExtendsProperty"
    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1225:1: ruleExtendsProperty returns [EObject current=null] : (otherlv_0= 'extends:' (this_WS_1= RULE_WS )? ( (lv_extendsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) ;
    public final EObject ruleExtendsProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_extendsNames_2_0=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_extendsNames_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1228:28: ( (otherlv_0= 'extends:' (this_WS_1= RULE_WS )? ( (lv_extendsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1229:1: (otherlv_0= 'extends:' (this_WS_1= RULE_WS )? ( (lv_extendsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1229:1: (otherlv_0= 'extends:' (this_WS_1= RULE_WS )? ( (lv_extendsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';' )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1229:3: otherlv_0= 'extends:' (this_WS_1= RULE_WS )? ( (lv_extendsNames_2_0= RULE_ID ) ) (this_WS_3= RULE_WS )? (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )* (this_WS_7= RULE_WS )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleExtendsProperty2709); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendsPropertyAccess().getExtendsKeyword_0());
                
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1233:1: (this_WS_1= RULE_WS )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_WS) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1233:2: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExtendsProperty2721); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getExtendsPropertyAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1237:3: ( (lv_extendsNames_2_0= RULE_ID ) )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1238:1: (lv_extendsNames_2_0= RULE_ID )
            {
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1238:1: (lv_extendsNames_2_0= RULE_ID )
            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1239:3: lv_extendsNames_2_0= RULE_ID
            {
            lv_extendsNames_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendsProperty2739); 

            			newLeafNode(lv_extendsNames_2_0, grammarAccess.getExtendsPropertyAccess().getExtendsNamesIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtendsPropertyRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"extendsNames",
                    		lv_extendsNames_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1255:2: (this_WS_3= RULE_WS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_WS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1255:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExtendsProperty2756); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getExtendsPropertyAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1259:3: (otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==17) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1259:5: otherlv_4= ',' (this_WS_5= RULE_WS )? ( (lv_extendsNames_6_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleExtendsProperty2770); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExtendsPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1263:1: (this_WS_5= RULE_WS )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_WS) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1263:2: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExtendsProperty2782); 
            	             
            	                newLeafNode(this_WS_5, grammarAccess.getExtendsPropertyAccess().getWSTerminalRuleCall_4_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1267:3: ( (lv_extendsNames_6_0= RULE_ID ) )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1268:1: (lv_extendsNames_6_0= RULE_ID )
            	    {
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1268:1: (lv_extendsNames_6_0= RULE_ID )
            	    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1269:3: lv_extendsNames_6_0= RULE_ID
            	    {
            	    lv_extendsNames_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendsProperty2800); 

            	    			newLeafNode(lv_extendsNames_6_0, grammarAccess.getExtendsPropertyAccess().getExtendsNamesIDTerminalRuleCall_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtendsPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"extendsNames",
            	            		lv_extendsNames_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1285:4: (this_WS_7= RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.imag.mosig.seacs.roboconf/src-gen/fr/imag/mosig/seacs/roboconf/parser/antlr/internal/InternalGraphDsl.g:1285:5: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleExtendsProperty2819); 
                     
                        newLeafNode(this_WS_7, grammarAccess.getExtendsPropertyAccess().getWSTerminalRuleCall_5()); 
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExtendsProperty2832); 

                	newLeafNode(otherlv_8, grammarAccess.getExtendsPropertyAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendsProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleGraph122 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ruleComponentOrFacet_in_ruleGraph144 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleGraph156 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleComponentOrFacet_in_entryRuleComponentOrFacet194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentOrFacet204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleComponentOrFacet250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_ruleComponentOrFacet277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent365 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleComponent382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleComponent395 = new BitSet(new long[]{0x0000000006254010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleComponent407 = new BitSet(new long[]{0x0000000006254010L});
    public static final BitSet FOLLOW_ruleComponentProperties_in_ruleComponent429 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleComponent441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacet500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFacet537 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacet549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacet567 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacet584 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFacet597 = new BitSet(new long[]{0x0000000000051010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacet609 = new BitSet(new long[]{0x0000000000051010L});
    public static final BitSet FOLLOW_ruleFacetProperties_in_ruleFacet631 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacet643 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFacet656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentProperties_in_entryRuleComponentProperties692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentProperties702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalProperty_in_ruleComponentProperties748 = new BitSet(new long[]{0x0000000006254010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleComponentProperties761 = new BitSet(new long[]{0x0000000006254010L});
    public static final BitSet FOLLOW_ruleInstallerProperty_in_ruleComponentProperties783 = new BitSet(new long[]{0x0000000006250012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleComponentProperties795 = new BitSet(new long[]{0x0000000006250002L});
    public static final BitSet FOLLOW_ruleOptionalProperty_in_ruleComponentProperties817 = new BitSet(new long[]{0x0000000006250002L});
    public static final BitSet FOLLOW_ruleFacetProperties_in_entryRuleFacetProperties854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacetProperties864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetProperties901 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleFacetProperty_in_ruleFacetProperties923 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetProperties935 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_ruleFacetProperty_in_entryRuleFacetProperty973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacetProperty983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildrenProperty_in_ruleFacetProperty1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportsProperty_in_ruleFacetProperty1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalProperty_in_entryRuleOptionalProperty1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalProperty1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildrenProperty_in_ruleOptionalProperty1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportsProperty_in_ruleOptionalProperty1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportsProperty_in_ruleOptionalProperty1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacetsProperty_in_ruleOptionalProperty1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendsProperty_in_ruleOptionalProperty1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstallerProperty_in_entryRuleInstallerProperty1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstallerProperty1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInstallerProperty1339 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleInstallerProperty1351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstallerProperty1369 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleInstallerProperty1386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstallerProperty1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildrenProperty_in_entryRuleChildrenProperty1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildrenProperty1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleChildrenProperty1482 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChildrenProperty1494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChildrenProperty1512 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChildrenProperty1529 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleChildrenProperty1543 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChildrenProperty1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChildrenProperty1573 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleChildrenProperty1592 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleChildrenProperty1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportsProperty_in_entryRuleExportsProperty1641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportsProperty1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExportsProperty1688 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsProperty1700 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_ruleExportsVariable_in_ruleExportsProperty1722 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsProperty1734 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleExportsProperty1748 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsProperty1760 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_ruleExportsVariable_in_ruleExportsProperty1782 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsProperty1796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExportsProperty1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportsVariable_in_entryRuleExportsVariable1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportsVariable1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExportsVariable1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExportsVariable1935 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsVariable1952 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExportsVariable1965 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExportsVariable1977 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExportsVariable1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportsProperty_in_entryRuleImportsProperty2037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportsProperty2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImportsProperty2084 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsProperty2096 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_ruleImportsVariable_in_ruleImportsProperty2118 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsProperty2130 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleImportsProperty2144 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsProperty2156 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_ruleImportsVariable_in_ruleImportsProperty2178 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsProperty2192 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImportsProperty2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportsVariable_in_entryRuleImportsVariable2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportsVariable2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImportsVariable2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsVariable2319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportsVariable2337 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleImportsVariable2354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportsVariable2371 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleImportsVariable2388 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleImportsVariable2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFacetsProperty_in_entryRuleFacetsProperty2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFacetsProperty2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFacetsProperty2503 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetsProperty2515 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacetsProperty2533 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetsProperty2550 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleFacetsProperty2564 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetsProperty2576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFacetsProperty2594 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFacetsProperty2613 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFacetsProperty2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendsProperty_in_entryRuleExtendsProperty2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendsProperty2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleExtendsProperty2709 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExtendsProperty2721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendsProperty2739 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExtendsProperty2756 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_17_in_ruleExtendsProperty2770 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExtendsProperty2782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendsProperty2800 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleExtendsProperty2819 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtendsProperty2832 = new BitSet(new long[]{0x0000000000000002L});

}