package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22302a;

    public /* synthetic */ l1(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f22302a = str;
        } else {
            m90.c1.j(i11, 1, j1.f22296a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.areEqual(this.f22302a, ((l1) obj).f22302a);
    }

    public final int hashCode() {
        return this.f22302a.hashCode();
    }

    public final String toString() {
        return w.a0.p("ShareRecipeResponse(shareToken=", this.f22302a, ")");
    }
}
