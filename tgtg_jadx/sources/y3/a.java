package y3;

import m3.e2;
import z3.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f45391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f45392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f45394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f45395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f45396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y.a f45397g = new y.a(this, 3);

    public a(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f45391a = iVar;
        this.f45392b = eVar;
        this.f45393c = str;
        this.f45394d = obj;
        this.f45395e = objArr;
    }

    public final void a() throws NoSuchMethodException, ClassNotFoundException {
        String strA;
        e eVar = this.f45392b;
        if (this.f45396f != null) {
            e40.a.h("entry(", this.f45396f, ") is not null");
            return;
        }
        if (eVar != null) {
            y.a aVar = this.f45397g;
            Object objInvoke = aVar.invoke();
            if (objInvoke == null || eVar.a(objInvoke)) {
                this.f45396f = eVar.d(this.f45393c, aVar);
                return;
            }
            if (objInvoke instanceof p) {
                p pVar = (p) objInvoke;
                if (pVar.c() == m3.f.f29272d || pVar.c() == m3.f.f29275g || pVar.c() == m3.f.f29273e) {
                    strA = "MutableState containing " + pVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = j.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // m3.e2
    public final void b() {
        d dVar = this.f45396f;
        if (dVar != null) {
            ((t5.a) dVar).L();
        }
    }

    @Override // m3.e2
    public final void c() {
        d dVar = this.f45396f;
        if (dVar != null) {
            ((t5.a) dVar).L();
        }
    }

    @Override // m3.e2
    public final void d() throws NoSuchMethodException, ClassNotFoundException {
        a();
    }
}
