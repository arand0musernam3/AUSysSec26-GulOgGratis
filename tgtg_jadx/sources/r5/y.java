package r5;

import kotlin.jvm.internal.Intrinsics;
import m5.k0;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f37714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f37716c;

    public y(m5.h hVar, long j9, t0 t0Var) {
        t0 t0Var2;
        this.f37714a = hVar;
        this.f37715b = k0.d(hVar.f29538b.length(), j9);
        if (t0Var != null) {
            t0Var2 = new t0(k0.d(hVar.f29538b.length(), t0Var.f29650a));
        } else {
            t0Var2 = null;
        }
        this.f37716c = t0Var2;
    }

    public static y a(y yVar, String str, long j9, int i11) {
        if ((i11 & 2) != 0) {
            j9 = yVar.f37715b;
        }
        t0 t0Var = yVar.f37716c;
        yVar.getClass();
        return new y(new m5.h(str), j9, t0Var);
    }

    public static y b(y yVar, m5.h hVar, long j9, int i11) {
        if ((i11 & 1) != 0) {
            hVar = yVar.f37714a;
        }
        if ((i11 & 2) != 0) {
            j9 = yVar.f37715b;
        }
        t0 t0Var = (i11 & 4) != 0 ? yVar.f37716c : null;
        yVar.getClass();
        return new y(hVar, j9, t0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return t0.c(this.f37715b, yVar.f37715b) && Intrinsics.areEqual(this.f37716c, yVar.f37716c) && Intrinsics.areEqual(this.f37714a, yVar.f37714a);
    }

    public final int hashCode() {
        int iHashCode = this.f37714a.hashCode() * 31;
        int i11 = t0.f29649c;
        int iB = e0.f.b(iHashCode, 31, this.f37715b);
        t0 t0Var = this.f37716c;
        return iB + (t0Var != null ? Long.hashCode(t0Var.f29650a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f37714a) + "', selection=" + ((Object) t0.i(this.f37715b)) + ", composition=" + this.f37716c + ')';
    }

    public y(int i11, long j9, String str) {
        this(new m5.h((i11 & 1) != 0 ? "" : str), (i11 & 2) != 0 ? t0.f29648b : j9, (t0) null);
    }
}
