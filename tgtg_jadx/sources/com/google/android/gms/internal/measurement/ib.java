package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ib extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11492b;

    public ib(jb jbVar, x0 x0Var) {
        this.f11491a = 1;
        this.f11492b = x0Var;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        switch (this.f11491a) {
            case 2:
                return (int) Math.min(((ia0.g) this.f11492b).f23643b, Integer.MAX_VALUE);
            case 3:
                ia0.d0 d0Var = (ia0.d0) this.f11492b;
                if (!d0Var.f23624c) {
                    return (int) Math.min(d0Var.f23623b.f23643b, Integer.MAX_VALUE);
                }
                i4.a.k("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f11491a) {
            case 2:
                break;
            case 3:
                ((ia0.d0) this.f11492b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        switch (this.f11491a) {
            case 0:
                jb jbVar = (jb) this.f11492b;
                try {
                    int iInflate = jbVar.f11518a.inflate(bArr, i11, i12);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i12 == 0) {
                        return 0;
                    }
                    if (jbVar.f11518a.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = jbVar.f11518a.getRemaining();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 70 + String.valueOf(remaining).length());
                    sb2.append("Read no bytes (requested up to ");
                    sb2.append(i12);
                    sb2.append(") but did not reach end of stream, had ");
                    sb2.append(remaining);
                    throw new IOException(sb2.toString());
                } catch (DataFormatException e5) {
                    throw new IOException(e5);
                }
            case 1:
                return ((x0) this.f11492b).f(i11, i12, bArr);
            case 2:
                bArr.getClass();
                return ((ia0.g) this.f11492b).read(bArr, i11, i12);
            default:
                bArr.getClass();
                ia0.d0 d0Var = (ia0.d0) this.f11492b;
                ia0.g gVar = d0Var.f23623b;
                if (d0Var.f23624c) {
                    i4.a.k("closed");
                    return 0;
                }
                ia0.b.e(bArr.length, i11, i12);
                if (gVar.f23643b == 0 && d0Var.f23622a.F(gVar, 8192L) == -1) {
                    return -1;
                }
                return gVar.read(bArr, i11, i12);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j9) {
        switch (this.f11491a) {
            case 1:
                if (j9 <= 0) {
                    return 0L;
                }
                int i11 = j9 > 2147483647L ? Integer.MAX_VALUE : (int) j9;
                ((x0) this.f11492b).g(i11);
                return i11;
            default:
                return super.skip(j9);
        }
    }

    public String toString() {
        switch (this.f11491a) {
            case 2:
                return ((ia0.g) this.f11492b) + ".inputStream()";
            case 3:
                return ((ia0.d0) this.f11492b) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f11491a) {
            case 3:
                outputStream.getClass();
                ia0.d0 d0Var = (ia0.d0) this.f11492b;
                ia0.g gVar = d0Var.f23623b;
                if (d0Var.f23624c) {
                    i4.a.k("closed");
                    return 0L;
                }
                long j9 = 0;
                long j11 = 0;
                while (true) {
                    if (gVar.f23643b == j9 && d0Var.f23622a.F(gVar, 8192L) == -1) {
                        return j11;
                    }
                    long j12 = gVar.f23643b;
                    j11 += j12;
                    ia0.b.e(j12, 0L, j12);
                    ia0.e0 e0Var = gVar.f23642a;
                    while (j12 > j9) {
                        e0Var.getClass();
                        int iMin = (int) Math.min(j12, e0Var.f23627c - e0Var.f23626b);
                        outputStream.write(e0Var.f23625a, e0Var.f23626b, iMin);
                        int i11 = e0Var.f23626b + iMin;
                        e0Var.f23626b = i11;
                        long j13 = iMin;
                        gVar.f23643b -= j13;
                        j12 -= j13;
                        if (i11 == e0Var.f23627c) {
                            ia0.e0 e0VarA = e0Var.a();
                            gVar.f23642a = e0VarA;
                            ia0.f0.a(e0Var);
                            e0Var = e0VarA;
                        }
                        j9 = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ ib(Closeable closeable, int i11) {
        this.f11491a = i11;
        this.f11492b = closeable;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f11491a) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            case 1:
                byte[] bArr2 = new byte[1];
                if (((x0) this.f11492b).f(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
            case 2:
                ia0.g gVar = (ia0.g) this.f11492b;
                if (gVar.f23643b > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                ia0.d0 d0Var = (ia0.d0) this.f11492b;
                ia0.g gVar2 = d0Var.f23623b;
                if (d0Var.f23624c) {
                    i4.a.k("closed");
                    return 0;
                }
                if (gVar2.f23643b == 0 && d0Var.f23622a.F(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.readByte() & 255;
        }
    }
}
