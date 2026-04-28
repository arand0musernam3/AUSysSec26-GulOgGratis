package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f2661a;

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((o0) iVar).f2650b).setBigContentTitle(this.mBigContentTitle).bigText(this.f2661a);
        if (this.mSummaryTextSet) {
            bigTextStyleBigText.setSummaryText(this.mSummaryText);
        }
    }

    public final void c(CharSequence charSequence) {
        this.mBigContentTitle = s.b(charSequence);
    }

    @Override // androidx.core.app.l0
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.bigText");
    }

    public final void d(CharSequence charSequence) {
        this.mSummaryText = s.b(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.f2661a = bundle.getCharSequence("android.bigText");
    }
}
