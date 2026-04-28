package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22329c;

    public /* synthetic */ u0(String str, int i11, String str2, boolean z11) {
        if ((i11 & 1) == 0) {
            this.f22327a = "";
        } else {
            this.f22327a = str;
        }
        if ((i11 & 2) == 0) {
            this.f22328b = "";
        } else {
            this.f22328b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f22329c = false;
        } else {
            this.f22329c = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.f22327a, u0Var.f22327a) && Intrinsics.areEqual(this.f22328b, u0Var.f22328b) && this.f22329c == u0Var.f22329c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22329c) + w2.l1.b(this.f22327a.hashCode() * 31, 31, this.f22328b);
    }

    public final String toString() {
        return j4.s.o(e0.f.t("RecipeTag(id=", this.f22327a, ", text=", this.f22328b, ", preSelected="), this.f22329c, ")");
    }
}
