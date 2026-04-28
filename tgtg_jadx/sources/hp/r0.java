package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22322b;

    public /* synthetic */ r0(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f22321a = "";
        } else {
            this.f22321a = str;
        }
        if ((i11 & 2) == 0) {
            this.f22322b = "";
        } else {
            this.f22322b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f22321a, r0Var.f22321a) && Intrinsics.areEqual(this.f22322b, r0Var.f22322b);
    }

    public final int hashCode() {
        return this.f22322b.hashCode() + (this.f22321a.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("RecipeStep(title=", this.f22321a, ", description=", this.f22322b, ")");
    }
}
