package xh;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class z extends b0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44348b;

    public /* synthetic */ z(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f44348b = str;
        } else {
            c1.j(i11, 1, x.f44347a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f44348b, ((z) obj).f44348b);
    }

    public final int hashCode() {
        return this.f44348b.hashCode();
    }

    public final String toString() {
        return w.a0.p("ShareReservationScreen(orderId=", this.f44348b, ")");
    }

    public z(String str) {
        str.getClass();
        this.f44348b = str;
    }
}
