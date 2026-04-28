package u30;

import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements t40.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f40703c = new y(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.firebase.messaging.m f40704d = new com.google.firebase.messaging.m(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t40.a f40705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile t40.b f40706b;

    public m(y yVar, t40.b bVar) {
        this.f40705a = yVar;
        this.f40706b = bVar;
    }

    public final void a(t40.a aVar) {
        t40.b bVar;
        t40.b bVar2;
        t40.b bVar3 = this.f40706b;
        com.google.firebase.messaging.m mVar = f40704d;
        if (bVar3 != mVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f40706b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f40705a = new a50.d(27, this.f40705a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // t40.b
    public final Object get() {
        return this.f40706b.get();
    }
}
