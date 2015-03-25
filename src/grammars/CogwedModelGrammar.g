/**
 Franco 130720: This is the grammar for a cogwed /model/.
 cogwed models are essentially interpreted systems. This grammar
 is very simplified: no structures for local states; global states are
 tuples of local states.
 The temporal relation is provided a list of pairs (of global states).

 Simple example:

 ----- cut here -----

 // This is a single line comment
 // (Multiple line comments are possible as well)

 // The number of agents
 N = 3;

 // The list of global states. 
 // Each global state is a tuple of N local states
 // (the application should check that the number of
 // elements is correct for each global state)
 S1 = (l_1_0,l_2_0,l_3_0);
 S2 = (l_1_1,l_2_0,l_3_1);
 S3 = (l_1_0,l_2_1,l_3_0);
 S4 = (l_1_1,l_2_2,l_3_1);
 S5 = (l_1_0,l_2_0,l_3_2);
 S6 = (l_1_2,l_2_3,l_3_1);
 
 // The temporal relation is just a list of pairs of global states
 RT = { (S1,S2), (S1,S3), (S2,S2), (S6,S1) };

 // This tells that atom1 is true in S1 and S3, etc.
 atom1 = { S1, S3 };
 atom2 = { S3, S4, S5};
----- cut here -----

 **/

grammar CogwedModelGrammar;

// A model is just a sequence of definitions:
cogwed_model_file: nofagents statesdef tempreldef atomsdef;



// Let's define the various parts



// The number of agents (must be > 0)
nofagents: ('N'|'n') '=' NONZEROINT ';' ;


/* This is the definition of global states.  We should check that in
   each global states there are exactly N elements. There is a way to
   do this here, but we are lazy and we delegate the check to the
   application. We require the definition of at least a global state
   (hence the + in the rule) 
*/
statesdef: (statedef ';')+;
// A single global state is  alist of local states
statedef: ID '=' lstateslist;
// Just a list of IDs (at least one), in brackets
lstateslist: '(' ID (',' ID)* ')';
// End of statesdef


/* The temporal relation is just a list of pairs of global states 
   We require at least one pair */
tempreldef : 'RT' '=' '{' pairofstates (',' pairofstates)* '}' ';';
// Just two IDs
pairofstates: '(' ID ',' ID ')';
// End of tempreldef


/* Definition of the propositional atoms (i.e.: what is true where?) 
   This section could be empty (i.e., no atoms)
*/
atomsdef: (singledef ';')*;
singledef: ID '=' '{' gstateslist '}';
// gstatelist is  alist of global states (at least one):
gstateslist: ID (',' ID)*;



/* **** Lexer rules ****** */

NONZEROINT: [1-9] ([0-9])*;
INT: [0-9]+;

// We throw away white spaces, tabs and new lines.
WS: [ \t\r\n]+ -> skip ; 

// We throw away comments, either on a single line or on multipe lines
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip ; 
COMMENT: '/*' .*? '*/' -> skip ; 

// C-style IDs
ID : ID_LETTER (ID_LETTER | DIGIT)* ; 
// Fragment means that we cannot access it from the parser
fragment ID_LETTER : 'a'..'z'|'A'..'Z'|'_' ;
fragment DIGIT : '0'..'9' ;

