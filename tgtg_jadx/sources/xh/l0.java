package xh;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l0 extends m0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44335b;

    public /* synthetic */ l0(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f44335b = str;
        } else {
            c1.j(i11, 1, j0.f44332a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.areEqual(this.f44335b, ((l0) obj).f44335b);
    }

    public final int hashCode() {
        return this.f44335b.hashCode();
    }

    public final String toString() {
        return w.a0.p("SearchCharityScreen(charityId=", this.f44335b, ")");
    }

    public l0(String str) {
        str.getClass();
        this.f44335b = str;
    }
}
