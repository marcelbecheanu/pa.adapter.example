package pa.devices;

/**
 * A classe StorageDeviceAdapter atua como um adaptador para permitir que um dispositivo antigo,
 * que implementa a interface OldStorageDevice, seja utilizado como um StorageDevice.
 */
public class StorageDeviceAdapter implements StorageDevice {
    private OldStorageDevice oldDevice;

    /**
     * Construtor que recebe um dispositivo antigo para adaptação.
     *
     * @param oldDevice O dispositivo antigo a ser adaptado.
     */
    public StorageDeviceAdapter(OldStorageDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    /**
     * Conecta o dispositivo adaptado chamando o método plugIn() do dispositivo antigo.
     */
    @Override
    public void connect() {
        oldDevice.plugIn();
    }

    /**
     * Desconecta o dispositivo adaptado chamando o método unplug() do dispositivo antigo.
     */
    @Override
    public void disconnect() {
        oldDevice.unplug();
    }

    /**
     * Transfere dados do dispositivo adaptado chamando o método copyData() do dispositivo antigo.
     */
    @Override
    public void transferData() {
        oldDevice.copyData();
    }
}
