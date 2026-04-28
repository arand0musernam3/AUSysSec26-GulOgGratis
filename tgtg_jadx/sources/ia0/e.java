package ia0;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h0 {
    @Override // ia0.h0
    public final l0 i() {
        return l0.f23657d;
    }

    @Override // ia0.h0
    public final void x(g gVar, long j9) throws EOFException {
        gVar.getClass();
        gVar.skip(j9);
    }

    @Override // ia0.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // ia0.h0, java.io.Flushable
    public final void flush() {
    }
}
