package z2;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46914c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f46915d = null;

    public s(String str, String str2) {
        this.f46912a = str;
        this.f46913b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f46912a, sVar.f46912a) && Intrinsics.areEqual(this.f46913b, sVar.f46913b) && this.f46914c == sVar.f46914c && Intrinsics.areEqual(this.f46915d, sVar.f46915d);
    }

    public final int hashCode() {
        int iE = r8.k.e(l1.b(this.f46912a.hashCode() * 31, 31, this.f46913b), 31, this.f46914c);
        e eVar = this.f46915d;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f46915d);
        sb2.append(", isShowingSubstitution=");
        return r8.k.q(sb2, this.f46914c, ')');
    }
}
