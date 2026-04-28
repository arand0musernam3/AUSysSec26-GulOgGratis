package s2;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls2/i;", "Lb5/h1;", "Ls2/j;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f38767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z70.i f38768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f38769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f38770e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(l lVar, Function1 function1, Function1 function12, Function1 function13) {
        this.f38767b = lVar;
        this.f38768c = (z70.i) function1;
        this.f38769d = function12;
        this.f38770e = function13;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // b5.h1
    public final s create() {
        return new j(this.f38767b, this.f38768c, this.f38769d, this.f38770e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f38767b == iVar.f38767b && this.f38768c == iVar.f38768c && this.f38769d == iVar.f38769d && this.f38770e == iVar.f38770e;
    }

    public final int hashCode() {
        int iHashCode = (this.f38768c.hashCode() + (this.f38767b.hashCode() * 31)) * 31;
        Function1 function1 = this.f38769d;
        return this.f38770e.hashCode() + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @Override // b5.h1
    public final void update(s sVar) {
        j jVar = (j) sVar;
        jVar.f38771q.f38778a = null;
        l lVar = this.f38767b;
        jVar.f38771q = lVar;
        lVar.f38778a = jVar;
        lVar.f38779b = jVar.isAttached() ? k.Attached : k.Detached;
        jVar.f38772r = this.f38768c;
        jVar.f38773s = this.f38769d;
        jVar.f38774t = this.f38770e;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
