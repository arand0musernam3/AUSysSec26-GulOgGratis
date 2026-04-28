package ia0;

import com.braze.h2;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f23677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f23678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23680d;

    public t(d0 d0Var, Inflater inflater) {
        this.f23677a = d0Var;
        this.f23678b = inflater;
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) throws IOException {
        gVar.getClass();
        do {
            long jA = a(gVar, j9);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.f23678b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f23677a.a());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(g gVar, long j9) throws IOException {
        Inflater inflater = this.f23678b;
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        if (this.f23680d) {
            h2.b("closed");
            return 0L;
        }
        if (j9 != 0) {
            try {
                e0 e0VarX0 = gVar.x0(1);
                int iMin = (int) Math.min(j9, 8192 - e0VarX0.f23627c);
                boolean zNeedsInput = inflater.needsInput();
                d0 d0Var = this.f23677a;
                if (zNeedsInput && !d0Var.a()) {
                    e0 e0Var = d0Var.f23623b.f23642a;
                    e0Var.getClass();
                    int i11 = e0Var.f23627c;
                    int i12 = e0Var.f23626b;
                    int i13 = i11 - i12;
                    this.f23679c = i13;
                    inflater.setInput(e0Var.f23625a, i12, i13);
                }
                int iInflate = inflater.inflate(e0VarX0.f23625a, e0VarX0.f23627c, iMin);
                int i14 = this.f23679c;
                if (i14 != 0) {
                    int remaining = i14 - inflater.getRemaining();
                    this.f23679c -= remaining;
                    d0Var.skip(remaining);
                }
                if (iInflate > 0) {
                    e0VarX0.f23627c += iInflate;
                    long j11 = iInflate;
                    gVar.f23643b += j11;
                    return j11;
                }
                if (e0VarX0.f23626b == e0VarX0.f23627c) {
                    gVar.f23642a = e0VarX0.a();
                    f0.a(e0VarX0);
                }
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23680d) {
            return;
        }
        this.f23678b.end();
        this.f23680d = true;
        this.f23677a.close();
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23677a.f23622a.i();
    }
}
