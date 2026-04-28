package n6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o6.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class m extends g {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public g[] f30654v0 = new g[4];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f30655w0 = 0;

    public final void W(g gVar) {
        if (gVar == this || gVar == null) {
            return;
        }
        int i11 = this.f30655w0 + 1;
        g[] gVarArr = this.f30654v0;
        if (i11 > gVarArr.length) {
            this.f30654v0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
        }
        g[] gVarArr2 = this.f30654v0;
        int i12 = this.f30655w0;
        gVarArr2[i12] = gVar;
        this.f30655w0 = i12 + 1;
    }

    public final void X(int i11, ArrayList arrayList, q qVar) {
        for (int i12 = 0; i12 < this.f30655w0; i12++) {
            g gVar = this.f30654v0[i12];
            ArrayList arrayList2 = qVar.f32023a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
        }
        for (int i13 = 0; i13 < this.f30655w0; i13++) {
            o6.i.b(this.f30654v0[i13], i11, arrayList, qVar);
        }
    }

    @Override // n6.g
    public void h(g gVar, HashMap map) {
        super.h(gVar, map);
        m mVar = (m) gVar;
        this.f30655w0 = 0;
        int i11 = mVar.f30655w0;
        for (int i12 = 0; i12 < i11; i12++) {
            W((g) map.get(mVar.f30654v0[i12]));
        }
    }

    public void Y() {
    }
}
