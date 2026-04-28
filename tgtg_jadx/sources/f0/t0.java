package f0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements e0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCharacteristics f16905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f16906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f16907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayMap f16908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayMap f16909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f16911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16912i;

    public t0(String str, CameraCharacteristics cameraCharacteristics, k1 k1Var, kotlin.collections.o0 o0Var, Set set) {
        str.getClass();
        o0Var.getClass();
        set.getClass();
        this.f16904a = str;
        this.f16905b = cameraCharacteristics;
        this.f16906c = k1Var;
        this.f16907d = set;
        this.f16908e = new ArrayMap();
        this.f16909f = new ArrayMap();
        u70.m mVar = u70.m.PUBLICATION;
        final int i11 = 0;
        this.f16910g = u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i12 = 1;
        u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i13 = 2;
        u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i14 = 3;
        u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i15 = 4;
        this.f16911h = u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i16 = 5;
        u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i17 = 6;
        u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
        final int i18 = 7;
        this.f16912i = u70.l.a(mVar, new Function0(this) { // from class: f0.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f16877b;

            {
                this.f16877b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        t0 t0Var = this.f16877b;
                        String str2 = t0Var.f16904a;
                        try {
                            try {
                                Trace.beginSection("Camera-" + ((Object) e0.s.b(str2)) + "#supportedExtensions");
                                k1 k1Var2 = t0Var.f16906c;
                                str2.getClass();
                                Object objV0 = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.v0(y.b(k1Var2.e(str2))) : kotlin.collections.p0.f26531a;
                                Trace.endSection();
                                return objV0;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (AssertionError e5) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) e0.s.b(str2)), e5);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 1:
                        t0 t0Var2 = this.f16877b;
                        String str3 = t0Var2.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str3)) + "#keys");
                                List<CameraCharacteristics.Key<?>> keys = t0Var2.f16905b.getKeys();
                                if (keys == null) {
                                    keys = kotlin.collections.n0.f26529a;
                                }
                                Set setV0 = CollectionsKt.v0(keys);
                                Trace.endSection();
                                return setV0;
                            } finally {
                            }
                        } catch (AssertionError e11) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) e0.s.b(str3)) + '}', e11);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 2:
                        t0 t0Var3 = this.f16877b;
                        String str4 = t0Var3.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str4)) + "#availableCaptureRequestKeys");
                                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = t0Var3.f16905b.getAvailableCaptureRequestKeys();
                                if (availableCaptureRequestKeys == null) {
                                    availableCaptureRequestKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV02 = CollectionsKt.v0(availableCaptureRequestKeys);
                                Trace.endSection();
                                return setV02;
                            } finally {
                            }
                        } catch (AssertionError e12) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) e0.s.b(str4)), e12);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 3:
                        t0 t0Var4 = this.f16877b;
                        String str5 = t0Var4.f16904a;
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str5)) + "#availableCaptureResultKeys");
                                List<CaptureResult.Key<?>> availableCaptureResultKeys = t0Var4.f16905b.getAvailableCaptureResultKeys();
                                if (availableCaptureResultKeys == null) {
                                    availableCaptureResultKeys = kotlin.collections.n0.f26529a;
                                }
                                Set setV03 = CollectionsKt.v0(availableCaptureResultKeys);
                                Trace.endSection();
                                return setV03;
                            } finally {
                            }
                        } catch (AssertionError e13) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) e0.s.b(str5)), e13);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 4:
                        t0 t0Var5 = this.f16877b;
                        String str6 = t0Var5.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection(((Object) e0.s.b(str6)) + "#physicalCameraIds");
                                Set setE = u.e(t0Var5.f16905b);
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) e0.s.b(str6)) + ": " + setE);
                                Set<String> set2 = setE;
                                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(set2, 10));
                                for (String str7 : set2) {
                                    e0.s.a(str7);
                                    arrayList.add(new e0.s(str7));
                                }
                                Set setV04 = CollectionsKt.v0(arrayList);
                                Trace.endSection();
                                return setV04;
                            } finally {
                            }
                        } catch (AssertionError e14) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e14);
                            return kotlin.collections.p0.f26531a;
                        } catch (NullPointerException e15) {
                            Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) e0.s.b(str6)), e15);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 5:
                        t0 t0Var6 = this.f16877b;
                        String str8 = t0Var6.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                Iterable iterableB = u.b(t0Var6.f16905b);
                                if (iterableB == null) {
                                    iterableB = kotlin.collections.n0.f26529a;
                                }
                                Set setV05 = CollectionsKt.v0(iterableB);
                                Trace.endSection();
                                return setV05;
                            } finally {
                            }
                        } catch (AssertionError e16) {
                            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e16);
                            return kotlin.collections.p0.f26531a;
                        }
                    case 6:
                        t0 t0Var7 = this.f16877b;
                        String str9 = t0Var7.f16904a;
                        if (Build.VERSION.SDK_INT < 35) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                Iterable iterableA = c0.a(t0Var7.f16905b);
                                if (iterableA == null) {
                                    iterableA = kotlin.collections.n0.f26529a;
                                }
                                Set setV06 = CollectionsKt.v0(iterableA);
                                Trace.endSection();
                                return setV06;
                            } finally {
                            }
                        } catch (AssertionError e17) {
                            Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e17);
                            return kotlin.collections.p0.f26531a;
                        }
                    default:
                        t0 t0Var8 = this.f16877b;
                        String str10 = t0Var8.f16904a;
                        if (Build.VERSION.SDK_INT < 28) {
                            return kotlin.collections.p0.f26531a;
                        }
                        try {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                Iterable iterableC = u.c(t0Var8.f16905b);
                                if (iterableC == null) {
                                    iterableC = kotlin.collections.n0.f26529a;
                                }
                                Set setV07 = CollectionsKt.v0(iterableC);
                                Trace.endSection();
                                return setV07;
                            } finally {
                            }
                        } catch (AssertionError e18) {
                            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e18);
                            return kotlin.collections.p0.f26531a;
                        }
                }
            }
        });
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        key.getClass();
        if (this.f16907d.contains(key)) {
            try {
                return this.f16905b.get(key);
            } catch (AssertionError unused) {
                a40.d0.q("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
                return null;
            }
        }
        synchronized (this.f16908e) {
            obj = this.f16908e.get(key);
        }
        if (obj != null) {
            return obj;
        }
        try {
            Object obj2 = this.f16905b.get(key);
            if (obj2 == null) {
                return obj2;
            }
            synchronized (this.f16908e) {
                this.f16908e.put(key, obj2);
            }
            return obj2;
        } catch (AssertionError unused2) {
            a40.d0.q("Failed to get characteristic for ", key, ": Framework throw an AssertionError");
            return null;
        }
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (r8.k.D(kClass, CameraCharacteristics.class, kClass)) {
            return this.f16905b;
        }
        return null;
    }
}
