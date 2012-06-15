package br.ufes.inf.filesystem.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.ufes.inf.filesystem.services.FsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFsDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g"; }


     
     	private FsDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FsDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFilesystem"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:60:1: entryRuleFilesystem : ruleFilesystem EOF ;
    public final void entryRuleFilesystem() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:61:1: ( ruleFilesystem EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:62:1: ruleFilesystem EOF
            {
             before(grammarAccess.getFilesystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilesystem_in_entryRuleFilesystem61);
            ruleFilesystem();

            state._fsp--;

             after(grammarAccess.getFilesystemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilesystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilesystem"


    // $ANTLR start "ruleFilesystem"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:69:1: ruleFilesystem : ( ( rule__Filesystem__Group__0 ) ) ;
    public final void ruleFilesystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:73:2: ( ( ( rule__Filesystem__Group__0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:74:1: ( ( rule__Filesystem__Group__0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:74:1: ( ( rule__Filesystem__Group__0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:75:1: ( rule__Filesystem__Group__0 )
            {
             before(grammarAccess.getFilesystemAccess().getGroup()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:76:1: ( rule__Filesystem__Group__0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:76:2: rule__Filesystem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group__0_in_ruleFilesystem94);
            rule__Filesystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilesystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilesystem"


    // $ANTLR start "entryRuleNode"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:89:1: ( ruleNode EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:90:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode121);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:97:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:101:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:102:1: ( ( rule__Node__Alternatives ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:102:1: ( ( rule__Node__Alternatives ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:103:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:104:1: ( rule__Node__Alternatives )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:104:2: rule__Node__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Alternatives_in_ruleNode154);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEString"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:117:1: ( ruleEString EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:132:1: ( rule__EString__Alternatives )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFolder"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:144:1: entryRuleFolder : ruleFolder EOF ;
    public final void entryRuleFolder() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:145:1: ( ruleFolder EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:146:1: ruleFolder EOF
            {
             before(grammarAccess.getFolderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFolder_in_entryRuleFolder241);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getFolderRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolder248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:153:1: ruleFolder : ( ( rule__Folder__Group__0 ) ) ;
    public final void ruleFolder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:157:2: ( ( ( rule__Folder__Group__0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:158:1: ( ( rule__Folder__Group__0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:158:1: ( ( rule__Folder__Group__0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:159:1: ( rule__Folder__Group__0 )
            {
             before(grammarAccess.getFolderAccess().getGroup()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:160:1: ( rule__Folder__Group__0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:160:2: rule__Folder__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__0_in_ruleFolder274);
            rule__Folder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleFile"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:172:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:173:1: ( ruleFile EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:174:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFile_in_entryRuleFile301);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFile308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:181:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:185:2: ( ( ( rule__File__Group__0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:186:1: ( ( rule__File__Group__0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:186:1: ( ( rule__File__Group__0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:187:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:188:1: ( rule__File__Group__0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:188:2: rule__File__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__File__Group__0_in_ruleFile334);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleLink"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:200:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:201:1: ( ruleLink EOF )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:202:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink361);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:209:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:213:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:214:1: ( ( rule__Link__Group__0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:214:1: ( ( rule__Link__Group__0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:215:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:216:1: ( rule__Link__Group__0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:216:2: rule__Link__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0_in_ruleLink394);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "rule__Node__Alternatives"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:228:1: rule__Node__Alternatives : ( ( ruleFolder ) | ( ruleFile ) | ( ruleLink ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:232:1: ( ( ruleFolder ) | ( ruleFile ) | ( ruleLink ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt1=3;
                    }
                    break;
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA1_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                case 13:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:233:1: ( ruleFolder )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:233:1: ( ruleFolder )
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:234:1: ruleFolder
                    {
                     before(grammarAccess.getNodeAccess().getFolderParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFolder_in_rule__Node__Alternatives430);
                    ruleFolder();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getFolderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:239:6: ( ruleFile )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:239:6: ( ruleFile )
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:240:1: ruleFile
                    {
                     before(grammarAccess.getNodeAccess().getFileParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFile_in_rule__Node__Alternatives447);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getFileParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:245:6: ( ruleLink )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:245:6: ( ruleLink )
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:246:1: ruleLink
                    {
                     before(grammarAccess.getNodeAccess().getLinkParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__Node__Alternatives464);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getLinkParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:256:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:260:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:261:1: ( RULE_STRING )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:261:1: ( RULE_STRING )
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:262:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives496); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:267:6: ( RULE_ID )
                    {
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:267:6: ( RULE_ID )
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:268:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives513); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Filesystem__Group__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:280:1: rule__Filesystem__Group__0 : rule__Filesystem__Group__0__Impl rule__Filesystem__Group__1 ;
    public final void rule__Filesystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:284:1: ( rule__Filesystem__Group__0__Impl rule__Filesystem__Group__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:285:2: rule__Filesystem__Group__0__Impl rule__Filesystem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group__0__Impl_in_rule__Filesystem__Group__0543);
            rule__Filesystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group__1_in_rule__Filesystem__Group__0546);
            rule__Filesystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group__0"


    // $ANTLR start "rule__Filesystem__Group__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:292:1: rule__Filesystem__Group__0__Impl : ( () ) ;
    public final void rule__Filesystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:296:1: ( ( () ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:297:1: ( () )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:297:1: ( () )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:298:1: ()
            {
             before(grammarAccess.getFilesystemAccess().getFilesystemAction_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:299:1: ()
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:301:1: 
            {
            }

             after(grammarAccess.getFilesystemAccess().getFilesystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group__0__Impl"


    // $ANTLR start "rule__Filesystem__Group__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:311:1: rule__Filesystem__Group__1 : rule__Filesystem__Group__1__Impl ;
    public final void rule__Filesystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:315:1: ( rule__Filesystem__Group__1__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:316:2: rule__Filesystem__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group__1__Impl_in_rule__Filesystem__Group__1604);
            rule__Filesystem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group__1"


    // $ANTLR start "rule__Filesystem__Group__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:322:1: rule__Filesystem__Group__1__Impl : ( ( rule__Filesystem__Group_1__0 )? ) ;
    public final void rule__Filesystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:326:1: ( ( ( rule__Filesystem__Group_1__0 )? ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:327:1: ( ( rule__Filesystem__Group_1__0 )? )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:327:1: ( ( rule__Filesystem__Group_1__0 )? )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:328:1: ( rule__Filesystem__Group_1__0 )?
            {
             before(grammarAccess.getFilesystemAccess().getGroup_1()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:329:1: ( rule__Filesystem__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:329:2: rule__Filesystem__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group_1__0_in_rule__Filesystem__Group__1__Impl631);
                    rule__Filesystem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilesystemAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group__1__Impl"


    // $ANTLR start "rule__Filesystem__Group_1__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:343:1: rule__Filesystem__Group_1__0 : rule__Filesystem__Group_1__0__Impl rule__Filesystem__Group_1__1 ;
    public final void rule__Filesystem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:347:1: ( rule__Filesystem__Group_1__0__Impl rule__Filesystem__Group_1__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:348:2: rule__Filesystem__Group_1__0__Impl rule__Filesystem__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group_1__0__Impl_in_rule__Filesystem__Group_1__0666);
            rule__Filesystem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group_1__1_in_rule__Filesystem__Group_1__0669);
            rule__Filesystem__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group_1__0"


    // $ANTLR start "rule__Filesystem__Group_1__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:355:1: rule__Filesystem__Group_1__0__Impl : ( ( rule__Filesystem__NodesAssignment_1_0 ) ) ;
    public final void rule__Filesystem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:359:1: ( ( ( rule__Filesystem__NodesAssignment_1_0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:360:1: ( ( rule__Filesystem__NodesAssignment_1_0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:360:1: ( ( rule__Filesystem__NodesAssignment_1_0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:361:1: ( rule__Filesystem__NodesAssignment_1_0 )
            {
             before(grammarAccess.getFilesystemAccess().getNodesAssignment_1_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:362:1: ( rule__Filesystem__NodesAssignment_1_0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:362:2: rule__Filesystem__NodesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__NodesAssignment_1_0_in_rule__Filesystem__Group_1__0__Impl696);
            rule__Filesystem__NodesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFilesystemAccess().getNodesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group_1__0__Impl"


    // $ANTLR start "rule__Filesystem__Group_1__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:372:1: rule__Filesystem__Group_1__1 : rule__Filesystem__Group_1__1__Impl ;
    public final void rule__Filesystem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:376:1: ( rule__Filesystem__Group_1__1__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:377:2: rule__Filesystem__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Filesystem__Group_1__1__Impl_in_rule__Filesystem__Group_1__1726);
            rule__Filesystem__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group_1__1"


    // $ANTLR start "rule__Filesystem__Group_1__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:383:1: rule__Filesystem__Group_1__1__Impl : ( ( rule__Filesystem__NodesAssignment_1_1 )* ) ;
    public final void rule__Filesystem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:387:1: ( ( ( rule__Filesystem__NodesAssignment_1_1 )* ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:388:1: ( ( rule__Filesystem__NodesAssignment_1_1 )* )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:388:1: ( ( rule__Filesystem__NodesAssignment_1_1 )* )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:389:1: ( rule__Filesystem__NodesAssignment_1_1 )*
            {
             before(grammarAccess.getFilesystemAccess().getNodesAssignment_1_1()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:390:1: ( rule__Filesystem__NodesAssignment_1_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:390:2: rule__Filesystem__NodesAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Filesystem__NodesAssignment_1_1_in_rule__Filesystem__Group_1__1__Impl753);
            	    rule__Filesystem__NodesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFilesystemAccess().getNodesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__Group_1__1__Impl"


    // $ANTLR start "rule__Folder__Group__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:404:1: rule__Folder__Group__0 : rule__Folder__Group__0__Impl rule__Folder__Group__1 ;
    public final void rule__Folder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:408:1: ( rule__Folder__Group__0__Impl rule__Folder__Group__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:409:2: rule__Folder__Group__0__Impl rule__Folder__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__0__Impl_in_rule__Folder__Group__0788);
            rule__Folder__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__1_in_rule__Folder__Group__0791);
            rule__Folder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0"


    // $ANTLR start "rule__Folder__Group__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:416:1: rule__Folder__Group__0__Impl : ( () ) ;
    public final void rule__Folder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:420:1: ( ( () ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:421:1: ( () )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:421:1: ( () )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:422:1: ()
            {
             before(grammarAccess.getFolderAccess().getFolderAction_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:423:1: ()
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:425:1: 
            {
            }

             after(grammarAccess.getFolderAccess().getFolderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0__Impl"


    // $ANTLR start "rule__Folder__Group__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:435:1: rule__Folder__Group__1 : rule__Folder__Group__1__Impl rule__Folder__Group__2 ;
    public final void rule__Folder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:439:1: ( rule__Folder__Group__1__Impl rule__Folder__Group__2 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:440:2: rule__Folder__Group__1__Impl rule__Folder__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__1__Impl_in_rule__Folder__Group__1849);
            rule__Folder__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__2_in_rule__Folder__Group__1852);
            rule__Folder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1"


    // $ANTLR start "rule__Folder__Group__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:447:1: rule__Folder__Group__1__Impl : ( ( rule__Folder__NameAssignment_1 ) ) ;
    public final void rule__Folder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:451:1: ( ( ( rule__Folder__NameAssignment_1 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:452:1: ( ( rule__Folder__NameAssignment_1 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:452:1: ( ( rule__Folder__NameAssignment_1 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:453:1: ( rule__Folder__NameAssignment_1 )
            {
             before(grammarAccess.getFolderAccess().getNameAssignment_1()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:454:1: ( rule__Folder__NameAssignment_1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:454:2: rule__Folder__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__NameAssignment_1_in_rule__Folder__Group__1__Impl879);
            rule__Folder__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1__Impl"


    // $ANTLR start "rule__Folder__Group__2"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:464:1: rule__Folder__Group__2 : rule__Folder__Group__2__Impl rule__Folder__Group__3 ;
    public final void rule__Folder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:468:1: ( rule__Folder__Group__2__Impl rule__Folder__Group__3 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:469:2: rule__Folder__Group__2__Impl rule__Folder__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__2__Impl_in_rule__Folder__Group__2909);
            rule__Folder__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__3_in_rule__Folder__Group__2912);
            rule__Folder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2"


    // $ANTLR start "rule__Folder__Group__2__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:476:1: rule__Folder__Group__2__Impl : ( '{' ) ;
    public final void rule__Folder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:480:1: ( ( '{' ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:481:1: ( '{' )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:481:1: ( '{' )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:482:1: '{'
            {
             before(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Folder__Group__2__Impl940); 
             after(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2__Impl"


    // $ANTLR start "rule__Folder__Group__3"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:495:1: rule__Folder__Group__3 : rule__Folder__Group__3__Impl rule__Folder__Group__4 ;
    public final void rule__Folder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:499:1: ( rule__Folder__Group__3__Impl rule__Folder__Group__4 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:500:2: rule__Folder__Group__3__Impl rule__Folder__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__3__Impl_in_rule__Folder__Group__3971);
            rule__Folder__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__4_in_rule__Folder__Group__3974);
            rule__Folder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3"


    // $ANTLR start "rule__Folder__Group__3__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:507:1: rule__Folder__Group__3__Impl : ( ( rule__Folder__Group_3__0 )? ) ;
    public final void rule__Folder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:511:1: ( ( ( rule__Folder__Group_3__0 )? ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:512:1: ( ( rule__Folder__Group_3__0 )? )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:512:1: ( ( rule__Folder__Group_3__0 )? )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:513:1: ( rule__Folder__Group_3__0 )?
            {
             before(grammarAccess.getFolderAccess().getGroup_3()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:514:1: ( rule__Folder__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:514:2: rule__Folder__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Folder__Group_3__0_in_rule__Folder__Group__3__Impl1001);
                    rule__Folder__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFolderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3__Impl"


    // $ANTLR start "rule__Folder__Group__4"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:524:1: rule__Folder__Group__4 : rule__Folder__Group__4__Impl ;
    public final void rule__Folder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:528:1: ( rule__Folder__Group__4__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:529:2: rule__Folder__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group__4__Impl_in_rule__Folder__Group__41032);
            rule__Folder__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4"


    // $ANTLR start "rule__Folder__Group__4__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:535:1: rule__Folder__Group__4__Impl : ( '}' ) ;
    public final void rule__Folder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:539:1: ( ( '}' ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:540:1: ( '}' )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:540:1: ( '}' )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:541:1: '}'
            {
             before(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Folder__Group__4__Impl1060); 
             after(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4__Impl"


    // $ANTLR start "rule__Folder__Group_3__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:564:1: rule__Folder__Group_3__0 : rule__Folder__Group_3__0__Impl rule__Folder__Group_3__1 ;
    public final void rule__Folder__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:568:1: ( rule__Folder__Group_3__0__Impl rule__Folder__Group_3__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:569:2: rule__Folder__Group_3__0__Impl rule__Folder__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group_3__0__Impl_in_rule__Folder__Group_3__01101);
            rule__Folder__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group_3__1_in_rule__Folder__Group_3__01104);
            rule__Folder__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_3__0"


    // $ANTLR start "rule__Folder__Group_3__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:576:1: rule__Folder__Group_3__0__Impl : ( ( rule__Folder__NodesAssignment_3_0 ) ) ;
    public final void rule__Folder__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:580:1: ( ( ( rule__Folder__NodesAssignment_3_0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:581:1: ( ( rule__Folder__NodesAssignment_3_0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:581:1: ( ( rule__Folder__NodesAssignment_3_0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:582:1: ( rule__Folder__NodesAssignment_3_0 )
            {
             before(grammarAccess.getFolderAccess().getNodesAssignment_3_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:583:1: ( rule__Folder__NodesAssignment_3_0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:583:2: rule__Folder__NodesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__NodesAssignment_3_0_in_rule__Folder__Group_3__0__Impl1131);
            rule__Folder__NodesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getNodesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_3__0__Impl"


    // $ANTLR start "rule__Folder__Group_3__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:593:1: rule__Folder__Group_3__1 : rule__Folder__Group_3__1__Impl ;
    public final void rule__Folder__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:597:1: ( rule__Folder__Group_3__1__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:598:2: rule__Folder__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Folder__Group_3__1__Impl_in_rule__Folder__Group_3__11161);
            rule__Folder__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_3__1"


    // $ANTLR start "rule__Folder__Group_3__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:604:1: rule__Folder__Group_3__1__Impl : ( ( rule__Folder__NodesAssignment_3_1 )* ) ;
    public final void rule__Folder__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:608:1: ( ( ( rule__Folder__NodesAssignment_3_1 )* ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:609:1: ( ( rule__Folder__NodesAssignment_3_1 )* )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:609:1: ( ( rule__Folder__NodesAssignment_3_1 )* )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:610:1: ( rule__Folder__NodesAssignment_3_1 )*
            {
             before(grammarAccess.getFolderAccess().getNodesAssignment_3_1()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:611:1: ( rule__Folder__NodesAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:611:2: rule__Folder__NodesAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Folder__NodesAssignment_3_1_in_rule__Folder__Group_3__1__Impl1188);
            	    rule__Folder__NodesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFolderAccess().getNodesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_3__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:625:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:629:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:630:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__01223);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__File__Group__1_in_rule__File__Group__01226);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:637:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:641:1: ( ( () ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:642:1: ( () )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:642:1: ( () )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:643:1: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:644:1: ()
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:646:1: 
            {
            }

             after(grammarAccess.getFileAccess().getFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:656:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:660:1: ( rule__File__Group__1__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:661:2: rule__File__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__11284);
            rule__File__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:667:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:671:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:672:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:672:1: ( ( rule__File__NameAssignment_1 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:673:1: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:674:1: ( rule__File__NameAssignment_1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:674:2: rule__File__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl1311);
            rule__File__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:688:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:692:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:693:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01345);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01348);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:700:1: rule__Link__Group__0__Impl : ( ( rule__Link__NameAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:704:1: ( ( ( rule__Link__NameAssignment_0 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:705:1: ( ( rule__Link__NameAssignment_0 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:705:1: ( ( rule__Link__NameAssignment_0 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:706:1: ( rule__Link__NameAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:707:1: ( rule__Link__NameAssignment_0 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:707:2: rule__Link__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__NameAssignment_0_in_rule__Link__Group__0__Impl1375);
            rule__Link__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:717:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:721:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:722:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11405);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11408);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:729:1: rule__Link__Group__1__Impl : ( '>' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:733:1: ( ( '>' ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:734:1: ( '>' )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:734:1: ( '>' )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:735:1: '>'
            {
             before(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Link__Group__1__Impl1436); 
             after(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:748:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:752:1: ( rule__Link__Group__2__Impl )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:753:2: rule__Link__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21467);
            rule__Link__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:759:1: rule__Link__Group__2__Impl : ( ( rule__Link__NodeAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:763:1: ( ( ( rule__Link__NodeAssignment_2 ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:764:1: ( ( rule__Link__NodeAssignment_2 ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:764:1: ( ( rule__Link__NodeAssignment_2 ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:765:1: ( rule__Link__NodeAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNodeAssignment_2()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:766:1: ( rule__Link__NodeAssignment_2 )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:766:2: rule__Link__NodeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__NodeAssignment_2_in_rule__Link__Group__2__Impl1494);
            rule__Link__NodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Filesystem__NodesAssignment_1_0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:783:1: rule__Filesystem__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__Filesystem__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:787:1: ( ( ruleNode ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:788:1: ( ruleNode )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:788:1: ( ruleNode )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:789:1: ruleNode
            {
             before(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Filesystem__NodesAssignment_1_01535);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__NodesAssignment_1_0"


    // $ANTLR start "rule__Filesystem__NodesAssignment_1_1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:798:1: rule__Filesystem__NodesAssignment_1_1 : ( ruleNode ) ;
    public final void rule__Filesystem__NodesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:802:1: ( ( ruleNode ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:803:1: ( ruleNode )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:803:1: ( ruleNode )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:804:1: ruleNode
            {
             before(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Filesystem__NodesAssignment_1_11566);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filesystem__NodesAssignment_1_1"


    // $ANTLR start "rule__Folder__NameAssignment_1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:813:1: rule__Folder__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Folder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:817:1: ( ( ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:818:1: ( ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:818:1: ( ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:819:1: ruleEString
            {
             before(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Folder__NameAssignment_11597);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__NameAssignment_1"


    // $ANTLR start "rule__Folder__NodesAssignment_3_0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:828:1: rule__Folder__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__Folder__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:832:1: ( ( ruleNode ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:833:1: ( ruleNode )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:833:1: ( ruleNode )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:834:1: ruleNode
            {
             before(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Folder__NodesAssignment_3_01628);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__NodesAssignment_3_0"


    // $ANTLR start "rule__Folder__NodesAssignment_3_1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:843:1: rule__Folder__NodesAssignment_3_1 : ( ruleNode ) ;
    public final void rule__Folder__NodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:847:1: ( ( ruleNode ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:848:1: ( ruleNode )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:848:1: ( ruleNode )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:849:1: ruleNode
            {
             before(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Folder__NodesAssignment_3_11659);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__NodesAssignment_3_1"


    // $ANTLR start "rule__File__NameAssignment_1"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:858:1: rule__File__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:862:1: ( ( ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:863:1: ( ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:863:1: ( ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:864:1: ruleEString
            {
             before(grammarAccess.getFileAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__File__NameAssignment_11690);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__NameAssignment_1"


    // $ANTLR start "rule__Link__NameAssignment_0"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:873:1: rule__Link__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:877:1: ( ( ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:878:1: ( ruleEString )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:878:1: ( ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:879:1: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Link__NameAssignment_01721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_0"


    // $ANTLR start "rule__Link__NodeAssignment_2"
    // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:888:1: rule__Link__NodeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Link__NodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:892:1: ( ( ( ruleEString ) ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:893:1: ( ( ruleEString ) )
            {
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:893:1: ( ( ruleEString ) )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:894:1: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getNodeNodeCrossReference_2_0()); 
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:895:1: ( ruleEString )
            // ../br.ufes.inf.filesystem.fsdsl.ui/src-gen/br/ufes/inf/filesystem/ui/contentassist/antlr/internal/InternalFsDsl.g:896:1: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNodeNodeEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Link__NodeAssignment_21756);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNodeNodeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getNodeNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NodeAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFilesystem_in_entryRuleFilesystem61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilesystem68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group__0_in_ruleFilesystem94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group__0_in_ruleFolder274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFile_in_entryRuleFile301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFile308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_rule__Node__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFile_in_rule__Node__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__Node__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group__0__Impl_in_rule__Filesystem__Group__0543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Filesystem__Group__1_in_rule__Filesystem__Group__0546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group__1__Impl_in_rule__Filesystem__Group__1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group_1__0_in_rule__Filesystem__Group__1__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group_1__0__Impl_in_rule__Filesystem__Group_1__0666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Filesystem__Group_1__1_in_rule__Filesystem__Group_1__0669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__NodesAssignment_1_0_in_rule__Filesystem__Group_1__0__Impl696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__Group_1__1__Impl_in_rule__Filesystem__Group_1__1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Filesystem__NodesAssignment_1_1_in_rule__Filesystem__Group_1__1__Impl753 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Folder__Group__0__Impl_in_rule__Folder__Group__0788 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Folder__Group__1_in_rule__Folder__Group__0791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group__1__Impl_in_rule__Folder__Group__1849 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Folder__Group__2_in_rule__Folder__Group__1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__NameAssignment_1_in_rule__Folder__Group__1__Impl879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group__2__Impl_in_rule__Folder__Group__2909 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_rule__Folder__Group__3_in_rule__Folder__Group__2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Folder__Group__2__Impl940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group__3__Impl_in_rule__Folder__Group__3971 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_rule__Folder__Group__4_in_rule__Folder__Group__3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group_3__0_in_rule__Folder__Group__3__Impl1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group__4__Impl_in_rule__Folder__Group__41032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Folder__Group__4__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group_3__0__Impl_in_rule__Folder__Group_3__01101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Folder__Group_3__1_in_rule__Folder__Group_3__01104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__NodesAssignment_3_0_in_rule__Folder__Group_3__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__Group_3__1__Impl_in_rule__Folder__Group_3__11161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Folder__NodesAssignment_3_1_in_rule__Folder__Group_3__1__Impl1188 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__01223 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__01226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__11284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01345 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__NameAssignment_0_in_rule__Link__Group__0__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11405 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Link__Group__1__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__NodeAssignment_2_in_rule__Link__Group__2__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Filesystem__NodesAssignment_1_01535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Filesystem__NodesAssignment_1_11566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Folder__NameAssignment_11597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Folder__NodesAssignment_3_01628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Folder__NodesAssignment_3_11659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__File__NameAssignment_11690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Link__NameAssignment_01721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Link__NodeAssignment_21756 = new BitSet(new long[]{0x0000000000000002L});
    }


}