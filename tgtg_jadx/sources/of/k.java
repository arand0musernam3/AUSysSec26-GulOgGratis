package of;

import java.lang.ref.WeakReference;
import ye.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32499b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f32498a = i11;
        this.f32499b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f32498a) {
            case 0:
                l lVar = (l) ((WeakReference) this.f32499b).get();
                if (lVar != null) {
                    lVar.f32516r.m(null);
                    lVar.f32509j.f32538g.m(null);
                }
                break;
            case 1:
                qf.a aVar = (qf.a) this.f32499b;
                aVar.f37037h.a(null);
                aVar.f37036g.a(null);
                aVar.f37038i = false;
                break;
            default:
                b0 b0Var = ((ye.b) this.f32499b).f45858g;
                b0Var.getClass();
                b0Var.f45871c.a(null);
                break;
        }
    }
}
