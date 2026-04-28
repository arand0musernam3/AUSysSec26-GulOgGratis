package r2;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37544c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f37542a = i11;
        this.f37543b = obj;
        this.f37544c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.f37542a) {
            case 0:
                ((p2.d) this.f37543b).f34133d.invoke(((d) this.f37544c).f37545a);
                break;
            default:
                Context context = (Context) this.f37543b;
                TextClassification textClassification = (TextClassification) this.f37544c;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT < 34) {
                    activity.send();
                } else {
                    l.a(activity);
                }
                break;
        }
        return true;
    }
}
