package ax;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4990a;

    public p0(SharedPreferences sharedPreferences, int i11) {
        switch (i11) {
            case 2:
                sharedPreferences.getClass();
                this.f4990a = sharedPreferences;
                break;
            default:
                sharedPreferences.getClass();
                this.f4990a = sharedPreferences;
                break;
        }
    }

    public void a(String str) {
        str.getClass();
        this.f4990a.edit().remove(str).commit();
    }

    public long b(String str, long j9) {
        str.getClass();
        return this.f4990a.getLong(str, j9);
    }

    public boolean c(long j9, String str) {
        str.getClass();
        return this.f4990a.edit().putLong(str, j9).commit();
    }

    public p0() {
        SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this.f4990a = sharedPreferences;
    }
}
