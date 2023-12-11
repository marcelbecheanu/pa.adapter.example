package pa.devices;

/**
 * A interface OldStorageDevice define as operações básicas para um dispositivo de armazenamento antigo.
 * As implementações desta interface devem fornecer métodos para conectar, desconectar e copiar dados do dispositivo antigo.
 */
public interface OldStorageDevice {

    /**
     * Conecta o dispositivo antigo.
     */
    void plugIn();

    /**
     * Desconecta o dispositivo antigo.
     */
    void unplug();

    /**
     * Copia dados do dispositivo antigo.
     */
    void copyData();
}
