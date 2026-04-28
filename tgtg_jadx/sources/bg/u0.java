package bg;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends androidx.recyclerview.widget.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f6236a = 1;
    }

    @Override // androidx.recyclerview.widget.y0
    public int calculateDxToMakeVisible(View view, int i11) {
        switch (this.f6236a) {
            case 1:
                return 0;
            default:
                return super.calculateDxToMakeVisible(view, i11);
        }
    }

    @Override // androidx.recyclerview.widget.y0
    public int calculateDyToMakeVisible(View view, int i11) {
        switch (this.f6236a) {
            case 1:
                return 0;
            default:
                return super.calculateDyToMakeVisible(view, i11);
        }
    }

    @Override // androidx.recyclerview.widget.y0
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float f11;
        float f12;
        switch (this.f6236a) {
            case 0:
                displayMetrics.getClass();
                f11 = displayMetrics.densityDpi;
                f12 = 50.0f;
                break;
            case 1:
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
            case 2:
                f11 = displayMetrics.densityDpi;
                f12 = 100.0f;
                break;
        }
        return f12 / f11;
    }

    @Override // androidx.recyclerview.widget.m2
    public PointF computeScrollVectorForPosition(int i11) {
        switch (this.f6236a) {
            case 1:
                return null;
            default:
                return super.computeScrollVectorForPosition(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Context context, int i11) {
        super(context);
        this.f6236a = i11;
    }
}
