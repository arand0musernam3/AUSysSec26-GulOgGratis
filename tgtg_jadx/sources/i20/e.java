package i20;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.app.tgtg.R;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f22957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22963k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f22965n;

    public e(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f22957e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        i0.c(context, attributeSet, i11, i12);
        int[] iArr = j10.a.f24409d;
        i0.d(context, attributeSet, iArr, i11, i12, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        this.f22953a = h0.g.r(context, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.f22954b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f22953a / 2);
                this.f22956d = false;
            } else if (i13 == 6) {
                this.f22955c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f22956d = true;
            }
        }
        this.f22959g = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f22960h = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f22961i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.f22962j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        this.f22963k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        this.l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.f22964m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f22965n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f22957e = new int[]{w0.e.z(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            this.f22957e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            this.f22957e = intArray;
            if (intArray.length == 0) {
                i4.a.f("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f22958f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            this.f22958f = this.f22957e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f11 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f22958f = w0.e.m(this.f22958f, (int) (f11 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.f22956d ? (int) (this.f22953a * this.f22955c) : this.f22954b;
    }

    public final boolean b(boolean z11) {
        if (this.l <= 0) {
            return false;
        }
        if (z11 || this.f22963k <= 0) {
            return z11 && this.f22962j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.f22956d && this.f22955c == 0.5f;
    }

    public void d() {
        if (this.f22961i >= 0) {
            return;
        }
        i4.a.f("indicatorTrackGapSize must be >= 0.");
    }
}
