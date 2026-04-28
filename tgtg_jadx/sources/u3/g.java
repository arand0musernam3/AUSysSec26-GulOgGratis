package u3;

import java.util.Set;
import m3.e2;
import m3.f2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3.e f40656b = new o3.e(new f2[16], 0);

    public g(Set set) {
        this.f40655a = set;
    }

    @Override // m3.e2
    public final void d() {
        o3.e eVar = this.f40656b;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            e2 e2Var = ((f2) objArr[i12]).f29279a;
            this.f40655a.remove(e2Var);
            e2Var.d();
        }
    }

    @Override // m3.e2
    public final void b() {
    }

    @Override // m3.e2
    public final void c() {
    }
}
