package n20;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30299b;

    public /* synthetic */ b0(Object obj, int i11) {
        this.f30298a = i11;
        this.f30299b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f30298a) {
            case 0:
                c0 c0Var = (c0) this.f30299b;
                if (c0Var.f30293c != null && !c0Var.f30294d.isEmpty()) {
                    RectF rectF = c0Var.f30294d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0Var.f30302g);
                    break;
                }
                break;
            default:
                t10.b bVar = ((Chip) this.f30299b).f12416e;
                if (bVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    bVar.getOutline(outline);
                }
                break;
        }
    }
}
