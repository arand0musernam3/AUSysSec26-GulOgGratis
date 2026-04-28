package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f22289d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22292c;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f22289d = new u70.j[]{u70.l.a(mVar, new f0(0)), u70.l.a(mVar, new f0(1)), u70.l.a(mVar, new f0(2))};
    }

    public i0(int i11, List list, List list2, List list3) {
        if (1 != (i11 & 1)) {
            m90.c1.j(i11, 1, g0.f22286a.getDescriptor());
            throw null;
        }
        this.f22290a = list;
        if ((i11 & 2) == 0) {
            this.f22291b = kotlin.collections.n0.f26529a;
        } else {
            this.f22291b = list2;
        }
        if ((i11 & 4) == 0) {
            this.f22292c = null;
        } else {
            this.f22292c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f22290a, i0Var.f22290a) && Intrinsics.areEqual(this.f22291b, i0Var.f22291b) && Intrinsics.areEqual(this.f22292c, i0Var.f22292c);
    }

    public final int hashCode() {
        int iC = e0.f.c(this.f22291b, this.f22290a.hashCode() * 31, 31);
        List list = this.f22292c;
        return iC + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecipeGeneratorRequest(fileUrls=");
        sb2.append(this.f22290a);
        sb2.append(", tags=");
        sb2.append(this.f22291b);
        sb2.append(", previousGeneratedRecipes=");
        return e0.f.p(sb2, this.f22292c, ")");
    }

    public i0(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        this.f22290a = list;
        this.f22291b = list2;
        this.f22292c = list3;
    }
}
