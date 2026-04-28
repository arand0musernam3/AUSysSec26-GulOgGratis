package tq;

import a3.l3;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c50.p;
import cg.o;
import com.app.tgtg.R;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.app.tgtg.model.local.GenericErrors;
import d2.i;
import d2.j2;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import d2.z1;
import g3.r9;
import g3.u7;
import i4.g0;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import lv.v;
import m2.u0;
import m3.f;
import m3.m;
import m3.s;
import m5.k0;
import m5.t0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import rs.l;
import s1.z;
import w2.e1;
import w2.s1;
import x2.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40421b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f40420a = i11;
        this.f40421b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f40420a;
        f fVar = m.f29332a;
        Object obj4 = this.f40421b;
        switch (i11) {
            case 0:
                GenericErrors genericErrors = (GenericErrors) obj4;
                z1 z1Var = (z1) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    t tVarR = d2.c.r(m2.c(m2.d(d2.c.y(v1.n.j(q.f5711a, lv.s.J, g0.f23254b), z1Var), 1.0f), 1.0f));
                    y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarR, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    o.a(genericErrors, null, null, sVar, 0, 6);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                t5.a aVar = (t5.a) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zH = sVar2.h(aVar);
                    Object objM = sVar2.M();
                    if (zH || objM == fVar) {
                        objM = new l(5, aVar);
                        sVar2.k0(objM);
                    }
                    us.a.s(null, (Function0) objM, sVar2, 0, 1);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((p) obj4).invoke((Throwable) obj);
                break;
            case 3:
                u7 u7Var = (u7) obj4;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    na0.a.M(u7Var, sVar3, 8);
                } else {
                    sVar3.U();
                }
                break;
            case 4:
                AddPhoneNumberFragment addPhoneNumberFragment = (AddPhoneNumberFragment) obj4;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                t tVarA = u.f13938a.a(d2.c.D(q.f5711a, 0.0f, 0.0f, 0.0f, 24, 7), b4.d.f5690h);
                s sVar4 = (s) ((m3.n) obj2);
                boolean zH2 = sVar4.h(addPhoneNumberFragment);
                Object objM2 = sVar4.M();
                if (zH2 || objM2 == fVar) {
                    objM2 = new rv.a(addPhoneNumberFragment, 17);
                    sVar4.k0(objM2);
                }
                r9.d(f0.U(sVar4, R.string.post_purchase_add_maybe_later), androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM2, 15), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                break;
            case 5:
                w2.o oVar = (w2.o) obj4;
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue4 = oVar.f43003v.i(iIntValue4);
                }
                if (!zBooleanValue) {
                    iIntValue5 = oVar.f43003v.i(iIntValue5);
                }
                if (oVar.f43002u) {
                    long j9 = oVar.f42999r.f37715b;
                    int i12 = t0.f29649c;
                    if (iIntValue4 != ((int) (j9 >> 32)) || iIntValue5 != ((int) (4294967295L & j9))) {
                        if (Math.min(iIntValue4, iIntValue5) < 0 || Math.max(iIntValue4, iIntValue5) > oVar.f42999r.f37714a.f29538b.length()) {
                            l3 l3Var = oVar.f43004w;
                            l3Var.t(false);
                            l3Var.q(u0.None);
                        } else {
                            if (zBooleanValue || iIntValue4 == iIntValue5) {
                                l3 l3Var2 = oVar.f43004w;
                                l3Var2.t(false);
                                l3Var2.q(u0.None);
                            } else {
                                oVar.f43004w.h(true);
                            }
                            oVar.f43000s.f28838v.invoke(new r5.y(oVar.f42999r.f37714a, k0.b(iIntValue4, iIntValue5), (t0) null));
                            z = true;
                        }
                    }
                }
                break;
            case 6:
                e1 e1Var = (e1) obj4;
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                s1 s1Var = e1Var.f42878q;
                v2.b bVarB = zBooleanValue2 ? s1Var.f43043a.b() : s1Var.d();
                long j11 = bVarB.f41929d;
                if (e1Var.f42881t && Math.min(iIntValue6, iIntValue7) >= 0 && Math.max(iIntValue6, iIntValue7) <= bVarB.f41928c.length()) {
                    int i13 = t0.f29649c;
                    if (iIntValue6 != ((int) (j11 >> 32)) || iIntValue7 != ((int) (j11 & 4294967295L))) {
                        long jB = k0.b(iIntValue6, iIntValue7);
                        if (zBooleanValue2 || iIntValue6 == iIntValue7) {
                            e1Var.f42880s.w(b0.None);
                        } else {
                            e1Var.f42880s.w(b0.Selection);
                        }
                        s1 s1Var2 = e1Var.f42878q;
                        if (zBooleanValue2) {
                            s1Var2.k(jB);
                        } else {
                            s1Var2.j(jB);
                        }
                    }
                    z = true;
                }
                break;
            case 7:
                break;
            case 8:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj4;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                s sVar5 = (s) nVar4;
                if (sVar5.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    r9.d((String) objectRef.element, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar5, 0, 0, 262142);
                } else {
                    sVar5.U();
                }
                break;
            default:
                ((Function1) obj4).invoke(new h4.b(((w4.v) obj2).f43180c));
                break;
        }
        return Unit.f26487a;
    }
}
