/*
* generated by Xtext
*/
package br.ufes.inf.filesystem.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import br.ufes.inf.filesystem.services.FsDslGrammarAccess;

public class FsDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FsDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected br.ufes.inf.filesystem.parser.antlr.internal.InternalFsDslParser createParser(XtextTokenStream stream) {
		return new br.ufes.inf.filesystem.parser.antlr.internal.InternalFsDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Filesystem";
	}
	
	public FsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
