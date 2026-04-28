package u40;

import c50.w;
import com.braze.h2;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f40758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10.g f40759b;

    public f(j jVar, d10.g gVar) {
        this.f40758a = jVar;
        this.f40759b = gVar;
    }

    @Override // u40.i
    public final boolean a(Exception exc) {
        this.f40759b.c(exc);
        return true;
    }

    @Override // u40.i
    public final boolean b(v40.b bVar) {
        if (bVar.f42007b != v40.d.REGISTERED || this.f40758a.a(bVar)) {
            return false;
        }
        String str = bVar.f42008c;
        if (str == null) {
            w.l("Null token");
            return false;
        }
        long j9 = bVar.f42010e;
        long j11 = bVar.f42011f;
        byte b8 = (byte) (((byte) 1) | 2);
        if (b8 == 3) {
            this.f40759b.b(new a(str, j9, j11));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((b8 & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        h2.b(a0.q("Missing required properties:", sb2));
        return false;
    }
}
