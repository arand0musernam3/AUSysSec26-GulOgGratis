package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2710a = new ArrayList();

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((o0) iVar).f2650b).setBigContentTitle(this.mBigContentTitle);
        if (this.mSummaryTextSet) {
            bigContentTitle.setSummaryText(this.mSummaryText);
        }
        Iterator it = this.f2710a.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
        }
    }

    @Override // androidx.core.app.l0
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.textLines");
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.f2710a;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
