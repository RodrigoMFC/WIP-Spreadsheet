package xxl.app.edit;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.Spreadsheet;
// FIXME import classes
import xxl.exceptions.UnrecognizedEntryException;

/**
 * Class for searching functions.
 */
class DoShow extends Command<Spreadsheet> {

    DoShow(Spreadsheet receiver) {
        super(Label.SHOW, receiver);
        // FIXME add fields
    }

    @Override
    protected final void execute() throws CommandException {
        try{
            _display.popup(_receiver.showContents(Form.requestString(Prompt.address())));
        }
        catch (UnrecognizedEntryException e ){
            throw new InvalidCellRangeException(e.getEntrySpecification());
        };
    }

}
