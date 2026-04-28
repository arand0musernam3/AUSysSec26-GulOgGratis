package s10;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.vectordrawable.graphics.drawable.h;
import b0.a0;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.app.tgtg.R;
import e0.f;
import e20.i0;
import ex.i;
import i20.c;
import j30.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w0.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends AppCompatCheckBox {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f38739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f38740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f38741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f38745k;
    public Drawable l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f38746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f38748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f38749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f38750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f38752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f38753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f38754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f38755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f38756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f38757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f38737y = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f38738z = {R.attr.state_error};
    public static final int[][] A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", AnalyticsPlatformParams.channel);

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, i11);
        this.f38739e = new LinkedHashSet();
        this.f38740f = new LinkedHashSet();
        this.f38756w = h.a(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f38757x = new c(2, this);
        Context context2 = getContext();
        this.l = getButtonDrawable();
        this.f38748o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        g gVarN = i0.n(context2, attributeSet, j10.a.C, i11, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) gVarN.f24503c;
        this.f38746m = gVarN.k(2);
        if (this.l != null && i.G(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.l = a0.x(context2, R.drawable.mtrl_checkbox_button);
                this.f38747n = true;
                if (this.f38746m == null) {
                    this.f38746m = a0.x(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f38749p = h0.g.q(context2, gVarN, 3);
        this.f38750q = i0.o(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f38742h = typedArray.getBoolean(10, false);
        this.f38743i = typedArray.getBoolean(6, true);
        this.f38744j = typedArray.getBoolean(9, false);
        this.f38745k = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        gVarN.v();
        a();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i11 = this.f38751r;
        return i11 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i11 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f38741g == null) {
            int iY = e.y(R.attr.colorControlActivated, this);
            int iY2 = e.y(R.attr.colorError, this);
            int iY3 = e.y(R.attr.colorSurface, this);
            int iY4 = e.y(R.attr.colorOnSurface, this);
            this.f38741g = new ColorStateList(A, new int[]{e.E(iY3, 1.0f, iY2), e.E(iY3, 1.0f, iY), e.E(iY3, 0.54f, iY4), e.E(iY3, 0.38f, iY4), e.E(iY3, 0.38f, iY4)});
        }
        return this.f38741g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f38748o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        androidx.vectordrawable.graphics.drawable.e eVar;
        Drawable drawableMutate = this.l;
        ColorStateList colorStateList3 = this.f38748o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.l = drawableMutate;
        Drawable drawableMutate2 = this.f38746m;
        ColorStateList colorStateList4 = this.f38749p;
        PorterDuff.Mode mode = this.f38750q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f38746m = drawableMutate2;
        if (this.f38747n) {
            h hVar = this.f38756w;
            if (hVar != null) {
                Drawable drawable = hVar.f4052a;
                c cVar = this.f38757x;
                if (drawable != null) {
                    ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(cVar.getPlatformCallback());
                }
                ArrayList arrayList = hVar.f4050e;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (hVar.f4050e.size() == 0 && (eVar = hVar.f4049d) != null) {
                        hVar.f4047b.f4042b.removeListener(eVar);
                        hVar.f4049d = null;
                    }
                }
                hVar.b(cVar);
            }
            Drawable drawable2 = this.l;
            if ((drawable2 instanceof AnimatedStateListDrawable) && hVar != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R.id.checked, R.id.unchecked, hVar, false);
                ((AnimatedStateListDrawable) this.l).addTransition(R.id.indeterminate, R.id.unchecked, hVar, false);
            }
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null && (colorStateList2 = this.f38748o) != null) {
            drawable3.setTintList(colorStateList2);
        }
        Drawable drawable4 = this.f38746m;
        if (drawable4 != null && (colorStateList = this.f38749p) != null) {
            drawable4.setTintList(colorStateList);
        }
        Drawable drawable5 = this.l;
        Drawable drawable6 = this.f38746m;
        if (drawable5 == null) {
            drawable5 = drawable6;
        } else if (drawable6 != null) {
            int intrinsicWidth = drawable6.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable5.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable6.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable5.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable5.getIntrinsicWidth() || intrinsicHeight > drawable5.getIntrinsicHeight()) {
                float f11 = intrinsicWidth / intrinsicHeight;
                if (f11 >= drawable5.getIntrinsicWidth() / drawable5.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable5.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f11);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable5.getIntrinsicHeight();
                    intrinsicWidth = (int) (f11 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable6});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable5 = layerDrawable;
        }
        super.setButtonDrawable(drawable5);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f38746m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f38749p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f38750q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f38748o;
    }

    public int getCheckedState() {
        return this.f38751r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f38745k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f38751r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38742h && this.f38748o == null && this.f38749p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f38737y);
        }
        if (this.f38744j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f38738z);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i13 = iArrOnCreateDrawableState[i12];
            if (i13 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i13 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i12] = 16842912;
                break;
            }
            i12++;
        }
        this.f38752s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f38743i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f38744j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f38745k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f38736a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f38736a = getCheckedState();
        return aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(a0.x(getContext(), i11));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f38746m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i11) {
        setButtonIconDrawable(a0.x(getContext(), i11));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f38749p == colorStateList) {
            return;
        }
        this.f38749p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f38750q == mode) {
            return;
        }
        this.f38750q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f38748o == colorStateList) {
            return;
        }
        this.f38748o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z11) {
        this.f38743i = z11;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedState(z11 ? 1 : 0);
    }

    public void setCheckedState(int i11) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f38751r != i11) {
            this.f38751r = i11;
            super.setChecked(i11 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f38754u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f38753t) {
                return;
            }
            this.f38753t = true;
            LinkedHashSet linkedHashSet = this.f38740f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw f.e(it);
                }
            }
            if (this.f38751r != 2 && (onCheckedChangeListener = this.f38755v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f38753t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f38745k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i11) {
        setErrorAccessibilityLabel(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setErrorShown(boolean z11) {
        if (this.f38744j == z11) {
            return;
        }
        this.f38744j = z11;
        refreshDrawableState();
        Iterator it = this.f38739e.iterator();
        if (it.hasNext()) {
            throw f.e(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f38755v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f38754u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f38742h = z11;
        if (z11) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.f38747n = false;
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public b(Context context) {
        this(context, null);
    }
}
