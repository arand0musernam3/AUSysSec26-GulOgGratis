package com.google.android.gms.oss.licenses.v2;

import b4.a;
import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import c5.d2;
import com.google.android.gms.oss.licenses.R;
import d2.c;
import d2.g0;
import d2.m2;
import d2.p;
import d2.u;
import d2.z1;
import e0.f;
import f2.l;
import g3.m5;
import g3.p0;
import g3.r0;
import g3.r9;
import g3.s0;
import g3.x5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.e;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzx {
    public static final void zza(@Nullable final zzbg zzbgVar, @Nullable final String str, @NotNull final Function0 function0, @NotNull final Function1 function1, final boolean z11, @Nullable n nVar, final int i11, int i12) {
        zzbg zzbgVar2;
        int i13;
        s sVar;
        function0.getClass();
        function1.getClass();
        int i14 = i11 & 6;
        s sVar2 = (s) nVar;
        sVar2.c0(1046837766);
        if (i14 == 0) {
            zzbgVar2 = zzbgVar;
            i13 = (true != sVar2.h(zzbgVar2) ? 2 : 4) | i11;
        } else {
            zzbgVar2 = zzbgVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= true != sVar2.f(str) ? 16 : 32;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= true != sVar2.h(function0) ? 128 : 256;
        }
        if ((i11 & 3072) == 0) {
            i13 |= true != sVar2.h(function1) ? 1024 : NewHope.SENDB_BYTES;
        }
        if ((i11 & 24576) == 0) {
            i13 |= true != sVar2.g(z11) ? 8192 : BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        }
        if (sVar2.R(1 & i13, (i13 & 9363) != 9362)) {
            sVar2.W();
            if ((i11 & 1) != 0 && !sVar2.z()) {
                sVar2.U();
            }
            sVar2.r();
            final b1 b1VarN = i.n(zzbgVar2.zza(), sVar2, 0);
            sVar = sVar2;
            x5.a(null, e.e(911352778, sVar2, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzw
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar3 = (s) ((n) obj);
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final String str2 = str;
                        final Function0 function02 = function0;
                        g3.i.c(e.e(1620876422, sVar3, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzt
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                s sVar4 = (s) ((n) obj3);
                                if (sVar4.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    String strU = str2;
                                    if (strU == null) {
                                        sVar4.a0(-1410886352);
                                        strU = f0.U(sVar4, R.string.oss_license_title);
                                    } else {
                                        sVar4.a0(-1410886631);
                                    }
                                    sVar4.q(false);
                                    r9.d(strU, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar4, 0, 0, 262142);
                                } else {
                                    sVar4.U();
                                }
                                return Unit.f26487a;
                            }
                        }), null, e.e(-453144380, sVar3, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzu
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                s sVar4 = (s) ((n) obj3);
                                if (sVar4.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    s0.h(function02, d2.j(q.f5711a, "LicenseListNavigationIcon"), false, null, null, null, zzd.zza(), sVar4, 1572912, 60);
                                } else {
                                    sVar4.U();
                                }
                                return Unit.f26487a;
                            }
                        }), null, 0.0f, null, null, null, sVar3, 390, 506);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), null, null, null, 0, 0L, 0L, null, e.e(-1349056427, sVar2, new i80.n() { // from class: com.google.android.gms.oss.licenses.v2.zzr
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k kVar = d.f5687e;
                    int iIntValue = ((Integer) obj3).intValue();
                    n nVar2 = (n) obj2;
                    z1 z1Var = (z1) obj;
                    z1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((s) nVar2).f(z1Var) ? 2 : 4;
                    }
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        q qVar = q.f5711a;
                        t tVarY = c.y(qVar, z1Var);
                        g0 g0Var = m2.f13850c;
                        t tVarThen = tVarY.then(g0Var);
                        u0 u0VarD = p.d(d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = a.c(tVarThen, sVar3);
                        j.R.getClass();
                        h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        boolean z12 = z11;
                        i.C(u0VarD, b5.i.f5843f, sVar3);
                        i.C(iVarL, b5.i.f5842e, sVar3);
                        i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                        i.z(sVar3, b5.i.f5845h);
                        i.C(tVarC, b5.i.f5841d, sVar3);
                        u uVar = u.f13938a;
                        if (z12) {
                            c3 c3Var = b1VarN;
                            sVar3.a0(1047958438);
                            final zzbb zzbbVar = (zzbb) c3Var.getValue();
                            if (zzbbVar instanceof zzba) {
                                sVar3.a0(1047999699);
                                m5.a(uVar.a(qVar, kVar), 0L, 0.0f, 0L, 0, 0.0f, sVar3, 0, 62);
                                sVar3.q(false);
                            } else if (zzbbVar instanceof zzay) {
                                sVar3.a0(1048152746);
                                r9.d(((zzay) zzbbVar).zza(), uVar.a(qVar, kVar), ((p0) sVar3.j(r0.f19375a)).f19288w, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar3, 0, 0, 262136);
                                sVar3.q(false);
                            } else {
                                if (!(zzbbVar instanceof zzaz)) {
                                    throw f.v(sVar3, 1280731100, false);
                                }
                                final Function1 function12 = function1;
                                sVar3.a0(1048388656);
                                boolean zH = sVar3.h(zzbbVar) | sVar3.f(function12);
                                Object objM = sVar3.M();
                                if (zH || objM == m.f29332a) {
                                    objM = new Function1() { // from class: com.google.android.gms.oss.licenses.v2.zzv
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            l lVar = (l) obj4;
                                            lVar.getClass();
                                            zzbb zzbbVar2 = zzbbVar;
                                            List listZza = ((zzaz) zzbbVar2).zza();
                                            lVar.r(listZza.size(), null, new zzp(listZza), new u3.d(new zzq(listZza, function12, zzbbVar2), true, 2039820996));
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar3.k0(objM);
                                }
                                ox.h.c(g0Var, null, null, null, null, null, false, null, (Function1) objM, sVar3, 6, 510);
                                sVar3.q(false);
                            }
                            sVar3.q(false);
                        } else {
                            sVar3.a0(1047762394);
                            r9.d(f0.U(sVar3, R.string.no_licenses_available), uVar.a(qVar, kVar), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar3, 0, 0, 262140);
                            sVar3.q(false);
                        }
                        sVar3.q(true);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 805306416, 509);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i15 = 0;
            w1VarS.f29476d = new Function2(str, function0, function1, z11, i11, i15) { // from class: com.google.android.gms.oss.licenses.v2.zzs
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Function0 zzc;
                private final /* synthetic */ Function1 zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ int zzf;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zzx.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (n) obj, i.F(this.zzf | 1), 0);
                    return Unit.f26487a;
                }
            };
        }
    }
}
