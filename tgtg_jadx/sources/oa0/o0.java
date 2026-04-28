package oa0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f32356a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q90.d0 f32357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q90.v f32358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f32360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f32361f;

    public o0(q90.d0 d0Var, q90.v vVar, List list, List list2, Executor executor) {
        this.f32357b = d0Var;
        this.f32358c = vVar;
        this.f32359d = list;
        this.f32360e = list2;
        this.f32361f = executor;
    }

    public final f a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f32360e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            f fVarA = ((e) list.get(i11)).a(type, annotationArr, this);
            if (fVarA != null) {
                return fVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((e) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object b(Class cls) {
        if (!cls.isInterface()) {
            i4.a.f("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new lx.i(this, cls));
    }

    public final k c(mt.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f32359d;
        int iIndexOf = list.indexOf(aVar) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            k kVarB = ((j) list.get(i11)).b(type, annotationArr, this);
            if (kVarB != null) {
                return kVarB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i12 = 0; i12 < iIndexOf; i12++) {
                sb2.append("\n   * ");
                sb2.append(((j) list.get(i12)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final k d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f32359d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            k kVarA = ((j) list.get(i11)).a(type, annotationArr, annotationArr2, this);
            if (kVarA != null) {
                return kVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f32359d;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((j) list.get(i11)).getClass();
        }
    }
}
