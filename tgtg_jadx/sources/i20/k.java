package i20;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f23009s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i12 = CircularProgressIndicator.f12527p;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        i0.c(context, attributeSet, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = j10.a.f24418k;
        i0.d(context, attributeSet, iArr, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.f23005o = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f23006p = Math.max(h0.g.r(context, typedArrayObtainStyledAttributes, 4, dimensionPixelSize), this.f22953a * 2);
        this.f23007q = h0.g.r(context, typedArrayObtainStyledAttributes, 3, dimensionPixelSize2);
        this.f23008r = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f23009s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    public k(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }
}
