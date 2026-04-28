package f2;

import d2.j2;
import g3.d8;
import g3.p8;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17129c;

    public /* synthetic */ j(int i11, x60.h hVar) {
        this.f17127a = 2;
        this.f17128b = i11;
        this.f17129c = hVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17127a) {
            case 0:
                u3.d dVar = (u3.d) this.f17129c;
                d dVar2 = (d) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar).f(dVar2) ? 4 : 2;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dVar.invoke(dVar2, Integer.valueOf(this.f17128b), sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.U();
                }
                break;
            case 1:
                Function0 function0 = (Function0) this.f17129c;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zF = sVar2.f(function0);
                    Object objM = sVar2.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new nn.m(6, function0);
                        sVar2.k0(objM);
                    }
                    s0.h((Function0) objM, null, false, null, null, null, u3.e.e(-144989158, sVar2, new c60.b(this.f17128b, 28)), sVar2, 1572864, 62);
                } else {
                    sVar2.U();
                }
                break;
            default:
                x60.h hVar = (x60.h) this.f17129c;
                d8 d8Var = (d8) obj;
                ((Integer) obj3).getClass();
                d8Var.getClass();
                p8.f19327a.b(d8Var.a(this.f17128b, false), 0.0f, 0.0f, hVar.J, null, (m3.n) obj2, 0, 22);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j(u70.f fVar, int i11, int i12) {
        this.f17127a = i12;
        this.f17129c = fVar;
        this.f17128b = i11;
    }
}
