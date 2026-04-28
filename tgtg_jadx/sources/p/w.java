package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class w extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f34066a;

    public w(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u2.a(getContext(), this);
        u uVar = new u(this);
        this.f34066a = uVar;
        uVar.a(attributeSet, i11);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap bitmap = this.f34066a.f34026b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }

    public w(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public w(@NonNull Context context) {
        this(context, null);
    }
}
