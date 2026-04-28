package qa;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends y {
    public static final String[] H = {"android:visibility:visibility", "android:visibility:parent"};
    public int G;

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36721c);
        int iD = w6.a.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != 0) {
            W(iD);
        }
    }

    public static void S(h0 h0Var) {
        View view = h0Var.f36674b;
        int visibility = view.getVisibility();
        HashMap map = h0Var.f36673a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qa.p0 T(qa.h0 r8, qa.h0 r9) {
        /*
            qa.p0 r0 = new qa.p0
            r0.<init>()
            r1 = 0
            r0.f36712a = r1
            r0.f36713b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f36673a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f36714c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f36716e = r6
            goto L33
        L2f:
            r0.f36714c = r3
            r0.f36716e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f36673a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f36715d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f36717f = r2
            goto L56
        L52:
            r0.f36715d = r3
            r0.f36717f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f36714c
            int r9 = r0.f36715d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f36716e
            android.view.ViewGroup r4 = r0.f36717f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f36713b = r1
            r0.f36712a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f36713b = r2
            r0.f36712a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f36717f
            if (r8 != 0) goto L81
            r0.f36713b = r1
            r0.f36712a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f36716e
            if (r8 != 0) goto L9f
            r0.f36713b = r2
            r0.f36712a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f36715d
            if (r8 != 0) goto L95
            r0.f36713b = r2
            r0.f36712a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f36714c
            if (r8 != 0) goto L9f
            r0.f36713b = r1
            r0.f36712a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.q0.T(qa.h0, qa.h0):qa.p0");
    }

    public abstract ObjectAnimator U(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2);

    public abstract ObjectAnimator V(ViewGroup viewGroup, View view, h0 h0Var, h0 h0Var2);

    public final void W(int i11) {
        if ((i11 & (-4)) == 0) {
            this.G = i11;
        } else {
            i4.a.f("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // qa.y
    public void d(h0 h0Var) {
        S(h0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (T(s(r5, false), w(r5, false)).f36712a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    @Override // qa.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(android.view.ViewGroup r25, qa.h0 r26, qa.h0 r27) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.q0.m(android.view.ViewGroup, qa.h0, qa.h0):android.animation.Animator");
    }

    @Override // qa.y
    public final String[] v() {
        return H;
    }

    @Override // qa.y
    public final boolean z(h0 h0Var, h0 h0Var2) {
        if (h0Var == null && h0Var2 == null) {
            return false;
        }
        if (h0Var != null && h0Var2 != null && h0Var2.f36673a.containsKey("android:visibility:visibility") != h0Var.f36673a.containsKey("android:visibility:visibility")) {
            return false;
        }
        p0 p0VarT = T(h0Var, h0Var2);
        if (p0VarT.f36712a) {
            return p0VarT.f36714c == 0 || p0VarT.f36715d == 0;
        }
        return false;
    }

    public q0() {
        this.G = 3;
    }
}
