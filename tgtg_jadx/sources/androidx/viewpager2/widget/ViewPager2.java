package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.d0;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j0;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.s1;
import com.braze.h2;
import gl.i;
import j4.s;
import java.util.ArrayList;
import ky.o;
import q1.z;
import qc.y;
import ua.a;
import wa.b;
import wa.c;
import wa.d;
import wa.e;
import wa.f;
import wa.g;
import wa.h;
import wa.j;
import wa.k;
import wa.l;
import wa.m;
import wa.n;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f4114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f4115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f4119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f4120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f4122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f4123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f4124k;
    public d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f4125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f4126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f4127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s1 f4128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f4132t;

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f4114a = new Rect();
        this.f4115b = new Rect();
        this.f4116c = new i();
        this.f4118e = false;
        this.f4119f = new e(this, 0);
        this.f4121h = -1;
        this.f4128p = null;
        this.f4129q = false;
        this.f4130r = true;
        this.f4131s = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.f4132t = new j(this);
        m mVar = new m(this, context);
        this.f4123j = mVar;
        mVar.setId(ViewCompat.g());
        this.f4123j.setDescendantFocusability(131072);
        h hVar = new h(this, context);
        this.f4120g = hVar;
        this.f4123j.setLayoutManager(hVar);
        int i11 = 1;
        this.f4123j.setScrollingTouchSlop(1);
        int[] iArr = a.f40979a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.a0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        int i12 = 0;
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f4123j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f4123j.j(new g());
            d dVar = new d(this);
            this.l = dVar;
            this.f4126n = new o(dVar, 28);
            l lVar = new l(this);
            this.f4124k = lVar;
            lVar.attachToRecyclerView(this.f4123j);
            this.f4123j.k(this.l);
            i iVar = new i();
            this.f4125m = iVar;
            this.l.f43351a = iVar;
            f fVar = new f(this, i12);
            f fVar2 = new f(this, i11);
            ((ArrayList) iVar.f20543b).add(fVar);
            ((ArrayList) this.f4125m.f20543b).add(fVar2);
            j jVar = this.f4132t;
            m mVar2 = this.f4123j;
            jVar.getClass();
            ViewCompat.i0(mVar2, 2);
            jVar.f43369f = new e(jVar, i11);
            ViewPager2 viewPager2 = jVar.f43370g;
            if (ViewCompat.q(viewPager2) == 0) {
                ViewCompat.i0(viewPager2, 1);
            }
            ((ArrayList) this.f4125m.f20543b).add(this.f4116c);
            b bVar = new b();
            this.f4127o = bVar;
            ((ArrayList) this.f4125m.f20543b).add(bVar);
            m mVar3 = this.f4123j;
            attachViewToParent(mVar3, 0, mVar3.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(wa.i iVar) {
        ((ArrayList) this.f4116c.f20543b).add(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        l1 adapter;
        Fragment fragmentB;
        if (this.f4121h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f4122i;
        if (parcelable != null) {
            if (adapter instanceof va.f) {
                va.d dVar = (va.d) ((va.f) adapter);
                z zVar = dVar.f42209c;
                z zVar2 = dVar.f42210d;
                if (!zVar2.d() || !zVar.d()) {
                    h2.b("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(dVar.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j9 = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = dVar.f42208b;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        if (string == null) {
                            fragmentB = null;
                        } else {
                            fragmentB = fragmentManager.f3109c.b(string);
                            if (fragmentB == null) {
                                fragmentManager.j0(new IllegalStateException(s.k("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                        }
                        zVar.h(j9, fragmentB);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            i4.a.f("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j11 = Long.parseLong(str.substring(2));
                        j0 j0Var = (j0) bundle.getParcelable(str);
                        if (dVar.b(j11)) {
                            zVar2.h(j11, j0Var);
                        }
                    }
                }
                if (!zVar.d()) {
                    dVar.f42215i = true;
                    dVar.f42214h = true;
                    dVar.d();
                    Handler handler = new Handler(Looper.getMainLooper());
                    a8.f fVar = new a8.f(dVar, 16);
                    dVar.f42207a.a(new d0(handler, fVar));
                    handler.postDelayed(fVar, ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS);
                }
            }
            this.f4122i = null;
        }
        int iMax = Math.max(0, Math.min(this.f4121h, adapter.getItemCount() - 1));
        this.f4117d = iMax;
        this.f4121h = -1;
        this.f4123j.j0(iMax);
        this.f4132t.R();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return this.f4123j.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i11) {
        return this.f4123j.canScrollVertically(i11);
    }

    public final void d(int i11, boolean z11) {
        i iVar;
        l1 adapter = getAdapter();
        if (adapter == null) {
            if (this.f4121h != -1) {
                this.f4121h = Math.max(i11, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i11, 0), adapter.getItemCount() - 1);
        int i12 = this.f4117d;
        if (iMin == i12 && this.l.f43356f == 0) {
            return;
        }
        if (iMin == i12 && z11) {
            return;
        }
        double d3 = i12;
        this.f4117d = iMin;
        this.f4132t.R();
        d dVar = this.l;
        if (dVar.f43356f != 0) {
            dVar.c();
            c cVar = dVar.f43357g;
            d3 = ((double) cVar.f43348a) + ((double) cVar.f43349b);
        }
        d dVar2 = this.l;
        dVar2.getClass();
        dVar2.f43355e = z11 ? 2 : 3;
        boolean z12 = dVar2.f43359i != iMin;
        dVar2.f43359i = iMin;
        dVar2.a(2);
        if (z12 && (iVar = dVar2.f43351a) != null) {
            iVar.c(iMin);
        }
        if (!z11) {
            this.f4123j.j0(iMin);
            return;
        }
        double d11 = iMin;
        double dAbs = Math.abs(d11 - d3);
        m mVar = this.f4123j;
        if (dAbs <= 3.0d) {
            mVar.m0(iMin);
            return;
        }
        mVar.j0(d11 > d3 ? iMin - 3 : iMin + 3);
        m mVar2 = this.f4123j;
        mVar2.post(new e7.a(iMin, mVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i11 = ((n) parcelable).f43372a;
            sparseArray.put(this.f4123j.getId(), (Parcelable) sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e() {
        l lVar = this.f4124k;
        if (lVar == null) {
            h2.b("Design assumption violated.");
            return;
        }
        View viewFindSnapView = lVar.findSnapView(this.f4120g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f4120g.getPosition(viewFindSnapView);
        if (position != this.f4117d && getScrollState() == 0) {
            this.f4125m.c(position);
        }
        this.f4118e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f4132t.getClass();
        this.f4132t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public l1 getAdapter() {
        return this.f4123j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4117d;
    }

    public int getItemDecorationCount() {
        return this.f4123j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4131s;
    }

    public int getOrientation() {
        return this.f4120g.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        m mVar = this.f4123j;
        if (getOrientation() == 0) {
            height = mVar.getWidth() - mVar.getPaddingLeft();
            paddingBottom = mVar.getPaddingRight();
        } else {
            height = mVar.getHeight() - mVar.getPaddingTop();
            paddingBottom = mVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.l.f43356f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j jVar = this.f4132t;
        jVar.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZ0 = AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo);
        ViewPager2 viewPager2 = jVar.f43370g;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfoCompatZ0.j0(i7.d.a(itemCount, itemCount2, 0, false));
        l1 adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.f4130r) {
            return;
        }
        if (viewPager2.f4117d > 0) {
            accessibilityNodeInfoCompatZ0.a(8192);
        }
        if (viewPager2.f4117d < itemCount3 - 1) {
            accessibilityNodeInfoCompatZ0.a(4096);
        }
        accessibilityNodeInfoCompatZ0.L0(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.f4123j.getMeasuredWidth();
        int measuredHeight = this.f4123j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f4114a;
        rect.left = paddingLeft;
        rect.right = (i13 - i11) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i14 - i12) - getPaddingBottom();
        Rect rect2 = this.f4115b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f4123j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f4118e) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        measureChild(this.f4123j, i11, i12);
        int measuredWidth = this.f4123j.getMeasuredWidth();
        int measuredHeight = this.f4123j.getMeasuredHeight();
        int measuredState = this.f4123j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i11, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f4121h = nVar.f43373b;
        this.f4122i = nVar.f43374c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f43372a = this.f4123j.getId();
        int i11 = this.f4121h;
        if (i11 == -1) {
            i11 = this.f4117d;
        }
        nVar.f43373b = i11;
        Parcelable parcelable = this.f4122i;
        if (parcelable != null) {
            nVar.f43374c = parcelable;
            return nVar;
        }
        Object adapter = this.f4123j.getAdapter();
        if (adapter instanceof va.f) {
            va.d dVar = (va.d) ((va.f) adapter);
            dVar.getClass();
            z zVar = dVar.f42209c;
            int iJ = zVar.j();
            z zVar2 = dVar.f42210d;
            Bundle bundle = new Bundle(zVar2.j() + iJ);
            for (int i12 = 0; i12 < zVar.j(); i12++) {
                long jF = zVar.f(i12);
                Fragment fragment = (Fragment) zVar.b(jF);
                if (fragment != null && fragment.isAdded()) {
                    dVar.f42208b.V(bundle, e0.f.i(jF, "f#"), fragment);
                }
            }
            for (int i13 = 0; i13 < zVar2.j(); i13++) {
                long jF2 = zVar2.f(i13);
                if (dVar.b(jF2)) {
                    bundle.putParcelable(e0.f.i(jF2, "s#"), (Parcelable) zVar2.b(jF2));
                }
            }
            nVar.f43374c = bundle;
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i11, Bundle bundle) {
        this.f4132t.getClass();
        if (i11 != 8192 && i11 != 4096) {
            return super.performAccessibilityAction(i11, bundle);
        }
        j jVar = this.f4132t;
        jVar.getClass();
        ViewPager2 viewPager2 = jVar.f43370g;
        if (i11 != 8192 && i11 != 4096) {
            y.e();
            return false;
        }
        int currentItem = i11 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f4130r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(l1 l1Var) {
        l1 adapter = this.f4123j.getAdapter();
        j jVar = this.f4132t;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(jVar.f43369f);
        } else {
            jVar.getClass();
        }
        e eVar = this.f4119f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(eVar);
        }
        this.f4123j.setAdapter(l1Var);
        this.f4117d = 0;
        c();
        j jVar2 = this.f4132t;
        jVar2.R();
        if (l1Var != null) {
            l1Var.registerAdapterDataObserver(jVar2.f43369f);
        }
        if (l1Var != null) {
            l1Var.registerAdapterDataObserver(eVar);
        }
    }

    public void setCurrentItem(int i11, boolean z11) {
        Object obj = this.f4126n.f26718b;
        d(i11, z11);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.f4132t.R();
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1 && i11 != -1) {
            i4.a.f("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f4131s = i11;
            this.f4123j.requestLayout();
        }
    }

    public void setOrientation(int i11) {
        this.f4120g.setOrientation(i11);
        this.f4132t.R();
    }

    public void setPageTransformer(k kVar) {
        boolean z11 = this.f4129q;
        if (kVar != null) {
            if (!z11) {
                this.f4128p = this.f4123j.getItemAnimator();
                this.f4129q = true;
            }
            this.f4123j.setItemAnimator(null);
        } else if (z11) {
            this.f4123j.setItemAnimator(this.f4128p);
            this.f4128p = null;
            this.f4129q = false;
        }
        this.f4127o.getClass();
        if (kVar == null) {
            return;
        }
        this.f4127o.getClass();
        this.f4127o.getClass();
    }

    public void setUserInputEnabled(boolean z11) {
        this.f4130r = z11;
        this.f4132t.R();
    }

    public void setCurrentItem(int i11) {
        setCurrentItem(i11, true);
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4114a = new Rect();
        this.f4115b = new Rect();
        this.f4116c = new i();
        this.f4118e = false;
        this.f4119f = new e(this, 0);
        this.f4121h = -1;
        this.f4128p = null;
        this.f4129q = false;
        this.f4130r = true;
        this.f4131s = -1;
        a(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4114a = new Rect();
        this.f4115b = new Rect();
        this.f4116c = new i();
        this.f4118e = false;
        this.f4119f = new e(this, 0);
        this.f4121h = -1;
        this.f4128p = null;
        this.f4129q = false;
        this.f4130r = true;
        this.f4131s = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f4114a = new Rect();
        this.f4115b = new Rect();
        this.f4116c = new i();
        this.f4118e = false;
        this.f4119f = new e(this, 0);
        this.f4121h = -1;
        this.f4128p = null;
        this.f4129q = false;
        this.f4130r = true;
        this.f4131s = -1;
        a(context, attributeSet);
    }
}
