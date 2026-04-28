package xh;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class r extends b0 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44341d;

    public /* synthetic */ r(String str, int i11, String str2, boolean z11) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, p.f44338a.getDescriptor());
            throw null;
        }
        this.f44339b = str;
        this.f44340c = z11;
        if ((i11 & 4) == 0) {
            this.f44341d = null;
        } else {
            this.f44341d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f44339b, rVar.f44339b) && this.f44340c == rVar.f44340c && Intrinsics.areEqual(this.f44341d, rVar.f44341d);
    }

    public final int hashCode() {
        int iE = r8.k.e(this.f44339b.hashCode() * 31, 31, this.f44340c);
        String str = this.f44341d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InventoryScreen(charityItemId=");
        sb2.append(this.f44339b);
        sb2.append(", showChangelog=");
        sb2.append(this.f44340c);
        sb2.append(", lastChangelog=");
        return r8.k.p(sb2, this.f44341d, ")");
    }

    public r(String str, String str2, boolean z11) {
        str.getClass();
        this.f44339b = str;
        this.f44340c = z11;
        this.f44341d = str2;
    }
}
