package pa.devices;

/**
 * A classe USBFlashDrive representa um pen drive, implementando a interface StorageDevice.
 * Esta classe define métodos para conectar, desconectar e transferir dados do pen drive.
 */
public class USBFlashDrive implements StorageDevice {

    /**
     * Conecta o pen drive via USB.
     */
    @Override
    public void connect() {
        System.out.println("Conectando o Pen Drive via USB");
    }

    /**
     * Desconecta o pen drive.
     */
    @Override
    public void disconnect() {
        System.out.println("Desconectando o Pen Drive");
    }

    /**
     * Transfere dados do pen drive.
     */
    @Override
    public void transferData() {
        System.out.println("Transferindo dados do Pen Drive");
    }
}
