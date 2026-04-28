package qe;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37013c;

    public s(List list, String str, boolean z11) {
        this.f37011a = str;
        this.f37012b = list;
        this.f37013c = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.d(zVar, bVar, this, kVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f37011a + "' Shapes: " + Arrays.toString(this.f37012b.toArray()) + '}';
    }
}
