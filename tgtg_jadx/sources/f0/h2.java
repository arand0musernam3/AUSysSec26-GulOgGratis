package f0;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f16710a = new h2();

    /* JADX WARN: Multi-variable type inference failed */
    public static r a(Surface surface, Integer num, e0.e1 e1Var, e0.d1 d1Var, e0.c1 c1Var, e0.f1 f1Var, List list, Size size, boolean z11, int i11, String str, int i12) {
        Class cls;
        OutputConfiguration outputConfiguration;
        Surface outputConfiguration2 = surface;
        Integer num2 = (i12 & 2) != 0 ? null : num;
        int i13 = i12 & 4;
        e0.e1 e1Var2 = e0.e1.f15331a;
        e0.e1 e1Var3 = i13 != 0 ? e1Var2 : e1Var;
        boolean z12 = (i12 & 512) != 0 ? false : z11;
        int i14 = (i12 & 1024) != 0 ? -1 : i11;
        e1Var3.getClass();
        if (!Intrinsics.areEqual(e1Var3, e0.e1.f15334d) || Build.VERSION.SDK_INT < 35) {
            if (Intrinsics.areEqual(e1Var3, e1Var2)) {
                if (outputConfiguration2 == 0) {
                    com.braze.h2.b("non-null surface!");
                    return null;
                }
                try {
                    outputConfiguration2 = i14 != -1 ? new OutputConfiguration(i14, outputConfiguration2) : new OutputConfiguration(outputConfiguration2);
                    outputConfiguration = outputConfiguration2;
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to create an OutputConfiguration for " + outputConfiguration2 + '!', th2);
                    return null;
                }
            } else {
                if (size == null) {
                    com.braze.h2.b("Size must defined when creating a deferred OutputConfiguration.");
                    return null;
                }
                if (Intrinsics.areEqual(e1Var3, e0.e1.f15333c)) {
                    cls = SurfaceTexture.class;
                } else if (Intrinsics.areEqual(e1Var3, e0.e1.f15332b)) {
                    cls = SurfaceHolder.class;
                } else if (Intrinsics.areEqual(e1Var3, e0.e1.f15335e)) {
                    if (Build.VERSION.SDK_INT < 35) {
                        com.braze.h2.b("OutputType.MEDIA_CODEC requires API 35 or higher.");
                        return null;
                    }
                    cls = MediaCodec.class;
                } else {
                    if (!Intrinsics.areEqual(e1Var3, e0.e1.f15336f)) {
                        j4.d.e(e1Var3, "Unsupported OutputType: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 35) {
                        com.braze.h2.b("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                        return null;
                    }
                    cls = MediaRecorder.class;
                }
                outputConfiguration = new OutputConfiguration(size, cls);
            }
        } else {
            if (num2 == null) {
                com.braze.h2.b("Required value was null.");
                return null;
            }
            if (size == null) {
                com.braze.h2.b("Required value was null.");
                return null;
            }
            outputConfiguration = b0.a(num2.intValue(), size);
        }
        if (z12) {
            outputConfiguration.enableSurfaceSharing();
        }
        if (str != null) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 28) {
                e40.a.g(r8.k.h(i15, "physicalCameraId is not supported on API ", " (requires API 28)"));
                return null;
            }
            if (i15 >= 28) {
                u.j(outputConfiguration, str);
            }
        }
        if (d1Var != null) {
            int i16 = d1Var.f15328a;
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 33) {
                z.d(outputConfiguration, i16);
            } else if (i16 != 0) {
                StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i17, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbK.append((Object) e0.d1.a(i16));
                Log.w("CXCP", sbK.toString());
            }
        }
        if (c1Var != null) {
            long j9 = c1Var.f15324a;
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 33) {
                z.c(outputConfiguration, j9);
            } else if (j9 != 1) {
                StringBuilder sbK2 = org.bouncycastle.jcajce.provider.asymmetric.a.k(i18, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbK2.append((Object) e0.c1.a(j9));
                Log.w("CXCP", sbK2.toString());
            }
        }
        if (f1Var != null && Build.VERSION.SDK_INT >= 33) {
            z.e(outputConfiguration, f1Var.f15337a);
        }
        if (!list.isEmpty()) {
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw e0.f.e(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i19 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            u.d(outputConfiguration);
        }
        return new r(outputConfiguration);
    }

    public static boolean b(int i11, boolean z11) {
        int i12;
        if (!z11 || 29 > (i12 = Build.VERSION.SDK_INT) || i12 >= 33) {
            return false;
        }
        return i11 == 1 || i11 == 2 || i11 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[PHI: r10
      0x0021: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:18:0x0031, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int r5, int r6, long r7, boolean r9, boolean r10, h0.d r11) {
        /*
            boolean r10 = b(r5, r10)
            java.lang.String r0 = "CXCP"
            if (r10 == 0) goto Ld
            java.lang.String r1 = "shouldRetry: Active resume mode is activated"
            android.util.Log.d(r0, r1)
        Ld:
            r1 = -1
            if (r10 != 0) goto L23
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            if (r11 != 0) goto L18
            goto L33
        L18:
            long r10 = r11.f20962a
            int r4 = h0.d.a(r2, r10)
            if (r4 != r1) goto L21
            goto L33
        L21:
            r2 = r10
            goto L33
        L23:
            r2 = 1800000000000(0x1a3185c5000, double:8.89318162514E-312)
            if (r11 != 0) goto L2b
            goto L33
        L2b:
            long r10 = r11.f20962a
            int r4 = h0.d.a(r2, r10)
            if (r4 != r1) goto L21
        L33:
            int r7 = h0.d.a(r7, r2)
            r8 = 0
            if (r7 <= 0) goto L3b
            goto L7b
        L3b:
            r7 = 1
            if (r5 != 0) goto L41
            if (r6 > r7) goto L7b
            goto L7a
        L41:
            if (r5 != r7) goto L4c
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r5 >= r9) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L4c:
            r10 = 2
            if (r5 != r10) goto L50
            goto L7a
        L50:
            r10 = 3
            if (r5 != r10) goto L58
            if (r9 == 0) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L58:
            r9 = 4
            if (r5 != r9) goto L5c
            goto L7a
        L5c:
            r9 = 5
            if (r5 != r9) goto L60
            goto L7a
        L60:
            r9 = 6
            if (r5 != r9) goto L64
            goto L7a
        L64:
            r9 = 7
            if (r5 != r9) goto L68
            goto L7a
        L68:
            r9 = 8
            if (r5 != r9) goto L6f
            if (r6 > r7) goto L7b
            goto L7a
        L6f:
            r9 = 10
            if (r5 != r9) goto L74
            goto L7b
        L74:
            r9 = 11
            if (r5 != r9) goto L7c
            if (r6 > r7) goto L7b
        L7a:
            return r7
        L7b:
            return r8
        L7c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected CameraError: "
            r5.<init>(r6)
            f0.h2 r6 = f0.x3.f16991i
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h2.c(int, int, long, boolean, boolean, h0.d):boolean");
    }
}
