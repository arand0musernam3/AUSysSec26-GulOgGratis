package o90;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n90.n f32175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n90.c cVar, n90.n nVar, String str) {
        super(str, cVar);
        cVar.getClass();
        nVar.getClass();
        this.f32175f = nVar;
        this.f32149a.add("primitive");
    }

    @Override // o90.a
    public final n90.n E(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f32175f;
        }
        i4.a.f("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // o90.a
    public final n90.n S() {
        return this.f32175f;
    }

    @Override // l90.a
    public final int w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }
}
