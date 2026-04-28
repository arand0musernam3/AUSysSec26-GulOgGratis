package ia0;

import com.braze.h2;
import java.io.Closeable;
import java.util.Arrays;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f23632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f23634c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f23636e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23635d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23637f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23638g = -1;

    public final void a(long j9) {
        g gVar = this.f23632a;
        if (gVar == null) {
            h2.b("not attached to a buffer");
            return;
        }
        if (!this.f23633b) {
            h2.b("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j11 = gVar.f23643b;
        if (j9 <= j11) {
            if (j9 < 0) {
                i4.a.i(e0.f.i(j9, "newSize < 0: "));
                return;
            }
            long j12 = j11 - j9;
            while (true) {
                if (j12 <= 0) {
                    break;
                }
                e0 e0Var = gVar.f23642a;
                e0Var.getClass();
                e0 e0Var2 = e0Var.f23631g;
                e0Var2.getClass();
                int i11 = e0Var2.f23627c;
                long j13 = i11 - e0Var2.f23626b;
                if (j13 > j12) {
                    e0Var2.f23627c = i11 - ((int) j12);
                    break;
                } else {
                    gVar.f23642a = e0Var2.a();
                    f0.a(e0Var2);
                    j12 -= j13;
                }
            }
            this.f23634c = null;
            this.f23635d = j9;
            this.f23636e = null;
            this.f23637f = -1;
            this.f23638g = -1;
        } else if (j9 > j11) {
            long j14 = j9 - j11;
            int i12 = 1;
            boolean z11 = true;
            for (long j15 = 0; j14 > j15; j15 = 0) {
                e0 e0VarX0 = gVar.x0(i12);
                int iMin = (int) Math.min(j14, 8192 - e0VarX0.f23627c);
                int i13 = e0VarX0.f23627c + iMin;
                e0VarX0.f23627c = i13;
                j14 -= (long) iMin;
                if (z11) {
                    this.f23634c = e0VarX0;
                    this.f23635d = j11;
                    this.f23636e = e0VarX0.f23625a;
                    this.f23637f = i13 - iMin;
                    this.f23638g = i13;
                    z11 = false;
                }
                i12 = 1;
            }
        }
        gVar.f23643b = j9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23632a == null) {
            h2.b("not attached to a buffer");
            return;
        }
        this.f23632a = null;
        this.f23634c = null;
        this.f23635d = -1L;
        this.f23636e = null;
        this.f23637f = -1;
        this.f23638g = -1;
    }

    public final int e(long j9) {
        g gVar = this.f23632a;
        if (gVar == null) {
            h2.b("not attached to a buffer");
            return 0;
        }
        if (j9 >= -1) {
            long j11 = gVar.f23643b;
            if (j9 <= j11) {
                if (j9 == -1 || j9 == j11) {
                    this.f23634c = null;
                    this.f23635d = j9;
                    this.f23636e = null;
                    this.f23637f = -1;
                    this.f23638g = -1;
                    return -1;
                }
                e0 e0Var = gVar.f23642a;
                e0 e0Var2 = this.f23634c;
                long j12 = 0;
                if (e0Var2 != null) {
                    long j13 = this.f23635d - ((long) (this.f23637f - e0Var2.f23626b));
                    if (j13 > j9) {
                        e0Var2 = e0Var;
                        e0Var = e0Var2;
                        j11 = j13;
                    } else {
                        j12 = j13;
                    }
                } else {
                    e0Var2 = e0Var;
                }
                if (j11 - j9 > j9 - j12) {
                    while (true) {
                        e0Var2.getClass();
                        long j14 = ((long) (e0Var2.f23627c - e0Var2.f23626b)) + j12;
                        if (j9 < j14) {
                            break;
                        }
                        e0Var2 = e0Var2.f23630f;
                        j12 = j14;
                    }
                } else {
                    while (j11 > j9) {
                        e0Var.getClass();
                        e0Var = e0Var.f23631g;
                        e0Var.getClass();
                        j11 -= (long) (e0Var.f23627c - e0Var.f23626b);
                    }
                    e0Var2 = e0Var;
                    j12 = j11;
                }
                if (this.f23633b) {
                    e0Var2.getClass();
                    if (e0Var2.f23628d) {
                        byte[] bArr = e0Var2.f23625a;
                        e0 e0Var3 = new e0(Arrays.copyOf(bArr, bArr.length), e0Var2.f23626b, e0Var2.f23627c, false, true);
                        if (gVar.f23642a == e0Var2) {
                            gVar.f23642a = e0Var3;
                        }
                        e0Var2.b(e0Var3);
                        e0 e0Var4 = e0Var3.f23631g;
                        e0Var4.getClass();
                        e0Var4.a();
                        e0Var2 = e0Var3;
                    }
                }
                this.f23634c = e0Var2;
                this.f23635d = j9;
                e0Var2.getClass();
                this.f23636e = e0Var2.f23625a;
                int i11 = e0Var2.f23626b + ((int) (j9 - j12));
                this.f23637f = i11;
                int i12 = e0Var2.f23627c;
                this.f23638g = i12;
                return i12 - i11;
            }
        }
        StringBuilder sbG = l1.g("offset=", j9, " > size=");
        sbG.append(gVar.f23643b);
        throw new ArrayIndexOutOfBoundsException(sbG.toString());
    }
}
