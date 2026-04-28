package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u70.j[] f22263f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f22265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f22268e;

    static {
        u70.m mVar = u70.m.PUBLICATION;
        f22263f = new u70.j[]{null, null, u70.l.a(mVar, new h60.b(28)), u70.l.a(mVar, new h60.b(29)), null};
    }

    public /* synthetic */ e0(int i11, String str, Long l, List list, List list2, Boolean bool) {
        if (16 != (i11 & 16)) {
            m90.c1.j(i11, 16, c0.f22260a.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.f22264a = null;
        } else {
            this.f22264a = str;
        }
        if ((i11 & 2) == 0) {
            this.f22265b = null;
        } else {
            this.f22265b = l;
        }
        if ((i11 & 4) == 0) {
            this.f22266c = null;
        } else {
            this.f22266c = list;
        }
        if ((i11 & 8) == 0) {
            this.f22267d = null;
        } else {
            this.f22267d = list2;
        }
        this.f22268e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f22264a, e0Var.f22264a) && Intrinsics.areEqual(this.f22265b, e0Var.f22265b) && Intrinsics.areEqual(this.f22266c, e0Var.f22266c) && Intrinsics.areEqual(this.f22267d, e0Var.f22267d) && Intrinsics.areEqual(this.f22268e, e0Var.f22268e);
    }

    public final int hashCode() {
        String str = this.f22264a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f22265b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f22266c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f22267d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f22268e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "RecipeGeneratorPollingResponse(status=" + this.f22264a + ", pollingIntervalMilliseconds=" + this.f22265b + ", ingredientsFoundInPictures=" + this.f22266c + ", recipes=" + this.f22267d + ", additionalRequestsAvailable=" + this.f22268e + ")";
    }
}
