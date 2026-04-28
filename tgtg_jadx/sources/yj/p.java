package yj;

import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.c3;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xj.k f46112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f46113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f46114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c3 f46115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f46116g;

    public /* synthetic */ p(ArrayList arrayList, xj.k kVar, Function1 function1, Function1 function12, c3 c3Var, b1 b1Var, int i11) {
        this.f46110a = i11;
        this.f46111b = arrayList;
        this.f46112c = kVar;
        this.f46113d = function1;
        this.f46114e = function12;
        this.f46115f = c3Var;
        this.f46116g = b1Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f46110a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    BasicItem basicItem = (BasicItem) this.f46111b.get(iIntValue);
                    sVar.a0(-1441913046);
                    t tVarA = f2.d.a(dVar, null, null, 7);
                    boolean zBooleanValue = ((Boolean) this.f46115f.getValue()).booleanValue();
                    xj.k kVar = this.f46112c;
                    boolean zH = sVar.h(kVar);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        objM = new n(kVar, this.f46116g, 0);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(kVar);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new o(kVar, 0);
                        sVar.k0(objM2);
                    }
                    a.g(tVarA, basicItem, kVar, zBooleanValue, this.f46113d, this.f46114e, function0, (Function1) objM2, sVar, 0);
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
                    i12 = (((s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    BasicItem basicItem2 = (BasicItem) this.f46111b.get(iIntValue3);
                    sVar2.a0(1498908833);
                    t tVarA2 = f2.d.a(dVar2, null, null, 7);
                    boolean zBooleanValue2 = ((Boolean) this.f46115f.getValue()).booleanValue();
                    xj.k kVar2 = this.f46112c;
                    boolean zH3 = sVar2.h(kVar2);
                    Object objM3 = sVar2.M();
                    m3.f fVar2 = m3.m.f29332a;
                    if (zH3 || objM3 == fVar2) {
                        objM3 = new n(kVar2, this.f46116g, 1);
                        sVar2.k0(objM3);
                    }
                    Function0 function02 = (Function0) objM3;
                    boolean zH4 = sVar2.h(kVar2);
                    Object objM4 = sVar2.M();
                    if (zH4 || objM4 == fVar2) {
                        objM4 = new o(kVar2, 1);
                        sVar2.k0(objM4);
                    }
                    a.g(tVarA2, basicItem2, kVar2, zBooleanValue2, this.f46113d, this.f46114e, function02, (Function1) objM4, sVar2, 0);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
