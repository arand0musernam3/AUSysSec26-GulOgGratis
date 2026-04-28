package i20;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import e20.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f23087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f23089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23091w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i12 = LinearProgressIndicator.f12528p;
        i0.c(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = j10.a.f24427u;
        i0.d(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        this.f23083o = typedArrayObtainStyledAttributes.getInt(0, 1);
        this.f23084p = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f23086r = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), this.f22953a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f23087s = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(2);
        if (typedValuePeekValue != null) {
            int i13 = typedValuePeekValue.type;
            if (i13 == 5) {
                this.f23088t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f22953a / 2);
                this.f23090v = false;
                this.f23091w = true;
            } else if (i13 == 6) {
                this.f23089u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f23090v = true;
                this.f23091w = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
        this.f23085q = this.f23084p == 1;
    }

    @Override // i20.e
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // i20.e
    public final void d() {
        super.d();
        if (this.f23086r < 0) {
            i4.a.f("Stop indicator size must be >= 0.");
            return;
        }
        if (this.f23083o == 0) {
            if ((a() > 0 || (this.f23091w && e() > 0)) && this.f22961i == 0) {
                i4.a.f("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.f22957e.length >= 3) {
                    return;
                }
                i4.a.f("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        return !this.f23091w ? a() : this.f23090v ? (int) (this.f22953a * this.f23089u) : this.f23088t;
    }

    public w(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }
}
