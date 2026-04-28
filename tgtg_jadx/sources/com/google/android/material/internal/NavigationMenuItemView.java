package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.g;
import e20.i;
import o.n;
import o.y;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p.c3;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends i implements y {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public n B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final g F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CheckedTextView f12507z;

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f12506y = true;
        g gVar = new g(this, 2);
        this.F = gVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.app.tgtg.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.app.tgtg.R.id.design_menu_item_text);
        this.f12507z = checkedTextView;
        ViewCompat.b0(checkedTextView, gVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(com.app.tgtg.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // o.y
    public final void a(n nVar) {
        StateListDrawable stateListDrawable;
        this.B = nVar;
        int i11 = nVar.f31570a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.app.tgtg.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f31574e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f31585q);
        c3.a(this, nVar.f31586r);
        n nVar2 = this.B;
        CharSequence charSequence = nVar2.f31574e;
        CheckedTextView checkedTextView = this.f12507z;
        if (charSequence == null && nVar2.getIcon() == null && this.B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    @Override // o.y
    public n getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        n nVar = this.B;
        if (nVar != null && nVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.f12505x != z11) {
            this.f12505x = z11;
            this.F.sendAccessibilityEvent(this.f12507z, NewHope.SENDB_BYTES);
        }
    }

    public void setChecked(boolean z11) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f12507z;
        checkedTextView.setChecked(z11);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z11 && this.f12506y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, getPaddingTop(), i11, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i11 = this.f12503v;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.f12504w) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = j.f43256a;
                Drawable drawable2 = resources.getDrawable(com.app.tgtg.R.drawable.navigation_empty_icon, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i12 = this.f12503v;
                    drawable2.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.E;
        }
        this.f12507z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.f12507z.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(int i11) {
        this.f12503v = i11;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        n nVar = this.B;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.f12507z.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.f12504w = z11;
    }

    public void setTextAppearance(int i11) {
        this.f12507z.setTextAppearance(i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12507z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12507z.setText(charSequence);
    }

    public void setShortcut(boolean z11, char c3) {
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }
}
