package p50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f34480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f34481d;

    public a(f fVar, int i11, int i12) {
        super(fVar);
        this.f34480c = (short) i11;
        this.f34481d = (short) i12;
    }

    @Override // p50.f
    public final void a(q50.a aVar, byte[] bArr) {
        int i11 = 0;
        while (true) {
            short s7 = this.f34481d;
            if (i11 >= s7) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s7 <= 62)) {
                aVar.b(31, 5);
                if (s7 > 62) {
                    aVar.b(s7 - 31, 16);
                } else if (i11 == 0) {
                    aVar.b(Math.min((int) s7, 31), 5);
                } else {
                    aVar.b(s7 - 31, 5);
                }
            }
            aVar.b(bArr[this.f34480c + i11], 8);
            i11++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f34480c);
        sb2.append("::");
        sb2.append((r1 + this.f34481d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
