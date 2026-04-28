package com.google.android.gms.oss.licenses.v2;

import android.util.Patterns;
import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.j;
import c5.d2;
import com.google.android.gms.oss.licenses.R;
import d2.g0;
import d2.m2;
import d2.u;
import d2.z1;
import g3.m5;
import g3.p0;
import g3.r0;
import g3.r9;
import g3.s0;
import g3.x5;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;
import m3.f;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.h;
import m5.l0;
import m5.u0;
import o00.v1;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q5.o;
import q5.r;
import t5.c;
import u3.e;
import x5.a;
import x5.l;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzm {
    public static final void zza(final int i11, @Nullable final zzbg zzbgVar, @NotNull final Function0 function0, @Nullable n nVar, final int i12, int i13) {
        int i14;
        s sVar;
        List listZza;
        function0.getClass();
        int i15 = i12 & 6;
        s sVar2 = (s) nVar;
        sVar2.c0(-158631053);
        if (i15 == 0) {
            i14 = (true != sVar2.d(i11) ? 2 : 4) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= true != sVar2.h(zzbgVar) ? 16 : 32;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= true != sVar2.h(function0) ? 128 : 256;
        }
        if (sVar2.R(i14 & 1, (i14 & 147) != 146)) {
            sVar2.W();
            if ((i12 & 1) != 0 && !sVar2.z()) {
                sVar2.U();
            }
            sVar2.r();
            final b1 b1VarN = i.n(zzbgVar.zza(), sVar2, 0);
            Object objM = sVar2.M();
            f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(null);
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            zzbb zzbbVarZzd = zzd(b1VarN);
            zzaz zzazVar = zzbbVarZzd instanceof zzaz ? (zzaz) zzbbVarZzd : null;
            final v1 v1Var = (zzazVar == null || (listZza = zzazVar.zza()) == null) ? null : (v1) CollectionsKt.Q(i11, listZza);
            boolean zH = sVar2.h(v1Var) | sVar2.h(zzbgVar);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                objM2 = new zzf(v1Var, zzbgVar, b1Var, null);
                sVar2.k0(objM2);
            }
            i.h(v1Var, (Function2) objM2, sVar2);
            sVar = sVar2;
            x5.a(null, e.e(-2027192017, sVar2, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzl
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar3 = (s) ((n) obj);
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final v1 v1Var2 = v1Var;
                        final Function0 function02 = function0;
                        g3.i.c(e.e(2104559859, sVar3, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                String str;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                s sVar4 = (s) ((n) obj3);
                                if (sVar4.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v1 v1Var3 = v1Var2;
                                    if (v1Var3 == null || (str = v1Var3.f31757a) == null) {
                                        str = "";
                                    }
                                    r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar4, 0, 0, 262142);
                                } else {
                                    sVar4.U();
                                }
                                return Unit.f26487a;
                            }
                        }), null, e.e(23976181, sVar3, new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzk
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                int iIntValue2 = ((Integer) obj4).intValue();
                                s sVar4 = (s) ((n) obj3);
                                if (sVar4.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    s0.h(function02, d2.j(q.f5711a, "LicenseDetailNavigationIcon"), false, null, null, null, zzb.zza(), sVar4, 1572912, 60);
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
            }), null, null, null, 0, 0L, 0L, null, e.e(-148690620, sVar2, new i80.n() { // from class: com.google.android.gms.oss.licenses.v2.zzg
                @Override // i80.n
                public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return zzm.zzc(v1Var, b1VarN, b1Var, (z1) obj, (n) obj2, iIntValue);
                }
            }), sVar, 805306416, 509);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i16 = 0;
            w1VarS.f29476d = new Function2(i11, zzbgVar, function0, i12, i16) { // from class: com.google.android.gms.oss.licenses.v2.zzh
                private final /* synthetic */ int zza;
                private final /* synthetic */ zzbg zzb;
                private final /* synthetic */ Function0 zzc;
                private final /* synthetic */ int zzd;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zzm.zza(this.zza, this.zzb, this.zzc, (n) obj, i.F(this.zzd | 1), 0);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void zzb(@NotNull final String str, @Nullable final t tVar, @Nullable n nVar, final int i11, int i12) {
        int i13;
        s sVar;
        str.getClass();
        int i14 = i11 & 6;
        s sVar2 = (s) nVar;
        sVar2.c0(-757578467);
        if (i14 == 0) {
            i13 = i11 | (true != sVar2.f(str) ? 2 : 4);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= true != sVar2.f(tVar) ? 16 : 32;
        }
        if (sVar2.R(i13 & 1, (i13 & 19) != 18)) {
            u0 u0Var = (u0) sVar2.j(r9.f19436a);
            long j9 = ((p0) sVar2.j(r0.f19375a)).f19258a;
            boolean z11 = (i13 & 14) == 4;
            Pattern pattern = Patterns.WEB_URL;
            boolean zE = z11 | sVar2.e(j9);
            Object objM = sVar2.M();
            if (zE || objM == m.f29332a) {
                m5.e eVar = new m5.e();
                Matcher matcher = pattern.matcher(str);
                matcher.getClass();
                int iEnd = 0;
                while (matcher.find()) {
                    eVar.c(str.substring(iEnd, matcher.start()));
                    String strGroup = matcher.group();
                    strGroup.getClass();
                    long j11 = j9;
                    int iH = eVar.h(new m5.n(strGroup, new m5.r0(new l0(j11, 0L, (r) null, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (a) null, (p) null, (c) null, 0L, l.f43854c, (i4.u0) null, 61438), null, null, null), null));
                    try {
                        eVar.c(strGroup);
                        eVar.g(iH);
                        iEnd = matcher.end();
                        j9 = j11;
                    } catch (Throwable th2) {
                        eVar.g(iH);
                        throw th2;
                    }
                }
                eVar.c(str.substring(iEnd));
                objM = eVar.j();
                sVar2.k0(objM);
            }
            sVar = sVar2;
            r9.e((h) objM, tVar, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, u0Var, sVar, i13 & 112, 0, 262140);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i15 = 0;
            w1VarS.f29476d = new Function2(str, tVar, i11, i15) { // from class: com.google.android.gms.oss.licenses.v2.zzi
                private final /* synthetic */ String zza;
                private final /* synthetic */ t zzb;
                private final /* synthetic */ int zzc;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zzm.zzb(this.zza, this.zzb, (n) obj, i.F(this.zzc | 1), 0);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static Unit zzc(v1 v1Var, c3 c3Var, b1 b1Var, z1 z1Var, n nVar, int i11) {
        int i12;
        k kVar = d.f5687e;
        z1Var.getClass();
        if ((i11 & 6) == 0) {
            i12 = i11 | (true != ((s) nVar).f(z1Var) ? 2 : 4);
        } else {
            i12 = i11;
        }
        s sVar = (s) nVar;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarY = d2.c.y(qVar, z1Var);
            g0 g0Var = m2.f13850c;
            t tVarThen = tVarY.then(g0Var);
            z4.u0 u0VarD = d2.p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarThen, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            i.C(u0VarD, b5.i.f5843f, sVar);
            i.C(iVarL, b5.i.f5842e, sVar);
            i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            i.z(sVar, b5.i.f5845h);
            i.C(tVarC, b5.i.f5841d, sVar);
            u uVar = u.f13938a;
            if (v1Var == null) {
                sVar.a0(1930657343);
                if (zzd(c3Var) instanceof zzba) {
                    sVar.a0(1930817148);
                    m5.a(uVar.a(qVar, kVar), 0L, 0.0f, 0L, 0, 0.0f, sVar, 0, 62);
                    sVar.q(false);
                } else {
                    sVar.a0(1930916565);
                    r9.d(f0.U(sVar, R.string.license_content_error), uVar.a(qVar, kVar), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 0, 0, 262140);
                    sVar = sVar;
                    sVar.q(false);
                }
                sVar.q(false);
            } else {
                sVar.a0(1931097543);
                String str = (String) b1Var.getValue();
                if (str == null) {
                    sVar.a0(1931148476);
                    m5.a(uVar.a(qVar, kVar), 0L, 0.0f, 0L, 0, 0.0f, sVar, 0, 62);
                    sVar.q(false);
                } else {
                    sVar.a0(1931248172);
                    zzb(str, d2.c.z(v1.n.r(g0Var, v1.n.q(sVar), true), 16.0f), sVar, 0, 0);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private static final zzbb zzd(c3 c3Var) {
        return (zzbb) c3Var.getValue();
    }
}
