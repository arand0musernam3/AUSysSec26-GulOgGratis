package m90;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f29819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f29820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(KClass kClass, KSerializer kSerializer) {
        super(kSerializer);
        kClass.getClass();
        kSerializer.getClass();
        this.f29819b = kClass;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.f29820c = new c(descriptor, 0);
    }

    @Override // m90.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // m90.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // m90.a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // m90.a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // m90.a
    public final Object g(Object obj) {
        throw null;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return this.f29820c;
    }

    @Override // m90.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        KClass kClass = this.f29819b;
        kClass.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) y9.w.v(kClass), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // m90.s
    public final void i(int i11, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i11, obj2);
    }
}
