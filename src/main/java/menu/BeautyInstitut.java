package menu;

import java.io.IOException;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

/**
 * This class represents a Beauty institut
 * This class contains the main function of the application
 */
public class BeautyInstitut {

    static final Logger LOGGER = getLogger(BeautyInstitut.class.getName());

    /**
     *
     * Load the menu of the BeautySalon from a json file
     *
     * @param filePath - the menu file path
     * @return the root category of the menu
     * @throws IOException
     */
    Category loadMenu(String filePath) throws IOException {
        return null;
    }


    /**
     * main function of the application
     * @param args
     */
    public static void main(String[] args) {
        BeautyInstitut testBackendInstitut = new BeautyInstitut();
    }
}
