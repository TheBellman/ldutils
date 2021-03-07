package net.parttimepolymath.utils.picker;


import net.parttimepolymath.utils.ResourceUtils;

/**
 * extension of the list picker which allows us to pick a random item from a resource file.
 *
 * @since 2020-05-16
 * @author Robert Hook
 */
public class StringListFilePicker extends ListPicker<String> {

    /**
     * construct with the name of a resource file.
     * @param fileName the non-null name of the resource file.
     */
    public StringListFilePicker(final String fileName) {
        super(ResourceUtils.readResourceFileAsList(fileName));
    }
}
