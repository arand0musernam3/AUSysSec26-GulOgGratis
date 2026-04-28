package ib;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f23750c;

    public n(int i11, Notification notification, int i12) {
        this.f23748a = i11;
        this.f23750c = notification;
        this.f23749b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f23748a == nVar.f23748a && this.f23749b == nVar.f23749b) {
            return this.f23750c.equals(nVar.f23750c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23750c.hashCode() + (((this.f23748a * 31) + this.f23749b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f23748a + ", mForegroundServiceType=" + this.f23749b + ", mNotification=" + this.f23750c + '}';
    }
}
