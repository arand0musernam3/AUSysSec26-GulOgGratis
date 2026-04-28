package f70;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17497a;

    public n(Uri uri) {
        uri.getClass();
        this.f17497a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f17497a, ((n) obj).f17497a);
    }

    public final int hashCode() {
        return this.f17497a.hashCode();
    }

    public final String toString() {
        return "OpenPdf(uri=" + this.f17497a + ")";
    }
}
