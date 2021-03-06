package AnalisadorLexicoSintatico;

public interface ParserConstants
{
    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL    = 49;
    int FIRST_SEMANTIC_ACTION = 66;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4,  3 },
        { -1, -1, -1, -1, -1, -1,  5,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5, -1,  5, -1,  5, -1, -1, -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1,  9, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  7, -1, 11, -1,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, 12, -1, -1, 13, 13, 13, -1, -1, 12, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, 15, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, 20, -1, -1, -1, -1, 19 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, 22 },
        { -1, 24, 25, 26, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1 },
        { -1, 33, -1, -1, -1, -1, -1, -1, -1, 33, 33, 33, 33, 33, -1, 33, 33, 33, -1, -1, 33, -1, 33, -1, 33, -1, -1, -1, 32, 32, 32, 32, 32, -1, 33, 33, 33, 33, 33, 33, -1, 33, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, 36, 37, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 40, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 43, 43, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, 46, 47, 48, 49, 50, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  6,  5, 26, 50, 19, 54, 16 },
        {  2, 51, 47, 52, 50 },
        {  0 },
        { 48,  2, 51 },
        {  0 },
        { 53 },
        { 28, 43,  3, 46,  3, 44,  9, 53 },
        { 20 },
        { 24 },
        {  7 },
        {  8 },
        { 22 },
        { 55, 54 },
        {  0 },
        { 21, 41,  2, 56, 42 },
        { 13, 41, 58, 57, 42 },
        {  2, 59, 34, 58, 60 },
        { 25, 64, 62, 12, 54, 18 },
        { 11, 64, 62, 14, 54, 17 },
        { 48,  2, 56 },
        { 43,  3, 44, 56 },
        {  0 },
        { 48, 58, 57 },
        {  0 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        { 27 },
        { 15 },
        { 43,  3, 44 },
        {  0 },
        { 61, 58, 60 },
        {  0 },
        { 29 },
        { 30 },
        { 31 },
        { 32 },
        { 33 },
        { 63, 64, 62 },
        {  0 },
        { 10 },
        { 23 },
        { 58, 60, 65, 58, 60 },
        { 41, 58, 60, 65, 58, 60, 42 },
        { 35 },
        { 36 },
        { 37 },
        { 38 },
        { 39 },
        { 40 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado um identificador",
        "Era esperado um n??mero inteiro",
        "Era esperado um n??mero real",
        "Era esperado uma string",
        "Era esperado o token algoritmo",
        "Era esperado o token caracter",
        "Era esperado o token caractere",
        "Era esperado o token de",
        "Era esperado o token e",
        "Era esperado o token enquanto",
        "Era esperado o token entao",
        "Era esperado o token escreva",
        "Era esperado o token faca",
        "Era esperado o token falso",
        "Era esperado o token fimalgoritmo",
        "Era esperado o token fimenquanto",
        "Era esperado o token fimse",
        "Era esperado o token inicio",
        "Era esperado o token inteiro",
        "Era esperado o token leia",
        "Era esperado o token logico",
        "Era esperado o token ou",
        "Era esperado o token real",
        "Era esperado o token se",
        "Era esperado o token var",
        "Era esperado o token verdadeiro",
        "Era esperado o token vetor",
        "Era esperado o token \"+\"",
        "Era esperado o token \"-\"",
        "Era esperado o token \"*\"",
        "Era esperado o token \"/\"",
        "Era esperado o token \"^\"",
        "Era esperado o token \"<-\"",
        "Era esperado o token \"=\"",
        "Era esperado o token \"<>\"",
        "Era esperado o token \">\"",
        "Era esperado o token \">=\"",
        "Era esperado o token \"<\"",
        "Era esperado o token \"<=\"",
        "Era esperado o token \"(\"",
        "Era esperado o token \")\"",
        "Era esperado o token \"[\"",
        "Era esperado o token \"]\"",
        "Era esperado o token \".\"",
        "Era esperado o token \"..\"",
        "Era esperado o token \":\"",
        "Era esperado o token \",\"",
        "<A> inv??lido",
        "<B> inv??lido",
        "<C> inv??lido",
        "<D> inv??lido",
        "<E> inv??lido",
        "<F> inv??lido",
        "<G> inv??lido",
        "<H> inv??lido",
        "<I> inv??lido",
        "<J> inv??lido",
        "<K> inv??lido",
        "<L> inv??lido",
        "<M> inv??lido",
        "<N> inv??lido",
        "<O> inv??lido",
        "<P> inv??lido",
        "<Q> inv??lido"
    };
}
