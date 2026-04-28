package m80;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends l80.a {
    @Override // l80.e
    public final int d(int i11) {
        return ThreadLocalRandom.current().nextInt(0, i11);
    }

    @Override // l80.e
    public final long f(long j9, long j11) {
        return ThreadLocalRandom.current().nextLong(j9, j11);
    }

    @Override // l80.a
    public final Random g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
