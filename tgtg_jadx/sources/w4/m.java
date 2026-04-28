package w4;

import a3.i3;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3.e f43153a = new o3.e(new l[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f43154b = new o0(10);

    public boolean a(q1.z zVar, z4.z zVar2, i3 i3Var, boolean z11) {
        o3.e eVar = this.f43153a;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z12 = ((l) objArr[i12]).a(zVar, zVar2, i3Var, z11) || z12;
        }
        return z12;
    }

    public void b(i3 i3Var) {
        o3.e eVar = this.f43153a;
        int i11 = eVar.f31832c;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            }
            if (((l) eVar.f31830a[i11]).f43146d.f2542b == 0) {
                eVar.l(i11);
            }
        }
    }
}
