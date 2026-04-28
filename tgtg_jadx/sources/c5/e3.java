package c5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5.n f7184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.h0 f7185b;

    public e3(j5.t tVar, q1.o oVar) {
        this.f7184a = tVar.f24696d;
        this.f7185b = new q1.h0(j5.t.j(4, tVar).size());
        List listJ = j5.t.j(4, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            j5.t tVar2 = (j5.t) listJ.get(i11);
            if (oVar.a(tVar2.f24699g)) {
                this.f7185b.b(tVar2.f24699g);
            }
        }
    }
}
