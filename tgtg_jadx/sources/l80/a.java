package l80;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends e {
    @Override // l80.e
    public final int a(int i11) {
        return ((-i11) >> 31) & (g().nextInt() >>> (32 - i11));
    }

    @Override // l80.e
    public final int b() {
        return g().nextInt();
    }

    @Override // l80.e
    public final int c(int i11) {
        return g().nextInt(i11);
    }

    @Override // l80.e
    public final long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
