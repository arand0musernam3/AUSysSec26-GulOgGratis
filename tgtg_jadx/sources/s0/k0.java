package s0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f38369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38371d;

    public /* synthetic */ k0(m0 m0Var, List list, int i11, int i12) {
        this.f38368a = i12;
        this.f38369b = m0Var;
        this.f38370c = list;
        this.f38371d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38368a) {
            case 0:
                m0 m0Var = this.f38369b;
                List list = this.f38370c;
                int i11 = this.f38371d;
                if (m0Var.l.get() && Intrinsics.areEqual(m0Var.f38396k, list)) {
                    wd.a.p("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i11);
                    w.j0 j0Var = m0Var.f38393h;
                    if (j0Var != null) {
                        j0Var.b();
                    }
                    m0Var.d(i11 - 1, list);
                    break;
                }
                break;
            default:
                m0 m0Var2 = this.f38369b;
                m0Var2.f38386a.execute(new k0(m0Var2, this.f38370c, this.f38371d, 0));
                break;
        }
    }
}
