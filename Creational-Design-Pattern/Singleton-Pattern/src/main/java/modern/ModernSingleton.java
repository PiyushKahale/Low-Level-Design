package modern;

public class ModernSingleton {
    private ModernSingleton() {}

    private static class Holder {
        private static final ModernSingleton INSTANCE = new ModernSingleton();
    }

    public static ModernSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
