package com.tobiasschuerg.adyk;

import android.content.Context;

/**
 * Created by Tobias Schürg on 13.06.13.
 */
abstract public class ADYK {

    private Context context;

    public ADYK (Context context) {
        this.context = context;
    }

    abstract void onDismiss();

    public void show() {
        if (preconditionsOk()) {
            ToolTip t = getFreshToolTip();
            if (t != null) {
                showDialog(t);
            }
        } else {
            // TODO: log something
        }
    }

    private void showDialog(ToolTip tip) {
        // TODO: show dialog
    }

    private ToolTip getFreshToolTip() {
        // TODO: randomly select a tooltip
        return new ToolTip(1, "Hello world.");
    }

    private boolean preconditionsOk() {
        // last tip was at least yesterday
        // tips are not disabled
        return false; // TODO;
    }

}
