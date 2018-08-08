package eta.runtime.thunk;

import eta.runtime.stg.Closure;
import eta.runtime.stg.StgContext;

public class UpdateInfo {
    public Thunk updatee;
    boolean    marked;
    UpdateInfo next;
    UpdateInfo prev;

    public UpdateInfo(final Thunk updatee) {
        this.updatee = updatee;
    }

    UpdateInfo reset(final UpdateInfo free) {
        prev = free;
        next = null;
        updatee = null;
        marked = false;
        return this;
    }
}
