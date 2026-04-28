package z2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f46886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m5.h f46887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46888c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f46889d = null;

    public o(m5.h hVar, m5.h hVar2) {
        this.f46886a = hVar;
        this.f46887b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f46886a, oVar.f46886a) && Intrinsics.areEqual(this.f46887b, oVar.f46887b) && this.f46888c == oVar.f46888c && Intrinsics.areEqual(this.f46889d, oVar.f46889d);
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f46887b.hashCode() + (this.f46886a.hashCode() * 31)) * 31, 31, this.f46888c);
        d dVar = this.f46889d;
        return iE + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f46886a) + ", substitution=" + ((Object) this.f46887b) + ", isShowingSubstitution=" + this.f46888c + ", layoutCache=" + this.f46889d + ')';
    }
}
