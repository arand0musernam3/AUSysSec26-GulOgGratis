package ls;

import a3.u1;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.SavedBancontactCard;
import com.app.tgtg.model.remote.payment.SavedCreditCard;
import com.app.tgtg.model.remote.payment.SavedEdenred;
import com.app.tgtg.model.remote.payment.UnknownSavedPaymentMethod;
import d2.c;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import d6.r;
import g3.r1;
import g3.r9;
import g3.s0;
import i4.g0;
import ii.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l2.g;
import lv.v;
import m3.b1;
import m3.i;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.d;
import u3.e;
import w.a0;
import x5.k;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f28166a = new d(new m(20), false, -382405841);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f28167b = new d(new m(21), false, -844478495);

    public static final void a(final BasicSavedPaymentMethod basicSavedPaymentMethod, final Function0 function0, n nVar, final int i11) {
        w1 w1VarS;
        Function2 function2;
        basicSavedPaymentMethod.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(467862527);
        int i12 = (sVar.f(basicSavedPaymentMethod) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else {
            if (basicSavedPaymentMethod instanceof UnknownSavedPaymentMethod) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    function2 = new Function2(basicSavedPaymentMethod, function0, i11, i13) { // from class: ls.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f28168a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BasicSavedPaymentMethod f28169b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Function0 f28170c;

                        {
                            this.f28168a = i13;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f28168a;
                            n nVar2 = (n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    a.a(this.f28169b, this.f28170c, nVar2, i.F(1));
                                    break;
                                default:
                                    a.a(this.f28169b, this.f28170c, nVar2, i.F(1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            s0.b(m2.d(q.f5711a, 1.0f), g.b(12), s0.p(lv.s.J, sVar, 6), s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, e.e(-714258995, sVar, new u1(basicSavedPaymentMethod, function0, false, 24)), sVar, 196614, 16);
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i14 = 1;
            function2 = new Function2(basicSavedPaymentMethod, function0, i11, i14) { // from class: ls.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f28168a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasicSavedPaymentMethod f28169b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f28170c;

                {
                    this.f28168a = i14;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.f28168a;
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            a.a(this.f28169b, this.f28170c, nVar2, i.F(1));
                            break;
                        default:
                            a.a(this.f28169b, this.f28170c, nVar2, i.F(1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    public static final void b(b1 b1Var, n nVar, int i11) {
        b1Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1381310980);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            r.b(b4.d.f5689g, 0L, null, null, e.e(-278878279, sVar, new r1(b1Var, 2)), sVar, 24582, 14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r1(b1Var, i11, 3);
        }
    }

    public static final void c(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(223378419);
        if (sVar.R(i11 & 1, i11 != 0)) {
            float fS = e0.s(sVar, R.dimen.spacing_2);
            float fS2 = e0.s(sVar, R.dimen.spacing_2);
            float fS3 = e0.s(sVar, R.dimen.spacing_3);
            float fS4 = e0.s(sVar, R.dimen.spacing_3);
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(v1.n.k(c.C(qVar, fS3, fS, fS4, fS2), 3, lv.s.H, g.b(12)), lv.s.I, g0.f23254b);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            i.C(tVarC, gVar4, sVar);
            float f11 = 24;
            float f12 = 40;
            t tVarC2 = c.C(qVar, f12, f11, f12, f11);
            y yVarA = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(yVarA, gVar, sVar);
            i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            i.C(tVarC3, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.payment_options_empty_state), null, lv.s.C, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28271j, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            c.f(m2.m(qVar, 16), sVar);
            v1.n.d(x0.z(R.drawable.icon_credit_card, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j60.a(i11, 23);
        }
    }

    public static final void d(BasicSavedPaymentMethod basicSavedPaymentMethod, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(-189912911);
        int i12 = (sVar2.f(basicSavedPaymentMethod) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            String strT = f0.T(R.string.voice_over_saved_payment_card, new Object[]{basicSavedPaymentMethod.getDisplayValue().length() > 4 ? basicSavedPaymentMethod.getDisplayValue().substring(basicSavedPaymentMethod.getDisplayValue().length() - 4) : basicSavedPaymentMethod instanceof SavedCreditCard ? ((SavedCreditCard) basicSavedPaymentMethod).getCardIdentifier() : basicSavedPaymentMethod instanceof SavedBancontactCard ? ((SavedBancontactCard) basicSavedPaymentMethod).getCardIdentifier() : ""}, sVar2);
            String displayValue = basicSavedPaymentMethod.getDisplayValue();
            m5.u0 u0Var = v.f28274n;
            long j9 = lv.s.C;
            boolean zF = sVar2.f(strT);
            Object objM = sVar2.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new gt.e(strT, 17);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            r9.d(displayValue, j5.r.c(q.f5711a, false, (Function1) objM), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(basicSavedPaymentMethod, i11, 7);
        }
    }

    public static final void e(SavedEdenred savedEdenred, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1104228375);
        int i12 = (sVar.f(savedEdenred) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            r9.d(savedEdenred.getDisplayValue(), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(savedEdenred, i11, 8);
        }
    }
}
