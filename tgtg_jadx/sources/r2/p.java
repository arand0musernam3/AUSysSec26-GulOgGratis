package r2;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(Menu menu, int i11, Context context, TextClassification textClassification, int i12) {
        if (i12 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i11, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new c(1, context, textClassification));
            return;
        }
        boolean z11 = i12 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i12);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z11 ? 16908353 : 0, i11, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z11 ? 2 : 0);
        if (z11 || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: r2.o
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                PendingIntent actionIntent = remoteAction.getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    l.a(actionIntent);
                    return true;
                }
                actionIntent.send();
                return true;
            }
        });
    }
}
