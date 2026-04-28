package f3;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import i4.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f17270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f17271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17272d;

    public h(boolean z11) {
        super(ColorStateList.valueOf(RoundCornerImageView.DEFAULT_STROKE_COLOR), null, z11 ? new ColorDrawable(-1) : null);
        this.f17269a = z11;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f17269a) {
            this.f17272d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f17272d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f17272d;
    }
}
