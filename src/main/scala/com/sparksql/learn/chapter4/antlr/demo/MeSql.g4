// 语法文件通常以 granmar 关键宇开头 这是一个名为 MeSql 的语法 它必须和文件名 MeSql.g4相匹配
grammar MeSql;

// 定义一条名为 me 的语法规则，它匹配一对花括号[START, STOP为词法关键词]、逗号分隔的 value [另一条语法规则，在下面], 以及 * 匹配多个 value
me : START value (',' value)* STOP ;

// 定义一条value的语法规则，正是上面me语法中的value，该value的值应该是 INT 或者继续是 me [代表嵌套], | 符号代表或
value : me
      |INT
      ;

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
