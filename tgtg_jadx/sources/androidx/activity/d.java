package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1714b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i11) {
        this.f1713a = i11;
        this.f1714b = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f1713a;
        ComponentActivity componentActivity = this.f1714b;
        switch (i11) {
            case 0:
                int i12 = ComponentActivity.f1695a;
                componentActivity.reportFullyDrawn();
                return Unit.f26487a;
            case 1:
                return ComponentActivity.u(componentActivity);
            case 2:
                int i13 = ComponentActivity.f1695a;
                q9.a aVar = new q9.a();
                componentActivity.getNavigationEventDispatcher().b(aVar);
                return aVar;
            case 3:
                int i14 = ComponentActivity.f1695a;
                return new i1(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i15 = ComponentActivity.f1695a;
                OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new c(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.getLifecycle().a(new e(0, onBackPressedDispatcher, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a40.l(3, componentActivity, onBackPressedDispatcher));
                    }
                }
                return onBackPressedDispatcher;
        }
    }
}
