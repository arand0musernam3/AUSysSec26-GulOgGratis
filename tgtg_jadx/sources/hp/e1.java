package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u70.j[] f22269c = {null, u70.l.a(u70.m.PUBLICATION, new f0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22271b;

    public /* synthetic */ e1(List list, int i11, int i12) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, c1.f22261a.getDescriptor());
            throw null;
        }
        this.f22270a = i12;
        this.f22271b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f22270a == e1Var.f22270a && Intrinsics.areEqual(this.f22271b, e1Var.f22271b);
    }

    public final int hashCode() {
        return this.f22271b.hashCode() + (Integer.hashCode(this.f22270a) * 31);
    }

    public final String toString() {
        return "SavedRecipeListResponse(maxNumberOfRecipes=" + this.f22270a + ", recipes=" + this.f22271b + ")";
    }
}
