package com.google.android.material.bottomsheet;

import android.view.View;
import uk.q;
import yi.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12358b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f12357a = i11;
        this.f12358b = obj;
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void b(View view) {
        switch (this.f12357a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = ((r) this.f12358b).f46021m;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.J(3);
                }
                break;
        }
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void c(int i11, View view) {
        BottomSheetBehavior bottomSheetBehavior;
        switch (this.f12357a) {
            case 0:
                if (i11 == 5) {
                    ((l) this.f12358b).cancel();
                }
                break;
            case 1:
                if (i11 == 5) {
                    m.access$100((m) this.f12358b);
                }
                break;
            case 2:
                q qVar = (q) this.f12358b;
                if (i11 == 4 || i11 == 6) {
                    qVar.q(false);
                    qVar.r(false);
                }
                break;
            default:
                if (i11 == 1 && (bottomSheetBehavior = ((r) this.f12358b).f46021m) != null) {
                    bottomSheetBehavior.J(3);
                    break;
                }
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
