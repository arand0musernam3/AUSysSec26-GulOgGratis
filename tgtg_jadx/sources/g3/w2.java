package g3;

import android.app.Activity;
import android.view.View;
import b4.q;
import c5.d2;
import com.app.tgtg.model.remote.user.response.charity.Product;
import g3.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19691f;

    public /* synthetic */ w2(ArrayList arrayList, boolean z11, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.f19686a = 2;
        this.f19688c = arrayList;
        this.f19687b = z11;
        this.f19689d = arrayList2;
        this.f19690e = arrayList3;
        this.f19691f = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19686a) {
            case 0:
                m3.k1 k1Var = ((t1.k0) this.f19688c).f39472d;
                m3.b1 b1Var = (m3.b1) this.f19689d;
                m3.c3 c3Var = (m3.c3) this.f19690e;
                m3.c3 c3Var2 = (m3.c3) this.f19691f;
                i4.s0 s0Var = (i4.s0) obj;
                boolean z11 = this.f19687b;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                s0Var.o(!z11 ? ((Number) c3Var.getValue()).floatValue() : ((Boolean) k1Var.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z11) {
                    fFloatValue = ((Number) c3Var.getValue()).floatValue();
                } else if (((Boolean) k1Var.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                s0Var.p(fFloatValue);
                if (!z11) {
                    fFloatValue2 = ((Number) c3Var2.getValue()).floatValue();
                } else if (!((Boolean) k1Var.getValue()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                s0Var.c(fFloatValue2);
                s0Var.w(((i4.z0) b1Var.getValue()).f23337a);
                break;
            case 1:
                jg.a0 a0Var = (jg.a0) this.f19688c;
                Activity activity = (Activity) this.f19689d;
                List list = (List) this.f19690e;
                List list2 = (List) this.f19691f;
                ((View) obj).getClass();
                a0Var.h(activity, list, list2, this.f19687b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f19688c;
                ArrayList arrayList2 = (ArrayList) this.f19689d;
                final ArrayList arrayList3 = (ArrayList) this.f19690e;
                String str = (String) this.f19691f;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                boolean zIsEmpty = arrayList.isEmpty();
                final boolean z12 = this.f19687b;
                if (!zIsEmpty && z12) {
                    f2.l.q(lVar, null, new u3.d(new a3.u1(15, arrayList, str), true, -782184852), 3);
                }
                if (!arrayList2.isEmpty()) {
                    f2.l.q(lVar, null, new u3.d(new a3.u1(16, arrayList2, arrayList3), true, 1083378901), 3);
                }
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    f2.l.q(lVar, null, ji.i.f25281a, 3);
                }
                f2.l.s(lVar, arrayList3.size(), null, new u3.d(new i80.o() { // from class: ji.c
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj3).intValue();
                        n nVar = (n) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((f2.d) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                        }
                        s sVar = (s) nVar;
                        if (sVar.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            q qVar = q.f5711a;
                            boolean z13 = z12;
                            ArrayList arrayList4 = arrayList3;
                            if (z13) {
                                sVar.a0(214259500);
                                i.d(d2.j(d2.c.B(qVar, 16, 0.0f, 2), "CharityInventoryItemChangelog"), (Product) arrayList4.get(iIntValue), sVar, 6);
                                sVar.q(false);
                            } else {
                                sVar.a0(214574398);
                                i.c(d2.j(d2.c.B(qVar, 16, 0.0f, 2), "CharityInventoryItem"), (Product) arrayList4.get(iIntValue), sVar, 6);
                                sVar.q(false);
                            }
                            if (iIntValue < arrayList4.size() - 1) {
                                sVar.a0(214912515);
                                s0.g(d2.j(d2.c.B(qVar, 16, 0.0f, 2), "Divider"), 1, lv.s.H, sVar, 438, 0);
                                sVar.q(false);
                            } else {
                                sVar.a0(215220996);
                                sVar.q(false);
                            }
                        } else {
                            sVar.U();
                        }
                        return Unit.f26487a;
                    }
                }, true, 1516531006), 6);
                break;
            case 3:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f19688c;
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) this.f19689d;
                l9.f fVar = (l9.f) this.f19690e;
                kotlin.collections.t tVar = (kotlin.collections.t) this.f19691f;
                g9.l lVar2 = (g9.l) obj;
                lVar2.getClass();
                booleanRef.element = true;
                booleanRef2.element = true;
                fVar.r(lVar2, this.f19687b, tVar);
                break;
            case 4:
                String str2 = (String) this.f19688c;
                List list3 = (List) this.f19689d;
                String str3 = (String) this.f19690e;
                jd.f fVar2 = (jd.f) this.f19691f;
                f2.l lVar3 = (f2.l) obj;
                lVar3.getClass();
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    f2.l.q(lVar3, null, new u3.d(new ph.c(str3, str2, 0), true, -1111361671), 3);
                }
                lVar3.r(list3.size(), new ao.p2(15, new p60.a(2), list3), new cn.n(list3, 17), new u3.d(new ph.f(list3, fVar2, str3, this.f19687b), true, 2039820996));
                break;
            case 5:
                List list4 = (List) this.f19688c;
                op.c cVar = (op.c) this.f19689d;
                List list5 = (List) this.f19690e;
                Function1 function1 = (Function1) this.f19691f;
                f2.l lVar4 = (f2.l) obj;
                lVar4.getClass();
                f2.l.q(lVar4, null, new u3.d(new a3.m2(cVar, 28), true, 1025879950), 3);
                if (list4 != null) {
                    lVar4.r(list4.size(), null, new cn.n(list4, 25), new u3.d(new tp.g(list4, list5, cVar, this.f19687b, function1), true, 802480018));
                }
                break;
            default:
                Ref.LongRef longRef = (Ref.LongRef) this.f19688c;
                x2.w wVar = (x2.w) this.f19689d;
                m2.t0 t0Var = (m2.t0) this.f19690e;
                Ref.LongRef longRef2 = (Ref.LongRef) this.f19691f;
                long jA = a3.m1.a(wVar.o(this.f19687b));
                longRef.element = jA;
                wVar.z(t0Var, jA);
                longRef2.element = 0L;
                wVar.f43801v = -1;
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ w2(Object obj, Object obj2, Object obj3, boolean z11, Object obj4, int i11) {
        this.f19686a = i11;
        this.f19688c = obj;
        this.f19689d = obj2;
        this.f19690e = obj3;
        this.f19687b = z11;
        this.f19691f = obj4;
    }

    public /* synthetic */ w2(Object obj, Object obj2, Object obj3, Object obj4, boolean z11, int i11) {
        this.f19686a = i11;
        this.f19688c = obj;
        this.f19689d = obj2;
        this.f19690e = obj3;
        this.f19691f = obj4;
        this.f19687b = z11;
    }

    public /* synthetic */ w2(Ref.LongRef longRef, Ref.LongRef longRef2, m2.t0 t0Var, x2.w wVar, boolean z11) {
        this.f19686a = 6;
        this.f19688c = longRef;
        this.f19689d = wVar;
        this.f19687b = z11;
        this.f19690e = t0Var;
        this.f19691f = longRef2;
    }

    public /* synthetic */ w2(boolean z11, t1.k0 k0Var, m3.b1 b1Var, t1.p1 p1Var, t1.p1 p1Var2) {
        this.f19686a = 0;
        this.f19687b = z11;
        this.f19688c = k0Var;
        this.f19689d = b1Var;
        this.f19690e = p1Var;
        this.f19691f = p1Var2;
    }
}
