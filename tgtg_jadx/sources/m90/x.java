package m90;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f29877e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f29878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6.y f29879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f29881d;

    public x(SerialDescriptor serialDescriptor, c6.y yVar) {
        serialDescriptor.getClass();
        this.f29878a = serialDescriptor;
        this.f29879b = yVar;
        int iE = serialDescriptor.e();
        if (iE <= 64) {
            this.f29880c = iE != 64 ? (-1) << iE : 0L;
            this.f29881d = f29877e;
            return;
        }
        this.f29880c = 0L;
        int i11 = (iE - 1) >>> 6;
        long[] jArr = new long[i11];
        if ((iE & 63) != 0) {
            jArr[i11 - 1] = (-1) << iE;
        }
        this.f29881d = jArr;
    }
}
