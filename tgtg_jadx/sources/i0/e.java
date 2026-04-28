package i0;

import android.util.Log;
import e0.h1;
import e0.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h1, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r80.c f22623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f22624c;

    public e(long j9) {
        this.f22622a = j9;
        if (j9 <= 0) {
            i4.a.f("Failed requirement.");
            throw null;
        }
        r80.c cVar = new r80.c();
        cVar.f37783a = 0L;
        this.f22623b = cVar;
    }

    @Override // e0.h1
    public final void L(k1 k1Var, long j9, f0.n nVar) {
        long j11;
        long j12;
        r80.c cVar = this.f22623b;
        do {
            j11 = cVar.f37783a;
            j12 = j11 != -1 ? 1 + j11 : -1L;
        } while (!r80.c.f37782b.compareAndSet(cVar, j11, j12));
        if (j12 == this.f22622a) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.f22624c + " after " + j12 + " frames.");
            u uVar = this.f22624c;
            uVar.getClass();
            uVar.G(true);
        }
    }

    @Override // i0.q
    public final void a() {
        long j9;
        r80.c cVar = this.f22623b;
        do {
            j9 = cVar.f37783a;
        } while (!r80.c.f37782b.compareAndSet(cVar, j9, j9 != -1 ? 0L : -1L));
        u uVar = this.f22624c;
        uVar.getClass();
        uVar.G(false);
        StringBuilder sb2 = new StringBuilder("Capture processing has been disabled for ");
        u uVar2 = this.f22624c;
        uVar2.getClass();
        sb2.append(uVar2);
        sb2.append(" until ");
        sb2.append(this.f22622a);
        sb2.append(" frames have been completed.");
        Log.w("CXCP", sb2.toString());
    }

    @Override // i0.q
    public final void b() {
        this.f22623b.f37783a = -1L;
        u uVar = this.f22624c;
        uVar.getClass();
        uVar.G(false);
    }

    @Override // i0.q
    public final void c() {
    }
}
