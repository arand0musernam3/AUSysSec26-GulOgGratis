package kd;

import ia0.j0;
import ia0.l0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f26285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26286b;

    public e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f26285a = byteBufferSlice;
        this.f26286b = byteBufferSlice.capacity();
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) {
        ByteBuffer byteBuffer = this.f26285a;
        int iPosition = byteBuffer.position();
        int i11 = this.f26286b;
        if (iPosition == i11) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j9);
        if (iPosition2 <= i11) {
            i11 = iPosition2;
        }
        byteBuffer.limit(i11);
        return gVar.write(byteBuffer);
    }

    @Override // ia0.j0
    public final l0 i() {
        return l0.f23657d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
