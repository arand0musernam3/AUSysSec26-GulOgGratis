package rb;

import android.net.NetworkRequest;
import ib.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37840b = w.f("NetworkRequestCompat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37841a;

    public f(NetworkRequest networkRequest) {
        this.f37841a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f37841a, ((f) obj).f37841a);
    }

    public final int hashCode() {
        Object obj = this.f37841a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f37841a + ')';
    }
}
