package pe;

import java.util.List;
import ke.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f34720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34721b;

    public c(b bVar, b bVar2) {
        this.f34720a = bVar;
        this.f34721b = bVar2;
    }

    @Override // pe.e
    public final ke.e g() {
        return new o(this.f34720a.g(), this.f34721b.g());
    }

    @Override // pe.e
    public final List h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // pe.e
    public final boolean isStatic() {
        return this.f34720a.isStatic() && this.f34721b.isStatic();
    }
}
