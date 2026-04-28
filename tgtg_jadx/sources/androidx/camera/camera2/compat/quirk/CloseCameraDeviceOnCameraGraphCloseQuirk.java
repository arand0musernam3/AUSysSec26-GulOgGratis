package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import s0.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Ls0/n1;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
@SourceDebugExtension({"SMAP\nCloseCameraDeviceOnCameraGraphCloseQuirk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseCameraDeviceOnCameraGraphCloseQuirk.kt\nandroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1761#2,3:114\n*S KotlinDebug\n*F\n+ 1 CloseCameraDeviceOnCameraGraphCloseQuirk.kt\nandroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk\n*L\n104#1:114,3\n*E\n"})
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f2176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f2177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f2179e;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    static {
        /*
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.f2175a = r1
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.f2176b = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Xiaomi"
            boolean r2 = r0.equalsIgnoreCase(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2c
            java.lang.String r2 = android.os.Build.BRAND
            r2.getClass()
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L4a
        L2c:
            java.lang.String r1 = "aurora"
            java.lang.String r2 = "houji"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = android.os.Build.DEVICE
            r2.getClass()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r5)
            r2.getClass()
            boolean r1 = kotlin.collections.y.v(r1, r2)
            if (r1 == 0) goto L4a
            r1 = r4
            goto L4b
        L4a:
            r1 = r3
        L4b:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.f2177c = r1
            r0.getClass()
            java.lang.String r1 = "Sony"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L63
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L97
        L63:
            java.lang.String r0 = "SO"
            java.lang.String r1 = "A301SO"
            java.lang.String r2 = "XQ-DQ"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = kotlin.collections.d0.h(r0)
            if (r0 == 0) goto L7a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7a
            goto L97
        L7a:
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.DEVICE
            r2.getClass()
            boolean r1 = kotlin.text.y.p(r2, r1, r4)
            if (r1 == 0) goto L7e
            r0 = r4
            goto L98
        L97:
            r0 = r3
        L98:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.f2178d = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lbd
        Lb2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lbd
            r1 = 34
            if (r0 > r1) goto Lbd
            r3 = r4
        Lbd:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.f2179e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.<clinit>():void");
    }
}
