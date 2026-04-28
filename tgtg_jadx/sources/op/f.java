package op;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f32902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f32903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f32904c;

    public /* synthetic */ f(int i11, h hVar, c cVar, l lVar) {
        if (6 != (i11 & 6)) {
            c1.j(i11, 6, d.f32901a.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.f32902a = h.UNKNOWN;
        } else {
            this.f32902a = hVar;
        }
        this.f32903b = cVar;
        this.f32904c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f32902a == fVar.f32902a && Intrinsics.areEqual(this.f32903b, fVar.f32903b) && Intrinsics.areEqual(this.f32904c, fVar.f32904c);
    }

    public final int hashCode() {
        int iHashCode = this.f32902a.hashCode() * 31;
        c cVar = this.f32903b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        l lVar = this.f32904c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "MetroSearch(type=" + this.f32902a + ", line=" + this.f32903b + ", station=" + this.f32904c + ")";
    }
}
