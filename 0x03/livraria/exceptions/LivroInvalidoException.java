package exceptions;

public class LivroInvalidoException  extends Exception {

    private static final long serialVersionUID = 1L;

    public LivroInvalidoException(String msg) {
        super(msg);
    }

    public LivroInvalidoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}