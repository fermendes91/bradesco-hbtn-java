package exceptions;

public class AutorInvalidoException  extends Exception {

    private static final long serialVersionUID = 1L;

    public AutorInvalidoException(String msg) {
        super(msg);
    }

    public AutorInvalidoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}