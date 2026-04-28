package u30;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f40671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f40672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f40675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f40676g;

    public b(String str, Set set, Set set2, int i11, int i12, e eVar, Set set3) {
        this.f40670a = str;
        this.f40671b = Collections.unmodifiableSet(set);
        this.f40672c = Collections.unmodifiableSet(set2);
        this.f40673d = i11;
        this.f40674e = i12;
        this.f40675f = eVar;
        this.f40676g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static a b(o oVar) {
        return new a(oVar, new o[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(cls));
        for (Class cls2 : clsArr) {
            android.support.v4.media.session.a.k(cls2, "Null interface");
            hashSet.add(o.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new mp.a(obj, 15), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f40671b.toArray()) + ">{" + this.f40673d + ", type=" + this.f40674e + ", deps=" + Arrays.toString(this.f40672c.toArray()) + "}";
    }
}
