
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jan 18 00:23:21 CET 2022
//----------------------------------------------------

import java.io.*;
import java.util.*;
//import SymbolTable.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jan 18 00:23:21 CET 2022
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\052\000\002\002\006\000\002\002\004\000\002\003" +
    "\006\000\002\004\004\000\002\004\003\000\002\005\006" +
    "\000\002\006\005\000\002\006\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\010\004\000\002\010\003\000\002\011\006\000\002\011" +
    "\006\000\002\011\007\000\002\011\007\000\002\011\003" +
    "\000\002\012\005\000\002\012\005\000\002\013\005\000" +
    "\002\013\003\000\002\014\005\000\002\014\003\000\002" +
    "\015\003\000\002\015\003\000\002\015\003\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\016\005" +
    "\000\002\016\005\000\002\016\003\000\002\017\005\000" +
    "\002\017\005\000\002\017\003\000\002\020\003\000\002" +
    "\020\003\000\002\020\005\000\002\021\005\000\002\021" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\004\004\001\002\000\004\005\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\006\010\001\002\000\004\007\012\001\002\000" +
    "\004\002\001\001\002\000\004\012\014\001\002\000\014" +
    "\007\ufffd\012\ufffd\022\ufffd\024\ufffd\025\ufffd\001\002\000" +
    "\010\006\ufffa\011\ufffa\015\ufffa\001\002\000\014\007\012" +
    "\012\031\022\032\024\033\025\037\001\002\000\006\011" +
    "\017\015\020\001\002\000\004\012\027\001\002\000\012" +
    "\016\025\017\024\020\022\021\023\001\002\000\004\014" +
    "\026\001\002\000\004\014\ufff7\001\002\000\004\014\ufff6" +
    "\001\002\000\004\014\ufff8\001\002\000\004\014\ufff9\001" +
    "\002\000\014\007\ufffc\012\ufffc\022\ufffc\024\ufffc\025\ufffc" +
    "\001\002\000\010\006\ufffb\011\ufffb\015\ufffb\001\002\000" +
    "\020\007\uffef\010\uffef\012\uffef\022\uffef\023\uffef\024\uffef" +
    "\025\uffef\001\002\000\010\011\ufffa\015\ufffa\041\112\001" +
    "\002\000\014\007\012\012\111\022\032\024\033\025\037" +
    "\001\002\000\004\005\115\001\002\000\016\007\012\010" +
    "\110\012\111\022\032\024\033\025\037\001\002\000\014" +
    "\007\ufffe\012\ufffe\022\ufffe\024\ufffe\025\ufffe\001\002\000" +
    "\020\007\ufff4\010\ufff4\012\ufff4\022\ufff4\023\ufff4\024\ufff4" +
    "\025\ufff4\001\002\000\004\005\040\001\002\000\010\005" +
    "\046\012\043\042\051\001\002\000\006\006\104\011\103" +
    "\001\002\000\052\006\uffe9\007\uffe9\010\uffe9\011\uffe9\012" +
    "\uffe9\013\uffe9\014\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9" +
    "\026\uffe9\027\076\030\071\031\067\032\074\033\077\034" +
    "\075\035\072\036\070\001\002\000\056\006\uffdc\007\uffdc" +
    "\010\uffdc\011\uffdc\012\uffdc\013\uffdc\014\uffdc\022\uffdc\023" +
    "\uffdc\024\uffdc\025\uffdc\026\uffdc\027\uffdc\030\uffdc\031\uffdc" +
    "\032\uffdc\033\uffdc\034\uffdc\035\uffdc\036\uffdc\037\uffdc\040" +
    "\uffdc\001\002\000\006\013\065\026\063\001\002\000\010" +
    "\006\uffd8\011\uffd8\013\061\001\002\000\010\005\046\012" +
    "\043\042\051\001\002\000\056\006\uffe0\007\uffe0\010\uffe0" +
    "\011\uffe0\012\uffe0\013\uffe0\014\uffe0\022\uffe0\023\uffe0\024" +
    "\uffe0\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0\032\uffe0" +
    "\033\uffe0\034\uffe0\035\uffe0\036\uffe0\037\053\040\054\001" +
    "\002\000\056\006\uffdd\007\uffdd\010\uffdd\011\uffdd\012\uffdd" +
    "\013\uffdd\014\uffdd\022\uffdd\023\uffdd\024\uffdd\025\uffdd\026" +
    "\uffdd\027\uffdd\030\uffdd\031\uffdd\032\uffdd\033\uffdd\034\uffdd" +
    "\035\uffdd\036\uffdd\037\uffdd\040\uffdd\001\002\000\056\006" +
    "\uffdb\007\uffdb\010\uffdb\011\uffdb\012\uffdb\013\uffdb\014\uffdb" +
    "\022\uffdb\023\uffdb\024\uffdb\025\uffdb\026\uffdb\027\uffdb\030" +
    "\uffdb\031\uffdb\032\uffdb\033\uffdb\034\uffdb\035\uffdb\036\uffdb" +
    "\037\uffdb\040\uffdb\001\002\000\032\006\uffeb\007\uffeb\010" +
    "\uffeb\011\uffeb\012\uffeb\013\uffeb\014\uffeb\022\uffeb\023\uffeb" +
    "\024\uffeb\025\uffeb\026\uffeb\001\002\000\010\005\046\012" +
    "\043\042\051\001\002\000\010\005\046\012\043\042\051" +
    "\001\002\000\056\006\uffde\007\uffde\010\uffde\011\uffde\012" +
    "\uffde\013\uffde\014\uffde\022\uffde\023\uffde\024\uffde\025\uffde" +
    "\026\uffde\027\uffde\030\uffde\031\uffde\032\uffde\033\uffde\034" +
    "\uffde\035\uffde\036\uffde\037\uffde\040\uffde\001\002\000\056" +
    "\006\uffdf\007\uffdf\010\uffdf\011\uffdf\012\uffdf\013\uffdf\014" +
    "\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\026\uffdf\027\uffdf" +
    "\030\uffdf\031\uffdf\032\uffdf\033\uffdf\034\uffdf\035\uffdf\036" +
    "\uffdf\037\uffdf\040\uffdf\001\002\000\006\006\060\013\061" +
    "\001\002\000\056\006\uffda\007\uffda\010\uffda\011\uffda\012" +
    "\uffda\013\uffda\014\uffda\022\uffda\023\uffda\024\uffda\025\uffda" +
    "\026\uffda\027\uffda\030\uffda\031\uffda\032\uffda\033\uffda\034" +
    "\uffda\035\uffda\036\uffda\037\uffda\040\uffda\001\002\000\010" +
    "\005\046\012\043\042\051\001\002\000\032\006\uffee\007" +
    "\uffee\010\uffee\011\uffee\012\uffee\013\uffee\014\uffee\022\uffee" +
    "\023\uffee\024\uffee\025\uffee\026\063\001\002\000\010\005" +
    "\046\012\043\042\051\001\002\000\032\006\uffec\007\uffec" +
    "\010\uffec\011\uffec\012\uffec\013\uffec\014\uffec\022\uffec\023" +
    "\uffec\024\uffec\025\uffec\026\uffec\001\002\000\004\003\066" +
    "\001\002\000\030\006\uffed\007\uffed\010\uffed\011\uffed\012" +
    "\uffed\013\uffed\014\uffed\022\uffed\023\uffed\024\uffed\025\uffed" +
    "\001\002\000\010\005\uffe6\012\uffe6\042\uffe6\001\002\000" +
    "\010\005\046\012\043\042\051\001\002\000\010\005\uffe7" +
    "\012\uffe7\042\uffe7\001\002\000\010\005\046\012\043\042" +
    "\051\001\002\000\010\005\046\012\043\042\051\001\002" +
    "\000\010\005\uffe5\012\uffe5\042\uffe5\001\002\000\010\005" +
    "\uffe3\012\uffe3\042\uffe3\001\002\000\010\005\uffe8\012\uffe8" +
    "\042\uffe8\001\002\000\010\005\uffe4\012\uffe4\042\uffe4\001" +
    "\002\000\036\006\uffea\007\uffea\010\uffea\011\uffea\012\uffea" +
    "\013\uffea\014\uffea\022\uffea\023\uffea\024\uffea\025\uffea\026" +
    "\uffea\035\072\036\070\001\002\000\056\006\uffe2\007\uffe2" +
    "\010\uffe2\011\uffe2\012\uffe2\013\uffe2\014\uffe2\022\uffe2\023" +
    "\uffe2\024\uffe2\025\uffe2\026\uffe2\027\uffe2\030\uffe2\031\uffe2" +
    "\032\uffe2\033\uffe2\034\uffe2\035\uffe2\036\uffe2\037\053\040" +
    "\054\001\002\000\056\006\uffe1\007\uffe1\010\uffe1\011\uffe1" +
    "\012\uffe1\013\uffe1\014\uffe1\022\uffe1\023\uffe1\024\uffe1\025" +
    "\uffe1\026\uffe1\027\uffe1\030\uffe1\031\uffe1\032\uffe1\033\uffe1" +
    "\034\uffe1\035\uffe1\036\uffe1\037\053\040\054\001\002\000" +
    "\010\005\046\012\043\042\051\001\002\000\004\014\105" +
    "\001\002\000\020\007\ufff0\010\ufff0\012\ufff0\022\ufff0\023" +
    "\ufff0\024\ufff0\025\ufff0\001\002\000\010\006\uffd9\011\uffd9" +
    "\013\061\001\002\000\020\007\ufff5\010\ufff5\012\ufff5\022" +
    "\ufff5\023\ufff5\024\ufff5\025\ufff5\001\002\000\022\002\uffff" +
    "\007\uffff\010\uffff\012\uffff\022\uffff\023\uffff\024\uffff\025" +
    "\uffff\001\002\000\004\041\112\001\002\000\010\005\046" +
    "\012\043\042\051\001\002\000\006\013\061\014\114\001" +
    "\002\000\020\007\ufff2\010\ufff2\012\ufff2\022\ufff2\023\ufff2" +
    "\024\ufff2\025\ufff2\001\002\000\004\012\014\001\002\000" +
    "\006\006\117\011\017\001\002\000\004\014\120\001\002" +
    "\000\020\007\ufff1\010\ufff1\012\ufff1\022\ufff1\023\ufff1\024" +
    "\ufff1\025\ufff1\001\002\000\016\007\012\012\111\022\032" +
    "\023\122\024\033\025\037\001\002\000\010\005\046\012" +
    "\043\042\051\001\002\000\022\007\ufff3\010\ufff3\012\ufff3" +
    "\013\061\022\ufff3\023\ufff3\024\ufff3\025\ufff3\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\121\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\010\001\001\000\002\001\001\000\010\004\014\005" +
    "\012\006\015\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\003\027\005\034\006\015\010\033\011\035\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\020" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\003\027\010\120\011\035\001\001\000\002\001\001" +
    "\000\006\003\027\011\106\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\020\012\044\013\043" +
    "\014\051\016\041\017\046\020\047\021\040\001\001\000" +
    "\002\001\001\000\004\015\072\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\012\056\013" +
    "\043\014\051\016\041\017\046\020\047\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\020\055\001\001\000\004\020\054\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\013\061\014\051\016\041\017\046" +
    "\020\047\001\001\000\002\001\001\000\012\014\063\016" +
    "\041\017\046\020\047\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\017" +
    "\101\020\047\001\001\000\002\001\001\000\006\017\100" +
    "\020\047\001\001\000\010\016\077\017\046\020\047\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\012\105\013\043\014\051\016\041" +
    "\017\046\020\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\012\112\013\043\014\051\016" +
    "\041\017\046\020\047\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\115\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\027\011\106" +
    "\001\001\000\016\012\122\013\043\014\051\016\041\017" +
    "\046\020\047\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

