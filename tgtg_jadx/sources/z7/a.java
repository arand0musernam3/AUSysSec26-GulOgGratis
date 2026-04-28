package z7;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import c5.a0;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import y00.d0;
import y00.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends h7.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Rect f47305k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final d0 l = new d0(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e0 f47306m = new e0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccessibilityManager f47311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f47312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f47313g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f47307a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f47308b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f47309c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f47310d = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47314h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47315i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47316j = Integer.MIN_VALUE;

    public a(View view) {
        this.f47312f = view;
        this.f47311e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.q(view) == 0) {
            ViewCompat.i0(view, 1);
        }
    }

    public final boolean a(int i11) {
        if (this.f47315i != i11) {
            return false;
        }
        this.f47315i = Integer.MIN_VALUE;
        m(i11, false);
        o(i11, 8);
        return true;
    }

    public final AccessibilityEvent b(int i11, int i12) {
        View view = this.f47312f;
        if (i11 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i12);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i12);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatI = i(i11);
        accessibilityEventObtain2.getText().add(accessibilityNodeInfoCompatI.y());
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfoCompatI.r());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfoCompatI.O());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfoCompatI.N());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfoCompatI.H());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfoCompatI.E());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            a40.d0.k("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfoCompatI.o());
        accessibilityEventObtain2.setSource(view, i11);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final AccessibilityNodeInfoCompat c(int i11) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatT = AccessibilityNodeInfoCompat.T();
        accessibilityNodeInfoCompatT.q0(true);
        accessibilityNodeInfoCompatT.s0(true);
        accessibilityNodeInfoCompatT.h0("android.view.View");
        Rect rect = f47305k;
        accessibilityNodeInfoCompatT.d0(rect);
        accessibilityNodeInfoCompatT.e0(rect);
        View view = this.f47312f;
        accessibilityNodeInfoCompatT.F0(view);
        l(i11, accessibilityNodeInfoCompatT);
        if (accessibilityNodeInfoCompatT.y() == null && accessibilityNodeInfoCompatT.r() == null) {
            a40.d0.k("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f47308b;
        accessibilityNodeInfoCompatT.k(rect2);
        if (rect2.equals(rect)) {
            a40.d0.k("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int i12 = accessibilityNodeInfoCompatT.i();
        if ((i12 & 64) != 0) {
            a40.d0.k("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((i12 & 128) != 0) {
            a40.d0.k("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoCompatT.D0(view.getContext().getPackageName());
        accessibilityNodeInfoCompatT.O0(view, i11);
        if (this.f47314h == i11) {
            accessibilityNodeInfoCompatT.a0(true);
            accessibilityNodeInfoCompatT.a(128);
        } else {
            accessibilityNodeInfoCompatT.a0(false);
            accessibilityNodeInfoCompatT.a(64);
        }
        boolean z11 = this.f47315i == i11;
        if (z11) {
            accessibilityNodeInfoCompatT.a(2);
        } else if (accessibilityNodeInfoCompatT.I()) {
            accessibilityNodeInfoCompatT.a(1);
        }
        accessibilityNodeInfoCompatT.t0(z11);
        int[] iArr = this.f47310d;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f47307a;
        accessibilityNodeInfoCompatT.l(rect3);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoCompatT.k(rect3);
            if (accessibilityNodeInfoCompatT.f2744b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatT2 = AccessibilityNodeInfoCompat.T();
                for (int i13 = accessibilityNodeInfoCompatT.f2744b; i13 != -1; i13 = accessibilityNodeInfoCompatT2.f2744b) {
                    accessibilityNodeInfoCompatT2.G0(view, -1);
                    accessibilityNodeInfoCompatT2.d0(rect);
                    l(i13, accessibilityNodeInfoCompatT2);
                    accessibilityNodeInfoCompatT2.k(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
                accessibilityNodeInfoCompatT2.X();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f47309c;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoCompatT.e0(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoCompatT.X0(true);
                        }
                    }
                }
            }
        }
        return accessibilityNodeInfoCompatT;
    }

    public final boolean d(MotionEvent motionEvent) {
        int i11;
        AccessibilityManager accessibilityManager = this.f47311e;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iE = e(motionEvent.getX(), motionEvent.getY());
            int i12 = this.f47316j;
            if (i12 != iE) {
                this.f47316j = iE;
                o(iE, 128);
                o(i12, 256);
            }
            if (iE == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i11 = this.f47316j) == Integer.MIN_VALUE) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f47316j = Integer.MIN_VALUE;
                o(Integer.MIN_VALUE, 128);
                o(i11, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int e(float f11, float f12);

    public abstract void f(ArrayList arrayList);

    public final void g(int i11) {
        View view;
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f47311e.isEnabled() || (parent = (view = this.f47312f).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventB = b(i11, NewHope.SENDB_BYTES);
        accessibilityEventB.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventB);
    }

    @Override // h7.b
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.f47313g == null) {
            this.f47313g = new a0(this, 1);
        }
        return this.f47313g;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.a.h(int, android.graphics.Rect):boolean");
    }

    public final AccessibilityNodeInfoCompat i(int i11) {
        if (i11 != -1) {
            return c(i11);
        }
        View view = this.f47312f;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatU = AccessibilityNodeInfoCompat.U(view);
        ViewCompat.P(view, accessibilityNodeInfoCompatU);
        ArrayList arrayList = new ArrayList();
        f(arrayList);
        if (accessibilityNodeInfoCompatU.n() > 0 && arrayList.size() > 0) {
            a40.d0.k("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            accessibilityNodeInfoCompatU.d(view, ((Integer) arrayList.get(i12)).intValue());
        }
        return accessibilityNodeInfoCompatU;
    }

    public abstract boolean j(int i11, int i12, Bundle bundle);

    public abstract void l(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public final boolean n(int i11) {
        int i12;
        View view = this.f47312f;
        if ((!view.isFocused() && !view.requestFocus()) || (i12 = this.f47315i) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            a(i12);
        }
        if (i11 == Integer.MIN_VALUE) {
            return false;
        }
        this.f47315i = i11;
        m(i11, true);
        o(i11, 8);
        return true;
    }

    public final void o(int i11, int i12) {
        View view;
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f47311e.isEnabled() || (parent = (view = this.f47312f).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, b(i11, i12));
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        k(accessibilityNodeInfoCompat);
    }

    public void k(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void m(int i11, boolean z11) {
    }
}
