package y80;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends z80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f45448a = new AtomicReference(null);

    @Override // z80.c
    public final boolean a(z80.a aVar) {
        AtomicReference atomicReference = this.f45448a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(r.f45563d);
        return true;
    }

    @Override // z80.c
    public final x70.c[] b(z80.a aVar) {
        this.f45448a.set(null);
        return z80.b.f47356a;
    }
}
