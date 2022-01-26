import java_cup.runtime.Symbol;
%% 
// declaration section
%class MPLexer
%function next_token
%line
%column
%debug
%type Symbol
%eofval{
return new Symbol( sym.EOF );
%eofval}

%{
//extra class members
KWTable kwTable = new KWTable();
Symbol getKW()
{
return new Symbol( kwTable.find( yytext() ));
}
%}

//states
%state COMMENT
//macros
slovo = [a-zA-Z]
cifra = [0-9]
ox10 = [0-9]
ox16 = [0-9a-fA-F]

%%
// rules section
\/\/ { yybegin( COMMENT ); }
<COMMENT>~\n { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }
\( { return new Symbol( sym.lp ); }
\) { return new Symbol( sym.rp ); }
\{ { return new Symbol( sym.lb ); }
\} { return new Symbol( sym.rb ); }

//operators
&& { return new Symbol( sym.and ); }
\|\| { return new Symbol( sym.or ); }
\+ { return new Symbol( sym.plus ); }
\* { return new Symbol( sym.multiply ); }
\- { return new Symbol( sym.minus ); }
\/  { return new Symbol( sym.divide ); }
\< { return new Symbol( sym.less ); }
\<= { return new Symbol( sym.LE ); }
\> { return new Symbol( sym.greater ); }
\>= { return new Symbol( sym.ge ); }
== { return new Symbol( sym.equals ); }
\<\> { return new Symbol( sym.nequals ); }
//separators
; { return new Symbol( sym.semi ); }
, { return new Symbol( sym.comma ); }
= { return new Symbol( sym.assign ); }
: { return new Symbol( sym.TWODOTS); }

//ids
true  { return new Symbol( sym.BOOL, yyline, yycolumn, yytext() );}
false { return new Symbol( sym.BOOL, yyline, yycolumn, yytext() );}
({slovo} | _)({slovo}|{cifra}| _)* { return new Symbol(sym.id, yyline, yycolumn, yytext());}

//constants
{cifra}+ {return new Symbol(sym.INT,yyline, yycolum, new Integer(yytext()));}
\${ox16}+ {return new Symbol(sym.INT, yyline, yycolumn, Integer.parseInt(yytext(), 16));}
0\.{cifra}+(E[+\-]{cifra}+)? {return new Symbol(sym.REAL, yyline, yycolumn,Float.valueOf(yytext()));}
'[^]' {return new Symbol( sym.CHAR, yyline, yycolumn, yytext().charAt(0));}
//error symbol
. {if (yytext() != null && yytext().length() >0) System.out.println("Error: " + yytext());}



