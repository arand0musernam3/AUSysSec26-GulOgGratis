package lx;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import ax.a0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import tx.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f28413d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f28410a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f28411b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f28412c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f28414e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136 A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:34:0x00d7, B:37:0x00de, B:43:0x00ec, B:49:0x00fc, B:55:0x010b, B:63:0x0128, B:67:0x0136, B:62:0x0124, B:40:0x00e3, B:44:0x00f3, B:72:0x0159, B:73:0x015e, B:76:0x016e, B:78:0x0175, B:79:0x017d, B:82:0x0196, B:84:0x019e, B:85:0x01a6, B:87:0x01ae, B:96:0x01ed, B:90:0x01c4, B:92:0x01cc, B:93:0x01d4, B:95:0x01dc, B:97:0x01f3, B:98:0x01f9, B:100:0x01ff, B:102:0x0207, B:106:0x021f, B:107:0x0224, B:109:0x022a, B:111:0x0246, B:114:0x024e, B:116:0x0254, B:117:0x025c, B:118:0x0264, B:120:0x026a, B:121:0x0272, B:103:0x0212, B:59:0x011e), top: B:136:0x00d7, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized android.os.Bundle c(java.util.List r28, long r29, boolean r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.q.c(java.util.List, long, boolean, java.util.List):android.os.Bundle");
    }

    public static final void d() {
        if (yx.a.f46339a.contains(q.class)) {
            return;
        }
        try {
            if (f28414e.get()) {
                s sVarA = f28410a.a();
                int i11 = p.$EnumSwitchMapping$0[sVarA.ordinal()];
                if (i11 == 2) {
                    d.b(s.V1);
                    return;
                }
                if (i11 != 3) {
                    if (i11 == 4 && w.b(tx.t.IapLoggingLib5To7)) {
                        f.b(a0.a(), sVarA);
                        return;
                    }
                    return;
                }
                if (w.b(tx.t.IapLoggingLib2)) {
                    f.b(a0.a(), sVarA);
                } else {
                    d.b(s.V2_V4);
                }
            }
        } catch (Throwable th2) {
            yx.a.a(q.class, th2);
        }
    }

    public final s a() {
        Set set = yx.a.f46339a;
        try {
            if (set.contains(this)) {
                return null;
            }
            try {
                Context contextA = a0.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                applicationInfo.getClass();
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return s.NONE;
                }
                List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return s.V5_V7;
                }
                String strConcat = "GPBL.".concat(string);
                if (!set.contains(q.class)) {
                    try {
                        f28413d = strConcat;
                    } catch (Throwable th2) {
                        yx.a.a(q.class, th2);
                    }
                }
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                if (intOrNull == null) {
                    return s.V5_V7;
                }
                int iIntValue = intOrNull.intValue();
                return iIntValue == 1 ? s.V1 : iIntValue < 5 ? s.V2_V4 : s.V5_V7;
            } catch (Exception unused) {
                return s.V5_V7;
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return null;
        }
    }

    public final String b(Bundle bundle, bx.s sVar, Bundle bundle2, bx.s sVar2, boolean z11, boolean z12) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                List<Pair> listC = z12 ? m.c(z11) : m.b(z11);
                if (listC != null) {
                    for (Pair pair : listC) {
                        Map map = bx.s.f6750b;
                        Object objU = p30.b.u(bx.t.IAPParameters, (String) pair.f26485a, bundle, sVar);
                        String str = objU instanceof String ? (String) objU : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) pair.f26486b) {
                                Map map2 = bx.s.f6750b;
                                Object objU2 = p30.b.u(bx.t.IAPParameters, str2, bundle2, sVar2);
                                String str3 = objU2 instanceof String ? (String) objU2 : null;
                                if (str3 != null && str3.length() != 0 && Intrinsics.areEqual(str3, str)) {
                                    return z11 ? (String) pair.f26485a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
