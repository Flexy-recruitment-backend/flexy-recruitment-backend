package menu;

import lombok.Data;

import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

/**
 * This class represents a category into a beauty institut menu
 */
@Data
public class Category {
    long id;

    String label;

    List<Category> categories;

    List<Service> services;

    static final Logger LOGGER = getLogger(Category.class.getName());

    /**
     *
     * @param searchingString - string to search into service labels
     */
    public void searchByLabel(String searchingString) {

    }

    /**
     *
     * @param thresholdPrice - threshold to search all services which price is under threshold
     */
    public void searchByPrice(float thresholdPrice) {

    }
}