//	symbolTable = new SymbolTable();

    }
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // ExpressionList ::= Expression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 42");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpressionList",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // ExpressionList ::= ExpressionList comma Expression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 41");
          
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ExpressionList",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Factor ::= lp Expression rp 
            {
              Object RESULT =null;
		
            System.out.println("Smena 40");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Factor ::= constanta 
            {
              Object RESULT =null;
		
            System.out.println("Smena 39");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Factor ::= id 
            {
              Object RESULT =null;
		
            System.out.println("Smena 38");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Factor",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Term ::= Factor 
            {
              Object RESULT =null;
		
            System.out.println("Smena 37");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Term ::= Term divide Factor 
            {
              Object RESULT =null;
		
            System.out.println("Smena 36");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Term ::= Term multiply Factor 
            {
              Object RESULT =null;
		
		   System.out.println("Smena 35");
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Term",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ArExpression ::= Term 
            {
              Object RESULT =null;
		
            System.out.println("Smena 34");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArExpression",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ArExpression ::= ArExpression minus Term 
            {
              Object RESULT =null;
		
            System.out.println("Smena 33");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArExpression",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ArExpression ::= ArExpression plus Term 
            {
              Object RESULT =null;
		
            System.out.println("Smena 32");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ArExpression",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= ge 
            {
              Object RESULT =null;
		
            System.out.println("Smena 31");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= greater 
            {
              Object RESULT =null;
		
            System.out.println("Smena 30");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= nequals 
            {
              Object RESULT =null;
		
            System.out.println("Smena 29");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= equals 
            {
              Object RESULT =null;
		
            System.out.println("Smena 28");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= LE 
            {
              Object RESULT =null;
		
            System.out.println("Smena 27");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= less 
            {
              Object RESULT =null;
		
            System.out.println("Smena 26");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelOp",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RelExpression ::= ArExpression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 25");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelExpression",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelExpression ::= ArExpression RelOp ArExpression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 24");
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("RelExpression",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // AndExpression ::= RelExpression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 23");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AndExpression",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // AndExpression ::= AndExpression and RelExpression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 22");
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AndExpression",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Expression ::= AndExpression or error 
            {
              Object RESULT =null;
		
            System.out.println("Smena 20");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= Expression or AndExpression 
            {
              Object RESULT =null;
		
            System.out.println("Smena 19");
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Block 
            {
              Object RESULT =null;
		
            System.out.println("Smena 18");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= write lp ExpressionList rp semi 
            {
              Object RESULT =null;
		
            System.out.println("Smena 17");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= read lp NameList rp semi 
            {
              Object RESULT =null;
		
            System.out.println("Smena 16");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= id assign Expression semi 
            {
              Object RESULT =null;
		
            System.out.println("Smena 15");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statement ::= repeat StatementList until Expression 
            {
              Object RESULT =null;
		
         	System.out.println("Smena 14");
         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // StatementList ::= Statement 
            {
              Object RESULT =null;
		
            System.out.println("Smena 13");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // StatementList ::= StatementList Statement 
            {
              Object RESULT =null;
		
            System.out.println("Smena 12");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= BOOL 
            {
              Object RESULT =null;
		
            System.out.println("Smena 11");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= REAL 
            {
              Object RESULT =null;
		
            System.out.println("Smena 10");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= CHAR 
            {
              Object RESULT =null;
		
            System.out.println("Smena 9");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= INT 
            {
              Object RESULT =null;
		
            System.out.println("Smena 8");
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= id 
            {
              Object RESULT =null;
		
                System.out.println("Smena 7");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NameList",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList comma id 
            {
              Object RESULT =null;
		
                System.out.println("Smena 6");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NameList",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= NameList TWODOTS Type semi 
            {
              Object RESULT =null;
		
                System.out.println("Smena 5");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarList ::= VarDecl 
            {
              Object RESULT =null;
		
                System.out.println("Smena 4");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarList ::= VarList VarDecl 
            {
              Object RESULT =null;
		
                System.out.println("Smena 3");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VarList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= lb VarList StatementList rb 
            {
              Object RESULT =null;
		
                System.out.println("Smena 2");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Block",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= main lp rp Block 
            {
              Object RESULT =null;
		
                System.out.println("Smena 1");
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

