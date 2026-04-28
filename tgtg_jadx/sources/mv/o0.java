package mv;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends androidx.lifecycle.k0 {
    public final SharedPreferences l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f30206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f30207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n0 f30208o = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: mv.n0
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            o0 o0Var = this.f30205a;
            if (Intrinsics.areEqual(str, o0Var.f30206m)) {
                String str2 = o0Var.f30207n;
                str.getClass();
                str2.getClass();
                String string = o0Var.l.getString(str, str2);
                string.getClass();
                o0Var.k(string);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [mv.n0] */
    public o0(SharedPreferences sharedPreferences, String str, String str2) {
        this.l = sharedPreferences;
        this.f30206m = str;
        this.f30207n = str2;
    }

    @Override // androidx.lifecycle.k0
    public final void g() {
        String str = this.f30206m;
        str.getClass();
        String str2 = this.f30207n;
        str2.getClass();
        String string = this.l.getString(str, str2);
        string.getClass();
        k(string);
        this.l.registerOnSharedPreferenceChangeListener(this.f30208o);
    }

    @Override // androidx.lifecycle.k0
    public final void h() {
        this.l.unregisterOnSharedPreferenceChangeListener(this.f30208o);
    }
}
