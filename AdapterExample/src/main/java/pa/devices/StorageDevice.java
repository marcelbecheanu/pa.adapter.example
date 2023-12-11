package pa.devices;

/**
 * A interface StorageDevice define as operações básicas para um dispositivo de armazenamento.
 * As implementações desta interface devem fornecer métodos para conectar, desconectar e transferir dados do dispositivo.
 */
public interface StorageDevice {

    /**
     * Conecta o dispositivo de armazenamento.
     */
    void connect();

    /**
     * Desconecta o dispositivo de armazenamento.
     */
    void disconnect();

    /**
     * Transfere dados do dispositivo de armazenamento.
     */
    void transferData();
}