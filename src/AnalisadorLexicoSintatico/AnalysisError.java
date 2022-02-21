package AnalisadorLexicoSintatico;

public class AnalysisError extends Exception
{
    private int position;

    public AnalysisError(String msg, int position)
    {
        super(msg);
        this.position = position;
    }

    public AnalysisError(String msg)
    {
        super(msg);
        this.position = -1;
    }

    public int getPosition()
    {
        return position;
    }

    public String toString()
    {
        return "Erro na posição " + position;
    }
}
