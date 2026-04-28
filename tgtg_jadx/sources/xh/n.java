package xh;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class n extends b0 {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44337b;

    public /* synthetic */ n(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f44337b = str;
        } else {
            c1.j(i11, 1, l.f44334a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f44337b, ((n) obj).f44337b);
    }

    public final int hashCode() {
        return this.f44337b.hashCode();
    }

    public final String toString() {
        return w.a0.p("CollectionDaysScreen(screenEntered=", this.f44337b, ")");
    }

    public n(String str) {
        this.f44337b = str;
    }
}
