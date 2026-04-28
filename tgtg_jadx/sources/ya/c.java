package ya;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f45782c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45784b;

    public c(String str, String str2) {
        this.f45783a = str;
        this.f45784b = str2;
        f45782c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f45780a;
        String str = this.f45784b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
