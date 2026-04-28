package h20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.app.tgtg.R;
import e20.i0;
import o.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f21352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p10.b f21353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.view.i f21355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f21356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f21357f;

    public s(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Design_BottomNavigationView), attributeSet, i11);
        n nVar = new n();
        nVar.f21344b = false;
        this.f21354c = nVar;
        Context context2 = getContext();
        j30.g gVarN = i0.n(context2, attributeSet, j10.a.L, i11, R.style.Widget_Design_BottomNavigationView, 17, 15);
        i iVar = new i(context2, getClass(), getMaxItemCount());
        this.f21352a = iVar;
        p10.b bVar = new p10.b(context2);
        this.f21353b = bVar;
        bVar.setMinimumHeight(getSuggestedMinimumHeight());
        bVar.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        nVar.f21343a = bVar;
        nVar.f21345c = 1;
        bVar.setPresenter(nVar);
        iVar.b(nVar, iVar.f31544a);
        nVar.c(getContext(), iVar);
        TypedArray typedArray = (TypedArray) gVarN.f24503c;
        if (typedArray.hasValue(11)) {
            bVar.setIconTintList(gVarN.j(11));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(gVarN.j(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM = b6.a.m(background);
        if (background == null || colorStateListM != null) {
            n20.j jVar = new n20.j(n20.o.c(context2, attributeSet, i11, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListM != null) {
                jVar.t(colorStateListM);
            }
            jVar.p(context2);
            setBackground(jVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(h0.g.q(context2, gVarN, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(h0.g.q(context2, gVarN, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, j10.a.K);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            i12 = 0;
            setItemActiveIndicatorExpandedPadding(getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(h0.g.p(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(n20.o.a(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            i12 = 0;
        }
        if (typedArray.hasValue(23)) {
            a(typedArray.getResourceId(23, i12));
        }
        gVarN.v();
        addView(bVar);
        iVar.f31548e = new se.b((p10.e) this, 22);
    }

    private MenuInflater getMenuInflater() {
        if (this.f21355d == null) {
            this.f21355d = new androidx.appcompat.view.i(getContext());
        }
        return this.f21355d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.f21353b.setMeasurePaddingFromLabelBaseline(z11);
    }

    public final void a(int i11) {
        n nVar = this.f21354c;
        nVar.f21344b = true;
        getMenuInflater().inflate(i11, this.f21352a);
        nVar.f21344b = false;
        nVar.b(true);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f21353b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f21353b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f21353b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f21353b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f21353b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f21353b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f21353b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f21353b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f21353b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f21353b.getItemActiveIndicatorMarginHorizontal();
    }

    public n20.o getItemActiveIndicatorShapeAppearance() {
        return this.f21353b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f21353b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f21353b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f21353b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f21353b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f21353b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f21353b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f21353b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f21353b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f21353b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f21353b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f21353b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f21353b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f21353b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f21353b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f21352a;
    }

    @NonNull
    public z getMenuView() {
        return this.f21353b;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.f21353b;
    }

    @NonNull
    public n getPresenter() {
        return this.f21354c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f21353b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f21353b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lx.u.Q(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r rVar = (r) parcelable;
        super.onRestoreInstanceState(rVar.f45418a);
        this.f21352a.t(rVar.f21351c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r rVar = new r(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        rVar.f21351c = bundle;
        this.f21352a.v(bundle);
        return rVar;
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f21353b.setActiveIndicatorLabelPadding(i11);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        lx.u.N(this, f11);
    }

    public void setHorizontalItemTextAppearanceActive(int i11) {
        this.f21353b.setHorizontalItemTextAppearanceActive(i11);
    }

    public void setHorizontalItemTextAppearanceInactive(int i11) {
        this.f21353b.setHorizontalItemTextAppearanceInactive(i11);
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        this.f21353b.setIconLabelHorizontalSpacing(i11);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f21353b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f21353b.setItemActiveIndicatorEnabled(z11);
    }

    public void setItemActiveIndicatorExpandedHeight(int i11) {
        this.f21353b.setItemActiveIndicatorExpandedHeight(i11);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.f21353b.setItemActiveIndicatorExpandedMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorExpandedPadding(int i11, int i12, int i13, int i14) {
        this.f21353b.setItemActiveIndicatorExpandedPadding(i11, i12, i13, i14);
    }

    public void setItemActiveIndicatorExpandedWidth(int i11) {
        this.f21353b.setItemActiveIndicatorExpandedWidth(i11);
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.f21353b.setItemActiveIndicatorHeight(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.f21353b.setItemActiveIndicatorMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(n20.o oVar) {
        this.f21353b.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.f21353b.setItemActiveIndicatorWidth(i11);
    }

    public void setItemBackground(Drawable drawable) {
        this.f21353b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i11) {
        this.f21353b.setItemBackgroundRes(i11);
    }

    public void setItemGravity(int i11) {
        p10.b bVar = this.f21353b;
        if (bVar.getItemGravity() != i11) {
            bVar.setItemGravity(i11);
            this.f21354c.b(false);
        }
    }

    public void setItemIconGravity(int i11) {
        p10.b bVar = this.f21353b;
        if (bVar.getItemIconGravity() != i11) {
            bVar.setItemIconGravity(i11);
            this.f21354c.b(false);
        }
    }

    public void setItemIconSize(int i11) {
        this.f21353b.setItemIconSize(i11);
    }

    public void setItemIconSizeRes(int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f21353b.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        this.f21353b.setItemOnTouchListener(i11, onTouchListener);
    }

    public void setItemPaddingBottom(int i11) {
        this.f21353b.setItemPaddingBottom(i11);
    }

    public void setItemPaddingTop(int i11) {
        this.f21353b.setItemPaddingTop(i11);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f21353b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f21353b.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f21353b.setItemTextAppearanceActiveBoldEnabled(z11);
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f21353b.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f21353b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.f21353b.setLabelFontScalingEnabled(z11);
    }

    public void setLabelMaxLines(int i11) {
        this.f21353b.setLabelMaxLines(i11);
    }

    public void setLabelVisibilityMode(int i11) {
        p10.b bVar = this.f21353b;
        if (bVar.getLabelVisibilityMode() != i11) {
            bVar.setLabelVisibilityMode(i11);
            this.f21354c.b(false);
        }
    }

    public void setOnItemReselectedListener(p pVar) {
        this.f21357f = pVar;
    }

    public void setOnItemSelectedListener(q qVar) {
        this.f21356e = qVar;
    }

    public void setSelectedItemId(int i11) {
        i iVar = this.f21352a;
        MenuItem menuItemFindItem = iVar.findItem(i11);
        if (menuItemFindItem != null) {
            boolean zQ = iVar.q(menuItemFindItem, this.f21354c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f21353b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
