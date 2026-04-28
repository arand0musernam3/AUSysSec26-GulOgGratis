package xy;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44509b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f44508a = i11;
        this.f44509b = obj;
    }

    @Override // t70.a
    public final Object get() {
        switch (this.f44508a) {
            case 0:
                return new t5.a((Context) ((e) this.f44509b).f44509b, new n20.f(16), new r40.d(), 16);
            default:
                return this.f44509b;
        }
    }
}
