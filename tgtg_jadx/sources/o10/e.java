package o10;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import ib.w;
import java.util.Set;
import jb.d0;
import jb.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f31799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f31800e;

    public e(jb.f fVar, k kVar, boolean z11, int i11) {
        fVar.getClass();
        kVar.getClass();
        this.f31799d = fVar;
        this.f31800e = kVar;
        this.f31797b = z11;
        this.f31798c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        d0 d0VarB;
        switch (this.f31796a) {
            case 0:
                ((ActionMenuView) this.f31799d).setTranslationX(((BottomAppBar) this.f31800e).D(r0, this.f31798c, this.f31797b));
                return;
            default:
                boolean z11 = this.f31797b;
                jb.f fVar = (jb.f) this.f31799d;
                k kVar = (k) this.f31800e;
                if (z11) {
                    int i11 = this.f31798c;
                    fVar.getClass();
                    String str = kVar.f24901a.f36799a;
                    synchronized (fVar.f24893k) {
                        d0VarB = fVar.b(str);
                        break;
                    }
                    zD = jb.f.d(str, d0VarB, i11);
                } else {
                    int i12 = this.f31798c;
                    fVar.getClass();
                    String str2 = kVar.f24901a.f36799a;
                    synchronized (fVar.f24893k) {
                        try {
                            if (fVar.f24888f.get(str2) != null) {
                                w.d().a(jb.f.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) fVar.f24890h.get(str2);
                                if (set != null && set.contains(kVar)) {
                                    zD = jb.f.d(str2, fVar.b(str2), i12);
                                }
                            }
                            zD = false;
                        } finally {
                        }
                    }
                }
                w.d().a(w.f("StopWorkRunnable"), "StopWorkRunnable for " + ((k) this.f31800e).f24901a.f36799a + "; Processor.stopWork = " + zD);
                return;
        }
    }

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i11, boolean z11) {
        this.f31800e = bottomAppBar;
        this.f31799d = actionMenuView;
        this.f31798c = i11;
        this.f31797b = z11;
    }
}
