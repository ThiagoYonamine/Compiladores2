grammar La;

@members {
    public static String grupo="<<587001, 489336>>";
    //PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
   
}

programa: 'fase:' NUM_INT 'inicio' corpo 'fim';
corpo : declaracoes comandos
        | ;

declaracoes_objetos: obj_item | obj_bloco | atribuicao;
atribuicao: IDENT '=' tipo;
obj_item: 'item' IDENT;
obj_bloco: 'bloco' IDENT;

declaracoes_funcao: 'funcao' IDENT '()' '{\n' comandos '}';

declaracoes:  declaracoes_objetos
            | declaracoes_funcao;

comandos : (cmd comandos )?;
cmd     : 'andar' '()'
        | 'virar' '()'
        | 'perguntar' '(' expressao ')' resultado
        | repetir 
        | IDENT '(' ')'
        | 'usar' '('IDENT')'
        | declaracoes;

repetir: 'repetir' '(' NUM_INT ')' '{\n' comandos '}';

tipo: tipo_bloco | tipo_item;
tipo_bloco : 'grama' | 'fogo' | 'parede' | 'inimigo' | 'proximo_bloco' ;
tipo_item : 'agua' | 'machado' | 'espada';
expressao: IDENT 'é' tipo '?';
resultado: 'SIM' '{\n' comandos '}' 'NAO' '{\n' comandos '}';
COMENTARIO
    : '#' .*? '#' ->skip;

IDENT
    : ('a'..'z'|'A'..'Z'| '_')('a'..'z'|'A'..'Z'|'0'..'9'| '_')*;

NUM_INT
    : ('0'..'9')+ ;

NUM_REAL
    : ('0'..'9')+ '.'('0'..'9')+ ; 

ENTER : ( ' '| '\t'| '\r'| '\n') -> skip;

COMENTARIO_ERRADO :
    { ErrosSintaticos.comentario = true;}
     '#' ~[\n#]* '\n' 
    ;

SIMBOLO_NAO_INDENTIFICADO
    : . 
    ;
