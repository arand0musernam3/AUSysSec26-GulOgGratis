package y9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f45634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String[] strArr, y yVar) {
        super(strArr);
        this.f45634b = yVar;
    }

    @Override // y9.i
    public final void a(Set set) {
        set.getClass();
        q.a aVarH = q.a.H();
        m0.l lVar = new m0.l(this.f45634b, 29);
        if (aVarH.f35696f.I()) {
            lVar.run();
        } else {
            aVarH.I(lVar);
        }
    }
}
