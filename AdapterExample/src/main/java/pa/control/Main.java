package pa.control;

import pa.devices.*;

/**
 * A classe Main é a classe principal que demonstra o uso de dispositivos de armazenamento
 * e adaptadores através da criação de instâncias e chamadas de métodos.
 */
public class Main {

    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Argumentos de linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Cria um objeto USBFlashDrive e MemoryCard, que implementam StorageDevice
        StorageDevice usbDrive = new USBFlashDrive();
        StorageDevice memoryCard = new MemoryCard();

        // Demonstração do uso de dispositivos de armazenamento diretamente
        System.out.println("Usando USBFlashDrive:");
        useStorageDevice(usbDrive);

        System.out.println("\nUsando MemoryCard:");
        useStorageDevice(memoryCard);

        // Cria um objeto OldDeviceImplementation e usa um adaptador para compatibilidade
        OldStorageDevice oldDevice = new OldDeviceImplementation();
        StorageDevice adaptedDevice = new StorageDeviceAdapter(oldDevice);

        // Demonstração do uso de um adaptador para compatibilidade com um dispositivo antigo
        System.out.println("\nUsando StorageDeviceAdapter:");
        useStorageDevice(adaptedDevice);
    }

    /**
     * Método auxiliar para demonstrar o uso de um dispositivo de armazenamento.
     *
     * @param device O dispositivo de armazenamento a ser usado.
     */
    private static void useStorageDevice(StorageDevice device) {
        device.connect();
        device.transferData();
        device.disconnect();
    }
}
