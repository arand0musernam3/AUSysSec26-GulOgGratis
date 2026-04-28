package s20;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b0.a0;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import com.google.android.material.tabs.TabLayout;
import e20.i0;
import h7.z;
import p.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f38800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f38801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f38802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f38803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m10.a f38804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f38805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f38806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f38807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f38808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f38810k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        this.f38810k = tabLayout;
        this.f38809j = 2;
        e(context);
        setPaddingRelative(tabLayout.f12613e, tabLayout.f12614f, tabLayout.f12615g, tabLayout.f12616h);
        setGravity(17);
        setOrientation(!tabLayout.E ? 1 : 0);
        setClickable(true);
        ViewCompat.l0(this, z.b(getContext(), AppConstants.RESULT_CODE_AUTO_REFUND));
    }

    private m10.a getBadge() {
        return this.f38804e;
    }

    @NonNull
    private m10.a getOrCreateBadge() {
        if (this.f38804e == null) {
            this.f38804e = new m10.a(getContext(), null);
        }
        b();
        m10.a aVar = this.f38804e;
        if (aVar != null) {
            return aVar;
        }
        h2.b("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.f38804e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f38803d;
            if (view != null) {
                m10.a aVar = this.f38804e;
                if (aVar != null) {
                    if (aVar.e() != null) {
                        aVar.e().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f38803d = null;
            }
        }
    }

    public final void b() {
        g gVar;
        if (this.f38804e != null) {
            if (this.f38805f != null) {
                a();
                return;
            }
            ImageView imageView = this.f38802c;
            if (imageView != null && (gVar = this.f38800a) != null && gVar.f38788a != null) {
                if (this.f38803d == imageView) {
                    c(imageView);
                    return;
                }
                a();
                ImageView imageView2 = this.f38802c;
                if (this.f38804e == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                m10.a aVar = this.f38804e;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.j(imageView2, null);
                if (aVar.e() != null) {
                    aVar.e().setForeground(aVar);
                } else {
                    imageView2.getOverlay().add(aVar);
                }
                this.f38803d = imageView2;
                return;
            }
            TextView textView = this.f38801b;
            if (textView == null || this.f38800a == null) {
                a();
                return;
            }
            if (this.f38803d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f38801b;
            if (this.f38804e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            m10.a aVar2 = this.f38804e;
            Rect rect2 = new Rect();
            textView2.getDrawingRect(rect2);
            aVar2.setBounds(rect2);
            aVar2.j(textView2, null);
            if (aVar2.e() != null) {
                aVar2.e().setForeground(aVar2);
            } else {
                textView2.getOverlay().add(aVar2);
            }
            this.f38803d = textView2;
        }
    }

    public final void c(View view) {
        m10.a aVar = this.f38804e;
        if (aVar == null || view != this.f38803d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.j(view, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            r3.f()
            s20.g r0 = r3.f38800a
            if (r0 == 0) goto L1e
            com.google.android.material.tabs.TabLayout r1 = r0.f38793f
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L1e
            int r0 = r0.f38791d
            if (r1 != r0) goto L1e
            r0 = 1
            goto L1f
        L18:
            java.lang.String r0 = "Tab not attached to a TabLayout"
            i4.a.f(r0)
            return
        L1e:
            r0 = 0
        L1f:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s20.j.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f38808i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f38808i.setState(drawableState)) {
            invalidate();
            this.f38810k.invalidate();
        }
    }

    public final void e(Context context) {
        TabLayout tabLayout = this.f38810k;
        int i11 = tabLayout.f12629u;
        if (i11 != 0) {
            Drawable drawableX = a0.x(context, i11);
            this.f38808i = drawableX;
            if (drawableX != null && drawableX.isStateful()) {
                this.f38808i.setState(getDrawableState());
            }
        } else {
            this.f38808i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable rippleDrawable = gradientDrawable;
        if (tabLayout.f12622n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateListA = k20.a.a(tabLayout.f12622n);
            boolean z11 = tabLayout.I;
            GradientDrawable gradientDrawable3 = gradientDrawable;
            if (z11) {
                gradientDrawable3 = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z11 ? null : gradientDrawable2);
        }
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i11;
        ViewParent parent;
        g gVar = this.f38800a;
        View view = gVar != null ? gVar.f38792e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f38805f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f38805f);
                }
                addView(view);
            }
            this.f38805f = view;
            TextView textView = this.f38801b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f38802c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f38802c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f38806g = textView2;
            if (textView2 != null) {
                this.f38809j = textView2.getMaxLines();
            }
            this.f38807h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f38805f;
            if (view3 != null) {
                removeView(view3);
                this.f38805f = null;
            }
            this.f38806g = null;
            this.f38807h = null;
        }
        if (this.f38805f == null) {
            if (this.f38802c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.app.tgtg.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f38802c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f38801b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.app.tgtg.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f38801b = textView3;
                addView(textView3);
                this.f38809j = this.f38801b.getMaxLines();
            }
            TextView textView4 = this.f38801b;
            TabLayout tabLayout = this.f38810k;
            textView4.setTextAppearance(tabLayout.f12618i);
            if (!isSelected() || (i11 = tabLayout.f12620k) == -1) {
                this.f38801b.setTextAppearance(tabLayout.f12619j);
            } else {
                this.f38801b.setTextAppearance(i11);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.f38801b.setTextColor(colorStateList);
            }
            g(this.f38801b, this.f38802c, true);
            b();
            ImageView imageView3 = this.f38802c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new i(this, imageView3));
            }
            TextView textView5 = this.f38801b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new i(this, textView5));
            }
        } else {
            TextView textView6 = this.f38806g;
            if (textView6 != null || this.f38807h != null) {
                g(textView6, this.f38807h, false);
            }
        }
        if (gVar == null || TextUtils.isEmpty(gVar.f38790c)) {
            return;
        }
        setContentDescription(gVar.f38790c);
    }

    public final void g(TextView textView, ImageView imageView, boolean z11) {
        boolean z12;
        Drawable drawable;
        g gVar = this.f38800a;
        Drawable drawableMutate = (gVar == null || (drawable = gVar.f38788a) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.f38810k;
        if (drawableMutate != null) {
            drawableMutate.setTintList(tabLayout.f12621m);
            PorterDuff.Mode mode = tabLayout.f12625q;
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
        }
        g gVar2 = this.f38800a;
        CharSequence charSequence = gVar2 != null ? gVar2.f38789b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z12 = false;
            } else {
                this.f38800a.getClass();
                z12 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z12 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z12 = false;
        }
        if (z11 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iG = (z12 && imageView.getVisibility() == 0) ? (int) i0.g(getContext(), 8) : 0;
            if (tabLayout.E) {
                if (iG != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iG);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iG != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iG;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        g gVar3 = this.f38800a;
        CharSequence charSequence2 = gVar3 != null ? gVar3.f38790c : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        c3.a(this, charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f38801b, this.f38802c, this.f38805f};
        int iMax = 0;
        int iMin = 0;
        boolean z11 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                iMin = z11 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z11 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z11 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f38801b, this.f38802c, this.f38805f};
        int iMax = 0;
        int iMin = 0;
        boolean z11 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                iMin = z11 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z11 ? Math.max(iMax, view.getRight()) : view.getRight();
                z11 = true;
            }
        }
        return iMax - iMin;
    }

    public g getTab() {
        return this.f38800a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZ0 = AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo);
        m10.a aVar = this.f38804e;
        if (aVar != null && aVar.isVisible()) {
            accessibilityNodeInfoCompatZ0.l0(this.f38804e.d());
        }
        accessibilityNodeInfoCompatZ0.k0(i7.e.a(0, 1, this.f38800a.f38791d, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatZ0.i0(false);
            accessibilityNodeInfoCompatZ0.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2750i);
        }
        accessibilityNodeInfoCompatZ0.J0(getResources().getString(com.app.tgtg.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        TabLayout tabLayout = this.f38810k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i11 = View.MeasureSpec.makeMeasureSpec(tabLayout.f12630v, Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f38801b != null) {
            float f11 = tabLayout.f12626r;
            if (isSelected() && tabLayout.f12620k != -1) {
                f11 = tabLayout.f12627s;
            }
            int i13 = this.f38809j;
            ImageView imageView = this.f38802c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f38801b;
                if (textView != null && textView.getLineCount() > 1) {
                    f11 = tabLayout.f12628t;
                }
            } else {
                i13 = 1;
            }
            float textSize = this.f38801b.getTextSize();
            int lineCount = this.f38801b.getLineCount();
            int maxLines = this.f38801b.getMaxLines();
            if (f11 != textSize || (maxLines >= 0 && i13 != maxLines)) {
                if (tabLayout.D == 1 && f11 > textSize && lineCount == 1) {
                    Layout layout = this.f38801b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f11 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f38801b.setTextSize(0, f11);
                this.f38801b.setMaxLines(i13);
                super.onMeasure(i11, i12);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f38800a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        g gVar = this.f38800a;
        TabLayout tabLayout = gVar.f38793f;
        if (tabLayout != null) {
            tabLayout.k(gVar, true);
            return true;
        }
        i4.a.f("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        isSelected();
        super.setSelected(z11);
        TextView textView = this.f38801b;
        if (textView != null) {
            textView.setSelected(z11);
        }
        ImageView imageView = this.f38802c;
        if (imageView != null) {
            imageView.setSelected(z11);
        }
        View view = this.f38805f;
        if (view != null) {
            view.setSelected(z11);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f38800a) {
            this.f38800a = gVar;
            d();
        }
    }
}
