package y1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import m3.w1;
import rk.a0;
import z3.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45354a = new r();

    public static void b(e eVar, Function2 function2, u3.d dVar, Function0 function0, int i11) {
        if ((i11 & 8) != 0) {
            dVar = null;
        }
        eVar.f45354a.add(new u3.d(new d(function2, eVar, dVar, function0), true, -1789283891));
    }

    public final void a(c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-798501095);
        int i12 = (sVar.f(cVar) ? 4 : 2) | i11 | (sVar.f(this) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            r rVar = this.f45354a;
            int size = rVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((i80.n) rVar.get(i13)).invoke(cVar, sVar, Integer.valueOf(i12 & 14));
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(this, cVar, i11, 20);
        }
    }
}
