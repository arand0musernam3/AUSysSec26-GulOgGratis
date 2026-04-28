package c40;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f7077g = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f7081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f7082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f7083f;

    public m(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f7083f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    J(i11, iArr[i12], bArr2);
                    i11 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    i4.a.k("Rename failed!");
                    throw null;
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f7078a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iT = t(0, bArr);
        this.f7079b = iT;
        if (iT <= randomAccessFile2.length()) {
            this.f7080c = t(4, bArr);
            int iT2 = t(8, bArr);
            int iT3 = t(12, bArr);
            this.f7081d = r(iT2);
            this.f7082e = r(iT3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f7079b + ", Actual length: " + randomAccessFile2.length());
    }

    public static void J(int i11, int i12, byte[] bArr) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    public static int t(int i11, byte[] bArr) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    public final void A(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iH = H(i11);
        int i14 = iH + i13;
        int i15 = this.f7079b;
        RandomAccessFile randomAccessFile = this.f7078a;
        if (i14 <= i15) {
            randomAccessFile.seek(iH);
            randomAccessFile.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iH;
        randomAccessFile.seek(iH);
        randomAccessFile.readFully(bArr, i12, i16);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i12 + i16, i13 - i16);
    }

    public final void B(int i11, int i12, byte[] bArr) throws IOException {
        int iH = H(i11);
        int i13 = iH + i12;
        int i14 = this.f7079b;
        RandomAccessFile randomAccessFile = this.f7078a;
        if (i13 <= i14) {
            randomAccessFile.seek(iH);
            randomAccessFile.write(bArr, 0, i12);
            return;
        }
        int i15 = i14 - iH;
        randomAccessFile.seek(iH);
        randomAccessFile.write(bArr, 0, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i15, i12 - i15);
    }

    public final int G() {
        if (this.f7080c == 0) {
            return 16;
        }
        j jVar = this.f7082e;
        int i11 = jVar.f7072a;
        int i12 = this.f7081d.f7072a;
        return i11 >= i12 ? (i11 - i12) + 4 + jVar.f7073b + 16 : (((i11 + 4) + jVar.f7073b) + this.f7079b) - i12;
    }

    public final int H(int i11) {
        int i12 = this.f7079b;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    public final void I(int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = {i11, i12, i13, i14};
        int i15 = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr = this.f7083f;
            if (i15 >= 4) {
                RandomAccessFile randomAccessFile = this.f7078a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                J(i16, iArr[i15], bArr);
                i16 += 4;
                i15++;
            }
        }
    }

    public final void a(byte[] bArr) {
        int iH;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    e(length);
                    boolean zP = p();
                    if (zP) {
                        iH = 16;
                    } else {
                        j jVar = this.f7082e;
                        iH = H(jVar.f7072a + 4 + jVar.f7073b);
                    }
                    j jVar2 = new j(iH, length);
                    J(0, length, this.f7083f);
                    B(iH, 4, this.f7083f);
                    B(iH + 4, length, bArr);
                    I(this.f7079b, this.f7080c + 1, zP ? iH : this.f7081d.f7072a, iH);
                    this.f7082e = jVar2;
                    this.f7080c++;
                    if (zP) {
                        this.f7081d = jVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7078a.close();
    }

    public final void e(int i11) throws IOException {
        int i12 = i11 + 4;
        int iG = this.f7079b - G();
        if (iG >= i12) {
            return;
        }
        int i13 = this.f7079b;
        do {
            iG += i13;
            i13 <<= 1;
        } while (iG < i12);
        RandomAccessFile randomAccessFile = this.f7078a;
        randomAccessFile.setLength(i13);
        randomAccessFile.getChannel().force(true);
        j jVar = this.f7082e;
        int iH = H(jVar.f7072a + 4 + jVar.f7073b);
        if (iH < this.f7081d.f7072a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f7079b);
            long j9 = iH - 4;
            if (channel.transferTo(16L, j9, channel) != j9) {
                i4.a.d("Copied insufficient number of bytes!");
                return;
            }
        }
        int i14 = this.f7082e.f7072a;
        int i15 = this.f7081d.f7072a;
        if (i14 < i15) {
            int i16 = (this.f7079b + i14) - 16;
            I(i13, this.f7080c, i15, i16);
            this.f7082e = new j(i16, this.f7082e.f7073b);
        } else {
            I(i13, this.f7080c, i15, i14);
        }
        this.f7079b = i13;
    }

    public final synchronized void g(l lVar) {
        int iH = this.f7081d.f7072a;
        for (int i11 = 0; i11 < this.f7080c; i11++) {
            j jVarR = r(iH);
            lVar.a(new k(this, jVarR), jVarR.f7073b);
            iH = H(jVarR.f7072a + 4 + jVarR.f7073b);
        }
    }

    public final synchronized boolean p() {
        return this.f7080c == 0;
    }

    public final j r(int i11) throws IOException {
        if (i11 == 0) {
            return j.f7071c;
        }
        RandomAccessFile randomAccessFile = this.f7078a;
        randomAccessFile.seek(i11);
        return new j(i11, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f7079b);
        sb2.append(", size=");
        sb2.append(this.f7080c);
        sb2.append(", first=");
        sb2.append(this.f7081d);
        sb2.append(", last=");
        sb2.append(this.f7082e);
        sb2.append(", element lengths=[");
        try {
            g(new i(sb2));
        } catch (IOException e5) {
            f7077g.log(Level.WARNING, "read error", (Throwable) e5);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final synchronized void u() {
        if (p()) {
            throw new NoSuchElementException();
        }
        if (this.f7080c == 1) {
            synchronized (this) {
                I(4096, 0, 0, 0);
                this.f7080c = 0;
                j jVar = j.f7071c;
                this.f7081d = jVar;
                this.f7082e = jVar;
                if (this.f7079b > 4096) {
                    RandomAccessFile randomAccessFile = this.f7078a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f7079b = 4096;
            }
        } else {
            j jVar2 = this.f7081d;
            int iH = H(jVar2.f7072a + 4 + jVar2.f7073b);
            A(iH, this.f7083f, 0, 4);
            int iT = t(0, this.f7083f);
            I(this.f7079b, this.f7080c - 1, iH, this.f7082e.f7072a);
            this.f7080c--;
            this.f7081d = new j(iH, iT);
        }
    }
}
