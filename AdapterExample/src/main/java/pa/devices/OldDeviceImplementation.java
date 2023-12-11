package pa.devices;

/**
 * A classe OldDeviceImplementation representa uma implementação específica de um dispositivo antigo.
 * Implementa a interface OldStorageDevice, fornecendo métodos para conectar, desconectar e copiar dados do dispositivo antigo.
 */
public class OldDeviceImplementation implements OldStorageDevice {

    /**
     * Conecta o dispositivo antigo.
     */
    @Override
    public void plugIn() {
        System.out.println("Conectando o Dispositivo Antigo");
    }

    /**
     * Desconecta o dispositivo antigo.
     */
    @Override
    public void unplug() {
        System.out.println("Desconectando o Dispositivo Antigo");
    }

    /**
     * Copia dados do dispositivo antigo.
     */
    @Override
    public void copyData() {
        System.out.println("Copiando dados do Dispositivo Antigo");
    }
}
