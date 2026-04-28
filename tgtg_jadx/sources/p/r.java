package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f33988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ax.f0 f33989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33990c = 0;

    public r(ImageView imageView) {
        this.f33988a = imageView;
    }

    public final void a() {
        ax.f0 f0Var;
        ImageView imageView = this.f33988a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            e1.a(drawable);
        }
        if (drawable == null || (f0Var = this.f33989b) == null) {
            return;
        }
        m.e(drawable, f0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i11) {
        int resourceId;
        ImageView imageView = this.f33988a;
        Context context = imageView.getContext();
        int[] iArr = j.a.f24258f;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        ViewCompat.a0(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b0.a0.x(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(gVarT.j(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(e1.c(typedArray.getInt(3, -1), null));
            }
            gVarT.v();
        } catch (Throwable th2) {
            gVarT.v();
            throw th2;
        }
    }

    public final void c(int i11) {
        ImageView imageView = this.f33988a;
        if (i11 != 0) {
            Drawable drawableX = b0.a0.x(imageView.getContext(), i11);
            if (drawableX != null) {
                e1.a(drawableX);
            }
            imageView.setImageDrawable(drawableX);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
