package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22315a;

    public /* synthetic */ o1(int i11, g gVar) {
        if (1 == (i11 & 1)) {
            this.f22315a = gVar;
        } else {
            m90.c1.j(i11, 1, m1.f22304a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && Intrinsics.areEqual(this.f22315a, ((o1) obj).f22315a);
    }

    public final int hashCode() {
        return this.f22315a.hashCode();
    }

    public final String toString() {
        return "SharedRecipeResponse(recipe=" + this.f22315a + ")";
    }
}
