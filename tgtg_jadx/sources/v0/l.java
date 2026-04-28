package v0;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f41619g = "Exif\u0000\u0000".getBytes(e.f41597d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f41620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f41622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41625f;

    public l(ByteArrayOutputStream byteArrayOutputStream, k kVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f41621b = new byte[1];
        this.f41622c = ByteBuffer.allocate(4);
        this.f41623d = 0;
        this.f41620a = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0365, code lost:
    
        if (r3 <= 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0367, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.l.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i11) throws IOException {
        byte[] bArr = this.f41621b;
        bArr[0] = (byte) (i11 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
