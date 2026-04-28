package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import j.a;
import j30.g;
import o.l;
import o.n;
import o.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f1916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f1917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f1918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f1919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f1920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f1921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f1922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f1923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f1924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f1925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1926k;
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f1928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f1930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1931q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        g gVarT = g.t(getContext(), attributeSet, a.f24270s, i11);
        this.f1925j = gVarT.k(5);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        this.f1926k = typedArray.getResourceId(1, -1);
        this.f1927m = typedArray.getBoolean(7, false);
        this.l = context;
        this.f1928n = gVarT.k(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.app.tgtg.R.attr.dropDownListViewStyle, 0);
        this.f1929o = typedArrayObtainStyledAttributes.hasValue(0);
        gVarT.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1930p == null) {
            this.f1930p = LayoutInflater.from(getContext());
        }
        return this.f1930p;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        ImageView imageView = this.f1922g;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    @Override // o.y
    public final void a(n nVar) {
        this.f1916a = nVar;
        boolean zIsVisible = nVar.isVisible();
        l lVar = nVar.f31582n;
        boolean z11 = false;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(nVar.f31574e);
        setCheckable(nVar.isCheckable());
        if (lVar.o()) {
            if ((lVar.n() ? nVar.f31579j : nVar.f31577h) != 0) {
                z11 = true;
            }
        }
        setShortcut(z11, lVar.n() ? nVar.f31579j : nVar.f31577h);
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f31585q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1923h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1923h.getLayoutParams();
        rect.top = this.f1923h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.y
    public n getItemData() {
        return this.f1916a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1925j);
        TextView textView = (TextView) findViewById(com.app.tgtg.R.id.title);
        this.f1919d = textView;
        int i11 = this.f1926k;
        if (i11 != -1) {
            textView.setTextAppearance(this.l, i11);
        }
        this.f1921f = (TextView) findViewById(com.app.tgtg.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.app.tgtg.R.id.submenuarrow);
        this.f1922g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1928n);
        }
        this.f1923h = (ImageView) findViewById(com.app.tgtg.R.id.group_divider);
        this.f1924i = (LinearLayout) findViewById(com.app.tgtg.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        if (this.f1917b != null && this.f1927m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1917b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        View view;
        if (!z11 && this.f1918c == null && this.f1920e == null) {
            return;
        }
        if ((this.f1916a.f31592x & 4) != 0) {
            if (this.f1918c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.app.tgtg.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1918c = radioButton;
                LinearLayout linearLayout = this.f1924i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1918c;
            view = this.f1920e;
        } else {
            if (this.f1920e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.app.tgtg.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1920e = checkBox;
                LinearLayout linearLayout2 = this.f1924i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1920e;
            view = this.f1918c;
        }
        if (z11) {
            compoundButton.setChecked(this.f1916a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1920e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1918c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if ((this.f1916a.f31592x & 4) != 0) {
            if (this.f1918c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.app.tgtg.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1918c = radioButton;
                LinearLayout linearLayout = this.f1924i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1918c;
        } else {
            if (this.f1920e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.app.tgtg.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1920e = checkBox;
                LinearLayout linearLayout2 = this.f1924i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1920e;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.f1931q = z11;
        this.f1927m = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        ImageView imageView = this.f1923h;
        if (imageView != null) {
            imageView.setVisibility((this.f1929o || !z11) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.f1916a.f31582n;
        boolean z11 = this.f1931q;
        if (z11 || this.f1927m) {
            ImageView imageView = this.f1917b;
            if (imageView == null && drawable == null && !this.f1927m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.app.tgtg.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1917b = imageView2;
                LinearLayout linearLayout = this.f1924i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1927m) {
                this.f1917b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1917b;
            if (!z11) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1917b.getVisibility() != 0) {
                this.f1917b.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setShortcut(boolean r9, char r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean, char):void");
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f1919d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f1919d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f1919d.getVisibility() != 0) {
                this.f1919d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.listMenuViewStyle);
    }
}
