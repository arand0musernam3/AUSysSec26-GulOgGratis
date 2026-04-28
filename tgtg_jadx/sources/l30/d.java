package l30;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27267e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f27263a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27264b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27265c = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27268f = 0;

    public d() {
        long j9 = 0;
        this.f27266d = j9;
        this.f27267e = j9;
    }

    public final void a() {
        ByteBuffer byteBuffer = this.f27263a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f27265c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j9 = byteBuffer.getLong();
        long j11 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j9 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f27266d;
        this.f27266d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j12 = this.f27267e;
        this.f27266d = ((jRotateLeft2 + j12) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j11 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j12;
        this.f27267e = jRotateLeft3;
        this.f27267e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f27266d) * 5) + 944331445;
        this.f27268f += 16;
    }

    public final d c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f27263a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.f27264b - byteBuffer.position();
        for (int i11 = 0; i11 < iPosition; i11++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.f27265c) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
