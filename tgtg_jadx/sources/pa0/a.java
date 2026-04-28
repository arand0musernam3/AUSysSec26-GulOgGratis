package pa0;

import j30.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jb.b;
import n90.c;
import oa0.j;
import oa0.k;
import oa0.o0;
import oz.m;
import q90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f34622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34623b;

    public a(z zVar, b bVar) {
        this.f34622a = zVar;
        this.f34623b = bVar;
    }

    @Override // oa0.j
    public final k a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, o0 o0Var) {
        type.getClass();
        annotationArr2.getClass();
        b bVar = this.f34623b;
        return new g(this.f34622a, ba0.g.G(((c) bVar.f24851a).f30750b, type), bVar, 23);
    }

    @Override // oa0.j
    public final k b(Type type, Annotation[] annotationArr, o0 o0Var) {
        type.getClass();
        annotationArr.getClass();
        b bVar = this.f34623b;
        return new m(3, ba0.g.G(((c) bVar.f24851a).f30750b, type), bVar);
    }
}
