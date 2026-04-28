package g30;

import a30.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19915c;

    public /* synthetic */ g(Object obj, int i11) {
        this.f19914b = i11;
        this.f19915c = obj;
    }

    @Override // g30.e
    public final void a() {
        switch (this.f19914b) {
            case 0:
                synchronized (((h) this.f19915c).f19922f) {
                    try {
                        if (((h) this.f19915c).f19927k.get() > 0 && ((h) this.f19915c).f19927k.decrementAndGet() > 0) {
                            ((h) this.f19915c).f19918b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        h hVar = (h) this.f19915c;
                        if (hVar.f19928m != null) {
                            hVar.f19918b.b("Unbind from service.", new Object[0]);
                            h hVar2 = (h) this.f19915c;
                            hVar2.f19917a.unbindService(hVar2.l);
                            h hVar3 = (h) this.f19915c;
                            hVar3.f19923g = false;
                            hVar3.f19928m = null;
                            hVar3.l = null;
                        }
                        ((h) this.f19915c).c();
                        return;
                    } finally {
                    }
                }
            default:
                h hVar4 = (h) ((o) this.f19915c).f666b;
                hVar4.f19918b.b("unlinkToDeath", new Object[0]);
                hVar4.f19928m.asBinder().unlinkToDeath(hVar4.f19926j, 0);
                hVar4.f19928m = null;
                hVar4.f19923g = false;
                return;
        }
    }
}
