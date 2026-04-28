package com.google.android.gms.oss.licenses.v2;

import b4.a;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import d2.g0;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import n9.e;
import o9.d;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzz implements d {

    @NotNull
    private final Object zza;

    @NotNull
    private final List zzb;

    @NotNull
    private final e zzc;

    @NotNull
    private final e zzd;

    @NotNull
    private final List zze;

    @NotNull
    private final Function2 zzf;

    public zzz(@NotNull Object obj, @NotNull List list, @NotNull e eVar, @NotNull e eVar2) {
        obj.getClass();
        list.getClass();
        eVar.getClass();
        eVar2.getClass();
        this.zza = obj;
        this.zzb = list;
        this.zzc = eVar;
        this.zzd = eVar2;
        this.zze = d0.h(eVar, eVar2);
        this.zzf = new u3.d(new Function2() { // from class: com.google.android.gms.oss.licenses.v2.zzy
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj2, Object obj3) {
                return zzz.zza(this.zza, (n) obj2, ((Integer) obj3).intValue());
            }
        }, true, 23545953);
    }

    public static Unit zza(zzz zzzVar, n nVar, int i11) {
        s sVar = (s) nVar;
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            g0 g0Var = m2.f13850c;
            i2 i2VarA = h2.a(i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(g0Var, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (0.4f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true);
            d2.d dVar2 = i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar2, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            zzzVar.zzc.a(sVar, 0);
            sVar.q(true);
            if (0.6f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var2 = new n1(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true);
            y yVarA2 = w.a(dVar2, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(n1Var2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            zzzVar.zzd.a(sVar, 0);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    @Override // o9.d
    @NotNull
    public final Function2 getContent() {
        return this.zzf;
    }

    @Override // o9.d
    @NotNull
    public final List getEntries() {
        return this.zze;
    }

    @Override // o9.d
    @NotNull
    public final Object getKey() {
        return this.zza;
    }

    @Override // o9.d
    @NotNull
    public /* bridge */ /* synthetic */ Map getMetadata() {
        return super.getMetadata();
    }

    @Override // o9.d
    @NotNull
    public final List getPreviousEntries() {
        return this.zzb;
    }
}
