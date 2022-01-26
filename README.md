# lexer-parser


Program → main ( ) Block

Block → { VarList StatementList }

VarList → VarList VarDecl | VarDecl

VarDecl → NameList : Type;

NameList → NameList , ID | ID

Type → int | char | real | bool

StatementList → StatementList Statement | Statement

Statement → repeat StatementList until Expression;

| ID = Expression ;

| read( NameList ) ;

| write ( ExpressionList ) ;

| Block

Expression → Expression || AndExpression | AndExpression

AndExpression → AndExpression && RelExpression | RelExpression

RelExpression → ArExpression RelOp ArExpression | ArExpression

RelOp → < | <= | == | != | > | >=

ArExpression → ArExpression + Term | ArExpression - Term | Term

Term → Term * Factor | Term / Factor | Factor

Factor → ID | CONST | ( Expression )

ExpressionList → ExpressionList , Expression | Expression


Terminalni simbol ID u ovom programskom jeziku označava identifikator (niz slova, cifara, i ’_’ u kojem prvi znak ne može da bude cifra), a simbol CONST konstantu koja moze da bude zadata u jednom od sledećih formata:

 

1. Konstante tipa int:

[$]<niz_cifara_zadate_osnove>

 

Pri čemu ako je znak $ naveden radi se o osnovi 16, a ukoliko nije naveden podrazumeva se osnova 10.

 

2. Konstante tipa real:

<niz_cifara>.[<niz_cifara>][E[±]<niz_cifara>]

 

3. Konstante tipa char:

’<znak>’

 

4. Konstante tipa bool:

true i false
 
