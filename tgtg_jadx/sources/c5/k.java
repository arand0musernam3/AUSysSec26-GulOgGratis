package c5;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7267b;

    public /* synthetic */ k(y yVar, int i11) {
        this.f7266a = i11;
        this.f7267b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7266a) {
            case 0:
                kotlin.collections.t tVar = this.f7267b.f7440h;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!tVar.isEmpty()) {
                    try {
                        ((Function0) tVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            default:
                y yVar = this.f7267b;
                yVar.I1 = false;
                MotionEvent motionEvent = yVar.A1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    yVar.H(motionEvent);
                    return;
                } else {
                    com.braze.h2.b("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
