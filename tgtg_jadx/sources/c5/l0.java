package c5;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f7283a = new l0();

    public final boolean onClearTranslation(View view) {
        j5.a aVar;
        Function0 function0;
        view.getClass();
        d4.e contentCaptureManager$ui = ((y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f14037f = d4.a.SHOW_ORIGINAL;
        q1.o oVarD = contentCaptureManager$ui.d();
        Object[] objArr = oVarD.f35800c;
        long[] jArr = oVarD.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        j5.n nVar = ((j5.u) objArr[(i11 << 3) + i13]).f24700a.f24696d;
                        if (j5.w.d(nVar, j5.x.D) != null && (aVar = (j5.a) j5.w.d(nVar, j5.m.f24669n)) != null && (function0 = (Function0) aVar.f24610b) != null) {
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onHideTranslation(View view) {
        j5.a aVar;
        Function1 function1;
        view.getClass();
        d4.e contentCaptureManager$ui = ((y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f14037f = d4.a.SHOW_ORIGINAL;
        q1.o oVarD = contentCaptureManager$ui.d();
        Object[] objArr = oVarD.f35800c;
        long[] jArr = oVarD.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        j5.n nVar = ((j5.u) objArr[(i11 << 3) + i13]).f24700a.f24696d;
                        if (Intrinsics.areEqual(j5.w.d(nVar, j5.x.D), Boolean.TRUE) && (aVar = (j5.a) j5.w.d(nVar, j5.m.f24668m)) != null && (function1 = (Function1) aVar.f24610b) != null) {
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onShowTranslation(View view) {
        j5.a aVar;
        Function1 function1;
        view.getClass();
        d4.e contentCaptureManager$ui = ((y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f14037f = d4.a.SHOW_TRANSLATED;
        q1.o oVarD = contentCaptureManager$ui.d();
        Object[] objArr = oVarD.f35800c;
        long[] jArr = oVarD.f35798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        j5.n nVar = ((j5.u) objArr[(i11 << 3) + i13]).f24700a.f24696d;
                        if (Intrinsics.areEqual(j5.w.d(nVar, j5.x.D), Boolean.FALSE) && (aVar = (j5.a) j5.w.d(nVar, j5.m.f24668m)) != null && (function1 = (Function1) aVar.f24610b) != null) {
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }
}
