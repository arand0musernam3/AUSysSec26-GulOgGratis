package t20;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import b0.a0;
import c5.o3;
import com.app.tgtg.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d40.t1;
import e20.i0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mv.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f39699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f39700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f39701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f39702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f39703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f39704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f39705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f39706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f39708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f39709k;
    public PorterDuff.Mode l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f39711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f39712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f39713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f39714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f39716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f39717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f39718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f39719v;

    public l(TextInputLayout textInputLayout, j30.g gVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f39707i = 0;
        this.f39708j = new LinkedHashSet();
        this.f39719v = new j(this, 0);
        k kVar = new k(this);
        this.f39717t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f39699a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39700b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (h0.g.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.f39701c = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (h0.g.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.f39705g = checkableImageButton2;
        this.f39706h = new b0(this, gVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f39714q = appCompatTextView;
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        if (typedArray.hasValue(38)) {
            this.f39702d = h0.g.q(getContext(), gVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f39703e = i0.o(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            h(gVar.k(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f39709k = h0.g.q(getContext(), gVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.l = i0.o(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            f(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButton2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f39709k = h0.g.q(getContext(), gVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.l = i0.o(typedArray.getInt(56, -1), null);
            }
            f(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            i4.a.f("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f39710m) {
            this.f39710m = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeZ = t1.z(typedArray.getInt(31, -1));
            this.f39711n = scaleTypeZ;
            checkableImageButton2.setScaleType(scaleTypeZ);
            checkableImageButton.setScaleType(scaleTypeZ);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(gVar.j(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.f39713p = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m();
        frameLayout.addView(checkableImageButton2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.f12660l1.add(kVar);
        if (textInputLayout.f12646e != null) {
            kVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o3(this, 7));
    }

    public final m a() {
        m dVar;
        int i11 = this.f39707i;
        b0 b0Var = this.f39706h;
        SparseArray sparseArray = (SparseArray) b0Var.f30156d;
        m mVar = (m) sparseArray.get(i11);
        if (mVar != null) {
            return mVar;
        }
        l lVar = (l) b0Var.f30157e;
        if (i11 == -1) {
            dVar = new d(lVar, 0);
        } else if (i11 == 0) {
            dVar = new d(lVar, 1);
        } else if (i11 == 1) {
            dVar = new r(lVar, b0Var.f30155c);
        } else if (i11 == 2) {
            dVar = new c(lVar);
        } else {
            if (i11 != 3) {
                i4.a.f(j4.s.f(i11, "Invalid end icon mode: "));
                return null;
            }
            dVar = new i(lVar);
        }
        sparseArray.append(i11, dVar);
        return dVar;
    }

    public final int b() {
        int marginStart;
        if (c() || d()) {
            CheckableImageButton checkableImageButton = this.f39705g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f39714q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean c() {
        return this.f39700b.getVisibility() == 0 && this.f39705g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f39701c.getVisibility() == 0;
    }

    public final void e(boolean z11) {
        boolean z12;
        boolean zIsActivated;
        boolean z13;
        m mVarA = a();
        boolean zJ = mVarA.j();
        CheckableImageButton checkableImageButton = this.f39705g;
        boolean z14 = true;
        if (!zJ || (z13 = checkableImageButton.f12498d) == mVarA.k()) {
            z12 = false;
        } else {
            checkableImageButton.setChecked(!z13);
            z12 = true;
        }
        if (!(mVarA instanceof i) || (zIsActivated = checkableImageButton.isActivated()) == ((i) mVarA).l) {
            z14 = z12;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z11 || z14) {
            t1.E(this.f39699a, checkableImageButton, this.f39709k);
        }
    }

    public final void f(int i11) {
        if (this.f39707i == i11) {
            return;
        }
        m mVarA = a();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f39718u;
        AccessibilityManager accessibilityManager = this.f39717t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f39718u = null;
        mVarA.r();
        this.f39707i = i11;
        Iterator it = this.f39708j.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        g(i11 != 0);
        m mVarA2 = a();
        int iD = this.f39706h.f30154b;
        if (iD == 0) {
            iD = mVarA2.d();
        }
        Drawable drawableX = iD != 0 ? a0.x(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f39705g;
        checkableImageButton.setImageDrawable(drawableX);
        TextInputLayout textInputLayout = this.f39699a;
        if (drawableX != null) {
            t1.s(textInputLayout, checkableImageButton, this.f39709k, this.l);
            t1.E(textInputLayout, checkableImageButton, this.f39709k);
        }
        int iC = mVarA2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(mVarA2.j());
        if (!mVarA2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i11);
        }
        mVarA2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = mVarA2.h();
        this.f39718u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f39718u);
        }
        View.OnClickListener onClickListenerF = mVarA2.f();
        View.OnLongClickListener onLongClickListener = this.f39712o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        t1.I(checkableImageButton, onLongClickListener);
        EditText editText = this.f39716s;
        if (editText != null) {
            mVarA2.l(editText);
            i(mVarA2);
        }
        t1.s(textInputLayout, checkableImageButton, this.f39709k, this.l);
        e(true);
    }

    public final void g(boolean z11) {
        if (c() != z11) {
            this.f39705g.setVisibility(z11 ? 0 : 8);
            j();
            l();
            this.f39699a.s();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f39701c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        t1.s(this.f39699a, checkableImageButton, this.f39702d, this.f39703e);
    }

    public final void i(m mVar) {
        if (this.f39716s == null) {
            return;
        }
        if (mVar.e() != null) {
            this.f39716s.setOnFocusChangeListener(mVar.e());
        }
        if (mVar.g() != null) {
            this.f39705g.setOnFocusChangeListener(mVar.g());
        }
    }

    public final void j() {
        this.f39700b.setVisibility((this.f39705g.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.f39713p == null || this.f39715r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f39701c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f39699a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f12658k.f39745q && textInputLayout.o()) ? 0 : 8);
        j();
        l();
        if (this.f39707i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void l() {
        TextInputLayout textInputLayout = this.f39699a;
        if (textInputLayout.f12646e == null) {
            return;
        }
        this.f39714q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f12646e.getPaddingTop(), (c() || d()) ? 0 : textInputLayout.f12646e.getPaddingEnd(), textInputLayout.f12646e.getPaddingBottom());
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.f39714q;
        int visibility = appCompatTextView.getVisibility();
        int i11 = (this.f39713p == null || this.f39715r) ? 8 : 0;
        if (visibility != i11) {
            a().o(i11 == 0);
        }
        j();
        appCompatTextView.setVisibility(i11);
        this.f39699a.s();
    }
}
