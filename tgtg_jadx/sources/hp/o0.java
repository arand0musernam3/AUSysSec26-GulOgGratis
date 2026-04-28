package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22314d;

    public /* synthetic */ o0(int i11, String str, String str2, boolean z11, boolean z12) {
        if ((i11 & 1) == 0) {
            this.f22311a = "";
        } else {
            this.f22311a = str;
        }
        if ((i11 & 2) == 0) {
            this.f22312b = "";
        } else {
            this.f22312b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f22313c = false;
        } else {
            this.f22313c = z11;
        }
        if ((i11 & 8) == 0) {
            this.f22314d = false;
        } else {
            this.f22314d = z12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.areEqual(this.f22311a, o0Var.f22311a) && Intrinsics.areEqual(this.f22312b, o0Var.f22312b) && this.f22313c == o0Var.f22313c && this.f22314d == o0Var.f22314d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22314d) + r8.k.e(w2.l1.b(this.f22311a.hashCode() * 31, 31, this.f22312b), 31, this.f22313c);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("RecipeIngredient(name=", this.f22311a, ", amount=", this.f22312b, ", foundInPicture=");
        sbT.append(this.f22313c);
        sbT.append(", optional=");
        sbT.append(this.f22314d);
        sbT.append(")");
        return sbT.toString();
    }
}
