package lj;

import b4.q;
import b4.t;
import b5.g;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.w;
import d2.y;
import d2.z;
import g3.r9;
import i80.n;
import ii.m;
import kotlin.jvm.functions.Function0;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import x60.h;
import x60.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f27880a;

    static {
        new u3.d(new m(10), false, -297841016);
        f27880a = new u3.d(new j60.a(14), false, -1734435982);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.app.tgtg.model.remote.mapService.response.FilterChipOption r30, com.app.tgtg.model.remote.mapService.response.MapFilters r31, java.util.List r32, gj.c0 r33, jj.c r34, kotlin.jvm.functions.Function0 r35, m3.n r36, int r37) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.d.a(com.app.tgtg.model.remote.mapService.response.FilterChipOption, com.app.tgtg.model.remote.mapService.response.MapFilters, java.util.List, gj.c0, jj.c, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void b(String str, Function0 function0, Function0 function02, Function0 function03, boolean z11, n nVar, m3.n nVar2, int i11) {
        n nVar3;
        Function0 function04 = function02;
        Function0 function05 = function03;
        boolean z12 = z11;
        str.getClass();
        function0.getClass();
        function04.getClass();
        function05.getClass();
        s sVar = (s) nVar2;
        sVar.c0(-1629120245);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function04) ? 256 : 128) | (sVar.h(function05) ? NewHope.SENDB_BYTES : 1024) | (sVar.g(z12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            float f11 = mVar.f44015k;
            q qVar = q.f5711a;
            t tVarA = d2.c.A(qVar, f11, f11);
            d2.d dVar = i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, i12 & 14, 0, 131066);
            sVar = sVar;
            SubtlePantryIconButtonKt.SmallSubtlePantryIconButton(function0, null, null, false, false, f27880a, sVar, ((i12 >> 3) & 14) | 196608, 30);
            sVar.q(true);
            d2.c.f(m2.e(qVar, mVar.f44008d), sVar);
            t tVarR = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar), true);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarR, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            nVar3 = nVar;
            nVar3.invoke(z.f13980a, sVar, 54);
            sVar.q(true);
            d2.c.f(m2.e(qVar, mVar.f44021r), sVar);
            function04 = function02;
            function05 = function03;
            z12 = z11;
            xz.b.c(function04, function05, z12, sVar, (i12 >> 6) & 1022);
            sVar.q(true);
        } else {
            nVar3 = nVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.w(str, function0, function04, function05, z12, nVar3, i11, 4);
        }
    }
}
