package l80;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends e implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final f f27505i = new f(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27511h;

    private final Object readResolve() throws Throwable {
        try {
            g();
            return this;
        } catch (Throwable th2) {
            Throwable thInitCause = new InvalidObjectException(th2.getMessage()).initCause(th2);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    @Override // l80.e
    public final int a(int i11) {
        return ((-i11) >> 31) & (b() >>> (32 - i11));
    }

    @Override // l80.e
    public final int b() {
        int i11 = this.f27506c;
        int i12 = i11 ^ (i11 >>> 2);
        this.f27506c = this.f27507d;
        this.f27507d = this.f27508e;
        this.f27508e = this.f27509f;
        int i13 = this.f27510g;
        this.f27509f = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.f27510g = i14;
        int i15 = this.f27511h + 362437;
        this.f27511h = i15;
        return i14 + i15;
    }

    public final void g() {
        if ((this.f27506c | this.f27507d | this.f27508e | this.f27509f | this.f27510g) != 0) {
            return;
        }
        i4.a.f("Initial state must have at least one non-zero element.");
    }
}
