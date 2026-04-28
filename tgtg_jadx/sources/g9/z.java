package g9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.text.StringsKt;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20256f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9.h f20258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f20259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f20260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f20261e;

    static {
        new LinkedHashMap();
    }

    public z(t0 t0Var) {
        t0Var.getClass();
        LinkedHashMap linkedHashMap = u0.f20222b;
        this.f20257a = zz.f.t(t0Var.getClass());
        this.f20258b = new l9.h(this);
        this.f20261e = new l1(0);
    }

    public final void b(v vVar) {
        vVar.getClass();
        l9.h hVar = this.f20258b;
        hVar.getClass();
        ArrayList arrayListF = w0.e.F(hVar.f27562d, new l9.g(vVar, 0));
        if (arrayListF.isEmpty()) {
            hVar.f27561c.add(vVar);
        } else {
            e40.a.l("Deep link ", vVar.f20230a, " can't be used to open destination ", hVar.f27559a, ".\nFollowing required arguments are missing: ", arrayListF);
        }
    }

    public final Bundle d(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f20258b.f27562d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        kotlin.collections.o0.f26530a.getClass();
        Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            j jVar = (j) entry.getValue();
            jVar.getClass();
            str.getClass();
            if (jVar.f20151c && (obj = jVar.f20153e) != null) {
                jVar.f20149a.e(bundleX, str, obj);
            }
        }
        if (bundle != null) {
            bundleX.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                j jVar2 = (j) entry2.getValue();
                boolean z11 = jVar2.f20152d;
                q0 q0Var = jVar2.f20149a;
                if (!z11) {
                    str2.getClass();
                    if (jVar2.f20150b || !bundleX.containsKey(str2) || !w.b.T(bundleX, str2)) {
                        try {
                            q0Var.a(bundleX, str2);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    e40.a.m(e0.f.s("Wrong argument type for '", str2, "' in argument savedState. "), q0Var.b(), " expected.");
                    return null;
                }
            }
        }
        return bundleX;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] e(g9.z r7) {
        /*
            r6 = this;
            kotlin.collections.t r0 = new kotlin.collections.t
            r0.<init>()
            r1 = r6
        L6:
            l9.h r2 = r1.f20258b
            g9.b0 r3 = r1.f20259c
            if (r7 == 0) goto Lf
            g9.b0 r4 = r7.f20259c
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L25
            g9.b0 r4 = r7.f20259c
            r4.getClass()
            int r5 = r2.f27563e
            i0.w r4 = r4.f20106g
            g9.z r4 = r4.u(r5)
            if (r4 != r1) goto L25
            r0.addFirst(r1)
            goto L3b
        L25:
            if (r3 == 0) goto L2f
            i0.w r4 = r3.f20106g
            int r4 = r4.f22745b
            int r2 = r2.f27563e
            if (r4 == r2) goto L32
        L2f:
            r0.addFirst(r1)
        L32:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            if (r3 != 0) goto L6b
        L3b:
            java.util.List r7 = kotlin.collections.CollectionsKt.r0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.e0.o(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L4e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r7.next()
            g9.z r1 = (g9.z) r1
            l9.h r1 = r1.f20258b
            int r1 = r1.f27563e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4e
        L66:
            int[] r7 = kotlin.collections.CollectionsKt.q0(r0)
            return r7
        L6b:
            r1 = r3
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.z.e(g9.z):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.z.equals(java.lang.Object):boolean");
    }

    public final h g(int i11) {
        l1 l1Var = this.f20261e;
        h hVar = l1Var.f() == 0 ? null : (h) l1Var.b(i11);
        if (hVar != null) {
            return hVar;
        }
        b0 b0Var = this.f20259c;
        if (b0Var != null) {
            return b0Var.g(i11);
        }
        return null;
    }

    public final Map h() {
        return x0.k(this.f20258b.f27562d);
    }

    public int hashCode() {
        l9.h hVar = this.f20258b;
        int i11 = hVar.f27563e * 31;
        String str = hVar.f27564f;
        int iHashCode = i11 + (str != null ? str.hashCode() : 0);
        for (v vVar : hVar.f27561c) {
            int i12 = iHashCode * 31;
            String str2 = vVar.f20230a;
            int iHashCode2 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = vVar.f20231b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = vVar.f20232c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        l1 l1Var = this.f20261e;
        l1Var.getClass();
        int i13 = 0;
        while (true) {
            if (!(i13 < l1Var.f())) {
                break;
            }
            int i14 = i13 + 1;
            h hVar2 = (h) l1Var.h(i13);
            int i15 = ((iHashCode * 31) + hVar2.f20121a) * 31;
            i0 i0Var = hVar2.f20122b;
            iHashCode = i15 + (i0Var != null ? i0Var.hashCode() : 0);
            Bundle bundle = hVar2.f20123c;
            if (bundle != null) {
                iHashCode = wd.a.n(bundle) + (iHashCode * 31);
            }
            i13 = i14;
        }
        for (String str5 : h().keySet()) {
            int iB = w2.l1.b(iHashCode * 31, 31, str5);
            Object obj = h().get(str5);
            iHashCode = iB + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g9.y i(a8.h r25) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.z.i(a8.h):g9.y");
    }

    public void j(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        attributeSet.getClass();
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, h9.a.f21670e);
        typedArrayObtainAttributes.getClass();
        m(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            l9.h hVar = this.f20258b;
            hVar.f27563e = resourceId;
            hVar.f27560b = null;
            int i11 = hVar.f27563e;
            if (i11 <= 16777215) {
                strValueOf = String.valueOf(i11);
            } else {
                try {
                    strValueOf = context.getResources().getResourceName(i11);
                    strValueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    strValueOf = String.valueOf(i11);
                }
            }
            hVar.f27560b = strValueOf;
        }
        this.f20260d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public final void l(int i11, h hVar) {
        hVar.getClass();
        if (!(this instanceof a)) {
            if (i11 != 0) {
                this.f20261e.d(i11, hVar);
                return;
            } else {
                i4.a.f("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i11 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void m(String str) {
        l9.h hVar = this.f20258b;
        if (str == null) {
            hVar.f27563e = 0;
            hVar.f27560b = null;
        } else {
            hVar.getClass();
            if (StringsKt.H(str)) {
                i4.a.f("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            ArrayList arrayListF = w0.e.F(hVar.f27562d, new l9.g(new v(strConcat, null, null), 1));
            if (!arrayListF.isEmpty()) {
                StringBuilder sbS = e0.f.s("Cannot set route \"", str, "\" for destination ");
                sbS.append(hVar.f27559a);
                sbS.append(". Following required arguments are missing: ");
                sbS.append(arrayListF);
                throw new IllegalArgumentException(sbS.toString().toString());
            }
            hVar.f27565g = u70.l.b(new dw.d(strConcat, 8));
            hVar.f27563e = strConcat.hashCode();
            hVar.f27560b = null;
        }
        hVar.f27564f = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        l9.h hVar = this.f20258b;
        String str = hVar.f27560b;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(hVar.f27563e));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = hVar.f27564f;
        if (str2 != null && !StringsKt.H(str2)) {
            sb2.append(" route=");
            sb2.append(hVar.f27564f);
        }
        if (this.f20260d != null) {
            sb2.append(" label=");
            sb2.append(this.f20260d);
        }
        return sb2.toString();
    }
}
