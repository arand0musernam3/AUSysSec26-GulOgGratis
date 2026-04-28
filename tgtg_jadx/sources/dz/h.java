package dz;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f15261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f15262c;

    public /* synthetic */ h(t70.a aVar, t70.a aVar2, int i11) {
        this.f15260a = i11;
        this.f15261b = aVar;
        this.f15262c = aVar2;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f15260a) {
            case 0:
                return new g(new n20.f(16), new r40.d(), a.f15239f, (j) this.f15261b.get(), this.f15262c);
            default:
                return new xy.f((Context) ((xy.e) this.f15261b).f44509b, (t5.a) ((xy.e) this.f15262c).get());
        }
    }
}
