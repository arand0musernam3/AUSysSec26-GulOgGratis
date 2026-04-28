package z20;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f46930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f46931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46932e = false;

    public a(int i11, int i12, long j9, long j11, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f46928a = i11;
        this.f46929b = i12;
        this.f46930c = pendingIntent;
        this.f46931d = pendingIntent2;
    }

    public final PendingIntent a(m mVar) {
        PendingIntent pendingIntent;
        int i11 = mVar.f46967a;
        if (i11 == 0) {
            PendingIntent pendingIntent2 = this.f46931d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i11 != 1 || (pendingIntent = this.f46930c) == null) {
            return null;
        }
        return pendingIntent;
    }
}
