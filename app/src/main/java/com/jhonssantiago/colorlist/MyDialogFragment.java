package com.jhonssantiago.colorlist;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //  return super.onCreateDialog(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view;
        builder.setTitle("Escolha uma cor")
                .setItems(R.array.array_cores, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       // Toast.makeText(getActivity().getApplicationContext(), "voce clicou em "+ recuperarItem(i), Toast.LENGTH_SHORT).show();

                        MainActivity main;
                        main.mudarColor(i);

                        switch (i) {
                            case 0:
                                view.setBackgroundColor(Color.BLUE);
                                break;
                            case 1:
                                view.setBackgroundColor(Color.BLACK);
                                break;
                            case 2:
                                view.setBackgroundColor(Color.WHITE);
                                break;
                            case 3:
                                view.setBackgroundColor(Color.RED);
                                break;
                        }

                    }
                });
        return builder.create() ;
    }

   private String recuperarItem(int i){
        Resources resources = getResources();
        String [] cores = resources.getStringArray(R.array.array_cores);
        return cores[i];
    }


}
