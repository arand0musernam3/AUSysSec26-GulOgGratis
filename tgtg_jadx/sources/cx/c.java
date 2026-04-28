package cx;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f13461d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13464c;

    public c(String str, List list, String str2) {
        this.f13462a = str;
        this.f13463b = str2;
        this.f13464c = list;
    }

    public static final CopyOnWriteArraySet a() {
        if (yx.a.f46339a.contains(c.class)) {
            return null;
        }
        try {
            return f13461d;
        } catch (Throwable th2) {
            yx.a.a(c.class, th2);
            return null;
        }
    }

    public final String b() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return this.f13462a;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
