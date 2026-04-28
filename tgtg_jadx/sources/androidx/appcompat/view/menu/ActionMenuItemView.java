package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import j.a;
import o.b;
import o.c;
import o.k;
import o.l;
import o.n;
import o.y;
import p.c3;
import p.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f1903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f1904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f1905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f1906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f1907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f1908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1913k;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f1909g = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24255c, i11, 0);
        this.f1911i = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1913k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1912j = -1;
        setSaveEnabled(false);
    }

    @Override // o.y
    public final void a(n nVar) {
        this.f1903a = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f31570a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f1907e == null) {
            this.f1907e = new b(this);
        }
    }

    @Override // p.i
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.i
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1903a.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (i11 < 480) {
            return (i11 >= 640 && i12 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1904b);
        if (this.f1905c != null && ((this.f1903a.f31593y & 4) != 4 || (!this.f1909g && !this.f1910h))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        setText(z13 ? this.f1904b : null);
        CharSequence charSequence = this.f1903a.f31585q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z13 ? null : this.f1903a.f31574e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1903a.f31586r;
        if (TextUtils.isEmpty(charSequence2)) {
            c3.a(this, z13 ? null : this.f1903a.f31574e);
        } else {
            c3.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.y
    public n getItemData() {
        return this.f1903a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f1906d;
        if (kVar != null) {
            kVar.c(this.f1903a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1909g = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i13 = this.f1912j) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f1911i;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i14) : i14;
        if (mode != 1073741824 && i14 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i12);
        }
        if (!zIsEmpty || this.f1905c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1905c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f1903a.hasSubMenu() && (bVar = this.f1907e) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z11) {
        if (this.f1910h != z11) {
            this.f1910h = z11;
            n nVar = this.f1903a;
            if (nVar != null) {
                l lVar = nVar.f31582n;
                lVar.f31554k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1905c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.f1913k;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(k kVar) {
        this.f1906d = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        this.f1912j = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(c cVar) {
        this.f1908f = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1904b = charSequence;
        e();
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    public void setShortcut(boolean z11, char c3) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
