package c50;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f7598d = {null, null, new m90.f0(r1.f29848a, c0.f7506a, 1)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f7599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f7600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7601c;

    public /* synthetic */ l0(int i11, q0 q0Var, j1 j1Var, Map map) {
        if (1 != (i11 & 1)) {
            m90.c1.j(i11, 1, j0.f7589a.getDescriptor());
            throw null;
        }
        this.f7599a = q0Var;
        if ((i11 & 2) == 0) {
            this.f7600b = null;
        } else {
            this.f7600b = j1Var;
        }
        if ((i11 & 4) == 0) {
            this.f7601c = null;
        } else {
            this.f7601c = map;
        }
    }

    public static l0 a(l0 l0Var, q0 q0Var, j1 j1Var, Map map, int i11) {
        if ((i11 & 1) != 0) {
            q0Var = l0Var.f7599a;
        }
        if ((i11 & 2) != 0) {
            j1Var = l0Var.f7600b;
        }
        if ((i11 & 4) != 0) {
            map = l0Var.f7601c;
        }
        l0Var.getClass();
        q0Var.getClass();
        return new l0(q0Var, j1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.f7599a, l0Var.f7599a) && Intrinsics.areEqual(this.f7600b, l0Var.f7600b) && Intrinsics.areEqual(this.f7601c, l0Var.f7601c);
    }

    public final int hashCode() {
        int iHashCode = this.f7599a.hashCode() * 31;
        j1 j1Var = this.f7600b;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : Long.hashCode(j1Var.f7590a))) * 31;
        Map map = this.f7601c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f7599a + ", backgroundTime=" + this.f7600b + ", processDataMap=" + this.f7601c + ')';
    }

    public l0(q0 q0Var, j1 j1Var, Map map) {
        q0Var.getClass();
        this.f7599a = q0Var;
        this.f7600b = j1Var;
        this.f7601c = map;
    }
}
