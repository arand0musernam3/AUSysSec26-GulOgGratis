package b0;

import android.os.Process;
import android.view.View;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.google.android.material.sidesheet.SideSheetBehavior;
import zendesk.ui.android.common.button.ButtonView;
import zendesk.ui.android.conversation.actionbutton.ActionButtonView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5208c;

    public /* synthetic */ h(int i11, Runnable runnable) {
        this.f5206a = 3;
        this.f5207b = i11;
        this.f5208c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5206a) {
            case 0:
                ((s0.p) this.f5208c).a(this.f5207b);
                break;
            case 1:
                TGTGLoadingView.f((TGTGLoadingView) this.f5208c, this.f5207b);
                break;
            case 2:
                ((ContentCardAdapter) this.f5208c).notifyItemChanged(this.f5207b);
                break;
            case 3:
                Runnable runnable = (Runnable) this.f5208c;
                Process.setThreadPriority(this.f5207b);
                runnable.run();
                break;
            case 4:
                NpsRatingView npsRatingView = ((mg.g) this.f5208c).f29954d;
                if (npsRatingView != null) {
                    npsRatingView.c(this.f5207b);
                }
                break;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5208c;
                View view = (View) sideSheetBehavior.f12594p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f5207b, false);
                }
                break;
            case 6:
                r0.n nVar = (r0.n) ((zw.q2) ((g1.g) this.f5208c).f18096b).f48333a;
                if (nVar != null) {
                    nVar.a(this.f5207b);
                }
                break;
            case 7:
                ((w6.a) this.f5208c).i(this.f5207b);
                break;
            case 8:
                ButtonView.render$lambda$4$lambda$3((ButtonView) this.f5208c, this.f5207b);
                break;
            default:
                ActionButtonView.render$lambda$5$lambda$4((ActionButtonView) this.f5208c, this.f5207b);
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i11, int i12) {
        this.f5206a = i12;
        this.f5208c = obj;
        this.f5207b = i11;
    }
}
