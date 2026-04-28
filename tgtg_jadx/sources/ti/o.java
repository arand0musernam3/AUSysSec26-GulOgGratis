package ti;

import g3.g7;
import g3.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f40250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f40251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f40252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g7 f40254g;

    public /* synthetic */ o(List list, s sVar, b0 b0Var, String str, ArrayList arrayList, g7 g7Var, int i11) {
        this.f40248a = i11;
        this.f40249b = list;
        this.f40250c = sVar;
        this.f40251d = b0Var;
        this.f40252e = str;
        this.f40253f = arrayList;
        this.f40254g = g7Var;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f40248a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    List list = (List) this.f40249b.get(iIntValue);
                    sVar.a0(-1978836228);
                    boolean zH = sVar.h(this.f40250c) | sVar.h(list) | sVar.h(this.f40251d) | sVar.f(this.f40252e);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        m mVar = new m(this.f40250c, list, this.f40251d, this.f40254g, this.f40252e, 0);
                        sVar.k0(mVar);
                        objM = mVar;
                    }
                    t.d(0, list, (Function0) objM, sVar);
                    if (iIntValue < t.g(this.f40253f).size() - 1) {
                        sVar.a0(-1978083766);
                        s0.g(d2.c.B(b4.q.f5711a, lv.t.f28253g, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1977800271);
                        sVar.q(false);
                    }
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((m3.s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((m3.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    List list2 = (List) this.f40249b.get(iIntValue3);
                    sVar2.a0(-130067481);
                    boolean zH2 = sVar2.h(this.f40250c) | sVar2.h(list2) | sVar2.h(this.f40251d) | sVar2.f(this.f40252e);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == m3.m.f29332a) {
                        m mVar2 = new m(this.f40250c, list2, this.f40251d, this.f40254g, this.f40252e, 1);
                        sVar2.k0(mVar2);
                        objM2 = mVar2;
                    }
                    t.d(0, list2, (Function0) objM2, sVar2);
                    if (iIntValue3 < t.g(this.f40253f).size() - 1) {
                        sVar2.a0(-129316941);
                        s0.g(d2.c.B(b4.q.f5711a, lv.t.f28253g, 0.0f, 2), 1, lv.s.H, sVar2, 438, 0);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-129033446);
                        sVar2.q(false);
                    }
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
