package exceptions;

public class OperacaoInvalidaException  extends Exception {

    private static final long serialVersionUID = 1L;

    public OperacaoInvalidaException(String msg) {
        super(msg);
    }

    public OperacaoInvalidaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}