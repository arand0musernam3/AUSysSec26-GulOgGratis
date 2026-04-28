package rg;

import android.app.PendingIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f37996c;

    public b(int i11, int i12, PendingIntent pendingIntent) {
        this.f37994a = i11;
        this.f37995b = i12;
        this.f37996c = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37994a == bVar.f37994a && this.f37995b == bVar.f37995b && Intrinsics.areEqual(this.f37996c, bVar.f37996c);
    }

    public final int hashCode() {
        return this.f37996c.hashCode() + r8.k.b(this.f37995b, Integer.hashCode(this.f37994a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbR = r8.k.r(this.f37994a, this.f37995b, "ErrorViewConfig(descriptionResId=", ", buttonTextResId=", ", pendingIntent=");
        sbR.append(this.f37996c);
        sbR.append(")");
        return sbR.toString();
    }
}
