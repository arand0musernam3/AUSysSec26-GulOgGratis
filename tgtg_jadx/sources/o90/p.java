package o90;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n90.e f32188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n90.c cVar, n90.e eVar) {
        super(null, cVar);
        cVar.getClass();
        eVar.getClass();
        this.f32188f = eVar;
        this.f32189g = eVar.f30756a.size();
        this.f32190h = -1;
    }

    @Override // o90.a
    public final n90.n E(String str) {
        str.getClass();
        return this.f32188f.get(Integer.parseInt(str));
    }

    @Override // o90.a
    public final String Q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return String.valueOf(i11);
    }

    @Override // o90.a
    public final n90.n S() {
        return this.f32188f;
    }

    @Override // l90.a
    public final int w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i11 = this.f32190h;
        if (i11 >= this.f32189g - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f32190h = i12;
        return i12;
    }
}
