package y3;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m2.h0;
import m3.d3;
import m3.m;
import m3.n;
import m3.s;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import q1.g1;
import q1.t0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ub.a f45398e = new ub.a(28, new u60.a(21), new g0(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f45399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f45400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f45401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.c f45402d;

    public c(Map map) {
        this.f45399a = map;
        long[] jArr = g1.f35760a;
        this.f45400b = new t0();
        this.f45402d = new sg.c(this, 23);
    }

    @Override // y3.b
    public final void e(Object obj, u3.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(533563200);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.d0(obj);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                sg.c cVar = this.f45402d;
                if (!((Boolean) cVar.invoke(obj)).booleanValue()) {
                    i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.f45399a.get(obj);
                d3 d3Var = g.f45406a;
                h hVar = new h(new f(map, cVar));
                sVar.k0(hVar);
                objM = hVar;
            }
            h hVar2 = (h) objM;
            m3.i.b(new v1[]{g.f45406a.a(hVar2), fa.a.f17529a.a(hVar2)}, dVar, sVar, (i12 & 112) | 8);
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(this) | sVar.h(obj) | sVar.h(hVar2);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new h0(this, obj, hVar2, 27);
                sVar.k0(objM2);
            }
            m3.i.d(unit, (Function1) objM2, sVar);
            if (sVar.f29440y && sVar.G.f29327i == sVar.f29441z) {
                sVar.f29441z = -1;
                sVar.f29440y = false;
            }
            sVar.q(false);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(this, obj, dVar, i11, 25);
        }
    }

    @Override // y3.b
    public final void f(Object obj) {
        if (this.f45400b.k(obj) == null) {
            this.f45399a.remove(obj);
        }
    }
}
