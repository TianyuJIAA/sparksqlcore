// 语法文件通常以 granmar 关键宇开头 这是一个名为 MeSql 的语法 它必须和文件名 MeSql.g4相匹配
lexer grammar MeSqlLexer;

// 以下所有词法符号都是根据正则表达式判断
// 定义一个INT的词法符号, 只能是正整数
INT : [0-9]+ ;

// 定义一个START的词法符号, 只包含{
START : '{' ;

// 定义一个STOP的词法符号, 只包含}
STOP : '}' ;

// 定义一个AND的词法符号, 只包含,
AND : ',' ;

// 定义一个WS的词法符号，后面跟正则表达式，意思是空白符号丢弃
WS  : [\t\n\r]+ -> skip ;
