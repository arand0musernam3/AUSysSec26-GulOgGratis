package u90;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t90.c f40957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga0.f f40958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40959d;

    public p(t90.e eVar) {
        eVar.getClass();
        TimeUnit.MINUTES.getClass();
        this.f40956a = 300000000000L;
        this.f40957b = eVar.d();
        this.f40958c = new ga0.f(this, 2, r8.k.p(new StringBuilder(), r90.g.f37816b, " ConnectionPool connection closer"));
        this.f40959d = new ConcurrentLinkedQueue();
    }

    public final int a(o oVar, long j9) {
        TimeZone timeZone = r90.g.f37815a;
        ArrayList arrayList = oVar.f40954p;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i11);
            if (reference.get() != null) {
                i11++;
            } else {
                String str = "A connection to " + oVar.f40942c.f36610a.f36408h + " was leaked. Did you forget to close a response body?";
                aa0.e eVar = aa0.e.f1191a;
                aa0.e.f1191a.j(((l) reference).f40921a, str);
                arrayList.remove(i11);
                if (arrayList.isEmpty()) {
                    oVar.f40955q = j9 - this.f40956a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
