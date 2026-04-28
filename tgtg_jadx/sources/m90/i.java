package m90;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f29807c;

    static {
        ByteCompanionObject.INSTANCE.getClass();
        f29807c = new i(j.f29812a);
    }

    @Override // m90.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // m90.s, m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        byte bF = aVar.f(this.f29806b, i11);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.f29803a;
        int i12 = hVar.f29804b;
        hVar.f29804b = i12 + 1;
        bArr[i12] = bF;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        h hVar = new h();
        hVar.f29803a = bArr;
        hVar.f29804b = bArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // m90.h1
    public final Object j() {
        return new byte[0];
    }

    @Override // m90.h1
    public final void k(l90.b bVar, Object obj, int i11) {
        byte[] bArr = (byte[]) obj;
        bVar.getClass();
        bArr.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            bVar.d(this.f29806b, i12, bArr[i12]);
        }
    }
}
