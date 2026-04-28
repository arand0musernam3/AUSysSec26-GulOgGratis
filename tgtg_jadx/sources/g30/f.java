package g30;

import dn.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d10.g f19911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30.e f19912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f19913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, d10.g gVar, d10.g gVar2, f30.e eVar) {
        super(gVar);
        this.f19911b = gVar2;
        this.f19912c = eVar;
        this.f19913d = hVar;
    }

    @Override // g30.e
    public final void a() {
        synchronized (this.f19913d.f19922f) {
            try {
                h hVar = this.f19913d;
                d10.g gVar = this.f19911b;
                hVar.f19921e.add(gVar);
                gVar.f13697a.addOnCompleteListener(new k(10, hVar, gVar));
                if (this.f19913d.f19927k.getAndIncrement() > 0) {
                    this.f19913d.f19918b.b("Already connected to the service.", new Object[0]);
                }
                h.b(this.f19913d, this.f19912c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
