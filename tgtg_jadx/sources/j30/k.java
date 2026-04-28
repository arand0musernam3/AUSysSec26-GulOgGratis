package j30;

import a90.v;
import c5.i2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f24515b;

    public k(i2 i2Var, String str) {
        this.f24514a = str;
        this.f24515b = i2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i2 i2Var = this.f24515b;
        return new j(i2Var, this.f24514a, (c) ((e.b) i2Var.f7256e).f15275b);
    }

    public final String toString() {
        v vVar = new v(", ", 3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        vVar.a(sb2, iterator());
        sb2.append(']');
        return sb2.toString();
    }
}
