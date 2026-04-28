package d20;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import n20.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f14005a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f14006b;

    public a(ShapeableImageView shapeableImageView) {
        this.f14006b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f14006b;
        if (shapeableImageView.f12486i == null) {
            return;
        }
        if (shapeableImageView.f12485h == null) {
            shapeableImageView.f12485h = new j(shapeableImageView.f12486i);
        }
        RectF rectF = shapeableImageView.f12479b;
        Rect rect = this.f14005a;
        rectF.round(rect);
        shapeableImageView.f12485h.setBounds(rect);
        shapeableImageView.f12485h.getOutline(outline);
    }
}
