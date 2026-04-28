package v0;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration f41606a;

    public h(i iVar) {
        this.f41606a = Collections.enumeration(iVar.f41611a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f41606a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f41606a.nextElement());
    }
}
