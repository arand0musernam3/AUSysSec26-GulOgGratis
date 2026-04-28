package oa0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f32365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f32367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32368d;

    public q(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f32365a = cls;
        this.f32366b = obj;
        this.f32367c = method;
        this.f32368d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f32365a.getName(), this.f32367c.getName(), this.f32368d);
    }
}
