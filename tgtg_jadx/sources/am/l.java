package am;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l extends m {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1614c;

    public /* synthetic */ l(int i11, String str, String str2) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, j.f1612a.getDescriptor());
            throw null;
        }
        this.f1613b = str;
        this.f1614c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f1613b, lVar.f1613b) && Intrinsics.areEqual(this.f1614c, lVar.f1614c);
    }

    public final int hashCode() {
        return this.f1614c.hashCode() + (this.f1613b.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("VerifyEmailScreen(email=", this.f1613b, ", pollingId=", this.f1614c, ")");
    }

    public l(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1613b = str;
        this.f1614c = str2;
    }
}
