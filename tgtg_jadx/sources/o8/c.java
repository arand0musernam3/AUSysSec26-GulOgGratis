package o8;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32056a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f32057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OutputStream f32058c;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f32058c = new DataOutputStream(outputStream);
        this.f32057b = byteOrder;
    }

    public void a(int i11) throws IOException {
        ((DataOutputStream) this.f32058c).write(i11);
    }

    public final void e(int i11) throws IOException {
        switch (this.f32056a) {
            case 0:
                DataOutputStream dataOutputStream = (DataOutputStream) this.f32058c;
                ByteOrder byteOrder = this.f32057b;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(i11 & 255);
                    dataOutputStream.write((i11 >>> 8) & 255);
                    dataOutputStream.write((i11 >>> 16) & 255);
                    dataOutputStream.write((i11 >>> 24) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((i11 >>> 24) & 255);
                    dataOutputStream.write((i11 >>> 16) & 255);
                    dataOutputStream.write((i11 >>> 8) & 255);
                    dataOutputStream.write(i11 & 255);
                }
                break;
            default:
                ByteOrder byteOrder2 = this.f32057b;
                ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f32058c;
                if (byteOrder2 == byteOrder3) {
                    outputStream.write(i11 & 255);
                    outputStream.write((i11 >>> 8) & 255);
                    outputStream.write((i11 >>> 16) & 255);
                    outputStream.write((i11 >>> 24) & 255);
                } else if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i11 >>> 24) & 255);
                    outputStream.write((i11 >>> 16) & 255);
                    outputStream.write((i11 >>> 8) & 255);
                    outputStream.write(i11 & 255);
                }
                break;
        }
    }

    public final void g(short s7) throws IOException {
        switch (this.f32056a) {
            case 0:
                DataOutputStream dataOutputStream = (DataOutputStream) this.f32058c;
                ByteOrder byteOrder = this.f32057b;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    dataOutputStream.write(s7 & 255);
                    dataOutputStream.write((s7 >>> 8) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    dataOutputStream.write((s7 >>> 8) & 255);
                    dataOutputStream.write(s7 & 255);
                }
                break;
            default:
                ByteOrder byteOrder2 = this.f32057b;
                ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f32058c;
                if (byteOrder2 == byteOrder3) {
                    outputStream.write(s7 & 255);
                    outputStream.write((s7 >>> 8) & 255);
                } else if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s7 >>> 8) & 255);
                    outputStream.write(s7 & 255);
                }
                break;
        }
    }

    public void p(long j9) throws IOException {
        if (j9 <= 4294967295L) {
            e((int) j9);
        } else {
            i4.a.f("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    public void r(int i11) throws IOException {
        if (i11 <= 65535) {
            g((short) i11);
        } else {
            i4.a.f("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.f32056a) {
            case 0:
                ((DataOutputStream) this.f32058c).write(bArr);
                break;
            default:
                this.f32058c.write(bArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f32058c = outputStream;
        this.f32057b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        switch (this.f32056a) {
            case 0:
                ((DataOutputStream) this.f32058c).write(bArr, i11, i12);
                break;
            default:
                this.f32058c.write(bArr, i11, i12);
                break;
        }
    }
}
