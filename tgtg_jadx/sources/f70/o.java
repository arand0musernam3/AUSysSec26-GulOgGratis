package f70;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17499b;

    public o(Uri uri) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        uri.getClass();
        this.f17498a = uri;
        this.f17499b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f17498a, oVar.f17498a) && this.f17499b == oVar.f17499b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17499b) + (this.f17498a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenUri(uri=" + this.f17498a + ", timestamp=" + this.f17499b + ")";
    }
}
