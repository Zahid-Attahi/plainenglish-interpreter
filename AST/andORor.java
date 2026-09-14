package PlainEnglish.AST;

public enum andORor {
    and {
        @Override public String toString() { return "and"; }
    },
    or {
        @Override public String toString() { return "or"; }
    }
}
