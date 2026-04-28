package je;

import he.z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ke.a, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f25109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke.e f25110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qe.q f25111c;

    public s(z zVar, re.b bVar, qe.p pVar) {
        this.f25109a = zVar;
        ke.e eVarG = pVar.f37001a.g();
        this.f25110b = eVarG;
        bVar.f(eVarG);
        eVarG.a(this);
    }

    public static int d(int i11, int i12) {
        int i13 = i11 / i12;
        if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
            i13--;
        }
        return i11 - (i13 * i12);
    }

    @Override // ke.a
    public final void a() {
        this.f25109a.invalidateSelf();
    }

    @Override // je.c
    public final void c(List list, List list2) {
    }
}
