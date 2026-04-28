package u40;

import android.text.TextUtils;
import java.util.regex.Pattern;
import ky.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f40763b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f40764c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f40765a;

    public j(p pVar) {
        this.f40765a = pVar;
    }

    public final boolean a(v40.b bVar) {
        if (TextUtils.isEmpty(bVar.f42008c)) {
            return true;
        }
        long j9 = bVar.f42011f + bVar.f42010e;
        this.f40765a.getClass();
        return j9 < (System.currentTimeMillis() / 1000) + 3600;
    }
}
