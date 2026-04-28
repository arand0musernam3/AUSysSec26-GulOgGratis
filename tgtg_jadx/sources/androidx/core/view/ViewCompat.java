package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.app.tgtg.R;
import h7.g;
import h7.i1;
import h7.j1;
import h7.l0;
import h7.m0;
import h7.m1;
import h7.n0;
import h7.p0;
import h7.r0;
import h7.s0;
import h7.t0;
import h7.u0;
import h7.v0;
import h7.w;
import h7.w0;
import h7.x;
import h7.x0;
import h7.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m7.h;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ViewCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2731a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f2732b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2733c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2734d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f2735e = new l0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f2736f = new n0();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @Deprecated
    public ViewCompat() {
    }

    public static String A(View view) {
        return view.getTransitionName();
    }

    @Deprecated
    public static WindowInsetsControllerCompat B(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return w0.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new WindowInsetsControllerCompat(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int C(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float D(View view) {
        return view.getZ();
    }

    public static boolean E(View view) {
        return i(view) != null;
    }

    @Deprecated
    public static boolean F(View view) {
        return view.hasTransientState();
    }

    public static boolean G(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(a.b(view));
        } else {
            tag = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        return bool != null && bool.booleanValue();
    }

    @Deprecated
    public static boolean H(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean I(View view) {
        return view.isLaidOut();
    }

    public static boolean J(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean K(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(a.c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        return bool != null && bool.booleanValue();
    }

    public static void L(int i11, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = j(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z11) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z11 ? 32 : NewHope.SENDB_BYTES);
                accessibilityEventObtain.setContentChangeTypes(i11);
                if (z11) {
                    accessibilityEventObtain.getText().add(j(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i11 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i11);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i11);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(j(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void M(View view, int i11) {
        view.offsetLeftAndRight(i11);
    }

    public static void N(View view, int i11) {
        view.offsetTopAndBottom(i11);
    }

    public static WindowInsetsCompat O(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsU = windowInsetsCompat.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsU);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsU)) {
                return WindowInsetsCompat.w(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void P(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.Y0());
    }

    @Deprecated
    public static boolean Q(View view, int i11, Bundle bundle) {
        return view.performAccessibilityAction(i11, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R(android.view.View r5, int r6) {
        /*
            r0 = 0
            r1 = -1
            if (r6 != r1) goto L6
        L4:
            r4 = r1
            goto L3f
        L6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            r4 = 6
            if (r2 >= r3) goto L16
            switch(r6) {
                case 21: goto L15;
                case 22: goto L13;
                case 23: goto L15;
                case 24: goto L13;
                case 25: goto L11;
                case 26: goto L15;
                case 27: goto L13;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r6 = r0
            goto L16
        L13:
            r6 = 4
            goto L16
        L15:
            r6 = r4
        L16:
            r3 = 30
            if (r2 >= r3) goto L2f
            r3 = 12
            if (r6 == r3) goto L2d
            r3 = 13
            if (r6 == r3) goto L30
            r3 = 16
            if (r6 == r3) goto L2d
            r3 = 17
            if (r6 == r3) goto L2b
            goto L2f
        L2b:
            r4 = r0
            goto L30
        L2d:
            r4 = 1
            goto L30
        L2f:
            r4 = r6
        L30:
            r6 = 27
            if (r2 >= r6) goto L3f
            r6 = 7
            if (r4 == r6) goto L4
            r6 = 8
            if (r4 == r6) goto L4
            r6 = 9
            if (r4 == r6) goto L4
        L3f:
            if (r4 != r1) goto L42
            return r0
        L42:
            boolean r5 = r5.performHapticFeedback(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewCompat.R(android.view.View, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g S(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return x0.b(view, gVar);
        }
        h hVar = (h) view.getTag(R.id.tag_on_receive_content_listener);
        x xVar = f2735e;
        if (hVar == null) {
            if (view instanceof x) {
                xVar = (x) view;
            }
            return xVar.onReceiveContent(gVar);
        }
        g gVarA = h.a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (view instanceof x) {
            xVar = (x) view;
        }
        return xVar.onReceiveContent(gVarA);
    }

    @Deprecated
    public static void T(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void U(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void V(View view, Runnable runnable, long j9) {
        view.postOnAnimationDelayed(runnable, j9);
    }

    public static void W(View view, int i11) {
        X(i11, view);
        L(0, view);
    }

    public static void X(int i11, View view) {
        ArrayList arrayListK = k(view);
        for (int i12 = 0; i12 < arrayListK.size(); i12++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListK.get(i12)).b() == i11) {
                arrayListK.remove(i12);
                return;
            }
        }
    }

    public static void Y(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            W(view, accessibilityActionCompat.b());
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompatA = accessibilityActionCompat.a(charSequence, accessibilityViewCommand);
        h7.b bVarH = h(view);
        if (bVarH == null) {
            bVarH = new h7.b();
        }
        b0(view, bVarH);
        X(accessibilityActionCompatA.b(), view);
        k(view).add(accessibilityActionCompatA);
        L(0, view);
    }

    public static void Z(View view) {
        view.requestApplyInsets();
    }

    public static int a(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int iB;
        ArrayList arrayListK = k(view);
        int i11 = 0;
        while (true) {
            if (i11 >= arrayListK.size()) {
                int i12 = -1;
                for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                    int i14 = f2734d[i13];
                    boolean z11 = true;
                    for (int i15 = 0; i15 < arrayListK.size(); i15++) {
                        z11 &= ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListK.get(i15)).b() != i14;
                    }
                    if (z11) {
                        i12 = i14;
                    }
                }
                iB = i12;
            } else {
                if (TextUtils.equals(charSequence, ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListK.get(i11)).c())) {
                    iB = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListK.get(i11)).b();
                    break;
                }
                i11++;
            }
        }
        if (iB != -1) {
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iB, charSequence, accessibilityViewCommand);
            h7.b bVarH = h(view);
            if (bVarH == null) {
                bVarH = new h7.b();
            }
            b0(view, bVarH);
            X(accessibilityActionCompat.b(), view);
            k(view).add(accessibilityActionCompat);
            L(0, view);
        }
        return iB;
    }

    public static void a0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            v0.b(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    public static void b(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void b0(View view, h7.b bVar) {
        if (bVar == null && (i(view) instanceof h7.a)) {
            bVar = new h7.b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.getBridge());
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat c(View view) {
        if (f2731a == null) {
            f2731a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f2731a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f2731a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static void c0(View view, boolean z11) {
        new m0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(view, Boolean.valueOf(z11));
    }

    public static WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return r0.b(view, windowInsetsCompat, rect);
    }

    public static void d0(View view, CharSequence charSequence) {
        new m0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        n0 n0Var = f2736f;
        if (charSequence == null) {
            n0Var.f21593a.remove(view);
            view.removeOnAttachStateChangeListener(n0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(n0Var);
        } else {
            n0Var.f21593a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(n0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(n0Var);
            }
        }
    }

    public static WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsU = windowInsetsCompat.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? w0.a(view, windowInsetsU) : p0.a(view, windowInsetsU);
            if (!windowInsetsA.equals(windowInsetsU)) {
                return WindowInsetsCompat.w(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void e0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = b.f2772d;
        b bVar = (b) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (bVar == null) {
            bVar = new b();
            bVar.f2773a = null;
            bVar.f2774b = null;
            bVar.f2775c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, bVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = bVar.f2773a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = b.f2772d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (bVar.f2773a == null) {
                            bVar.f2773a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = b.f2772d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                bVar.f2773a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    bVar.f2773a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = bVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (bVar.f2774b == null) {
                    bVar.f2774b = new SparseArray();
                }
                bVar.f2774b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static void f0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    @Deprecated
    public static int g() {
        return View.generateViewId();
    }

    public static void g0(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static h7.b h(View view) {
        View.AccessibilityDelegate accessibilityDelegateI = i(view);
        if (accessibilityDelegateI == null) {
            return null;
        }
        return accessibilityDelegateI instanceof h7.a ? ((h7.a) accessibilityDelegateI).f21510a : new h7.b(accessibilityDelegateI);
    }

    public static void h0(View view, float f11) {
        view.setElevation(f11);
    }

    public static View.AccessibilityDelegate i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return v0.a(view);
        }
        if (f2733c) {
            return null;
        }
        if (f2732b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2732b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2733c = true;
                return null;
            }
        }
        try {
            Object obj = f2732b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2733c = true;
            return null;
        }
    }

    @Deprecated
    public static void i0(View view, int i11) {
        view.setImportantForAccessibility(i11);
    }

    public static CharSequence j(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = a.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void j0(View view, int i11) {
        u0.b(view, i11);
    }

    public static ArrayList k(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void k0(View view, w wVar) {
        r0.c(view, wVar);
    }

    public static ColorStateList l(View view) {
        return view.getBackgroundTintList();
    }

    public static void l0(View view, z zVar) {
        t0.a(view, (PointerIcon) (zVar != null ? zVar.a() : null));
    }

    public static PorterDuff.Mode m(View view) {
        return view.getBackgroundTintMode();
    }

    public static void m0(View view, boolean z11) {
        new m0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(view, Boolean.valueOf(z11));
    }

    @Deprecated
    public static Display n(View view) {
        return view.getDisplay();
    }

    public static void n0(View view, int i11, int i12) {
        view.setScrollIndicators(i11, i12);
    }

    public static float o(View view) {
        return view.getElevation();
    }

    public static void o0(View view, CharSequence charSequence) {
        new m0(R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(view, charSequence);
    }

    @Deprecated
    public static boolean p(View view) {
        return view.getFitsSystemWindows();
    }

    public static void p0(View view, String str) {
        view.setTransitionName(str);
    }

    @Deprecated
    public static int q(View view) {
        return view.getImportantForAccessibility();
    }

    public static void q0(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            m1.h(view, windowInsetsAnimationCompat$Callback);
            return;
        }
        PathInterpolator pathInterpolator = j1.f21568e;
        View.OnApplyWindowInsetsListener i1Var = windowInsetsAnimationCompat$Callback != null ? new i1(view, windowInsetsAnimationCompat$Callback) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, i1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(i1Var);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int r(View view) {
        return u0.a(view);
    }

    public static void r0(View view) {
        view.stopNestedScroll();
    }

    @Deprecated
    public static int s(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static int t(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int u(View view) {
        return view.getMinimumWidth();
    }

    public static String[] v(View view) {
        return Build.VERSION.SDK_INT >= 31 ? x0.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int w(View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    public static int x(View view) {
        return view.getPaddingStart();
    }

    public static WindowInsetsCompat y(View view) {
        return s0.a(view);
    }

    public static CharSequence z(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = w0.b(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }
}
