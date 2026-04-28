package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25677e;

    public p0(byte[] bArr, int i11, int i12) {
        super(bArr);
        q0.i(i11, i11 + i12, bArr.length);
        this.f25676d = i11;
        this.f25677e = i12;
    }

    @Override // k00.q0
    public final byte b(int i11) {
        int i12 = this.f25677e;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f25684b[this.f25676d + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(j4.s.f(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(r8.k.k("Index > length: ", i11, i12, ", "));
    }

    @Override // k00.q0
    public final byte c(int i11) {
        return this.f25684b[this.f25676d + i11];
    }

    @Override // k00.q0
    public final int d() {
        return this.f25676d;
    }

    @Override // k00.q0
    public final int e() {
        return this.f25677e;
    }

    @Override // k00.q0
    public final void g(int i11, byte[] bArr) {
        System.arraycopy(this.f25684b, this.f25676d, bArr, 0, i11);
    }
}
