package com.milovanjakovljevic.dialogdemo

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialog:DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder=AlertDialog.Builder(this.requireActivity())
        builder.setMessage("Make a selection")
            // An OK button that does nothing
            .setPositiveButton("OK", { dialog, id ->
                // Nothing happening here
            })
            // A "Cancel" button that does nothing
            .setNegativeButton("Cancel", { dialog, id ->
                // Nothing happening here either
            })
        return builder.create()
    }
}