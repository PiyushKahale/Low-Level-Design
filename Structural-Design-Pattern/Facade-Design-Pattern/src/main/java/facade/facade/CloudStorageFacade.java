package facade.facade;

import facade.impl.AccountManager;
import facade.impl.CloudRepository;
import facade.impl.EncryptionService;
import facade.impl.FileCompressor;
import facade.storage.DB;

public class CloudStorageFacade {

    private CloudRepository cloudRepository;
    private AccountManager accountManager;
    private EncryptionService encryptionService;
    private FileCompressor fileCompressor;

    public CloudStorageFacade(DB dbStore) {
        cloudRepository = new CloudRepository();
        accountManager =  new AccountManager(dbStore);
        encryptionService = new EncryptionService();
        fileCompressor = new FileCompressor();
    }

    public void saveFile(Integer userId, String username, byte[] data) {
        System.out.println("Started saving file...");
        boolean isValidUser = accountManager.validateUser(userId, username);
        if(!isValidUser) {
            throw new RuntimeException("Invalid username or password");
        }
        byte[] compressedData = fileCompressor.compress(data);
        byte[] encryptedFile = encryptionService.encrypt(compressedData);
        cloudRepository.upload(encryptedFile);
    }
}
