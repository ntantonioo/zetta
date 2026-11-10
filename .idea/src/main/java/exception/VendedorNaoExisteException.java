package exception;

public class VendedorNaoExisteException extends RuntimeException {
    public VendedorNaoExisteException(String message) {
        super(message);
    }
}
