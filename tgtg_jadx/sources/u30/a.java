package u30;

import com.braze.h2;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40663a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f40664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f40665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f40668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f40669g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f40664b = hashSet;
        this.f40665c = new HashSet();
        this.f40666d = 0;
        this.f40667e = 0;
        this.f40669g = new HashSet();
        hashSet.add(o.a(cls));
        for (Class cls2 : clsArr) {
            android.support.v4.media.session.a.k(cls2, "Null interface");
            this.f40664b.add(o.a(cls2));
        }
    }

    public final void a(i iVar) {
        if (this.f40664b.contains(iVar.f40692a)) {
            i4.a.f("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.f40665c.add(iVar);
        }
    }

    public final b b() {
        if (this.f40668f != null) {
            return new b(this.f40663a, new HashSet(this.f40664b), new HashSet(this.f40665c), this.f40666d, this.f40667e, this.f40668f, this.f40669g);
        }
        h2.b("Missing required property: factory.");
        return null;
    }

    public final void c(int i11) {
        if (this.f40666d == 0) {
            this.f40666d = i11;
        } else {
            h2.b("Instantiation type has already been set.");
        }
    }

    public a(o oVar, o[] oVarArr) {
        HashSet hashSet = new HashSet();
        this.f40664b = hashSet;
        this.f40665c = new HashSet();
        this.f40666d = 0;
        this.f40667e = 0;
        this.f40669g = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            android.support.v4.media.session.a.k(oVar2, "Null interface");
        }
        Collections.addAll(this.f40664b, oVarArr);
    }
}
