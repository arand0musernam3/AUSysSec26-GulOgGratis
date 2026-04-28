package ke;

import he.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ub.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub.a f26310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ub.a aVar) {
        super(11);
        this.f26310d = aVar;
    }

    @Override // ub.a
    public final Object w(we.b bVar) {
        Float f11 = (Float) ((k0) this.f26310d.f40982c);
        if (f11 == null) {
            return null;
        }
        return Float.valueOf(f11.floatValue() * 2.55f);
    }
}
