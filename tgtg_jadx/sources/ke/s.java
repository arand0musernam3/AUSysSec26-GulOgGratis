package ke;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f26364i;

    public s(Object obj, ub.a aVar) {
        super(Collections.EMPTY_LIST);
        k(aVar);
        this.f26364i = obj;
    }

    @Override // ke.e
    public final float c() {
        return 1.0f;
    }

    @Override // ke.e
    public final Object f() {
        ub.a aVar = this.f26305e;
        Object obj = this.f26364i;
        float f11 = this.f26304d;
        return aVar.x(0.0f, 0.0f, obj, obj, f11, f11, f11);
    }

    @Override // ke.e
    public final Object g(we.a aVar, float f11) {
        return f();
    }

    @Override // ke.e
    public final void i() {
        if (this.f26305e != null) {
            super.i();
        }
    }

    @Override // ke.e
    public final void j(float f11) {
        this.f26304d = f11;
    }
}
