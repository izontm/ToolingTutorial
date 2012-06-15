/*
* generated by Xtext
*/
grammar InternalFsDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package br.ufes.inf.filesystem.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleFilesystem
entryRuleFilesystem 
:
{ before(grammarAccess.getFilesystemRule()); }
	 ruleFilesystem
{ after(grammarAccess.getFilesystemRule()); } 
	 EOF 
;

// Rule Filesystem
ruleFilesystem
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFilesystemAccess().getGroup()); }
(rule__Filesystem__Group__0)
{ after(grammarAccess.getFilesystemAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getAlternatives()); }
(rule__Node__Alternatives)
{ after(grammarAccess.getNodeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFolder
entryRuleFolder 
:
{ before(grammarAccess.getFolderRule()); }
	 ruleFolder
{ after(grammarAccess.getFolderRule()); } 
	 EOF 
;

// Rule Folder
ruleFolder
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFolderAccess().getGroup()); }
(rule__Folder__Group__0)
{ after(grammarAccess.getFolderAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFile
entryRuleFile 
:
{ before(grammarAccess.getFileRule()); }
	 ruleFile
{ after(grammarAccess.getFileRule()); } 
	 EOF 
;

// Rule File
ruleFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFileAccess().getGroup()); }
(rule__File__Group__0)
{ after(grammarAccess.getFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLink
entryRuleLink 
:
{ before(grammarAccess.getLinkRule()); }
	 ruleLink
{ after(grammarAccess.getLinkRule()); } 
	 EOF 
;

// Rule Link
ruleLink
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLinkAccess().getGroup()); }
(rule__Link__Group__0)
{ after(grammarAccess.getLinkAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Node__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getFolderParserRuleCall_0()); }
	ruleFolder
{ after(grammarAccess.getNodeAccess().getFolderParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getNodeAccess().getFileParserRuleCall_1()); }
	ruleFile
{ after(grammarAccess.getNodeAccess().getFileParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getNodeAccess().getLinkParserRuleCall_2()); }
	ruleLink
{ after(grammarAccess.getNodeAccess().getLinkParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Filesystem__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Filesystem__Group__0__Impl
	rule__Filesystem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Filesystem__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getFilesystemAction_0()); }
(

)
{ after(grammarAccess.getFilesystemAccess().getFilesystemAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Filesystem__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Filesystem__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Filesystem__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getGroup_1()); }
(rule__Filesystem__Group_1__0)?
{ after(grammarAccess.getFilesystemAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Filesystem__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Filesystem__Group_1__0__Impl
	rule__Filesystem__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Filesystem__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getNodesAssignment_1_0()); }
(rule__Filesystem__NodesAssignment_1_0)
{ after(grammarAccess.getFilesystemAccess().getNodesAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Filesystem__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Filesystem__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Filesystem__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getNodesAssignment_1_1()); }
(rule__Filesystem__NodesAssignment_1_1)*
{ after(grammarAccess.getFilesystemAccess().getNodesAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Folder__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__0__Impl
	rule__Folder__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getFolderAction_0()); }
(

)
{ after(grammarAccess.getFolderAccess().getFolderAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__1__Impl
	rule__Folder__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNameAssignment_1()); }
(rule__Folder__NameAssignment_1)
{ after(grammarAccess.getFolderAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__2__Impl
	rule__Folder__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__3__Impl
	rule__Folder__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getGroup_3()); }
(rule__Folder__Group_3__0)?
{ after(grammarAccess.getFolderAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Folder__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group_3__0__Impl
	rule__Folder__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNodesAssignment_3_0()); }
(rule__Folder__NodesAssignment_3_0)
{ after(grammarAccess.getFolderAccess().getNodesAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNodesAssignment_3_1()); }
(rule__Folder__NodesAssignment_3_1)*
{ after(grammarAccess.getFolderAccess().getNodesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__File__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__File__Group__0__Impl
	rule__File__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getFileAction_0()); }
(

)
{ after(grammarAccess.getFileAccess().getFileAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__File__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__File__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getNameAssignment_1()); }
(rule__File__NameAssignment_1)
{ after(grammarAccess.getFileAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Link__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__0__Impl
	rule__Link__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNameAssignment_0()); }
(rule__Link__NameAssignment_0)
{ after(grammarAccess.getLinkAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__1__Impl
	rule__Link__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_1()); }

	'>' 

{ after(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNodeAssignment_2()); }
(rule__Link__NodeAssignment_2)
{ after(grammarAccess.getLinkAccess().getNodeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Filesystem__NodesAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_0_0()); }
	ruleNode{ after(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Filesystem__NodesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_1_0()); }
	ruleNode{ after(grammarAccess.getFilesystemAccess().getNodesNodeParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__NodesAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_0_0()); }
	ruleNode{ after(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__NodesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_1_0()); }
	ruleNode{ after(grammarAccess.getFolderAccess().getNodesNodeParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__File__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getFileAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Link__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_0_0()); }
	ruleEString{ after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Link__NodeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNodeNodeCrossReference_2_0()); }
(
{ before(grammarAccess.getLinkAccess().getNodeNodeEStringParserRuleCall_2_0_1()); }
	ruleEString{ after(grammarAccess.getLinkAccess().getNodeNodeEStringParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getLinkAccess().getNodeNodeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

