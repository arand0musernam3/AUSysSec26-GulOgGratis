package ug;

import android.content.Context;
import android.location.Geocoder;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import b4.q;
import b4.t;
import b5.j;
import c6.r;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.google.android.gms.internal.measurement.cg;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import g3.k6;
import g3.m6;
import g3.q7;
import g3.r9;
import g3.s0;
import he.k;
import i4.g0;
import i4.r0;
import i4.v0;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import v80.p0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f41125a = new u3.d(new u60.a(3), false, 2143364278);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f41126b = new u3.d(new u60.a(4), false, -1101733803);

    public static final void a(vg.b bVar, Function1 function1, boolean z11, n nVar, int i11) {
        boolean z12;
        bVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(1309798618);
        int i12 = i11 | (sVar.d(bVar.ordinal()) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            if (z11) {
                sVar.a0(-969770246);
                s0.g(null, 1, lv.s.H, sVar, 432, 1);
                sVar.q(false);
            } else {
                sVar.a0(-969643394);
                sVar.q(false);
            }
            int i13 = a.$EnumSwitchMapping$0[bVar.ordinal()];
            m3.f fVar = m.f29332a;
            switch (i13) {
                case 1:
                    z12 = true;
                    sVar.a0(-969538552);
                    t tVarA = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28252f, lv.t.f28253g);
                    lv.q qVar2 = lv.q.GREY;
                    String strU = f0.U(sVar, R.string.onboarding_where_bottom_sheet_close_button);
                    boolean z13 = (i12 & 112) == 32;
                    Object objM = sVar.M();
                    if (z13 || objM == fVar) {
                        objM = new qr.f(function1, 10);
                        sVar.k0(objM);
                    }
                    v0.n.o(tVarA, strU, null, qVar2, null, false, (Function0) objM, sVar, 3078, 0, 1012);
                    sVar = sVar;
                    sVar.q(false);
                    break;
                case 2:
                    z12 = true;
                    sVar.a0(-968949459);
                    t tVarA2 = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28252f, lv.t.f28253g);
                    String strU2 = f0.U(sVar, R.string.onboarding_where_bottom_sheet_add_location_button);
                    boolean z14 = (i12 & 112) == 32;
                    Object objM2 = sVar.M();
                    if (z14 || objM2 == fVar) {
                        objM2 = new qr.f(function1, 11);
                        sVar.k0(objM2);
                    }
                    v0.n.l(tVarA2, strU2, null, null, null, false, false, null, null, (Function0) objM2, sVar, 6, 508);
                    sVar.q(false);
                    break;
                case 3:
                    z12 = true;
                    sVar.a0(-968375184);
                    t tVarA3 = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28255i, lv.t.f28253g);
                    String strU3 = f0.U(sVar, R.string.onboarding_where_bottom_sheet_confirm_button);
                    boolean z15 = (i12 & 112) == 32;
                    Object objM3 = sVar.M();
                    if (z15 || objM3 == fVar) {
                        objM3 = new qr.f(function1, 12);
                        sVar.k0(objM3);
                    }
                    v0.n.l(tVarA3, strU3, null, null, null, false, false, null, null, (Function0) objM3, sVar, 6, 508);
                    sVar.q(false);
                    break;
                case 4:
                    z12 = true;
                    sVar.a0(-967795484);
                    t tVarA4 = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28252f, lv.t.f28253g);
                    String strU4 = f0.U(sVar, R.string.station_picker_add_stations_cta);
                    String strU5 = f0.U(sVar, R.string.station_picker_add_stations_cta_voice_over);
                    boolean z16 = (i12 & 112) == 32;
                    Object objM4 = sVar.M();
                    if (z16 || objM4 == fVar) {
                        objM4 = new qr.f(function1, 13);
                        sVar.k0(objM4);
                    }
                    v0.n.l(tVarA4, strU4, strU5, null, null, false, false, null, null, (Function0) objM4, sVar, 6, 504);
                    sVar.q(false);
                    break;
                case 5:
                    z12 = true;
                    sVar.a0(-967123404);
                    t tVarA5 = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28252f, lv.t.f28253g);
                    String strU6 = f0.U(sVar, R.string.onboarding_where_bottom_sheet_save_button);
                    boolean z17 = (i12 & 112) == 32;
                    Object objM5 = sVar.M();
                    if (z17 || objM5 == fVar) {
                        objM5 = new qr.f(function1, 14);
                        sVar.k0(objM5);
                    }
                    v0.n.l(tVarA5, strU6, null, null, null, false, false, null, null, (Function0) objM5, sVar, 6, 508);
                    sVar.q(false);
                    break;
                case 6:
                    sVar.a0(-966557654);
                    t tVarA6 = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28252f, lv.t.f28253g);
                    String strU7 = f0.U(sVar, R.string.onboarding_where_bottom_sheet_apply_changes_button);
                    boolean z18 = (i12 & 112) == 32;
                    Object objM6 = sVar.M();
                    if (z18 || objM6 == fVar) {
                        objM6 = new qr.f(function1, 15);
                        sVar.k0(objM6);
                    }
                    z12 = true;
                    v0.n.l(tVarA6, strU7, null, null, null, false, false, null, null, (Function0) objM6, sVar, 6, 508);
                    sVar.q(false);
                    break;
                default:
                    throw e0.f.v(sVar, -862558897, false);
            }
            sVar.q(z12);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(bVar, function1, z11, i11, 16);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(tg.i r13, m3.n r14, int r15) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.b(tg.i, m3.n, int):void");
    }

    public static final void c(t tVar, float f11, float f12, v0 v0Var, long j9, n nVar, final int i11) {
        s sVar;
        final t tVar2;
        final float f13;
        final float f14;
        final v0 v0Var2;
        final long j11;
        final float f15;
        final float f16;
        final t tVar3;
        v0 v0Var3;
        long j12;
        s sVar2 = (s) nVar;
        sVar2.c0(1840539265);
        int i12 = i11 | 26038;
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                f15 = 40;
                f16 = 2;
                l2.a aVar = ((k6) sVar2.j(m6.f19099a)).f18965e;
                long j13 = lv.s.G;
                tVar3 = q.f5711a;
                v0Var3 = aVar;
                j12 = j13;
            } else {
                sVar2.U();
                tVar3 = tVar;
                f15 = f11;
                f16 = f12;
                v0Var3 = v0Var;
                j12 = j9;
            }
            sVar2.r();
            sVar = sVar2;
            q7.a(null, v0Var3, j12, 0L, 0.0f, 0.0f, null, u3.e.e(-1459297018, sVar2, new Function2() { // from class: ug.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p.a(m2.n(tVar3, f15, f16), sVar3, 0);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 12583296, 121);
            f14 = f16;
            v0Var2 = v0Var3;
            f13 = f15;
            tVar2 = tVar3;
            j11 = j12;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            f13 = f11;
            f14 = f12;
            v0Var2 = v0Var;
            j11 = j9;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(f13, f14, v0Var2, j11, i11) { // from class: ug.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f41131b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f41132c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v0 f41133d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f41134e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    c.c(this.f41130a, this.f41131b, this.f41132c, this.f41133d, this.f41134e, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(String str, String str2, n nVar, int i11) {
        String str3;
        str.getClass();
        str2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-875821564);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            long j9 = lv.s.J;
            r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarE = m2.e(m2.d(v1.n.j(qVar, j9, r0Var), 1.0f), 280);
            float f11 = lv.t.f28251e;
            t tVarZ = d2.c.z(tVarE, f11);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            le.p pVarD = e0.D(new le.q("sad_smiley_blob.json"), sVar, 6);
            le.h hVarJ = cg.j((k) pVarD.getValue(), false, false, 0.0f, Integer.MAX_VALUE, sVar, 958);
            t tVarM = m2.m(qVar, 100);
            k kVar = (k) pVarD.getValue();
            boolean zF = sVar.f(hVarJ);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new cg.f(hVarJ, 4);
                sVar.k0(objM);
            }
            x0.g(kVar, (Function0) objM, tVarM, false, false, false, false, null, false, null, null, false, false, null, null, false, sVar, MLKEMEngine.KyberPolyBytes, 0, 131064);
            r9.d(str, d2.c.D(qVar, 0.0f, f11, 0.0f, f11, 5), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28272k, sVar, (i12 & 14) | 48, 12582912, 130044);
            str3 = str2;
            r9.d(str3, null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            sVar.q(true);
        } else {
            str3 = str2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.v0(str, str3, i11, 2);
        }
    }

    public static final void e(tg.i iVar, n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(-1360649616);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) sVar2.j(c5.v0.f7390b);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar2.j(w8.g.f43289a);
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new rt.a();
                sVar2.k0(objM);
            }
            rt.a aVar = (rt.a) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                aVar.getClass();
                context.getClass();
                objM2 = new rt.f(context);
                sVar2.k0(objM2);
            }
            rt.f fVar2 = (rt.f) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = fVar2.f38239a;
                sVar2.k0(objM3);
            }
            View view = (View) objM3;
            b1 b1VarN = m3.i.n(iVar.f40168g, sVar2, 0);
            boolean zH = sVar2.h(fVar2) | sVar2.h(lifecycleOwner);
            Object objM4 = sVar2.M();
            if (zH || objM4 == fVar) {
                objM4 = new rk.j(fVar2, lifecycleOwner, 1);
                sVar2.k0(objM4);
            }
            m3.i.d(lifecycleOwner, (Function1) objM4, sVar2);
            LatLngInfo latLngInfo = ((vg.a) b1VarN.getValue()).f42318b;
            boolean zH2 = sVar2.h(fVar2) | sVar2.h(context) | sVar2.h(iVar) | sVar2.f(b1VarN);
            Object objM5 = sVar2.M();
            if (zH2 || objM5 == fVar) {
                co.n nVar2 = new co.n(fVar2, context, iVar, b1VarN, null, 9);
                sVar2.k0(nVar2);
                objM5 = nVar2;
            }
            m3.i.h(latLngInfo, (Function2) objM5, sVar2);
            t tVarB = f4.g.b(m2.d(q.f5711a, 1.0f), l2.g.b(lv.t.f28252f));
            boolean zH3 = sVar2.h(view);
            Object objM6 = sVar2.M();
            if (zH3 || objM6 == fVar) {
                objM6 = new nv.d(2, view);
                sVar2.k0(objM6);
            }
            t tVarA = b4.a.a(tVarB, c5.m2.f7291a, new s1.e((Function1) objM6, 2));
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarA, sVar2);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            d2.g0 g0Var = m2.f13850c;
            boolean zH4 = sVar2.h(view);
            Object objM7 = sVar2.M();
            if (zH4 || objM7 == fVar) {
                objM7 = new nv.d(3, view);
                sVar2.k0(objM7);
            }
            sVar = sVar2;
            r.b((Function1) objM7, g0Var, null, sVar, 48, 4);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(iVar, i11, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(b4.t r37, tg.i r38, boolean r39, m3.n r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.f(b4.t, tg.i, boolean, m3.n, int, int):void");
    }

    public static final void g(List list, tg.i iVar, n nVar, int i11) {
        int i12;
        list.getClass();
        s sVar = (s) nVar;
        sVar.c0(97039038);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(iVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            t tVarJ = v1.n.j(m2.f13850c, lv.s.J, g0.f23254b);
            boolean zH = sVar.h(list) | sVar.h(iVar);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new ry.b(12, list, iVar);
                sVar.k0(objM);
            }
            ox.h.c(tVarJ, null, null, null, null, null, false, null, (Function1) objM, sVar, 6, 510);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(list, iVar, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(b4.t r30, java.lang.String r31, boolean r32, kotlin.jvm.functions.Function0 r33, m3.n r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.h(b4.t, java.lang.String, boolean, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static void i(st.a aVar, float f11, LatLngInfo latLngInfo) {
        st.a.a(aVar, latLngInfo.isValid() ? new xk.a(latLngInfo, null, null, null, 14) : new xk.a(null, null, null, null, 13), f11, 4);
    }

    public static final void j(Context context, st.a aVar, LatLngInfo latLngInfo, tg.i iVar) {
        if (latLngInfo != null) {
            ry.b bVar = new ry.b(11, iVar, latLngInfo);
            ((rt.d) aVar).getClass();
            context.getClass();
            Geocoder geocoder = new Geocoder(context, Locale.getDefault());
            c90.f fVar = p0.f42144a;
            v80.f0.B(v80.f0.b(c90.e.f7834b), null, null, new os.c(geocoder, latLngInfo, bVar, context, (x70.c) null, 5), 3);
        }
    }
}
