package s80;

import d40.t1;
import java.util.List;
import kotlin.collections.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80.a f38902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38904d;

    public a(t80.a aVar, int i11, int i12) {
        this.f38902b = aVar;
        this.f38903c = i11;
        t1.v(i11, i12, aVar.size());
        this.f38904d = i12 - i11;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f38904d;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        t1.t(i11, this.f38904d);
        return this.f38902b.get(this.f38903c + i11);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i11, int i12) {
        t1.v(i11, i12, this.f38904d);
        int i13 = this.f38903c;
        return new a(this.f38902b, i11 + i13, i13 + i12);
    }
}
