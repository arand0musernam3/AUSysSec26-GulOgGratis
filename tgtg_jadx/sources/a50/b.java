package a50;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f819b;

    public b(Set set, c cVar) {
        this.f818a = b(set);
        this.f819b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f816a);
            sb2.append('/');
            sb2.append(aVar.f817b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f819b;
        synchronized (((HashSet) cVar.f822b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f822b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f818a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f822b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f822b);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
