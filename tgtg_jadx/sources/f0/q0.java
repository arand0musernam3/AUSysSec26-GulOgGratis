package f0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f16851b;

    public /* synthetic */ q0(r0 r0Var, int i11) {
        this.f16850a = i11;
        this.f16851b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16850a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                r0 r0Var = this.f16851b;
                sb2.append((Object) e0.s.b(r0Var.f16864a));
                sb2.append("#availableCaptureRequestKeys");
                String string = sb2.toString();
                try {
                    try {
                        Trace.beginSection(string);
                        Object objV0 = Build.VERSION.SDK_INT >= 33 ? CollectionsKt.v0(z.a(r0Var.f16866c, r0Var.f16865b)) : kotlin.collections.p0.f26531a;
                        if (objV0 == null) {
                            objV0 = kotlin.collections.p0.f26531a;
                            break;
                        }
                        Trace.endSection();
                        return objV0;
                    } finally {
                    }
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to get " + string + "! Caching {} and ignoring exception.", th2);
                    return kotlin.collections.p0.f26531a;
                }
            case 1:
                StringBuilder sb3 = new StringBuilder();
                r0 r0Var2 = this.f16851b;
                sb3.append((Object) e0.s.b(r0Var2.f16864a));
                sb3.append("#availableCaptureResultKeys");
                String string2 = sb3.toString();
                try {
                    try {
                        Trace.beginSection(string2);
                        Object objV02 = Build.VERSION.SDK_INT >= 33 ? CollectionsKt.v0(z.b(r0Var2.f16866c, r0Var2.f16865b)) : kotlin.collections.p0.f26531a;
                        if (objV02 == null) {
                            objV02 = kotlin.collections.p0.f26531a;
                            break;
                        }
                        Trace.endSection();
                        return objV02;
                    } catch (Throwable th3) {
                        Log.w("CXCP", "Failed to get " + string2 + "! Caching {} and ignoring exception.", th3);
                        return kotlin.collections.p0.f26531a;
                    }
                } finally {
                }
            case 2:
                StringBuilder sb4 = new StringBuilder();
                r0 r0Var3 = this.f16851b;
                sb4.append((Object) e0.s.b(r0Var3.f16864a));
                sb4.append("#isPostviewSupported");
                String string3 = sb4.toString();
                boolean z11 = false;
                try {
                    try {
                        Trace.beginSection(string3);
                        boolean zB = Build.VERSION.SDK_INT >= 34 ? a0.b(r0Var3.f16866c, r0Var3.f16865b) : false;
                        Trace.endSection();
                        z11 = zB;
                        break;
                    } catch (Throwable th4) {
                        Log.w("CXCP", "Failed to get " + string3 + "! Caching false and ignoring exception.", th4);
                    }
                    return Boolean.valueOf(z11);
                } finally {
                }
            default:
                StringBuilder sb5 = new StringBuilder();
                r0 r0Var4 = this.f16851b;
                sb5.append((Object) e0.s.b(r0Var4.f16864a));
                sb5.append("#isCaptureProgressSupported");
                String string4 = sb5.toString();
                boolean z12 = false;
                try {
                    try {
                        Trace.beginSection(string4);
                        boolean zA = Build.VERSION.SDK_INT >= 34 ? a0.a(r0Var4.f16866c, r0Var4.f16865b) : false;
                        Trace.endSection();
                        z12 = zA;
                    } finally {
                    }
                    break;
                } catch (Throwable th5) {
                    Log.w("CXCP", "Failed to get " + string4 + "! Caching false and ignoring exception.", th5);
                }
                return Boolean.valueOf(z12);
        }
    }
}
