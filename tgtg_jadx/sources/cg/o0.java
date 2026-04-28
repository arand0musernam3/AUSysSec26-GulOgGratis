package cg;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ le.p f8042b;

    public /* synthetic */ o0(le.p pVar, int i11) {
        this.f8041a = i11;
        this.f8042b = pVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f8041a;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        int i12 = iIntValue & 17;
        switch (i11) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, i12 != 16)) {
                    o00.x0.f((he.k) this.f8042b.getValue(), d2.c.z(b4.q.f5711a, 8), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572912, 0, 4194236);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, i12 != 16)) {
                    o00.x0.f((he.k) this.f8042b.getValue(), d2.c.z(b4.q.f5711a, 8), false, 0.0f, Integer.MAX_VALUE, false, null, sVar2, 1572912, 0, 4194236);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
