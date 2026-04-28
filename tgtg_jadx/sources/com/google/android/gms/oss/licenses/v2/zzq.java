package com.google.android.gms.oss.licenses.v2;

import androidx.compose.foundation.b;
import b4.a;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import d2.c;
import d2.i;
import d2.m2;
import d2.w;
import d2.y;
import f2.d;
import g3.la;
import g3.na;
import g3.r9;
import g3.s0;
import i80.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.m;
import m3.n;
import m3.s;
import o00.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzq implements o {
    final /* synthetic */ List zza;
    final /* synthetic */ Function1 zzb;
    final /* synthetic */ zzbb zzc;

    public zzq(List list, Function1 function1, zzbb zzbbVar) {
        this.zza = list;
        this.zzb = function1;
        this.zzc = zzbbVar;
    }

    @Override // i80.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        zza((d) obj, ((Number) obj2).intValue(), (n) obj3, ((Number) obj4).intValue());
        return Unit.f26487a;
    }

    public final void zza(d dVar, int i11, n nVar, int i12) {
        int i13;
        if ((i12 & 6) == 0) {
            i13 = i12 | (true != ((s) nVar).f(dVar) ? 2 : 4);
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= true != ((s) nVar).d(i11) ? 16 : 32;
        }
        s sVar = (s) nVar;
        if (!sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.U();
            return;
        }
        v1 v1Var = (v1) this.zza.get(i11);
        sVar.a0(663005396);
        y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        q qVar = q.f5711a;
        t tVarC = a.c(qVar, sVar);
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
        String str = v1Var.f31757a;
        str.getClass();
        t tVarD = m2.d(qVar, 1.0f);
        Function1 function1 = this.zzb;
        boolean zF = ((((i13 & 112) ^ 48) > 32 && sVar.d(i11)) || (i13 & 48) == 32) | sVar.f(function1);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new zzo(function1, i11);
            sVar.k0(objM);
        }
        r9.d(str, c.z(b.c(tVarD, false, null, null, (Function0) objM, 15), 16.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((la) sVar.j(na.f19192a)).f19052j, sVar, 0, 0, 131068);
        if (i11 < d0.g(((zzaz) this.zzc).zza())) {
            sVar.a0(90335340);
            s0.g(null, 0.0f, 0L, sVar, 0, 7);
        } else {
            sVar.a0(86199785);
        }
        sVar.q(false);
        sVar.q(true);
        sVar.q(false);
    }
}
