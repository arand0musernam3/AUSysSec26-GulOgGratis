package ia0;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends h0, WritableByteChannel {
    h M(String str);

    long b0(j0 j0Var);

    @Override // ia0.h0, java.io.Flushable
    void flush();

    g h();

    h n0(int i11, int i12, byte[] bArr);

    h o0(j jVar);

    h s0(long j9);

    h write(byte[] bArr);

    h writeByte(int i11);

    h writeInt(int i11);

    h writeShort(int i11);
}
