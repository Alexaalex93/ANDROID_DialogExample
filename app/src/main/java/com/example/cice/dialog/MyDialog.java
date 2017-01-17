package com.example.cice.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;

/**
 * Created by cice on 29/11/16.
 */


//Dialog es un PopUp, sirve para dar opciones al usuario (Como con las opciones del Wifi)
public class MyDialog extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Establecemos un mensaje
        builder.setMessage("Elige una opcion")
            //Añadimos un OK Button
       .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

           }
       })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
        //Return super.onCreateDialog (savedInstanceState);M
    }
}
