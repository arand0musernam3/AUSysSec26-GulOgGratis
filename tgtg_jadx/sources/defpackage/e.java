package defpackage;

import a.a;
import d2.m2;
import g3.k8;
import g3.r9;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15269a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f15272d;

    public /* synthetic */ e(List list, int i11, Function1 function1) {
        this.f15270b = list;
        this.f15271c = i11;
        this.f15272d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15269a) {
            case 0:
                ((Integer) obj2).intValue();
                a.m(this.f15270b, this.f15272d, (n) obj, i.F(this.f15271c | 1));
                return Unit.f26487a;
            default:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i11 = 0;
                    for (Object obj3 : this.f15270b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            d0.n();
                            throw null;
                        }
                        final String str = (String) obj3;
                        final int i13 = this.f15271c;
                        boolean z11 = i13 == i11;
                        long j9 = lv.s.J;
                        Function1 function1 = this.f15272d;
                        boolean zF = sVar.f(function1) | sVar.d(i11);
                        Object objM = sVar.M();
                        if (zF || objM == m.f29332a) {
                            objM = new lp.s(i11, 0, function1);
                            sVar.k0(objM);
                        }
                        k8.b(z11, (Function0) objM, null, false, u3.e.e(-718046653, sVar, new Function2() { // from class: lp.t
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                m3.n nVar2 = (m3.n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                m3.s sVar2 = (m3.s) nVar2;
                                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    r9.d(str, d2.c.B(m2.d(b4.q.f5711a, 1.0f), lv.t.f28253g, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, i13 == i11 ? u0.a(lv.v.f28274n, lv.s.f28217b, 0L, q5.r.f36046k, null, 0L, null, 0, 0L, null, null, 16777210) : u0.a(lv.v.f28274n, lv.s.D, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar2, 48, 0, 130044);
                                } else {
                                    sVar2.U();
                                }
                                return Unit.f26487a;
                            }
                        }), j9, 0L, sVar, 1597440, 428);
                        i11 = i12;
                    }
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ e(List list, Function1 function1, int i11) {
        this.f15270b = list;
        this.f15272d = function1;
        this.f15271c = i11;
    }
}
