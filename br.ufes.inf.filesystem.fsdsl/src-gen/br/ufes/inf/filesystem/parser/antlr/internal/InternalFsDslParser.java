package br.ufes.inf.filesystem.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.filesystem.services.FsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'>'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalFsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g"; }



     	private FsDslGrammarAccess grammarAccess;
     	
        public InternalFsDslParser(TokenStream input, FsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Filesystem";	
       	}
       	
       	@Override
       	protected FsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFilesystem"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:67:1: entryRuleFilesystem returns [EObject current=null] : iv_ruleFilesystem= ruleFilesystem EOF ;
    public final EObject entryRuleFilesystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilesystem = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:68:2: (iv_ruleFilesystem= ruleFilesystem EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:69:2: iv_ruleFilesystem= ruleFilesystem EOF
            {
             newCompositeNode(grammarAccess.getFilesystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilesystem_in_entryRuleFilesystem75);
            iv_ruleFilesystem=ruleFilesystem();

            state._fsp--;

             current =iv_ruleFilesystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilesystem85); 

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
    // $ANTLR end "entryRuleFilesystem"


    // $ANTLR start "ruleFilesystem"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:76:1: ruleFilesystem returns [EObject current=null] : ( () ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )? ) ;
    public final EObject ruleFilesystem() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_1_0 = null;

        EObject lv_nodes_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:79:28: ( ( () ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )? ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:80:1: ( () ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )? )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:80:1: ( () ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )? )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:80:2: () ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )?
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:80:2: ()
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFilesystemAccess().getFilesystemAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:86:2: ( ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:86:3: ( (lv_nodes_1_0= ruleNode ) ) ( (lv_nodes_2_0= ruleNode ) )*
                    {
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:86:3: ( (lv_nodes_1_0= ruleNode ) )
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:87:1: (lv_nodes_1_0= ruleNode )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:87:1: (lv_nodes_1_0= ruleNode )
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:88:3: lv_nodes_1_0= ruleNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleFilesystem141);
                    lv_nodes_1_0=ruleNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilesystemRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_1_0, 
                            		"Node");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:104:2: ( (lv_nodes_2_0= ruleNode ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:105:1: (lv_nodes_2_0= ruleNode )
                    	    {
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:105:1: (lv_nodes_2_0= ruleNode )
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:106:3: lv_nodes_2_0= ruleNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleFilesystem162);
                    	    lv_nodes_2_0=ruleNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFilesystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_2_0, 
                    	            		"Node");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleFilesystem"


    // $ANTLR start "entryRuleNode"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:130:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:131:2: (iv_ruleNode= ruleNode EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:132:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode201);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode211); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:139:1: ruleNode returns [EObject current=null] : (this_Folder_0= ruleFolder | this_File_1= ruleFile | this_Link_2= ruleLink ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Folder_0 = null;

        EObject this_File_1 = null;

        EObject this_Link_2 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:142:28: ( (this_Folder_0= ruleFolder | this_File_1= ruleFile | this_Link_2= ruleLink ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:143:1: (this_Folder_0= ruleFolder | this_File_1= ruleFile | this_Link_2= ruleLink )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:143:1: (this_Folder_0= ruleFolder | this_File_1= ruleFile | this_Link_2= ruleLink )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                    {
                    alt3=2;
                    }
                    break;
                case 11:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt3=3;
                    }
                    break;
                case 11:
                    {
                    alt3=1;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:144:5: this_Folder_0= ruleFolder
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getFolderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFolder_in_ruleNode258);
                    this_Folder_0=ruleFolder();

                    state._fsp--;

                     
                            current = this_Folder_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:154:5: this_File_1= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getFileParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFile_in_ruleNode285);
                    this_File_1=ruleFile();

                    state._fsp--;

                     
                            current = this_File_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:164:5: this_Link_2= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getLinkParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleNode312);
                    this_Link_2=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_2; 
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEString"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:181:2: (iv_ruleEString= ruleEString EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:182:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString348);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString359); 

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
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:189:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:192:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:193:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:193:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:193:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString399); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:201:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString425); 

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


    // $ANTLR start "entryRuleFolder"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:216:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:217:2: (iv_ruleFolder= ruleFolder EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:218:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFolder_in_entryRuleFolder470);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolder480); 

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
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:225:1: ruleFolder returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_nodes_3_0 = null;

        EObject lv_nodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:228:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )? otherlv_5= '}' ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:229:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )? otherlv_5= '}' )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:229:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )? otherlv_5= '}' )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:229:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )? otherlv_5= '}'
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:229:2: ()
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:230:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFolderAccess().getFolderAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:235:2: ( (lv_name_1_0= ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:236:1: (lv_name_1_0= ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:236:1: (lv_name_1_0= ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:237:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFolder535);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFolderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFolder547); 

                	newLeafNode(otherlv_2, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:257:1: ( ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:257:2: ( (lv_nodes_3_0= ruleNode ) ) ( (lv_nodes_4_0= ruleNode ) )*
                    {
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:257:2: ( (lv_nodes_3_0= ruleNode ) )
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:258:1: (lv_nodes_3_0= ruleNode )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:258:1: (lv_nodes_3_0= ruleNode )
                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:259:3: lv_nodes_3_0= ruleNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleFolder569);
                    lv_nodes_3_0=ruleNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_3_0, 
                            		"Node");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:275:2: ( (lv_nodes_4_0= ruleNode ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:276:1: (lv_nodes_4_0= ruleNode )
                    	    {
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:276:1: (lv_nodes_4_0= ruleNode )
                    	    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:277:3: lv_nodes_4_0= ruleNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleFolder590);
                    	    lv_nodes_4_0=ruleNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_4_0, 
                    	            		"Node");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFolder605); 

                	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleFile"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:305:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:306:2: (iv_ruleFile= ruleFile EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:307:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFile_in_entryRuleFile641);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFile651); 

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:314:1: ruleFile returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:317:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:318:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:318:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:318:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:318:2: ()
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:319:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFileAccess().getFileAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:324:2: ( (lv_name_1_0= ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:325:1: (lv_name_1_0= ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:325:1: (lv_name_1_0= ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:326:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFile706);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleLink"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:350:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:351:2: (iv_ruleLink= ruleLink EOF )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:352:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink742);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink752); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:359:1: ruleLink returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '>' ( ( ruleEString ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:362:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '>' ( ( ruleEString ) ) ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:363:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '>' ( ( ruleEString ) ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:363:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '>' ( ( ruleEString ) ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:363:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '>' ( ( ruleEString ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:363:2: ( (lv_name_0_0= ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:364:1: (lv_name_0_0= ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:364:1: (lv_name_0_0= ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:365:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLink798);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLink810); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getGreaterThanSignKeyword_1());
                
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:385:1: ( ( ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:386:1: ( ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:386:1: ( ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl/src-gen/br/ufes/inf/filesystem/parser/antlr/internal/InternalFsDsl.g:387:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getNodeNodeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLink833);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleLink"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFilesystem_in_entryRuleFilesystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilesystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_ruleFilesystem141 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleNode_in_ruleFilesystem162 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_ruleNode258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFile_in_ruleNode285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_ruleNode312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFolder535 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleFolder547 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_ruleNode_in_ruleFolder569 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_ruleNode_in_ruleFolder590 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_12_in_ruleFolder605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFile_in_entryRuleFile641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFile651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFile706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLink798 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleLink810 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLink833 = new BitSet(new long[]{0x0000000000000002L});
    }


}