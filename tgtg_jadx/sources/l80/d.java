package l80;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e implements Serializable {
    public d(DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return c.f27502a;
    }

    @Override // l80.e
    public final int a(int i11) {
        return e.f27504b.a(i11);
    }

    @Override // l80.e
    public final int b() {
        return e.f27504b.b();
    }

    @Override // l80.e
    public final int c(int i11) {
        return e.f27504b.c(i11);
    }

    @Override // l80.e
    public final int d(int i11) {
        return e.f27504b.d(i11);
    }

    @Override // l80.e
    public final long e() {
        return e.f27504b.e();
    }

    @Override // l80.e
    public final long f(long j9, long j11) {
        throw null;
    }
}
