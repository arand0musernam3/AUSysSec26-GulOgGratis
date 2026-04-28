package x80;

import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f44077b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44078a;

    public static final Object a(Object obj) {
        if (obj instanceof o) {
            return null;
        }
        return obj;
    }

    public static final void b(Object obj) {
        if (obj instanceof o) {
            if (!(obj instanceof n)) {
                h2.b("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th2 = ((n) obj).f44076a;
            if (th2 != null) {
                throw th2;
            }
            h2.b("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f44078a, ((p) obj).f44078a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f44078a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f44078a;
        if (obj instanceof n) {
            return ((n) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
