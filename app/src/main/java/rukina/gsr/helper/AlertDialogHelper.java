package rukina.gsr.helper;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;

import rukina.gsr.R;
import rukina.gsr.dialogfragment.AlertDialogForFragment;
import rukina.gsr.dialogfragment.CompoundAlertDialogFragment;
import rukina.gsr.dialogfragment.SimpleAlertDialogFragment;
import rukina.gsr.interfaces.DialogClickListener;

/**
 * Created by zahid.r on 2/3/2015.
 */
public class AlertDialogHelper {

    public static void showSimpleAlertDialog(Context context, String message) {
        DialogFragment simpleAlertDialogFragment = SimpleAlertDialogFragment.newInstance(
                R.string.empty, message);
        final Activity activity = (Activity) context;
        if (activity != null) {
            try {
                simpleAlertDialogFragment.setCancelable(false);
                simpleAlertDialogFragment.show(activity.getFragmentManager(), "dialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void showSimpleAlertDialog(Context context, String message, int tag) {
        DialogFragment simpleAlertDialogFragment = SimpleAlertDialogFragment.newInstance(
                R.string.empty, message, tag);
        final Activity activity = (Activity) context;
        if (activity != null) {
            try {
                simpleAlertDialogFragment.setCancelable(false);
                simpleAlertDialogFragment.show(activity.getFragmentManager(), "dialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void showAlertDialogForFragment(Context context, DialogClickListener dialogClickListener, String message, int tag) {
        AlertDialogForFragment alertDialogForFragment = AlertDialogForFragment.newInstance(
                R.string.empty, message, tag);
        alertDialogForFragment.setDialogListener(dialogClickListener);
        final Activity activity = (Activity) context;
        if (activity != null)
            try {
                alertDialogForFragment.setCancelable(false);
                alertDialogForFragment.show(activity.getFragmentManager(), "dialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void showCompoundAlertDialog(Context context, String title, String message, String posButton, String negButton, int tag) {
        CompoundAlertDialogFragment compoundDialogFragment = CompoundAlertDialogFragment.newInstance(title, message, posButton, negButton, tag);
        Activity activity = (Activity)context;
        if(activity != null) {
            compoundDialogFragment.show(activity.getFragmentManager(), "dialog");
        }

    }



}
