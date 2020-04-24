package smartcity.project.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smartcity.project.xtext.services.SmartCityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartCityDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'smartCities'", "'{'", "','", "'}'", "'city'", "'stakeholders'", "'data'", "'infrastructurelayer'", "'dataPackage'", "'components'", "'socialMedia'", "'['", "'url'", "':'", "']'", "'openData'", "'providedData'", "'organization'", "'organizationName'", "'real'", "'='", "'('", "')'", "'bool'", "'int'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'infrastructureComponent'", "'monitoringInfrastructure'", "'sensor'", "'location'", "'actuator'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmartCityDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartCityDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartCityDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartCityDSL.g"; }



     	private SmartCityDSLGrammarAccess grammarAccess;

        public InternalSmartCityDSLParser(TokenStream input, SmartCityDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartCityModel";
       	}

       	@Override
       	protected SmartCityDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartCityModel"
    // InternalSmartCityDSL.g:64:1: entryRuleSmartCityModel returns [EObject current=null] : iv_ruleSmartCityModel= ruleSmartCityModel EOF ;
    public final EObject entryRuleSmartCityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCityModel = null;


        try {
            // InternalSmartCityDSL.g:64:55: (iv_ruleSmartCityModel= ruleSmartCityModel EOF )
            // InternalSmartCityDSL.g:65:2: iv_ruleSmartCityModel= ruleSmartCityModel EOF
            {
             newCompositeNode(grammarAccess.getSmartCityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartCityModel=ruleSmartCityModel();

            state._fsp--;

             current =iv_ruleSmartCityModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSmartCityModel"


    // $ANTLR start "ruleSmartCityModel"
    // InternalSmartCityDSL.g:71:1: ruleSmartCityModel returns [EObject current=null] : ( () (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleSmartCityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_smartCities_3_0 = null;

        EObject lv_smartCities_5_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:77:2: ( ( () (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )? ) )
            // InternalSmartCityDSL.g:78:2: ( () (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )? )
            {
            // InternalSmartCityDSL.g:78:2: ( () (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )? )
            // InternalSmartCityDSL.g:79:3: () (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )?
            {
            // InternalSmartCityDSL.g:79:3: ()
            // InternalSmartCityDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmartCityModelAccess().getSmartCityModelAction_0(),
            					current);
            			

            }

            // InternalSmartCityDSL.g:86:3: (otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartCityDSL.g:87:4: otherlv_1= 'smartCities' otherlv_2= '{' ( (lv_smartCities_3_0= ruleSmartCity ) ) (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )* otherlv_6= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSmartCityModelAccess().getSmartCitiesKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSmartCityModelAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalSmartCityDSL.g:95:4: ( (lv_smartCities_3_0= ruleSmartCity ) )
                    // InternalSmartCityDSL.g:96:5: (lv_smartCities_3_0= ruleSmartCity )
                    {
                    // InternalSmartCityDSL.g:96:5: (lv_smartCities_3_0= ruleSmartCity )
                    // InternalSmartCityDSL.g:97:6: lv_smartCities_3_0= ruleSmartCity
                    {

                    						newCompositeNode(grammarAccess.getSmartCityModelAccess().getSmartCitiesSmartCityParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_smartCities_3_0=ruleSmartCity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityModelRule());
                    						}
                    						add(
                    							current,
                    							"smartCities",
                    							lv_smartCities_3_0,
                    							"smartcity.project.xtext.SmartCityDSL.SmartCity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:114:4: (otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:115:5: otherlv_4= ',' ( (lv_smartCities_5_0= ruleSmartCity ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSmartCityModelAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalSmartCityDSL.g:119:5: ( (lv_smartCities_5_0= ruleSmartCity ) )
                    	    // InternalSmartCityDSL.g:120:6: (lv_smartCities_5_0= ruleSmartCity )
                    	    {
                    	    // InternalSmartCityDSL.g:120:6: (lv_smartCities_5_0= ruleSmartCity )
                    	    // InternalSmartCityDSL.g:121:7: lv_smartCities_5_0= ruleSmartCity
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmartCityModelAccess().getSmartCitiesSmartCityParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_smartCities_5_0=ruleSmartCity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmartCityModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"smartCities",
                    	    								lv_smartCities_5_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.SmartCity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSmartCityModelAccess().getRightCurlyBracketKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSmartCityModel"


    // $ANTLR start "entryRuleSource"
    // InternalSmartCityDSL.g:148:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSmartCityDSL.g:148:47: (iv_ruleSource= ruleSource EOF )
            // InternalSmartCityDSL.g:149:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSmartCityDSL.g:155:1: ruleSource returns [EObject current=null] : (this_SocialMedia_0= ruleSocialMedia | this_OpenData_1= ruleOpenData | this_ProvidedData_2= ruleProvidedData | this_Stakeholder_3= ruleStakeholder ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SocialMedia_0 = null;

        EObject this_OpenData_1 = null;

        EObject this_ProvidedData_2 = null;

        EObject this_Stakeholder_3 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:161:2: ( (this_SocialMedia_0= ruleSocialMedia | this_OpenData_1= ruleOpenData | this_ProvidedData_2= ruleProvidedData | this_Stakeholder_3= ruleStakeholder ) )
            // InternalSmartCityDSL.g:162:2: (this_SocialMedia_0= ruleSocialMedia | this_OpenData_1= ruleOpenData | this_ProvidedData_2= ruleProvidedData | this_Stakeholder_3= ruleStakeholder )
            {
            // InternalSmartCityDSL.g:162:2: (this_SocialMedia_0= ruleSocialMedia | this_OpenData_1= ruleOpenData | this_ProvidedData_2= ruleProvidedData | this_Stakeholder_3= ruleStakeholder )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmartCityDSL.g:163:3: this_SocialMedia_0= ruleSocialMedia
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getSocialMediaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SocialMedia_0=ruleSocialMedia();

                    state._fsp--;


                    			current = this_SocialMedia_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:172:3: this_OpenData_1= ruleOpenData
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getOpenDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenData_1=ruleOpenData();

                    state._fsp--;


                    			current = this_OpenData_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCityDSL.g:181:3: this_ProvidedData_2= ruleProvidedData
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getProvidedDataParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProvidedData_2=ruleProvidedData();

                    state._fsp--;


                    			current = this_ProvidedData_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmartCityDSL.g:190:3: this_Stakeholder_3= ruleStakeholder
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getStakeholderParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stakeholder_3=ruleStakeholder();

                    state._fsp--;


                    			current = this_Stakeholder_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleData"
    // InternalSmartCityDSL.g:202:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalSmartCityDSL.g:202:45: (iv_ruleData= ruleData EOF )
            // InternalSmartCityDSL.g:203:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalSmartCityDSL.g:209:1: ruleData returns [EObject current=null] : (this_RealValue_0= ruleRealValue | this_BoolValue_1= ruleBoolValue | this_IntegerValue_2= ruleIntegerValue ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_RealValue_0 = null;

        EObject this_BoolValue_1 = null;

        EObject this_IntegerValue_2 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:215:2: ( (this_RealValue_0= ruleRealValue | this_BoolValue_1= ruleBoolValue | this_IntegerValue_2= ruleIntegerValue ) )
            // InternalSmartCityDSL.g:216:2: (this_RealValue_0= ruleRealValue | this_BoolValue_1= ruleBoolValue | this_IntegerValue_2= ruleIntegerValue )
            {
            // InternalSmartCityDSL.g:216:2: (this_RealValue_0= ruleRealValue | this_BoolValue_1= ruleBoolValue | this_IntegerValue_2= ruleIntegerValue )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSmartCityDSL.g:217:3: this_RealValue_0= ruleRealValue
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getRealValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealValue_0=ruleRealValue();

                    state._fsp--;


                    			current = this_RealValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:226:3: this_BoolValue_1= ruleBoolValue
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getBoolValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolValue_1=ruleBoolValue();

                    state._fsp--;


                    			current = this_BoolValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmartCityDSL.g:235:3: this_IntegerValue_2= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getIntegerValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_2=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleInfrastructureComponent"
    // InternalSmartCityDSL.g:247:1: entryRuleInfrastructureComponent returns [EObject current=null] : iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF ;
    public final EObject entryRuleInfrastructureComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureComponent = null;


        try {
            // InternalSmartCityDSL.g:247:64: (iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF )
            // InternalSmartCityDSL.g:248:2: iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfrastructureComponent=ruleInfrastructureComponent();

            state._fsp--;

             current =iv_ruleInfrastructureComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfrastructureComponent"


    // $ANTLR start "ruleInfrastructureComponent"
    // InternalSmartCityDSL.g:254:1: ruleInfrastructureComponent returns [EObject current=null] : (this_InfrastructureComponent_Impl_0= ruleInfrastructureComponent_Impl | this_MonitoringInfrastructure_1= ruleMonitoringInfrastructure ) ;
    public final EObject ruleInfrastructureComponent() throws RecognitionException {
        EObject current = null;

        EObject this_InfrastructureComponent_Impl_0 = null;

        EObject this_MonitoringInfrastructure_1 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:260:2: ( (this_InfrastructureComponent_Impl_0= ruleInfrastructureComponent_Impl | this_MonitoringInfrastructure_1= ruleMonitoringInfrastructure ) )
            // InternalSmartCityDSL.g:261:2: (this_InfrastructureComponent_Impl_0= ruleInfrastructureComponent_Impl | this_MonitoringInfrastructure_1= ruleMonitoringInfrastructure )
            {
            // InternalSmartCityDSL.g:261:2: (this_InfrastructureComponent_Impl_0= ruleInfrastructureComponent_Impl | this_MonitoringInfrastructure_1= ruleMonitoringInfrastructure )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmartCityDSL.g:262:3: this_InfrastructureComponent_Impl_0= ruleInfrastructureComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getInfrastructureComponentAccess().getInfrastructureComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InfrastructureComponent_Impl_0=ruleInfrastructureComponent_Impl();

                    state._fsp--;


                    			current = this_InfrastructureComponent_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:271:3: this_MonitoringInfrastructure_1= ruleMonitoringInfrastructure
                    {

                    			newCompositeNode(grammarAccess.getInfrastructureComponentAccess().getMonitoringInfrastructureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonitoringInfrastructure_1=ruleMonitoringInfrastructure();

                    state._fsp--;


                    			current = this_MonitoringInfrastructure_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInfrastructureComponent"


    // $ANTLR start "entryRuleIoTDev"
    // InternalSmartCityDSL.g:283:1: entryRuleIoTDev returns [EObject current=null] : iv_ruleIoTDev= ruleIoTDev EOF ;
    public final EObject entryRuleIoTDev() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIoTDev = null;


        try {
            // InternalSmartCityDSL.g:283:47: (iv_ruleIoTDev= ruleIoTDev EOF )
            // InternalSmartCityDSL.g:284:2: iv_ruleIoTDev= ruleIoTDev EOF
            {
             newCompositeNode(grammarAccess.getIoTDevRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIoTDev=ruleIoTDev();

            state._fsp--;

             current =iv_ruleIoTDev; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIoTDev"


    // $ANTLR start "ruleIoTDev"
    // InternalSmartCityDSL.g:290:1: ruleIoTDev returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleIoTDev() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:296:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalSmartCityDSL.g:297:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalSmartCityDSL.g:297:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==46) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartCityDSL.g:298:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getIoTDevAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:307:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getIoTDevAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleIoTDev"


    // $ANTLR start "entryRuleSmartCity"
    // InternalSmartCityDSL.g:319:1: entryRuleSmartCity returns [EObject current=null] : iv_ruleSmartCity= ruleSmartCity EOF ;
    public final EObject entryRuleSmartCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCity = null;


        try {
            // InternalSmartCityDSL.g:319:50: (iv_ruleSmartCity= ruleSmartCity EOF )
            // InternalSmartCityDSL.g:320:2: iv_ruleSmartCity= ruleSmartCity EOF
            {
             newCompositeNode(grammarAccess.getSmartCityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartCity=ruleSmartCity();

            state._fsp--;

             current =iv_ruleSmartCity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSmartCity"


    // $ANTLR start "ruleSmartCity"
    // InternalSmartCityDSL.g:326:1: ruleSmartCity returns [EObject current=null] : ( () (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )? otherlv_3= '{' (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )? (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleSmartCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_city_2_0 = null;

        EObject lv_stakeholders_6_0 = null;

        EObject lv_stakeholders_8_0 = null;

        EObject lv_data_12_0 = null;

        EObject lv_data_14_0 = null;

        EObject lv_infrastructurelayer_17_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:332:2: ( ( () (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )? otherlv_3= '{' (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )? (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )? otherlv_18= '}' ) )
            // InternalSmartCityDSL.g:333:2: ( () (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )? otherlv_3= '{' (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )? (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )? otherlv_18= '}' )
            {
            // InternalSmartCityDSL.g:333:2: ( () (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )? otherlv_3= '{' (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )? (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )? otherlv_18= '}' )
            // InternalSmartCityDSL.g:334:3: () (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )? otherlv_3= '{' (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )? (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )? (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )? otherlv_18= '}'
            {
            // InternalSmartCityDSL.g:334:3: ()
            // InternalSmartCityDSL.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmartCityAccess().getSmartCityAction_0(),
            					current);
            			

            }

            // InternalSmartCityDSL.g:341:3: (otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartCityDSL.g:342:4: otherlv_1= 'city' ( (lv_city_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSmartCityAccess().getCityKeyword_1_0());
                    			
                    // InternalSmartCityDSL.g:346:4: ( (lv_city_2_0= ruleEString ) )
                    // InternalSmartCityDSL.g:347:5: (lv_city_2_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:347:5: (lv_city_2_0= ruleEString )
                    // InternalSmartCityDSL.g:348:6: lv_city_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getCityEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_city_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						set(
                    							current,
                    							"city",
                    							lv_city_2_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCityDSL.g:370:3: (otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartCityDSL.g:371:4: otherlv_4= 'stakeholders' otherlv_5= '{' ( (lv_stakeholders_6_0= ruleSource ) ) (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSmartCityAccess().getStakeholdersKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmartCityDSL.g:379:4: ( (lv_stakeholders_6_0= ruleSource ) )
                    // InternalSmartCityDSL.g:380:5: (lv_stakeholders_6_0= ruleSource )
                    {
                    // InternalSmartCityDSL.g:380:5: (lv_stakeholders_6_0= ruleSource )
                    // InternalSmartCityDSL.g:381:6: lv_stakeholders_6_0= ruleSource
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getStakeholdersSourceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_stakeholders_6_0=ruleSource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						add(
                    							current,
                    							"stakeholders",
                    							lv_stakeholders_6_0,
                    							"smartcity.project.xtext.SmartCityDSL.Source");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:398:4: (otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==13) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:399:5: otherlv_7= ',' ( (lv_stakeholders_8_0= ruleSource ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSmartCityAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmartCityDSL.g:403:5: ( (lv_stakeholders_8_0= ruleSource ) )
                    	    // InternalSmartCityDSL.g:404:6: (lv_stakeholders_8_0= ruleSource )
                    	    {
                    	    // InternalSmartCityDSL.g:404:6: (lv_stakeholders_8_0= ruleSource )
                    	    // InternalSmartCityDSL.g:405:7: lv_stakeholders_8_0= ruleSource
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmartCityAccess().getStakeholdersSourceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_stakeholders_8_0=ruleSource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stakeholders",
                    	    								lv_stakeholders_8_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.Source");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmartCityDSL.g:428:3: (otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartCityDSL.g:429:4: otherlv_10= 'data' otherlv_11= '{' ( (lv_data_12_0= ruleDataPackage ) ) (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSmartCityAccess().getDataKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmartCityDSL.g:437:4: ( (lv_data_12_0= ruleDataPackage ) )
                    // InternalSmartCityDSL.g:438:5: (lv_data_12_0= ruleDataPackage )
                    {
                    // InternalSmartCityDSL.g:438:5: (lv_data_12_0= ruleDataPackage )
                    // InternalSmartCityDSL.g:439:6: lv_data_12_0= ruleDataPackage
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getDataDataPackageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_data_12_0=ruleDataPackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_12_0,
                    							"smartcity.project.xtext.SmartCityDSL.DataPackage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:456:4: (otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:457:5: otherlv_13= ',' ( (lv_data_14_0= ruleDataPackage ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSmartCityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmartCityDSL.g:461:5: ( (lv_data_14_0= ruleDataPackage ) )
                    	    // InternalSmartCityDSL.g:462:6: (lv_data_14_0= ruleDataPackage )
                    	    {
                    	    // InternalSmartCityDSL.g:462:6: (lv_data_14_0= ruleDataPackage )
                    	    // InternalSmartCityDSL.g:463:7: lv_data_14_0= ruleDataPackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmartCityAccess().getDataDataPackageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_data_14_0=ruleDataPackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_14_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.DataPackage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmartCityDSL.g:486:3: (otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmartCityDSL.g:487:4: otherlv_16= 'infrastructurelayer' ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) )
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getSmartCityAccess().getInfrastructurelayerKeyword_5_0());
                    			
                    // InternalSmartCityDSL.g:491:4: ( (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer ) )
                    // InternalSmartCityDSL.g:492:5: (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer )
                    {
                    // InternalSmartCityDSL.g:492:5: (lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer )
                    // InternalSmartCityDSL.g:493:6: lv_infrastructurelayer_17_0= rulePublicInfrastructureLayer
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getInfrastructurelayerPublicInfrastructureLayerParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_infrastructurelayer_17_0=rulePublicInfrastructureLayer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						set(
                    							current,
                    							"infrastructurelayer",
                    							lv_infrastructurelayer_17_0,
                    							"smartcity.project.xtext.SmartCityDSL.PublicInfrastructureLayer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSmartCity"


    // $ANTLR start "entryRuleEString"
    // InternalSmartCityDSL.g:519:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartCityDSL.g:519:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartCityDSL.g:520:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartCityDSL.g:526:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartCityDSL.g:532:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartCityDSL.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartCityDSL.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartCityDSL.g:534:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:542:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDataPackage"
    // InternalSmartCityDSL.g:553:1: entryRuleDataPackage returns [EObject current=null] : iv_ruleDataPackage= ruleDataPackage EOF ;
    public final EObject entryRuleDataPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPackage = null;


        try {
            // InternalSmartCityDSL.g:553:52: (iv_ruleDataPackage= ruleDataPackage EOF )
            // InternalSmartCityDSL.g:554:2: iv_ruleDataPackage= ruleDataPackage EOF
            {
             newCompositeNode(grammarAccess.getDataPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPackage=ruleDataPackage();

            state._fsp--;

             current =iv_ruleDataPackage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataPackage"


    // $ANTLR start "ruleDataPackage"
    // InternalSmartCityDSL.g:560:1: ruleDataPackage returns [EObject current=null] : ( () otherlv_1= 'dataPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleDataPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_data_4_0 = null;

        EObject lv_data_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:566:2: ( ( () otherlv_1= 'dataPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )? otherlv_7= '}' ) )
            // InternalSmartCityDSL.g:567:2: ( () otherlv_1= 'dataPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )? otherlv_7= '}' )
            {
            // InternalSmartCityDSL.g:567:2: ( () otherlv_1= 'dataPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )? otherlv_7= '}' )
            // InternalSmartCityDSL.g:568:3: () otherlv_1= 'dataPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )? otherlv_7= '}'
            {
            // InternalSmartCityDSL.g:568:3: ()
            // InternalSmartCityDSL.g:569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataPackageAccess().getDataPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPackageAccess().getDataPackageKeyword_1());
            		
            // InternalSmartCityDSL.g:579:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:580:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:580:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:581:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDataPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartCityDSL.g:602:3: ( ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30||(LA15_0>=34 && LA15_0<=35)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmartCityDSL.g:603:4: ( (lv_data_4_0= ruleData ) ) (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )*
                    {
                    // InternalSmartCityDSL.g:603:4: ( (lv_data_4_0= ruleData ) )
                    // InternalSmartCityDSL.g:604:5: (lv_data_4_0= ruleData )
                    {
                    // InternalSmartCityDSL.g:604:5: (lv_data_4_0= ruleData )
                    // InternalSmartCityDSL.g:605:6: lv_data_4_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getDataPackageAccess().getDataDataParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_data_4_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataPackageRule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_4_0,
                    							"smartcity.project.xtext.SmartCityDSL.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:622:4: (otherlv_5= ',' ( (lv_data_6_0= ruleData ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:623:5: otherlv_5= ',' ( (lv_data_6_0= ruleData ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_14); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataPackageAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmartCityDSL.g:627:5: ( (lv_data_6_0= ruleData ) )
                    	    // InternalSmartCityDSL.g:628:6: (lv_data_6_0= ruleData )
                    	    {
                    	    // InternalSmartCityDSL.g:628:6: (lv_data_6_0= ruleData )
                    	    // InternalSmartCityDSL.g:629:7: lv_data_6_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataPackageAccess().getDataDataParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_data_6_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_6_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataPackageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataPackage"


    // $ANTLR start "entryRulePublicInfrastructureLayer"
    // InternalSmartCityDSL.g:656:1: entryRulePublicInfrastructureLayer returns [EObject current=null] : iv_rulePublicInfrastructureLayer= rulePublicInfrastructureLayer EOF ;
    public final EObject entryRulePublicInfrastructureLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublicInfrastructureLayer = null;


        try {
            // InternalSmartCityDSL.g:656:66: (iv_rulePublicInfrastructureLayer= rulePublicInfrastructureLayer EOF )
            // InternalSmartCityDSL.g:657:2: iv_rulePublicInfrastructureLayer= rulePublicInfrastructureLayer EOF
            {
             newCompositeNode(grammarAccess.getPublicInfrastructureLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublicInfrastructureLayer=rulePublicInfrastructureLayer();

            state._fsp--;

             current =iv_rulePublicInfrastructureLayer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePublicInfrastructureLayer"


    // $ANTLR start "rulePublicInfrastructureLayer"
    // InternalSmartCityDSL.g:663:1: rulePublicInfrastructureLayer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePublicInfrastructureLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_components_7_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:669:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSmartCityDSL.g:670:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSmartCityDSL.g:670:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSmartCityDSL.g:671:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSmartCityDSL.g:671:3: ()
            // InternalSmartCityDSL.g:672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublicInfrastructureLayerAccess().getPublicInfrastructureLayerAction_0(),
            					current);
            			

            }

            // InternalSmartCityDSL.g:678:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartCityDSL.g:679:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartCityDSL.g:679:4: (lv_name_1_0= ruleEString )
            // InternalSmartCityDSL.g:680:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublicInfrastructureLayerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublicInfrastructureLayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPublicInfrastructureLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCityDSL.g:701:3: (otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmartCityDSL.g:702:4: otherlv_3= 'components' otherlv_4= '{' ( (lv_components_5_0= ruleInfrastructureComponent ) ) (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPublicInfrastructureLayerAccess().getComponentsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getPublicInfrastructureLayerAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmartCityDSL.g:710:4: ( (lv_components_5_0= ruleInfrastructureComponent ) )
                    // InternalSmartCityDSL.g:711:5: (lv_components_5_0= ruleInfrastructureComponent )
                    {
                    // InternalSmartCityDSL.g:711:5: (lv_components_5_0= ruleInfrastructureComponent )
                    // InternalSmartCityDSL.g:712:6: lv_components_5_0= ruleInfrastructureComponent
                    {

                    						newCompositeNode(grammarAccess.getPublicInfrastructureLayerAccess().getComponentsInfrastructureComponentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_components_5_0=ruleInfrastructureComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublicInfrastructureLayerRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_5_0,
                    							"smartcity.project.xtext.SmartCityDSL.InfrastructureComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:729:4: (otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:730:5: otherlv_6= ',' ( (lv_components_7_0= ruleInfrastructureComponent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPublicInfrastructureLayerAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmartCityDSL.g:734:5: ( (lv_components_7_0= ruleInfrastructureComponent ) )
                    	    // InternalSmartCityDSL.g:735:6: (lv_components_7_0= ruleInfrastructureComponent )
                    	    {
                    	    // InternalSmartCityDSL.g:735:6: (lv_components_7_0= ruleInfrastructureComponent )
                    	    // InternalSmartCityDSL.g:736:7: lv_components_7_0= ruleInfrastructureComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getPublicInfrastructureLayerAccess().getComponentsInfrastructureComponentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_components_7_0=ruleInfrastructureComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPublicInfrastructureLayerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_7_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.InfrastructureComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getPublicInfrastructureLayerAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPublicInfrastructureLayerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePublicInfrastructureLayer"


    // $ANTLR start "entryRuleSocialMedia"
    // InternalSmartCityDSL.g:767:1: entryRuleSocialMedia returns [EObject current=null] : iv_ruleSocialMedia= ruleSocialMedia EOF ;
    public final EObject entryRuleSocialMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocialMedia = null;


        try {
            // InternalSmartCityDSL.g:767:52: (iv_ruleSocialMedia= ruleSocialMedia EOF )
            // InternalSmartCityDSL.g:768:2: iv_ruleSocialMedia= ruleSocialMedia EOF
            {
             newCompositeNode(grammarAccess.getSocialMediaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSocialMedia=ruleSocialMedia();

            state._fsp--;

             current =iv_ruleSocialMedia; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSocialMedia"


    // $ANTLR start "ruleSocialMedia"
    // InternalSmartCityDSL.g:774:1: ruleSocialMedia returns [EObject current=null] : ( () otherlv_1= 'socialMedia' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleSocialMedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:780:2: ( ( () otherlv_1= 'socialMedia' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' ) )
            // InternalSmartCityDSL.g:781:2: ( () otherlv_1= 'socialMedia' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' )
            {
            // InternalSmartCityDSL.g:781:2: ( () otherlv_1= 'socialMedia' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' )
            // InternalSmartCityDSL.g:782:3: () otherlv_1= 'socialMedia' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']'
            {
            // InternalSmartCityDSL.g:782:3: ()
            // InternalSmartCityDSL.g:783:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSocialMediaAccess().getSocialMediaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSocialMediaAccess().getSocialMediaKeyword_1());
            		
            // InternalSmartCityDSL.g:793:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:794:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:794:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:795:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSocialMediaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSocialMediaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSocialMediaAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalSmartCityDSL.g:816:3: (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmartCityDSL.g:817:4: otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getSocialMediaAccess().getUrlKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSocialMediaAccess().getColonKeyword_4_1());
                    			
                    // InternalSmartCityDSL.g:825:4: ( (lv_url_6_0= ruleEString ) )
                    // InternalSmartCityDSL.g:826:5: (lv_url_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:826:5: (lv_url_6_0= ruleEString )
                    // InternalSmartCityDSL.g:827:6: lv_url_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSocialMediaAccess().getUrlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_url_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSocialMediaRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_6_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSocialMediaAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSocialMedia"


    // $ANTLR start "entryRuleOpenData"
    // InternalSmartCityDSL.g:853:1: entryRuleOpenData returns [EObject current=null] : iv_ruleOpenData= ruleOpenData EOF ;
    public final EObject entryRuleOpenData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenData = null;


        try {
            // InternalSmartCityDSL.g:853:49: (iv_ruleOpenData= ruleOpenData EOF )
            // InternalSmartCityDSL.g:854:2: iv_ruleOpenData= ruleOpenData EOF
            {
             newCompositeNode(grammarAccess.getOpenDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenData=ruleOpenData();

            state._fsp--;

             current =iv_ruleOpenData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpenData"


    // $ANTLR start "ruleOpenData"
    // InternalSmartCityDSL.g:860:1: ruleOpenData returns [EObject current=null] : ( () otherlv_1= 'openData' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleOpenData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:866:2: ( ( () otherlv_1= 'openData' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' ) )
            // InternalSmartCityDSL.g:867:2: ( () otherlv_1= 'openData' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' )
            {
            // InternalSmartCityDSL.g:867:2: ( () otherlv_1= 'openData' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']' )
            // InternalSmartCityDSL.g:868:3: () otherlv_1= 'openData' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '[' (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )? otherlv_7= ']'
            {
            // InternalSmartCityDSL.g:868:3: ()
            // InternalSmartCityDSL.g:869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenDataAccess().getOpenDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenDataAccess().getOpenDataKeyword_1());
            		
            // InternalSmartCityDSL.g:879:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:880:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:880:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:881:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpenDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpenDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenDataAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalSmartCityDSL.g:902:3: (otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmartCityDSL.g:903:4: otherlv_4= 'url' otherlv_5= ':' ( (lv_url_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpenDataAccess().getUrlKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getOpenDataAccess().getColonKeyword_4_1());
                    			
                    // InternalSmartCityDSL.g:911:4: ( (lv_url_6_0= ruleEString ) )
                    // InternalSmartCityDSL.g:912:5: (lv_url_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:912:5: (lv_url_6_0= ruleEString )
                    // InternalSmartCityDSL.g:913:6: lv_url_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpenDataAccess().getUrlEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_url_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpenDataRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_6_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOpenDataAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOpenData"


    // $ANTLR start "entryRuleProvidedData"
    // InternalSmartCityDSL.g:939:1: entryRuleProvidedData returns [EObject current=null] : iv_ruleProvidedData= ruleProvidedData EOF ;
    public final EObject entryRuleProvidedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedData = null;


        try {
            // InternalSmartCityDSL.g:939:53: (iv_ruleProvidedData= ruleProvidedData EOF )
            // InternalSmartCityDSL.g:940:2: iv_ruleProvidedData= ruleProvidedData EOF
            {
             newCompositeNode(grammarAccess.getProvidedDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedData=ruleProvidedData();

            state._fsp--;

             current =iv_ruleProvidedData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProvidedData"


    // $ANTLR start "ruleProvidedData"
    // InternalSmartCityDSL.g:946:1: ruleProvidedData returns [EObject current=null] : ( () otherlv_1= 'providedData' otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleProvidedData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSmartCityDSL.g:952:2: ( ( () otherlv_1= 'providedData' otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' ) )
            // InternalSmartCityDSL.g:953:2: ( () otherlv_1= 'providedData' otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )
            {
            // InternalSmartCityDSL.g:953:2: ( () otherlv_1= 'providedData' otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}' )
            // InternalSmartCityDSL.g:954:3: () otherlv_1= 'providedData' otherlv_2= '{' ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )? otherlv_6= '}'
            {
            // InternalSmartCityDSL.g:954:3: ()
            // InternalSmartCityDSL.g:955:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedDataAccess().getProvidedDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedDataAccess().getProvidedDataKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedDataAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmartCityDSL.g:969:3: ( ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmartCityDSL.g:970:4: ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalSmartCityDSL.g:970:4: ( ( ruleEString ) )
                    // InternalSmartCityDSL.g:971:5: ( ruleEString )
                    {
                    // InternalSmartCityDSL.g:971:5: ( ruleEString )
                    // InternalSmartCityDSL.g:972:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvidedDataRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProvidedDataAccess().getProviderStakeholderCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:986:4: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:987:5: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProvidedDataAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSmartCityDSL.g:991:5: ( ( ruleEString ) )
                    	    // InternalSmartCityDSL.g:992:6: ( ruleEString )
                    	    {
                    	    // InternalSmartCityDSL.g:992:6: ( ruleEString )
                    	    // InternalSmartCityDSL.g:993:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProvidedDataRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProvidedDataAccess().getProviderStakeholderCrossReference_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProvidedDataAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProvidedData"


    // $ANTLR start "entryRuleStakeholder"
    // InternalSmartCityDSL.g:1017:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // InternalSmartCityDSL.g:1017:52: (iv_ruleStakeholder= ruleStakeholder EOF )
            // InternalSmartCityDSL.g:1018:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStakeholder"


    // $ANTLR start "ruleStakeholder"
    // InternalSmartCityDSL.g:1024:1: ruleStakeholder returns [EObject current=null] : ( () otherlv_1= 'organization' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_organization_4_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1030:2: ( ( () otherlv_1= 'organization' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )? ) )
            // InternalSmartCityDSL.g:1031:2: ( () otherlv_1= 'organization' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )? )
            {
            // InternalSmartCityDSL.g:1031:2: ( () otherlv_1= 'organization' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )? )
            // InternalSmartCityDSL.g:1032:3: () otherlv_1= 'organization' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )?
            {
            // InternalSmartCityDSL.g:1032:3: ()
            // InternalSmartCityDSL.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStakeholderAccess().getStakeholderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStakeholderAccess().getOrganizationKeyword_1());
            		
            // InternalSmartCityDSL.g:1043:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1044:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1044:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1045:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStakeholderAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStakeholderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartCityDSL.g:1062:3: (otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSmartCityDSL.g:1063:4: otherlv_3= 'organizationName' ( (lv_organization_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getOrganizationNameKeyword_3_0());
                    			
                    // InternalSmartCityDSL.g:1067:4: ( (lv_organization_4_0= ruleEString ) )
                    // InternalSmartCityDSL.g:1068:5: (lv_organization_4_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1068:5: (lv_organization_4_0= ruleEString )
                    // InternalSmartCityDSL.g:1069:6: lv_organization_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStakeholderAccess().getOrganizationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_organization_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStakeholderRule());
                    						}
                    						set(
                    							current,
                    							"organization",
                    							lv_organization_4_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleRealValue"
    // InternalSmartCityDSL.g:1091:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalSmartCityDSL.g:1091:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalSmartCityDSL.g:1092:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalSmartCityDSL.g:1098:1: ruleRealValue returns [EObject current=null] : ( () otherlv_1= 'real' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1104:2: ( ( () otherlv_1= 'real' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) )
            // InternalSmartCityDSL.g:1105:2: ( () otherlv_1= 'real' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            {
            // InternalSmartCityDSL.g:1105:2: ( () otherlv_1= 'real' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            // InternalSmartCityDSL.g:1106:3: () otherlv_1= 'real' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']'
            {
            // InternalSmartCityDSL.g:1106:3: ()
            // InternalSmartCityDSL.g:1107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealValueAccess().getRealValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRealValueAccess().getRealKeyword_1());
            		
            // InternalSmartCityDSL.g:1117:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1118:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1118:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1119:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRealValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRealValueAccess().getEqualsSignKeyword_3());
            		
            // InternalSmartCityDSL.g:1140:3: ( (lv_value_4_0= ruleEDouble ) )
            // InternalSmartCityDSL.g:1141:4: (lv_value_4_0= ruleEDouble )
            {
            // InternalSmartCityDSL.g:1141:4: (lv_value_4_0= ruleEDouble )
            // InternalSmartCityDSL.g:1142:5: lv_value_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRealValueAccess().getValueEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"smartcity.project.xtext.SmartCityDSL.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getRealValueAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSmartCityDSL.g:1163:3: ( (lv_unit_6_0= ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmartCityDSL.g:1164:4: (lv_unit_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1164:4: (lv_unit_6_0= ruleEString )
                    // InternalSmartCityDSL.g:1165:5: lv_unit_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRealValueAccess().getUnitEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_unit_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRealValueRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_6_0,
                    						"smartcity.project.xtext.SmartCityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getRealValueAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getRealValueAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalSmartCityDSL.g:1190:3: ( ( ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmartCityDSL.g:1191:4: ( ruleEString )
                    {
                    // InternalSmartCityDSL.g:1191:4: ( ruleEString )
                    // InternalSmartCityDSL.g:1192:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealValueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getRealValueAccess().getSrcSourceCrossReference_9_0());
                    				
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRealValueAccess().getRightSquareBracketKeyword_10());
            		

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalSmartCityDSL.g:1214:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalSmartCityDSL.g:1214:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSmartCityDSL.g:1215:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
             newCompositeNode(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;

             current =iv_ruleBoolValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalSmartCityDSL.g:1221:1: ruleBoolValue returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1227:2: ( ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) )
            // InternalSmartCityDSL.g:1228:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            {
            // InternalSmartCityDSL.g:1228:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            // InternalSmartCityDSL.g:1229:3: () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']'
            {
            // InternalSmartCityDSL.g:1229:3: ()
            // InternalSmartCityDSL.g:1230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolValueAccess().getBoolValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolValueAccess().getBoolKeyword_1());
            		
            // InternalSmartCityDSL.g:1240:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1241:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1241:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1242:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoolValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getBoolValueAccess().getEqualsSignKeyword_3());
            		
            // InternalSmartCityDSL.g:1263:3: ( (lv_value_4_0= ruleEBoolean ) )
            // InternalSmartCityDSL.g:1264:4: (lv_value_4_0= ruleEBoolean )
            {
            // InternalSmartCityDSL.g:1264:4: (lv_value_4_0= ruleEBoolean )
            // InternalSmartCityDSL.g:1265:5: lv_value_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBoolValueAccess().getValueEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"smartcity.project.xtext.SmartCityDSL.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getBoolValueAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSmartCityDSL.g:1286:3: ( (lv_unit_6_0= ruleEString ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmartCityDSL.g:1287:4: (lv_unit_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1287:4: (lv_unit_6_0= ruleEString )
                    // InternalSmartCityDSL.g:1288:5: lv_unit_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getBoolValueAccess().getUnitEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_unit_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBoolValueRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_6_0,
                    						"smartcity.project.xtext.SmartCityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getBoolValueAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getBoolValueAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalSmartCityDSL.g:1313:3: ( ( ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmartCityDSL.g:1314:4: ( ruleEString )
                    {
                    // InternalSmartCityDSL.g:1314:4: ( ruleEString )
                    // InternalSmartCityDSL.g:1315:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolValueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getBoolValueAccess().getSrcSourceCrossReference_9_0());
                    				
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBoolValueAccess().getRightSquareBracketKeyword_10());
            		

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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalSmartCityDSL.g:1337:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalSmartCityDSL.g:1337:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalSmartCityDSL.g:1338:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalSmartCityDSL.g:1344:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1350:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' ) )
            // InternalSmartCityDSL.g:1351:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            {
            // InternalSmartCityDSL.g:1351:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']' )
            // InternalSmartCityDSL.g:1352:3: () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= '(' ( (lv_unit_6_0= ruleEString ) )? otherlv_7= ')' otherlv_8= '[' ( ( ruleEString ) )? otherlv_10= ']'
            {
            // InternalSmartCityDSL.g:1352:3: ()
            // InternalSmartCityDSL.g:1353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerValueAccess().getIntKeyword_1());
            		
            // InternalSmartCityDSL.g:1363:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1364:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1364:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1365:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_3());
            		
            // InternalSmartCityDSL.g:1386:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalSmartCityDSL.g:1387:4: (lv_value_4_0= ruleEInt )
            {
            // InternalSmartCityDSL.g:1387:4: (lv_value_4_0= ruleEInt )
            // InternalSmartCityDSL.g:1388:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"smartcity.project.xtext.SmartCityDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegerValueAccess().getLeftParenthesisKeyword_5());
            		
            // InternalSmartCityDSL.g:1409:3: ( (lv_unit_6_0= ruleEString ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSmartCityDSL.g:1410:4: (lv_unit_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1410:4: (lv_unit_6_0= ruleEString )
                    // InternalSmartCityDSL.g:1411:5: lv_unit_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getIntegerValueAccess().getUnitEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_unit_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntegerValueRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_6_0,
                    						"smartcity.project.xtext.SmartCityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getIntegerValueAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getIntegerValueAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalSmartCityDSL.g:1436:3: ( ( ruleEString ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmartCityDSL.g:1437:4: ( ruleEString )
                    {
                    // InternalSmartCityDSL.g:1437:4: ( ruleEString )
                    // InternalSmartCityDSL.g:1438:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerValueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getIntegerValueAccess().getSrcSourceCrossReference_9_0());
                    				
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIntegerValueAccess().getRightSquareBracketKeyword_10());
            		

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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEDouble"
    // InternalSmartCityDSL.g:1460:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSmartCityDSL.g:1460:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSmartCityDSL.g:1461:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSmartCityDSL.g:1467:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSmartCityDSL.g:1473:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSmartCityDSL.g:1474:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSmartCityDSL.g:1474:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSmartCityDSL.g:1475:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSmartCityDSL.g:1475:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSmartCityDSL.g:1476:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSmartCityDSL.g:1482:3: (this_INT_1= RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSmartCityDSL.g:1483:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_34); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSmartCityDSL.g:1503:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=38 && LA33_0<=39)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSmartCityDSL.g:1504:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSmartCityDSL.g:1504:4: (kw= 'E' | kw= 'e' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==38) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==39) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSmartCityDSL.g:1505:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSmartCityDSL.g:1511:5: kw= 'e'
                            {
                            kw=(Token)match(input,39,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSmartCityDSL.g:1517:4: (kw= '-' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==36) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalSmartCityDSL.g:1518:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSmartCityDSL.g:1536:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSmartCityDSL.g:1536:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSmartCityDSL.g:1537:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSmartCityDSL.g:1543:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSmartCityDSL.g:1549:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSmartCityDSL.g:1550:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSmartCityDSL.g:1550:2: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            else if ( (LA34_0==41) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSmartCityDSL.g:1551:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartCityDSL.g:1557:3: kw= 'false'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartCityDSL.g:1566:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmartCityDSL.g:1566:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmartCityDSL.g:1567:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmartCityDSL.g:1573:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmartCityDSL.g:1579:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmartCityDSL.g:1580:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmartCityDSL.g:1580:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmartCityDSL.g:1581:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmartCityDSL.g:1581:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSmartCityDSL.g:1582:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInfrastructureComponent_Impl"
    // InternalSmartCityDSL.g:1599:1: entryRuleInfrastructureComponent_Impl returns [EObject current=null] : iv_ruleInfrastructureComponent_Impl= ruleInfrastructureComponent_Impl EOF ;
    public final EObject entryRuleInfrastructureComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureComponent_Impl = null;


        try {
            // InternalSmartCityDSL.g:1599:69: (iv_ruleInfrastructureComponent_Impl= ruleInfrastructureComponent_Impl EOF )
            // InternalSmartCityDSL.g:1600:2: iv_ruleInfrastructureComponent_Impl= ruleInfrastructureComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfrastructureComponent_Impl=ruleInfrastructureComponent_Impl();

            state._fsp--;

             current =iv_ruleInfrastructureComponent_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfrastructureComponent_Impl"


    // $ANTLR start "ruleInfrastructureComponent_Impl"
    // InternalSmartCityDSL.g:1606:1: ruleInfrastructureComponent_Impl returns [EObject current=null] : ( () otherlv_1= 'infrastructureComponent' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInfrastructureComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1612:2: ( ( () otherlv_1= 'infrastructureComponent' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmartCityDSL.g:1613:2: ( () otherlv_1= 'infrastructureComponent' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmartCityDSL.g:1613:2: ( () otherlv_1= 'infrastructureComponent' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmartCityDSL.g:1614:3: () otherlv_1= 'infrastructureComponent' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmartCityDSL.g:1614:3: ()
            // InternalSmartCityDSL.g:1615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfrastructureComponent_ImplAccess().getInfrastructureComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInfrastructureComponent_ImplAccess().getInfrastructureComponentKeyword_1());
            		
            // InternalSmartCityDSL.g:1625:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1626:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1626:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1627:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfrastructureComponent_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfrastructureComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleInfrastructureComponent_Impl"


    // $ANTLR start "entryRuleMonitoringInfrastructure"
    // InternalSmartCityDSL.g:1648:1: entryRuleMonitoringInfrastructure returns [EObject current=null] : iv_ruleMonitoringInfrastructure= ruleMonitoringInfrastructure EOF ;
    public final EObject entryRuleMonitoringInfrastructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringInfrastructure = null;


        try {
            // InternalSmartCityDSL.g:1648:65: (iv_ruleMonitoringInfrastructure= ruleMonitoringInfrastructure EOF )
            // InternalSmartCityDSL.g:1649:2: iv_ruleMonitoringInfrastructure= ruleMonitoringInfrastructure EOF
            {
             newCompositeNode(grammarAccess.getMonitoringInfrastructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringInfrastructure=ruleMonitoringInfrastructure();

            state._fsp--;

             current =iv_ruleMonitoringInfrastructure; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMonitoringInfrastructure"


    // $ANTLR start "ruleMonitoringInfrastructure"
    // InternalSmartCityDSL.g:1655:1: ruleMonitoringInfrastructure returns [EObject current=null] : ( () otherlv_1= 'monitoringInfrastructure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleMonitoringInfrastructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_devices_4_0 = null;

        EObject lv_devices_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1661:2: ( ( () otherlv_1= 'monitoringInfrastructure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )? otherlv_7= '}' ) )
            // InternalSmartCityDSL.g:1662:2: ( () otherlv_1= 'monitoringInfrastructure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )? otherlv_7= '}' )
            {
            // InternalSmartCityDSL.g:1662:2: ( () otherlv_1= 'monitoringInfrastructure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )? otherlv_7= '}' )
            // InternalSmartCityDSL.g:1663:3: () otherlv_1= 'monitoringInfrastructure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )? otherlv_7= '}'
            {
            // InternalSmartCityDSL.g:1663:3: ()
            // InternalSmartCityDSL.g:1664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringInfrastructureAccess().getMonitoringInfrastructureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitoringInfrastructureAccess().getMonitoringInfrastructureKeyword_1());
            		
            // InternalSmartCityDSL.g:1674:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartCityDSL.g:1675:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartCityDSL.g:1675:4: (lv_name_2_0= ruleEString )
            // InternalSmartCityDSL.g:1676:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitoringInfrastructureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringInfrastructureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"smartcity.project.xtext.SmartCityDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringInfrastructureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartCityDSL.g:1697:3: ( ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44||LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSmartCityDSL.g:1698:4: ( (lv_devices_4_0= ruleIoTDev ) ) (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )*
                    {
                    // InternalSmartCityDSL.g:1698:4: ( (lv_devices_4_0= ruleIoTDev ) )
                    // InternalSmartCityDSL.g:1699:5: (lv_devices_4_0= ruleIoTDev )
                    {
                    // InternalSmartCityDSL.g:1699:5: (lv_devices_4_0= ruleIoTDev )
                    // InternalSmartCityDSL.g:1700:6: lv_devices_4_0= ruleIoTDev
                    {

                    						newCompositeNode(grammarAccess.getMonitoringInfrastructureAccess().getDevicesIoTDevParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_devices_4_0=ruleIoTDev();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringInfrastructureRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_4_0,
                    							"smartcity.project.xtext.SmartCityDSL.IoTDev");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartCityDSL.g:1717:4: (otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==13) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSmartCityDSL.g:1718:5: otherlv_5= ',' ( (lv_devices_6_0= ruleIoTDev ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_36); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMonitoringInfrastructureAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmartCityDSL.g:1722:5: ( (lv_devices_6_0= ruleIoTDev ) )
                    	    // InternalSmartCityDSL.g:1723:6: (lv_devices_6_0= ruleIoTDev )
                    	    {
                    	    // InternalSmartCityDSL.g:1723:6: (lv_devices_6_0= ruleIoTDev )
                    	    // InternalSmartCityDSL.g:1724:7: lv_devices_6_0= ruleIoTDev
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonitoringInfrastructureAccess().getDevicesIoTDevParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_devices_6_0=ruleIoTDev();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonitoringInfrastructureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_6_0,
                    	    								"smartcity.project.xtext.SmartCityDSL.IoTDev");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMonitoringInfrastructureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMonitoringInfrastructure"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartCityDSL.g:1751:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartCityDSL.g:1751:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartCityDSL.g:1752:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartCityDSL.g:1758:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'sensor' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_model_2_0 = null;

        AntlrDatatypeRuleToken lv_location_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1764:2: ( ( () otherlv_1= 'sensor' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? ) )
            // InternalSmartCityDSL.g:1765:2: ( () otherlv_1= 'sensor' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? )
            {
            // InternalSmartCityDSL.g:1765:2: ( () otherlv_1= 'sensor' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? )
            // InternalSmartCityDSL.g:1766:3: () otherlv_1= 'sensor' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )?
            {
            // InternalSmartCityDSL.g:1766:3: ()
            // InternalSmartCityDSL.g:1767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalSmartCityDSL.g:1777:3: ( (lv_model_2_0= ruleEString ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSmartCityDSL.g:1778:4: (lv_model_2_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1778:4: (lv_model_2_0= ruleEString )
                    // InternalSmartCityDSL.g:1779:5: lv_model_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_model_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSensorRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_2_0,
                    						"smartcity.project.xtext.SmartCityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmartCityDSL.g:1796:3: (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSmartCityDSL.g:1797:4: otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLocationKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getEqualsSignKeyword_3_2());
                    			
                    // InternalSmartCityDSL.g:1809:4: ( (lv_location_6_0= ruleEString ) )
                    // InternalSmartCityDSL.g:1810:5: (lv_location_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1810:5: (lv_location_6_0= ruleEString )
                    // InternalSmartCityDSL.g:1811:6: lv_location_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getLocationEStringParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_location_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_6_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getRightSquareBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalSmartCityDSL.g:1837:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalSmartCityDSL.g:1837:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalSmartCityDSL.g:1838:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalSmartCityDSL.g:1844:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'actuator' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_model_2_0 = null;

        AntlrDatatypeRuleToken lv_location_6_0 = null;



        	enterRule();

        try {
            // InternalSmartCityDSL.g:1850:2: ( ( () otherlv_1= 'actuator' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? ) )
            // InternalSmartCityDSL.g:1851:2: ( () otherlv_1= 'actuator' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? )
            {
            // InternalSmartCityDSL.g:1851:2: ( () otherlv_1= 'actuator' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )? )
            // InternalSmartCityDSL.g:1852:3: () otherlv_1= 'actuator' ( (lv_model_2_0= ruleEString ) )? (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )?
            {
            // InternalSmartCityDSL.g:1852:3: ()
            // InternalSmartCityDSL.g:1853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		
            // InternalSmartCityDSL.g:1863:3: ( (lv_model_2_0= ruleEString ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSmartCityDSL.g:1864:4: (lv_model_2_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1864:4: (lv_model_2_0= ruleEString )
                    // InternalSmartCityDSL.g:1865:5: lv_model_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_model_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActuatorRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_2_0,
                    						"smartcity.project.xtext.SmartCityDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmartCityDSL.g:1882:3: (otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSmartCityDSL.g:1883:4: otherlv_3= '[' otherlv_4= 'location' otherlv_5= '=' ( (lv_location_6_0= ruleEString ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,45,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getLocationKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getEqualsSignKeyword_3_2());
                    			
                    // InternalSmartCityDSL.g:1895:4: ( (lv_location_6_0= ruleEString ) )
                    // InternalSmartCityDSL.g:1896:5: (lv_location_6_0= ruleEString )
                    {
                    // InternalSmartCityDSL.g:1896:5: (lv_location_6_0= ruleEString )
                    // InternalSmartCityDSL.g:1897:6: lv_location_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getLocationEStringParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_location_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_6_0,
                    							"smartcity.project.xtext.SmartCityDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getActuatorAccess().getRightSquareBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleActuator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001C200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C40004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000500000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});

}