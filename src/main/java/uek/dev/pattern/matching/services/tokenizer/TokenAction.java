package uek.dev.pattern.matching.services.tokenizer;

public interface TokenAction<T> {
    T doAction(String token);
}
