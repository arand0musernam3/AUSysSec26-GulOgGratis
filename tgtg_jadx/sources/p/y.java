package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class y extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f34081a;

    public y(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u2.a(getContext(), this);
        z zVar = new z(this);
        this.f34081a = zVar;
        zVar.a(attributeSet, i11);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f34081a;
        y yVar = zVar.f34085d;
        Drawable drawable = zVar.f34086e;
        if (drawable != null && drawable.isStateful() && drawable.setState(yVar.getDrawableState())) {
            yVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f34081a.f34086e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34081a.d(canvas);
    }

    public y(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public y(@NonNull Context context) {
        this(context, null);
    }
}
