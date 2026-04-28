package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22336a;

    public /* synthetic */ y0(int i11, g gVar) {
        if (1 == (i11 & 1)) {
            this.f22336a = gVar;
        } else {
            m90.c1.j(i11, 1, w0.f22332a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.areEqual(this.f22336a, ((y0) obj).f22336a);
    }

    public final int hashCode() {
        return this.f22336a.hashCode();
    }

    public final String toString() {
        return "SaveRecipeRequest(recipe=" + this.f22336a + ")";
    }

    public y0(g gVar) {
        gVar.getClass();
        this.f22336a = gVar;
    }
}
