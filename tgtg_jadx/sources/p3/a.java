package p3;

import java.util.List;
import kotlin.collections.f;
import q3.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f34199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34201d;

    public a(c cVar, int i11, int i12) {
        this.f34199b = cVar;
        this.f34200c = i11;
        dx.f.p(i11, i12, cVar.size());
        this.f34201d = i12 - i11;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f34201d;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        dx.f.n(i11, this.f34201d);
        return this.f34199b.get(this.f34200c + i11);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i11, int i12) {
        dx.f.p(i11, i12, this.f34201d);
        int i13 = this.f34200c;
        return new a(this.f34199b, i11 + i13, i13 + i12);
    }
}
