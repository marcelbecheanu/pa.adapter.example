package pa.devices;

/**
 * A classe MemoryCard representa um cartão de memória, que implementa a interface StorageDevice.
 * Essa classe define métodos para conectar, desconectar e transferir dados do cartão de memória.
 */
public class MemoryCard implements StorageDevice {

    /**
     * Conecta o cartão de memória.
     */
    @Override
    public void connect() {
        System.out.println("Conectando o Cartão de Memória");
    }

    /**
     * Desconecta o cartão de memória.
     */
    @Override
    public void disconnect() {
        System.out.println("Desconectando o Cartão de Memória");
    }

    /**
     * Transfere dados do cartão de memória.
     */
    @Override
    public void transferData() {
        System.out.println("Transferindo dados do Cartão de Memória");
    }
}
