package j6;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {
    public static g j(String str) {
        g gVar = new g(str.toCharArray());
        gVar.f24741b = 0L;
        long length = str.length() - 1;
        if (gVar.f24742c == LongCompanionObject.MAX_VALUE) {
            gVar.f24742c = length;
            b bVar = gVar.f24743d;
            if (bVar != null) {
                bVar.j(gVar);
            }
        }
        return gVar;
    }

    @Override // j6.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && c().equals(((g) obj).c())) {
            return true;
        }
        return super.equals(obj);
    }
}
