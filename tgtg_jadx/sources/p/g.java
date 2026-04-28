package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AppCompatImageView implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a f33898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.widget.a aVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f33898a = aVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        c3.a(this, getContentDescription());
        setOnTouchListener(new o.b(this, this));
    }

    @Override // p.i
    public final boolean b() {
        return false;
    }

    @Override // p.i
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f33898a.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i11, int i12, int i13, int i14) {
        boolean frame = super.setFrame(i11, i12, i13, i14);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
