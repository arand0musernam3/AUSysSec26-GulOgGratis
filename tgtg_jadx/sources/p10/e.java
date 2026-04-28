package p10;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e20.i0;
import h20.s;
import j30.g;
import ky.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends s {
    public e(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g gVarN = i0.n(getContext(), attributeSet, j10.a.f24413f, i11, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) gVarN.f24503c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        gVarN.v();
        i0.f(this, new p(8));
    }

    @Override // h20.s
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i12) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i12;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i12), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i12) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        b bVar = (b) getMenuView();
        if (bVar.f34125l1 != z11) {
            bVar.setItemHorizontalTranslationEnabled(z11);
            getPresenter().b(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }

    public e(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public e(@NonNull Context context) {
        this(context, null);
    }
}
