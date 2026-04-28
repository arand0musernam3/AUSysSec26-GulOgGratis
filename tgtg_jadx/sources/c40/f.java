package c40;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n20.f f7064c = new n20.f(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7066b;

    public f(g40.b bVar) {
        this.f7065a = bVar;
        this.f7066b = f7064c;
    }

    @Override // c40.l
    public void a(k kVar, int i11) throws IOException {
        int[] iArr = (int[]) this.f7066b;
        try {
            kVar.read((byte[]) this.f7065a, iArr[0], i11);
            iArr[0] = iArr[0] + i11;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f7065a = bArr;
        this.f7066b = iArr;
    }
}
