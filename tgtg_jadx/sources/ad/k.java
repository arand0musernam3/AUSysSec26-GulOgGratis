package ad;

import android.view.ViewTreeObserver;
import u70.o;
import u70.q;
import v80.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f1236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1237e;

    public /* synthetic */ k(Object obj, ViewTreeObserver viewTreeObserver, l lVar, int i11) {
        this.f1233a = i11;
        this.f1237e = obj;
        this.f1235c = viewTreeObserver;
        this.f1236d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i11 = this.f1233a;
        l lVar = this.f1236d;
        ViewTreeObserver viewTreeObserver = this.f1235c;
        Object obj = this.f1237e;
        switch (i11) {
            case 0:
                f fVar = (f) obj;
                h hVarC = fVar.c();
                if (hVarC != null) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        fVar.f1225a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.f1234b) {
                        this.f1234b = true;
                        o oVar = q.f40850b;
                        lVar.resumeWith(hVarC);
                    }
                }
                break;
            default:
                ud.f fVar2 = (ud.f) obj;
                ud.h hVarC2 = fVar2.c();
                if (hVarC2 != null) {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        fVar2.f41058a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.f1234b) {
                        this.f1234b = true;
                        o oVar2 = q.f40850b;
                        lVar.resumeWith(hVarC2);
                    }
                }
                break;
        }
        return true;
    }
}
