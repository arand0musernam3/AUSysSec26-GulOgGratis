package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2348a;

    public Guideline(Context context) {
        super(context);
        this.f2348a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z11) {
        this.f2348a = z11;
    }

    public void setGuidelineBegin(int i11) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f2348a && aVar.f2306a == i11) {
            return;
        }
        aVar.f2306a = i11;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i11) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f2348a && aVar.f2308b == i11) {
            return;
        }
        aVar.f2308b = i11;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f11) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (this.f2348a && aVar.f2310c == f11) {
            return;
        }
        aVar.f2310c = f11;
        setLayoutParams(aVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2348a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2348a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.f2348a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
    }
}
