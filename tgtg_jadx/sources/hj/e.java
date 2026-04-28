package hj;

import b4.q;
import b4.t;
import b5.h;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import g3.r9;
import kotlin.jvm.functions.Function0;
import m3.n;
import m3.s;
import m3.w1;
import o30.f0;
import x5.k;
import x60.j;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f22087a = new u3.d(new g60.a(16), false, 621601379);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f22088b = new u3.d(new g60.a(17), false, 1809825501);

    /* JADX WARN: Removed duplicated region for block: B:131:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.app.tgtg.model.remote.mapService.response.MapClustersResponse r53, gj.c0 r54, jj.c r55, kotlin.jvm.functions.Function0 r56, m3.n r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.e.a(com.app.tgtg.model.remote.mapService.response.MapClustersResponse, gj.c0, jj.c, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void b(int i11, t tVar, Function0 function0, n nVar) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1524178012);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(function0) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            j jVar = (j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            t tVarD = m2.d(tVar, 1.0f);
            i2 i2VarA = h2.a(i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            SubtlePantryIconButtonKt.MediumSubtlePantryIconButton(function0, null, null, false, false, f22088b, sVar, (i12 & 14) | 196608, 30);
            r9.d(f0.U(sVar, R.string.filters_main_title), null, 0L, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 130046);
            sVar = sVar;
            b3.i.y(q.f5711a, mVar.f44007c, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(function0, tVar, i11);
        }
    }
}
