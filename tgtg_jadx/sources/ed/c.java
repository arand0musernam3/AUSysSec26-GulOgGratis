package ed;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.vectordrawable.graphics.drawable.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f15920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f15921b;

    public c(Function0 function0, Function0 function02) {
        this.f15920a = function0;
        this.f15921b = function02;
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.f15921b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.f15920a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
