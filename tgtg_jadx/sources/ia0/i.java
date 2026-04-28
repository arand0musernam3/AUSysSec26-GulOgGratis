package ia0;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface i extends j0, ReadableByteChannel {
    String D(long j9);

    String R(Charset charset);

    int U(y yVar);

    boolean X(long j9, j jVar);

    g h();

    long j0(h hVar);

    void l0(g gVar, long j9);

    j q(long j9);

    void r0(long j9);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j9);

    void skip(long j9);

    byte[] v();

    InputStream w0();

    long y(byte b8, long j9, long j11);

    long z(long j9, j jVar);
}
