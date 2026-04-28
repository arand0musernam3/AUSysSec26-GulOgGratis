package z20;

import a30.p;
import android.os.RemoteException;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a30.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d10.g f46951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, d10.g gVar, String str, d10.g gVar2) {
        super(gVar);
        this.f46950b = 0;
        this.f46953e = jVar;
        this.f46952d = str;
        this.f46951c = gVar2;
    }

    @Override // a30.k
    public final void a() {
        switch (this.f46950b) {
            case 0:
                d10.g gVar = this.f46951c;
                j jVar = (j) this.f46953e;
                String str = (String) this.f46952d;
                try {
                    jVar.f46960a.f679m.r(jVar.f46961b, j.a(jVar, str), new i(jVar, gVar, str));
                    return;
                } catch (RemoteException e5) {
                    j.f46958e.c(e5, "requestUpdateInfo(%s)", str);
                    gVar.c(new RuntimeException(e5));
                    return;
                }
            case 1:
                d10.g gVar2 = this.f46951c;
                j jVar2 = (j) this.f46953e;
                try {
                    jVar2.f46960a.f679m.t(jVar2.f46961b, j.b(), new h(jVar2, new a30.j("OnCompleteUpdateCallback", 0), gVar2));
                    return;
                } catch (RemoteException e11) {
                    j.f46958e.c(e11, "completeUpdate(%s)", (String) this.f46952d);
                    gVar2.c(new RuntimeException(e11));
                    return;
                }
            default:
                synchronized (((p) this.f46953e).f673f) {
                    try {
                        p pVar = (p) this.f46953e;
                        d10.g gVar3 = this.f46951c;
                        pVar.f672e.add(gVar3);
                        gVar3.f13697a.addOnCompleteListener(new z(3, pVar, gVar3));
                        if (((p) this.f46953e).f678k.getAndIncrement() > 0) {
                            ((p) this.f46953e).f669b.d("Already connected to the service.", new Object[0]);
                        }
                        p.b((p) this.f46953e, (a30.k) this.f46952d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, d10.g gVar, d10.g gVar2, Object obj2, int i11) {
        super(gVar);
        this.f46950b = i11;
        this.f46953e = obj;
        this.f46951c = gVar2;
        this.f46952d = obj2;
    }
}
