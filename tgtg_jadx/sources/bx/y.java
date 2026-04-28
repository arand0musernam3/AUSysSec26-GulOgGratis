package bx;

import android.content.SharedPreferences;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6761c;

    public /* synthetic */ y(String str, String str2, int i11) {
        this.f6759a = i11;
        this.f6760b = str;
        this.f6761c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f6759a;
        String str = this.f6761c;
        String str2 = this.f6760b;
        switch (i11) {
            case 0:
                if (!yx.a.f46339a.contains(z.class)) {
                    try {
                        str.getClass();
                        if (!z.f6764c.get()) {
                            z.f6762a.b();
                        }
                        SharedPreferences sharedPreferences = z.f6763b;
                        if (sharedPreferences == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                            sharedPreferences = null;
                        }
                        sharedPreferences.edit().putString(str2, str).apply();
                    } catch (Throwable th2) {
                        yx.a.a(z.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                str.getClass();
                HashSet hashSet = rx.f.f38262e;
                rx.a.j(str2, str, new float[0]);
                break;
        }
    }
}
