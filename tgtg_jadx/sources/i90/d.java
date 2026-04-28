package i90;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.n0;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends m90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f23585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23587c;

    public d(KClass kClass) {
        kClass.getClass();
        this.f23585a = kClass;
        this.f23586b = n0.f26529a;
        this.f23587c = l.a(m.PUBLICATION, new hi.d(this, 13));
    }

    @Override // m90.b
    public final KClass c() {
        return this.f23585a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f23587c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f23585a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(KClass kClass, Annotation[] annotationArr) {
        this(kClass);
        kClass.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f23586b = listAsList;
    }
}
