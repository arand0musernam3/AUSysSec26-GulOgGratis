package js;

import a3.p0;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b4.q;
import b4.t;
import b5.j;
import cg.o;
import cg.z;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.braze.h2;
import d2.m2;
import d2.z1;
import d40.t1;
import g3.d5;
import g3.ga;
import g3.h0;
import g3.x5;
import h2.n0;
import hs.h;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import m3.b1;
import m3.f;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.d;
import u3.e;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    /* JADX WARN: Type inference failed for: r5v13, types: [T, java.lang.Object] */
    public static final void a(h hVar, final boolean z11, Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, n nVar, int i11) {
        s sVar;
        h hVar2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1536535109);
        int i12 = i11 | 2 | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function04) ? 131072 : 65536) | (sVar2.h(function05) ? 1048576 : 524288) | (sVar2.h(function06) ? 8388608 : 4194304);
        if (sVar2.R(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                s1 s1VarA = z8.a.a(sVar2);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                hVar2 = (h) t1.K(Reflection.getOrCreateKotlinClass(h.class), s1VarA, e0.r(s1VarA, sVar2), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
            } else {
                sVar2.U();
                hVar2 = hVar;
            }
            sVar2.r();
            d5 d5VarC = ga.c(sVar2);
            final b1 b1VarN = i.n(hVar2.f22478g, sVar2, 0);
            final b1 b1VarN2 = i.n(hVar2.f22486p, sVar2, 0);
            final b1 b1VarN3 = i.n(hVar2.f22480i, sVar2, 0);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = i.n(hVar2.f22484n, sVar2, 0).getValue();
            Object objM = sVar2.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            final b1 b1Var2 = (b1) objM2;
            t tVarA = v4.f.a(m2.f13850c, d5VarC.f18456c, null);
            d dVarE = e.e(-1830049279, sVar2, new z(5, function0));
            final h hVar3 = hVar2;
            d dVarE2 = e.e(585677206, sVar2, new i80.n() { // from class: js.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z1 z1Var = (z1) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((s) nVar2).f(z1Var) ? 4 : 2;
                    }
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        t tVarR = d2.c.r(m2.c(m2.d(d2.c.y(v1.n.j(q.f5711a, lv.s.J, g0.f23254b), z1Var), 1.0f), 1.0f));
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = b4.a.c(tVarR, sVar3);
                        j.R.getClass();
                        b5.h hVar4 = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar4);
                        } else {
                            sVar3.n0();
                        }
                        i.C(u0VarD, b5.i.f5843f, sVar3);
                        i.C(iVarL, b5.i.f5842e, sVar3);
                        i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                        i.z(sVar3, b5.i.f5845h);
                        i.C(tVarC, b5.i.f5841d, sVar3);
                        Ref.ObjectRef objectRef2 = objectRef;
                        GenericErrors genericErrors = (GenericErrors) objectRef2.element;
                        Unit unit = null;
                        if (genericErrors == null) {
                            sVar3.a0(949117417);
                            sVar3.q(false);
                        } else {
                            sVar3.a0(949117418);
                            o.a(genericErrors, null, null, sVar3, 0, 6);
                            objectRef2.element = null;
                            sVar3.q(false);
                            unit = Unit.f26487a;
                        }
                        b1 b1Var3 = b1Var;
                        b1 b1Var4 = b1Var2;
                        f fVar2 = m.f29332a;
                        if (unit == null) {
                            sVar3.a0(949231467);
                            PushNotificationsSettings pushNotificationsSettings = (PushNotificationsSettings) b1VarN.getValue();
                            boolean zBooleanValue = ((Boolean) b1VarN2.getValue()).booleanValue();
                            Object objM3 = sVar3.M();
                            if (objM3 == fVar2) {
                                objM3 = new p0(b1Var3, 25);
                                sVar3.k0(objM3);
                            }
                            Function1 function1 = (Function1) objM3;
                            Object objM4 = sVar3.M();
                            if (objM4 == fVar2) {
                                objM4 = new p0(b1Var4, 26);
                                sVar3.k0(objM4);
                            }
                            b0.z.l(hVar3, pushNotificationsSettings, z11, zBooleanValue, function03, function04, function06, function1, (Function1) objM4, sVar3, 113246208);
                            sVar3 = sVar3;
                            sVar3.q(false);
                        } else {
                            sVar3.a0(1277543042);
                            sVar3.q(false);
                        }
                        sVar3.q(true);
                        if (((Boolean) b1Var3.getValue()).booleanValue()) {
                            sVar3.a0(1753590576);
                            Function0 function07 = function02;
                            boolean zF = sVar3.f(function07);
                            Object objM5 = sVar3.M();
                            if (zF || objM5 == fVar2) {
                                objM5 = new b(function07, b1Var3, 0);
                                sVar3.k0(objM5);
                            }
                            Function0 function08 = (Function0) objM5;
                            Object objM6 = sVar3.M();
                            if (objM6 == fVar2) {
                                objM6 = new n0(b1Var3, 4);
                                sVar3.k0(objM6);
                            }
                            cg.j.g(function08, (Function0) objM6, sVar3, 48);
                            sVar3.q(false);
                        } else {
                            sVar3.a0(1753863500);
                            sVar3.q(false);
                        }
                        if (((Boolean) b1Var4.getValue()).booleanValue()) {
                            sVar3.a0(1753910837);
                            Function0 function09 = function05;
                            boolean zF2 = sVar3.f(function09);
                            Object objM7 = sVar3.M();
                            if (zF2 || objM7 == fVar2) {
                                objM7 = new b(function09, b1Var4, 1);
                                sVar3.k0(objM7);
                            }
                            Function0 function010 = (Function0) objM7;
                            Object objM8 = sVar3.M();
                            if (objM8 == fVar2) {
                                objM8 = new n0(b1Var4, 5);
                                sVar3.k0(objM8);
                            }
                            cg.j.h(function010, (Function0) objM8, sVar3, 48);
                            sVar3.q(false);
                        } else {
                            sVar3.a0(1754209708);
                            sVar3.q(false);
                        }
                        if (((Boolean) b1VarN3.getValue()).booleanValue()) {
                            j4.s.y(1754235624, 0, sVar3, sVar3, false);
                        } else {
                            sVar3.a0(1754270220);
                            sVar3.q(false);
                        }
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            });
            sVar = sVar2;
            x5.a(tVarA, dVarE, null, null, null, 0, 0L, 0L, null, dVarE2, sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
            hVar2 = hVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(hVar2, z11, function0, function02, function03, function04, function05, function06, i11);
        }
    }
}
