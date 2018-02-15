package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book alphabetically.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> sortedAllPersons = addressBook.getSortedAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListShownSummary(sortedAllPersons), sortedAllPersons);
    }

}
