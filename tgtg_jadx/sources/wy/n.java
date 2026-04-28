package wy;

import androidx.lifecycle.n1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements ty.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f43584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f43585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f43586c;

    public n(Set set, i iVar, p pVar) {
        this.f43584a = set;
        this.f43585b = iVar;
        this.f43586c = pVar;
    }

    public final n1 a(String str, ty.c cVar, ty.e eVar) {
        Set set = this.f43584a;
        if (set.contains(cVar)) {
            return new n1(this.f43585b, str, cVar, eVar, this.f43586c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
