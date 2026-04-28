package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import jb.u;
import o1.a;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f2227f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f2232e;

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i11);
        Rect rect = new Rect();
        this.f2230c = rect;
        this.f2231d = new Rect();
        m mVar = new m(this, 2);
        this.f2232e = mVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f31786a, i11, com.app.tgtg.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f2227f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.app.tgtg.R.color.cardview_light_background) : getResources().getColor(com.app.tgtg.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f2228a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f2229b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        p1.a aVar = new p1.a(colorStateListValueOf, dimension);
        mVar.f33836b = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        u.O(mVar, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((p1.a) this.f2232e.f33836b).f34115h;
    }

    public float getCardElevation() {
        return ((CardView) this.f2232e.f33837c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2230c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2230c.left;
    }

    public int getContentPaddingRight() {
        return this.f2230c.right;
    }

    public int getContentPaddingTop() {
        return this.f2230c.top;
    }

    public float getMaxCardElevation() {
        return ((p1.a) this.f2232e.f33836b).f34112e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2229b;
    }

    public float getRadius() {
        return ((p1.a) this.f2232e.f33836b).f34108a;
    }

    public boolean getUseCompatPadding() {
        return this.f2228a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
        p1.a aVar = (p1.a) this.f2232e.f33836b;
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f34115h = colorStateListValueOf;
        aVar.f34109b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f34115h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f11) {
        ((CardView) this.f2232e.f33837c).setElevation(f11);
    }

    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f2230c.set(i11, i12, i13, i14);
        u.U(this.f2232e);
    }

    public void setMaxCardElevation(float f11) {
        u.O(this.f2232e, f11);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i11) {
        super.setMinimumHeight(i11);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i11) {
        super.setMinimumWidth(i11);
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.f2229b) {
            this.f2229b = z11;
            m mVar = this.f2232e;
            u.O(mVar, ((p1.a) mVar.f33836b).f34112e);
        }
    }

    public void setRadius(float f11) {
        p1.a aVar = (p1.a) this.f2232e.f33836b;
        if (f11 == aVar.f34108a) {
            return;
        }
        aVar.f34108a = f11;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f2228a != z11) {
            this.f2228a = z11;
            m mVar = this.f2232e;
            u.O(mVar, ((p1.a) mVar.f33836b).f34112e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        p1.a aVar = (p1.a) this.f2232e.f33836b;
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f34115h = colorStateList;
        aVar.f34109b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f34115h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.cardViewStyle);
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }
}
