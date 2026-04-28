package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/m;", "Lb5/h1;", "Ld2/n;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.k f13843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f13845d;

    public m(b4.k kVar, boolean z11, Function1 function1) {
        this.f13843b = kVar;
        this.f13844c = z11;
        this.f13845d = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        n nVar = new n();
        nVar.f13857o = this.f13843b;
        nVar.f13858p = this.f13844c;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && Intrinsics.areEqual(this.f13843b, mVar.f13843b) && this.f13844c == mVar.f13844c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13844c) + (this.f13843b.hashCode() * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13845d.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        n nVar = (n) sVar;
        nVar.f13857o = this.f13843b;
        nVar.f13858p = this.f13844c;
    }
}
