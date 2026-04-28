package com.google.android.gms.oss.licenses.v2;

import ab.l;
import al.a0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b0.z;
import c5.q2;
import c5.v0;
import c5.x1;
import c5.x3;
import cb.b;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import d40.t1;
import fb.i;
import fb.k;
import h3.d;
import i4.g0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import m0.i1;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m90.z0;
import n9.g;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;
import u3.e;
import v80.p0;
import y00.e0;
import z3.r;
import z5.c;
import z5.h;
import z8.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzar {
    public static final void zza(@Nullable zzbg zzbgVar, @Nullable final String str, final boolean z11, @Nullable n nVar, final int i11, int i12) {
        String str2;
        final zzbg zzbgVar2;
        zzbg zzbgVar3;
        i iVar;
        l lVarB;
        final Activity activity;
        b bVar = b.f7859g;
        b bVar2 = b.f7858f;
        f fVar = m.f29332a;
        int i13 = i11 & 6;
        s sVar = (s) nVar;
        sVar.c0(1574643533);
        int i14 = i13 == 0 ? i11 | 2 : i11;
        if ((i11 & 48) == 0) {
            str2 = str;
            i14 |= true != sVar.f(str2) ? 16 : 32;
        } else {
            str2 = str;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= true != sVar.g(z11) ? 128 : 256;
        }
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                zzbgVar3 = (zzbg) t1.K(Reflection.getOrCreateKotlinClass(zzbg.class), s1VarA, null, s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            } else {
                sVar.U();
                zzbgVar3 = zzbgVar;
            }
            sVar.r();
            if (z11) {
                sVar.a0(572838453);
                boolean zH = sVar.h(zzbgVar3);
                Object objM = sVar.M();
                if (zH || objM == fVar) {
                    objM = new zzah(zzbgVar3, null);
                    sVar.k0(objM);
                }
                m3.i.h(zzbgVar3, (Function2) objM, sVar);
            } else {
                sVar.a0(571569685);
            }
            sVar.q(false);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                g[] gVarArr = {zzn.zza};
                r rVar = new r();
                rVar.addAll(y.T(gVarArr));
                sVar.k0(rVar);
                objM2 = rVar;
            }
            final r rVar2 = (r) objM2;
            sVar.a0(280825064);
            long jM = ((c) sVar.j(x1.f7416h)).m(z.z(((q2) ((x3) sVar.j(x1.f7427t))).a()));
            sVar.q(false);
            List list = bb.a.f6098c;
            Set set = h3.c.f21365a;
            Set set2 = h3.b.f21364a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (z5.f.a(h.b(jM), ((z5.f) obj).f47277a) >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                i1.c();
                return;
            }
            float fMax = ((z5.f) it.next()).f47277a;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((z5.f) it.next()).f47277a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (z5.f.a(h.a(jM), ((z5.f) obj2).f47277a) >= 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                i1.c();
                return;
            }
            float fMax2 = ((z5.f) it2.next()).f47277a;
            while (it2.hasNext()) {
                fMax2 = Math.max(fMax2, ((z5.f) it2.next()).f47277a);
            }
            bb.a aVar = new bb.a((int) fMax, (int) fMax2);
            Context context = (Context) sVar.j(v0.f7390b);
            boolean zF = sVar.f(context);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                cb.g.f7877a.getClass();
                context.getClass();
                db.a aVar2 = (db.a) cb.f.f7875b.getValue();
                if (aVar2 == null) {
                    k kVar = k.f17541c;
                    if (k.f17541c == null) {
                        ReentrantLock reentrantLock = k.f17542d;
                        reentrantLock.lock();
                        try {
                            if (k.f17541c == null) {
                                try {
                                    lVarB = fb.h.b();
                                } catch (Throwable unused) {
                                }
                                if (lVarB != null) {
                                    l lVar = l.f1214f;
                                    lVar.getClass();
                                    Object value = lVarB.f1219e.getValue();
                                    value.getClass();
                                    Object value2 = lVar.f1219e.getValue();
                                    value2.getClass();
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        iVar = new i(context);
                                        if (!iVar.e()) {
                                        }
                                        k.f17541c = new k(iVar);
                                    }
                                }
                                iVar = null;
                                k.f17541c = new k(iVar);
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    aVar2 = k.f17541c;
                    aVar2.getClass();
                }
                cb.l lVar2 = new cb.l();
                e0 e0Var = new e0(11);
                ab.g.a();
                b bVar3 = new b(lVar2, aVar2, e0Var);
                cb.f.f7876c.getClass();
                y80.c cVarF = y80.r.f(new a3.x1(bVar3, context, null, 12));
                c90.f fVar2 = p0.f42144a;
                objM3 = new a0(y80.r.s(cVarF, a90.p.f1044a), 15);
                sVar.k0(objM3);
            }
            List<cb.c> list2 = (List) m3.i.m((y80.i) objM3, n0.f26529a, null, sVar, 48, 2).getValue();
            b bVar4 = b.f7857e;
            b bVar5 = b.f7861i;
            ArrayList arrayList3 = new ArrayList();
            for (cb.c cVar : list2) {
                ab.b bVar6 = cVar.f7866a;
                b bVar7 = bVar6.b() > bVar6.a() ? bVar : bVar2;
                ab.b bVar8 = cVar.f7866a;
                zzbg zzbgVar4 = zzbgVar3;
                b bVar9 = cVar.f7868c;
                if (Intrinsics.areEqual(bVar7, bVar)) {
                    Intrinsics.areEqual(bVar9, bVar5);
                }
                h4.c cVarE = g0.E(bVar8.c());
                boolean zAreEqual = Intrinsics.areEqual(bVar9, b.f7860h);
                ab.b bVar10 = cVar.f7866a;
                b bVar11 = bVar;
                boolean zAreEqual2 = Intrinsics.areEqual(bVar10.b() > bVar10.a() ? bVar11 : bVar2, bVar2);
                b bVar12 = cVar.f7867b;
                arrayList3.add(new d(cVarE, zAreEqual, zAreEqual2, Intrinsics.areEqual(bVar12, b.f7863k) || (Intrinsics.areEqual(bVar12, b.f7862j) && Intrinsics.areEqual(bVar9, bVar5)), Intrinsics.areEqual((bVar8.b() == 0 || bVar8.a() == 0) ? b.f7856d : bVar4, bVar4)));
                zzbgVar3 = zzbgVar4;
                bVar = bVar11;
            }
            zzbg zzbgVar5 = zzbgVar3;
            boolean zF2 = sVar.f(aVar);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == fVar) {
                objM4 = new zzab(aVar);
                sVar.k0(objM4);
            }
            zzab zzabVar = (zzab) objM4;
            Context baseContext = (Context) sVar.j(v0.f7390b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
            }
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new Function0() { // from class: com.google.android.gms.oss.licenses.v2.zzaq
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        return zzar.zzd(rVar2);
                    }
                };
                sVar.k0(objM5);
            }
            Function0 function0 = (Function0) objM5;
            sVar.a0(1403965950);
            j30.g gVar = new j30.g(zzag.zza);
            final String str3 = str2;
            zzbgVar2 = zzbgVar5;
            gVar.a(Reflection.getOrCreateKotlinClass(zzn.class), zzai.zza, zzaa.zzb(), e.e(2057248279, sVar, new i80.n() { // from class: com.google.android.gms.oss.licenses.v2.zzak
                @Override // i80.n
                public final /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    n nVar2 = (n) obj4;
                    ((zzn) obj3).getClass();
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final Activity activity2 = activity;
                        boolean zH2 = sVar2.h(activity2);
                        Object objM6 = sVar2.M();
                        f fVar3 = m.f29332a;
                        if (zH2 || objM6 == fVar3) {
                            objM6 = new Function0() { // from class: com.google.android.gms.oss.licenses.v2.zzan
                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ Object invoke() {
                                    Activity activity3 = activity2;
                                    if (activity3 != null) {
                                        activity3.finish();
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(objM6);
                        }
                        Function0 function02 = (Function0) objM6;
                        Object objM7 = sVar2.M();
                        if (objM7 == fVar3) {
                            final r rVar3 = rVar2;
                            Function1 function1 = new Function1() { // from class: com.google.android.gms.oss.licenses.v2.zzao
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ Object invoke(Object obj6) {
                                    rVar3.add(new zze(((Integer) obj6).intValue()));
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(function1);
                            objM7 = function1;
                        }
                        zzx.zza(zzbgVar2, str3, function02, (Function1) objM7, z11, sVar2, 3072, 0);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }));
            gVar.a(Reflection.getOrCreateKotlinClass(zze.class), zzaj.zza, zzaa.zza(), e.e(613731955, sVar, new i80.n() { // from class: com.google.android.gms.oss.licenses.v2.zzal
                @Override // i80.n
                public final /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    n nVar2 = (n) obj4;
                    zze zzeVar = (zze) obj3;
                    zzeVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((s) nVar2).f(zzeVar) ? 2 : 4;
                    }
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int iZza = zzeVar.zza();
                        Object objM6 = sVar2.M();
                        if (objM6 == m.f29332a) {
                            final r rVar3 = rVar2;
                            Function0 function02 = new Function0() { // from class: com.google.android.gms.oss.licenses.v2.zzap
                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ Object invoke() {
                                    return zzar.zze(rVar3);
                                }
                            };
                            sVar2.k0(function02);
                            objM6 = function02;
                        }
                        zzm.zza(iZza, zzbgVar2, (Function0) objM6, sVar2, MLKEMEngine.KyberPolyBytes, 0);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }));
            z0 z0Var = new z0(gVar, 3);
            sVar.q(false);
            cg.e(rVar2, null, null, function0, null, zzabVar, null, null, null, z0Var, sVar, 3078);
            sVar = sVar;
        } else {
            sVar.U();
            zzbgVar2 = zzbgVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i15 = 1;
            w1VarS.f29476d = new Function2(str, z11, i11, i15) { // from class: com.google.android.gms.oss.licenses.v2.zzam
                private final /* synthetic */ String zzb;
                private final /* synthetic */ boolean zzc;
                private final /* synthetic */ int zzd;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    zzar.zza(this.zza, this.zzb, this.zzc, (n) obj3, m3.i.F(this.zzd | 1), 1);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit zzd(r rVar) {
        i0.y(rVar);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit zze(r rVar) {
        i0.y(rVar);
        return Unit.f26487a;
    }
}
