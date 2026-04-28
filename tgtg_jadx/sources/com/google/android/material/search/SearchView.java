package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import b0.a0;
import bg.t;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.app.tgtg.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import e20.i0;
import g20.b;
import g20.f;
import h7.h2;
import h7.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import l20.e;
import l20.g;
import l20.h;
import l20.i;
import l20.j;
import l20.k;
import l20.l;
import l20.o;
import lx.u;
import p.z2;
import s6.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SearchView extends FrameLayout implements a, b {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public l C;
    public HashMap D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f12556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f12558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f12559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f12560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f12561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Toolbar f12562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f12563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f12564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EditText f12565k;
    public final ImageButton l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f12566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TouchObserverFrameLayout f12567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f12569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f12570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f12571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a20.a f12572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f12573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SearchBar f12574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12579z;

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Material3_SearchView), attributeSet, i11);
        this.f12570q = new f(this, this);
        this.f12573t = new LinkedHashSet();
        this.f12575v = 16;
        this.C = l.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.S, i11, R.style.Widget_Material3_SearchView, new int[0]);
        this.f12579z = typedArrayM.getColor(11, 0);
        int resourceId = typedArrayM.getResourceId(16, -1);
        int resourceId2 = typedArrayM.getResourceId(0, -1);
        String string = typedArrayM.getString(3);
        String string2 = typedArrayM.getString(4);
        String string3 = typedArrayM.getString(24);
        boolean z11 = typedArrayM.getBoolean(27, false);
        this.f12576w = typedArrayM.getBoolean(8, true);
        this.f12577x = typedArrayM.getBoolean(7, true);
        boolean z12 = typedArrayM.getBoolean(17, false);
        this.f12578y = typedArrayM.getBoolean(9, true);
        this.f12571r = typedArrayM.getBoolean(10, true);
        typedArrayM.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f12568o = true;
        this.f12555a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f12556b = clippableRoundedCornerLayout;
        this.f12557c = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f12558d = viewFindViewById;
        this.f12559e = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f12560f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f12561g = materialToolbar;
        this.f12562h = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f12563i = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.f12564j = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f12565k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.f12566m = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.f12567n = touchObserverFrameLayout;
        this.f12569p = new o(this);
        this.f12572s = new a20.a(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new h(0));
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z12) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new e(this, 2));
            if (z11) {
                m.a aVar = new m.a(getContext());
                int iY = w0.e.y(R.attr.colorOnSurface, this);
                Paint paint = aVar.f28447a;
                if (iY != paint.getColor()) {
                    paint.setColor(iY);
                    aVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(aVar);
            }
        }
        imageButton.setOnClickListener(new e(this, 0));
        editText.addTextChangedListener(new fl.f(this, 2));
        touchObserverFrameLayout.setOnTouchListener(new i(this, 0));
        i0.f(materialToolbar, new g(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i12 = marginLayoutParams.leftMargin;
        final int i13 = marginLayoutParams.rightMargin;
        ViewCompat.k0(viewFindViewById2, new w() { // from class: l20.d
            @Override // h7.w
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i14 = SearchView.E;
                x6.d dVarE = windowInsetsCompat.e(h2.h() | h2.b());
                int i15 = i12 + dVarE.f43873a;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i15;
                marginLayoutParams2.rightMargin = i13 + dVarE.f43875c;
                return windowInsetsCompat;
            }
        });
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.k0(viewFindViewById, new g(this));
    }

    public static /* synthetic */ void e(SearchView searchView, WindowInsetsCompat windowInsetsCompat) {
        int i11 = windowInsetsCompat.e(h2.h() | h2.b()).f43874b;
        searchView.setUpStatusBarSpacer(i11);
        if (searchView.B) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(i11 > 0);
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f12574u;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", AnalyticsPlatformParams.channel);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z11) {
        this.f12558d.setVisibility(z11 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f11) {
        View view;
        a20.a aVar = this.f12572s;
        if (aVar == null || (view = this.f12557c) == null) {
            return;
        }
        view.setBackgroundColor(aVar.a(f11, this.f12579z));
    }

    private void setUpHeaderLayout(int i11) {
        if (i11 != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.f12559e;
            frameLayout.addView(layoutInflaterFrom.inflate(i11, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i11) {
        View view = this.f12558d;
        if (view.getLayoutParams().height != i11) {
            view.getLayoutParams().height = i11;
            view.requestLayout();
        }
    }

    @Override // g20.b
    public final void a(androidx.activity.b bVar) {
        SearchBar searchBar;
        if (i() || (searchBar = this.f12574u) == null) {
            return;
        }
        searchBar.setPlaceholderText(this.f12565k.getText().toString());
        o oVar = this.f12569p;
        g20.i iVar = oVar.f26830n;
        SearchBar searchBar2 = oVar.f26832p;
        iVar.f18279f = bVar;
        float fC = bVar.c();
        View view = iVar.f18275b;
        iVar.f18291j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar2 != null) {
            iVar.f18292k = i0.b(view, searchBar2);
        }
        iVar.f18290i = fC;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f12568o) {
            this.f12567n.addView(view, i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @Override // g20.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.activity.b r26) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.b(androidx.activity.b):void");
    }

    @Override // g20.b
    public final void c() {
        if (i()) {
            return;
        }
        o oVar = this.f12569p;
        g20.i iVar = oVar.f26830n;
        androidx.activity.b bVar = iVar.f18279f;
        iVar.f18279f = null;
        if (Build.VERSION.SDK_INT < 34 || this.f12574u == null || bVar == null) {
            g();
            return;
        }
        long totalDuration = oVar.l().getTotalDuration();
        g20.i iVar2 = oVar.f26830n;
        AnimatorSet animatorSetB = iVar2.b(oVar.f26832p);
        animatorSetB.setDuration(totalDuration);
        animatorSetB.start();
        iVar2.f18290i = 0.0f;
        iVar2.f18291j = null;
        iVar2.f18292k = null;
        if (oVar.f26831o != null) {
            oVar.c(false).start();
            oVar.f26831o.resume();
        }
        oVar.f26831o = null;
    }

    @Override // g20.b
    public final void d() {
        if (i() || this.f12574u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        o oVar = this.f12569p;
        g20.i iVar = oVar.f26830n;
        SearchBar searchBar = oVar.f26832p;
        if (iVar.a() != null) {
            AnimatorSet animatorSetB = iVar.b(searchBar);
            View view = iVar.f18275b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new g20.h(), clippableRoundedCornerLayout.getCornerRadii(), iVar.c());
                valueAnimatorOfObject.addUpdateListener(new t(clippableRoundedCornerLayout, 3));
                animatorSetB.playTogether(valueAnimatorOfObject);
            }
            animatorSetB.setDuration(iVar.f18278e);
            animatorSetB.start();
            iVar.f18290i = 0.0f;
            iVar.f18291j = null;
            iVar.f18292k = null;
        }
        AnimatorSet animatorSet = oVar.f26831o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        oVar.f26831o = null;
    }

    public final void f() {
        this.f12565k.post(new l20.f(this, 2));
    }

    public final void g() {
        if (this.C.equals(l.HIDDEN) || this.C.equals(l.HIDING)) {
            return;
        }
        SearchBar searchBar = this.f12574u;
        o oVar = this.f12569p;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            oVar.l();
            return;
        }
        this.f12574u.setPlaceholderText(this.f12565k.getText().toString());
        SearchBar searchBar2 = this.f12574u;
        Objects.requireNonNull(oVar);
        searchBar2.post(new j(oVar, 0));
    }

    public g20.i getBackHelper() {
        return this.f12569p.f26830n;
    }

    @Override // s6.a
    @NonNull
    public s6.b getBehavior() {
        return new Behavior();
    }

    @NonNull
    public l getCurrentTransitionState() {
        return this.C;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.f12565k;
    }

    public CharSequence getHint() {
        return this.f12565k.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f12563i;
    }

    public CharSequence getSearchPrefixText() {
        return this.f12563i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f12575v;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f12565k.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f12561g;
    }

    public final boolean h() {
        return this.f12575v == 48;
    }

    public final boolean i() {
        return this.C.equals(l.HIDDEN) || this.C.equals(l.HIDING);
    }

    public final void j() {
        if (this.f12578y) {
            this.f12565k.postDelayed(new l20.f(this, 0), 100L);
        }
    }

    public final void k(l lVar, boolean z11) {
        if (this.C.equals(lVar)) {
            return;
        }
        if (z11) {
            if (lVar == l.SHOWN) {
                setModalForAccessibility(true);
            } else if (lVar == l.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        this.C = lVar;
        Iterator it = new LinkedHashSet(this.f12573t).iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        n(lVar);
        SearchBar searchBar = this.f12574u;
        if (searchBar == null || lVar != l.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public final void l() {
        if (this.C.equals(l.SHOWN)) {
            return;
        }
        l lVar = this.C;
        l lVar2 = l.SHOWING;
        if (lVar.equals(lVar2)) {
            return;
        }
        o oVar = this.f12569p;
        SearchView searchView = oVar.f26818a;
        SearchBar searchBar = oVar.f26832p;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = oVar.f26820c;
        if (searchBar == null) {
            if (searchView.h()) {
                searchView.postDelayed(new l20.f(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new j(oVar, 2));
            return;
        }
        EditText editText = oVar.f26827j;
        if (searchView.h()) {
            searchView.j();
        }
        searchView.setTransitionState(lVar2);
        Toolbar toolbar = oVar.f26824g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (oVar.f26832p.getMenuResId() == -1 || !searchView.f12577x) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(oVar.f26832p.getMenuResId());
            ActionMenuView actionMenuViewH = i0.h(toolbar);
            if (actionMenuViewH != null) {
                for (int i11 = 0; i11 < actionMenuViewH.getChildCount(); i11++) {
                    View childAt = actionMenuViewH.getChildAt(i11);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(oVar.f26832p.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new j(oVar, 1));
    }

    public final void m(ViewGroup viewGroup, boolean z11) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != this) {
                if (childAt.findViewById(this.f12556b.getId()) != null) {
                    m((ViewGroup) childAt, z11);
                } else {
                    HashMap map = this.D;
                    if (z11) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.D.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void n(l lVar) {
        if (this.f12574u == null || !this.f12571r) {
            return;
        }
        boolean zEquals = lVar.equals(l.SHOWN);
        f fVar = this.f12570q;
        if (zEquals) {
            fVar.a(false);
        } else if (lVar.equals(l.HIDDEN)) {
            fVar.b();
        }
    }

    public final void o() {
        ImageButton imageButtonK = i0.k(this.f12561g);
        if (imageButtonK == null) {
            return;
        }
        int i11 = this.f12556b.getVisibility() == 0 ? 1 : 0;
        Drawable drawable = imageButtonK.getDrawable();
        if (drawable instanceof m.a) {
            ((m.a) drawable).setProgress(i11);
        }
        if (drawable instanceof e20.f) {
            ((e20.f) drawable).a(i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.Q(this);
        l currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == l.SHOWN) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == l.HIDDEN) {
            setModalForAccessibility(false);
        }
        n(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.f12570q.b();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f12575v = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f45418a);
        setText(kVar.f26810c);
        setVisible(kVar.f26811d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        Editable text = getText();
        kVar.f26810c = text == null ? null : text.toString();
        kVar.f26811d = this.f12556b.getVisibility();
        return kVar;
    }

    public void setAnimatedNavigationIcon(boolean z11) {
        this.f12576w = z11;
    }

    public void setAutoShowKeyboard(boolean z11) {
        this.f12578y = z11;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        setUpBackgroundViewElevationOverlay(f11);
    }

    public void setHint(CharSequence charSequence) {
        this.f12565k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z11) {
        this.f12577x = z11;
    }

    public void setModalForAccessibility(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z11) {
            this.D = new HashMap(viewGroup.getChildCount());
        }
        m(viewGroup, z11);
        if (z11) {
            return;
        }
        this.D = null;
    }

    public void setOnMenuItemClickListener(z2 z2Var) {
        this.f12561g.setOnMenuItemClickListener(z2Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.f12563i;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z11) {
        this.B = true;
        setStatusBarSpacerEnabledInternal(z11);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f12565k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z11) {
        this.f12561g.setTouchscreenBlocksFocus(z11);
    }

    public void setTransitionState(@NonNull l lVar) {
        k(lVar, true);
    }

    public void setUseWindowInsetsController(boolean z11) {
        this.A = z11;
    }

    public void setVisible(boolean z11) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f12556b;
        boolean z12 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z11 ? 0 : 8);
        o();
        k(z11 ? l.SHOWN : l.HIDDEN, z12 != z11);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f12574u = searchBar;
        this.f12569p.f26832p = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new e(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new l20.f(this, 1));
                    this.f12565k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f12561g;
        if (materialToolbar != null && !(materialToolbar.getNavigationIcon() instanceof m.a)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.f12574u == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = a0.x(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new e20.f(this.f12574u.getNavigationIcon(), drawableMutate));
                o();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        n(getCurrentTransitionState());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Behavior extends s6.b {
        public Behavior() {
        }

        @Override // s6.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f12574u != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
        }
    }

    public void setHint(int i11) {
        this.f12565k.setHint(i11);
    }

    public void setText(int i11) {
        this.f12565k.setText(i11);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }
}
