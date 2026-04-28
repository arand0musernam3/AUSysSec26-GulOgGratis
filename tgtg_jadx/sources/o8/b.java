package o8;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import r8.k;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f32051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f32053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f32054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32055e;

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f32051a = dataInputStream;
        dataInputStream.mark(0);
        this.f32052b = 0;
        this.f32053c = byteOrder;
        this.f32055e = inputStream instanceof b ? ((b) inputStream).f32055e : -1;
    }

    public final void a(int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i11 - i12;
            DataInputStream dataInputStream = this.f32051a;
            int iSkip = (int) dataInputStream.skip(i13);
            if (iSkip <= 0) {
                if (this.f32054d == null) {
                    this.f32054d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f32054d, 0, Math.min(8192, i13));
                if (iSkip == -1) {
                    throw new EOFException(k.h(i11, "Reached EOF while skipping ", " bytes."));
                }
            }
            i12 += iSkip;
        }
        this.f32052b += i12;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f32051a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f32052b++;
        return this.f32051a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f32052b++;
        return this.f32051a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f32052b++;
        int i11 = this.f32051a.read();
        if (i11 >= 0) {
            return (byte) i11;
        }
        i4.a.b();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f32052b += 2;
        return this.f32051a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f32052b += bArr.length;
        this.f32051a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f32052b += 4;
        DataInputStream dataInputStream = this.f32051a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i11 | i12 | i13 | i14) < 0) {
            i4.a.b();
            return 0;
        }
        ByteOrder byteOrder = this.f32053c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
        }
        o.o(this.f32053c, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j9;
        long j11;
        this.f32052b += 8;
        DataInputStream dataInputStream = this.f32051a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        int i18 = dataInputStream.read();
        if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
            i4.a.b();
            return 0L;
        }
        ByteOrder byteOrder = this.f32053c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j9 = (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8);
            j11 = i11;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                o.o(this.f32053c, "Invalid byte order: ");
                return 0L;
            }
            j9 = (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8);
            j11 = i18;
        }
        return j9 + j11;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f32052b += 2;
        DataInputStream dataInputStream = this.f32051a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            i4.a.b();
            return (short) 0;
        }
        ByteOrder byteOrder = this.f32053c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i12 << 8) + i11);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i11 << 8) + i12);
        }
        o.o(this.f32053c, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f32052b += 2;
        return this.f32051a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f32052b++;
        return this.f32051a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f32052b += 2;
        DataInputStream dataInputStream = this.f32051a;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            i4.a.b();
            return 0;
        }
        ByteOrder byteOrder = this.f32053c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i12 << 8) + i11;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i11 << 8) + i12;
        }
        o.o(this.f32053c, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i11) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i11, int i12) throws IOException {
        this.f32052b += i12;
        this.f32051a.readFully(bArr, i11, i12);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f32051a.read(bArr, i11, i12);
        this.f32052b += i13;
        return i13;
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f32055e = bArr.length;
    }
}
