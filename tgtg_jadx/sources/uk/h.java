package uk;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import pg.r1;
import pg.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f41332b;

    public /* synthetic */ h(int i11, View view) {
        this.f41331a = i11;
        this.f41332b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i11 = this.f41331a;
        View view = this.f41332b;
        switch (i11) {
            case 0:
                q qVar = (q) view;
                boolean z11 = qVar.f41362p;
                s1 s1Var = qVar.f41370x;
                if (z11) {
                    qVar.f41362p = false;
                    r1 r1Var = (r1) s1Var.f35151e;
                    Button button = r1Var.f35119d;
                    int visibility = button.getVisibility();
                    BottomSheetBehavior bottomSheetBehavior = qVar.f41366t;
                    if (visibility != 8) {
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.I(d70.b.a(12) + button.getBottom());
                        }
                    } else if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.I(d70.b.a(12) + r1Var.f35128n.getBottom());
                    }
                }
                break;
            case 1:
                q qVar2 = (q) view;
                if (((ImageView) qVar2.f41370x.f35153g).getY() > qVar2.f41357j && ((ImageView) r0.f35153g).getY() != 0.0d && qVar2.f41357j != 0.0d) {
                    qVar2.m();
                    break;
                }
                break;
            case 2:
                q qVar3 = (q) view;
                int i12 = q.f41347y;
                Rect rect = new Rect();
                qVar3.getRootView().getWindowVisibleDisplayFrame(rect);
                int height = qVar3.getRootView().getRootView().getHeight();
                double d3 = height - rect.bottom;
                double d11 = ((double) height) * 0.15d;
                boolean z12 = qVar3.f41361o;
                if (d3 <= d11) {
                    if (z12) {
                        qVar3.k();
                        qVar3.f41361o = false;
                    }
                } else if (!z12) {
                    qVar3.l();
                    qVar3.f41361o = true;
                }
                break;
            default:
                ((p20.e) view).D();
                break;
        }
    }
}
