package b4;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f5681b;

    public /* synthetic */ b(int i11, Function0 function0) {
        this.f5680a = i11;
        this.f5681b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5680a) {
            case 0:
                this.f5681b.invoke();
                break;
            case 1:
                this.f5681b.invoke();
                break;
            case 2:
                this.f5681b.invoke();
                break;
            case 3:
                this.f5681b.invoke();
                break;
            case 4:
                this.f5681b.invoke();
                break;
            case 5:
                this.f5681b.invoke();
                break;
            case 6:
                Function0 function0 = this.f5681b;
                if (function0 != null) {
                    function0.invoke();
                }
                ft.c.e0(ft.c.q() + 1);
                ft.c.f0(System.currentTimeMillis());
                break;
            default:
                this.f5681b.invoke();
                break;
        }
    }
}
