package av;

import androidx.lifecycle.p0;
import e0.f;
import s0.j0;
import s0.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4846c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f4844a = i11;
        this.f4845b = obj;
        this.f4846c = obj2;
    }

    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        switch (this.f4844a) {
            case 0:
                e eVar = (e) this.f4845b;
                p0 p0Var = (p0) this.f4846c;
                if (eVar.l.compareAndSet(true, false)) {
                    p0Var.a(obj);
                }
                break;
            default:
                m0 m0Var = (m0) this.f4845b;
                String str = (String) this.f4846c;
                m0.d dVar = (m0.d) obj;
                if (!m0Var.l.get()) {
                    wd.a.p("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                } else if (dVar.f28490b != null) {
                    StringBuilder sbS = f.s("Camera ", str, " state changed to ");
                    sbS.append(dVar.f28489a);
                    sbS.append(" with error: ");
                    m0.e eVar2 = dVar.f28490b;
                    sbS.append(eVar2 != null ? Integer.valueOf(eVar2.f28494a) : null);
                    sbS.append(". Triggering refresh.");
                    wd.a.I("CameraPresencePrvdr", sbS.toString());
                    m0Var.f38386a.execute(new j0(m0Var, 2));
                }
                break;
        }
    }
}
