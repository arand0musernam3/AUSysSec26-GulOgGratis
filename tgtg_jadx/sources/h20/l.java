package h20;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import e20.h0;
import java.util.HashSet;
import o.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends ViewGroup implements z {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int[] f21313f1 = {R.attr.state_checked};

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int[] f21314g1 = {-16842910};
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public n20.o I;
    public boolean J;
    public ColorStateList K;
    public n L;
    public j M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean T;
    public MenuItem V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa.a f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e20.m f21316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g7.b f21317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f21318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k[] f21321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21322h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f21323h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f21325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21326k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ColorStateList f21327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f21333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f21334t;
    public final Rect t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f21336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21339y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21340z;

    public l(Context context) {
        super(context);
        this.f21318d = new SparseArray();
        this.f21322h = -1;
        this.f21324i = -1;
        this.f21336v = new SparseArray();
        this.f21337w = -1;
        this.f21338x = -1;
        this.f21339y = -1;
        this.f21340z = -1;
        this.H = 49;
        this.J = false;
        int i11 = 1;
        this.P = 1;
        this.Q = 0;
        this.V = null;
        this.W = 7;
        this.f21323h0 = false;
        this.t0 = new Rect();
        this.f21327m = c();
        if (isInEditMode()) {
            this.f21315a = null;
        } else {
            qa.a aVar = new qa.a();
            this.f21315a = aVar;
            aVar.W(0);
            aVar.q();
            aVar.K(ox.h.P(getContext(), com.app.tgtg.R.attr.motionDurationMedium4, getResources().getInteger(com.app.tgtg.R.integer.material_motion_duration_long_1)));
            aVar.M(ox.h.Q(getContext(), com.app.tgtg.R.attr.motionEasingStandard, k10.a.f25731b));
            aVar.S(new h0());
        }
        this.f21316b = new e20.m((p10.b) this, i11);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.W, this.M.f21312e);
    }

    private h getNewItem() {
        g7.b bVar = this.f21317c;
        h hVar = bVar != null ? (h) bVar.a() : null;
        return hVar == null ? new p10.a(getContext()) : hVar;
    }

    private void setBadgeIfNeeded(@NonNull h hVar) {
        m10.a aVar;
        int id2 = hVar.getId();
        if (id2 == -1 || (aVar = (m10.a) this.f21336v.get(id2)) == null) {
            return;
        }
        hVar.setBadge(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        View viewE;
        removeAllViews();
        k[] kVarArr = this.f21321g;
        if (kVarArr != null && this.f21317c != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    h hVar = (h) kVar;
                    this.f21317c.c(hVar);
                    ImageView imageView = hVar.f21300t;
                    if (hVar.f21279g1 != null) {
                        if (imageView != null) {
                            hVar.setClipChildren(true);
                            hVar.setClipToPadding(true);
                            m10.a aVar = hVar.f21279g1;
                            if (aVar != null) {
                                if (aVar.e() != null) {
                                    aVar.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        hVar.f21279g1 = null;
                    }
                    hVar.I = null;
                    hVar.O = 0.0f;
                    hVar.f21271a = false;
                }
            }
        }
        this.L.f21344b = true;
        this.M.b();
        this.L.f21344b = false;
        int i11 = this.M.f21310c;
        if (i11 == 0) {
            this.f21322h = 0;
            this.f21324i = 0;
            this.f21321g = null;
            this.f21317c = null;
            return;
        }
        if (this.f21317c == null || this.Q != i11) {
            this.Q = i11;
            this.f21317c = new g7.b(i11);
        }
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < this.M.f21309b.size(); i12++) {
            hashSet.add(Integer.valueOf(this.M.a(i12).getItemId()));
        }
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f21336v;
            if (i13 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i13);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i13++;
        }
        int size = this.M.f21309b.size();
        this.f21321g = new k[size];
        int i14 = this.f21319e;
        boolean z11 = i14 != -1 ? i14 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            MenuItem menuItemA = this.M.a(i16);
            boolean z12 = menuItemA instanceof a;
            if (z12) {
                Context context = getContext();
                d dVar = new d(context);
                LayoutInflater.from(context).inflate(com.app.tgtg.R.layout.m3_navigation_menu_divider, (ViewGroup) dVar, true);
                dVar.b();
                dVar.setOnlyShowWhenExpanded(true);
                dVar.setDividersEnabled(this.f21323h0);
                viewE = dVar;
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    i4.a.f("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                o oVar = new o(getContext());
                int i17 = this.f21331q;
                if (i17 == 0) {
                    i17 = this.f21329o;
                }
                oVar.setTextAppearance(i17);
                oVar.setTextColor(this.l);
                oVar.setOnlyShowWhenExpanded(true);
                oVar.a((o.n) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = oVar;
            } else if (size2 > 0) {
                size2--;
                viewE = e(i16, (o.n) menuItemA, z11, true);
            } else {
                o.n nVar = (o.n) menuItemA;
                boolean z13 = i15 >= this.W;
                i15++;
                viewE = e(i16, nVar, z11, z13);
            }
            if (!z12 && menuItemA.isCheckable() && this.f21324i == -1) {
                this.f21324i = i16;
            }
            this.f21321g[i16] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.f21324i);
        this.f21324i = iMin;
        setCheckedItem(this.f21321g[iMin].getItemData());
    }

    @Override // o.z
    public final void b(o.l lVar) {
        this.M = new j(lVar);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = androidx.core.app.e.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.app.tgtg.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f21313f1;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f21314g1;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i11, defaultColor});
    }

    public final n20.j d() {
        if (this.I == null || this.K == null) {
            return null;
        }
        n20.j jVar = new n20.j(this.I);
        jVar.t(this.K);
        return jVar;
    }

    public final h e(int i11, o.n nVar, boolean z11, boolean z12) {
        this.L.f21344b = true;
        nVar.setCheckable(true);
        this.L.f21344b = false;
        h newItem = getNewItem();
        newItem.setShifting(z11);
        newItem.setLabelMaxLines(this.P);
        newItem.setIconTintList(this.f21325j);
        newItem.setIconSize(this.f21326k);
        newItem.setTextColor(this.f21327m);
        newItem.setTextAppearanceInactive(this.f21328n);
        newItem.setTextAppearanceActive(this.f21329o);
        newItem.setHorizontalTextAppearanceInactive(this.f21330p);
        newItem.setHorizontalTextAppearanceActive(this.f21331q);
        newItem.setTextAppearanceActiveBoldEnabled(this.f21332r);
        newItem.setTextColor(this.l);
        int i12 = this.f21337w;
        if (i12 != -1) {
            newItem.setItemPaddingTop(i12);
        }
        int i13 = this.f21338x;
        if (i13 != -1) {
            newItem.setItemPaddingBottom(i13);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.N);
        newItem.setLabelFontScalingEnabled(this.O);
        int i14 = this.f21339y;
        if (i14 != -1) {
            newItem.setActiveIndicatorLabelPadding(i14);
        }
        int i15 = this.f21340z;
        if (i15 != -1) {
            newItem.setIconLabelHorizontalSpacing(i15);
        }
        newItem.setActiveIndicatorWidth(this.B);
        newItem.setActiveIndicatorHeight(this.C);
        newItem.setActiveIndicatorExpandedWidth(this.D);
        newItem.setActiveIndicatorExpandedHeight(this.E);
        newItem.setActiveIndicatorMarginHorizontal(this.F);
        newItem.setItemGravity(this.H);
        newItem.setActiveIndicatorExpandedPadding(this.t0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.G);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.J);
        newItem.setActiveIndicatorEnabled(this.A);
        Drawable drawable = this.f21333s;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f21335u);
        }
        newItem.setItemRippleColor(this.f21334t);
        newItem.setLabelVisibilityMode(this.f21319e);
        newItem.setItemIconGravity(this.f21320f);
        newItem.setOnlyShowWhenExpanded(z12);
        newItem.setExpanded(this.T);
        newItem.a(nVar);
        newItem.setItemPosition(i11);
        int i16 = nVar.f31570a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f21318d.get(i16));
        newItem.setOnClickListener(this.f21316b);
        int i17 = this.f21322h;
        if (i17 != 0 && i16 == i17) {
            this.f21324i = i11;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f21339y;
    }

    public SparseArray<m10.a> getBadgeDrawables() {
        return this.f21336v;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.T ? this.M.f21311d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f21331q;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f21330p;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f21340z;
    }

    public ColorStateList getIconTintList() {
        return this.f21325j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.K;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.E;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.G;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.C;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.F;
    }

    public n20.o getItemActiveIndicatorShapeAppearance() {
        return this.I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.B;
    }

    public Drawable getItemBackground() {
        k[] kVarArr = this.f21321g;
        if (kVarArr != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    return ((h) kVar).getBackground();
                }
            }
        }
        return this.f21333s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f21335u;
    }

    public int getItemGravity() {
        return this.H;
    }

    public int getItemIconGravity() {
        return this.f21320f;
    }

    public int getItemIconSize() {
        return this.f21326k;
    }

    public int getItemPaddingBottom() {
        return this.f21338x;
    }

    public int getItemPaddingTop() {
        return this.f21337w;
    }

    public ColorStateList getItemRippleColor() {
        return this.f21334t;
    }

    public int getItemTextAppearanceActive() {
        return this.f21329o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f21328n;
    }

    public ColorStateList getItemTextColor() {
        return this.l;
    }

    public int getLabelMaxLines() {
        return this.P;
    }

    public int getLabelVisibilityMode() {
        return this.f21319e;
    }

    public j getMenu() {
        return this.M;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.O;
    }

    public int getSelectedItemId() {
        return this.f21322h;
    }

    public int getSelectedItemPosition() {
        return this.f21324i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo).j0(i7.d.a(1, getCurrentVisibleContentItemCount(), 1, false));
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f21339y = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorLabelPadding(i11);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.V == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.V;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.V.setChecked(false);
        }
        menuItem.setChecked(true);
        this.V = menuItem;
    }

    public void setCollapsedMaxItemCount(int i11) {
        this.W = i11;
    }

    public void setExpanded(boolean z11) {
        this.T = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                kVar.setExpanded(z11);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i11) {
        this.f21331q = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setHorizontalTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i11) {
        this.f21330p = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setHorizontalTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        this.f21340z = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setIconLabelHorizontalSpacing(i11);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f21325j = colorStateList;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.A = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorEnabled(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i11) {
        this.E = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorExpandedHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.G = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorExpandedMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i11, int i12, int i13, int i14) {
        Rect rect = this.t0;
        rect.left = i11;
        rect.top = i12;
        rect.right = i13;
        rect.bottom = i14;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorExpandedPadding(rect);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i11) {
        this.D = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorExpandedWidth(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.C = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorHeight(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.F = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorMarginHorizontal(i11);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z11) {
        this.J = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorResizeable(z11);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(n20.o oVar) {
        this.I = oVar;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.B = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setActiveIndicatorWidth(i11);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f21333s = drawable;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.f21335u = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemBackground(i11);
                }
            }
        }
    }

    public void setItemGravity(int i11) {
        this.H = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemGravity(i11);
                }
            }
        }
    }

    public void setItemIconGravity(int i11) {
        this.f21320f = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemIconGravity(i11);
                }
            }
        }
    }

    public void setItemIconSize(int i11) {
        this.f21326k = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setIconSize(i11);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        SparseArray sparseArray = this.f21318d;
        if (onTouchListener == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, onTouchListener);
        }
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if ((kVar instanceof h) && kVar.getItemData() != null && kVar.getItemData().f31570a == i11) {
                    ((h) kVar).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i11) {
        this.f21338x = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemPaddingBottom(this.f21338x);
                }
            }
        }
    }

    public void setItemPaddingTop(int i11) {
        this.f21337w = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemPaddingTop(i11);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f21334t = colorStateList;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f21329o = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setTextAppearanceActive(i11);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f21332r = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setTextAppearanceActiveBoldEnabled(z11);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f21328n = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setTextAppearanceInactive(i11);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.O = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setLabelFontScalingEnabled(z11);
                }
            }
        }
    }

    public void setLabelMaxLines(int i11) {
        this.P = i11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setLabelMaxLines(i11);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.f21319e = i11;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z11) {
        this.N = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof h) {
                    ((h) kVar).setMeasureBottomPaddingFromLabelBaseline(z11);
                }
            }
        }
    }

    public void setPresenter(@NonNull n nVar) {
        this.L = nVar;
    }

    public void setSubmenuDividersEnabled(boolean z11) {
        if (this.f21323h0 == z11) {
            return;
        }
        this.f21323h0 = z11;
        k[] kVarArr = this.f21321g;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                if (kVar instanceof d) {
                    ((d) kVar).setDividersEnabled(z11);
                }
            }
        }
    }
}
