package m90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f29770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(KSerializer kSerializer, int i11) {
        super(kSerializer);
        this.f29769b = i11;
        kSerializer.getClass();
        switch (i11) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.f29770c = new c(descriptor, 2);
                break;
            case 2:
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.f29770c = new c(descriptor2, 3);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                descriptor3.getClass();
                this.f29770c = new c(descriptor3, 1);
                break;
        }
    }

    @Override // m90.a
    public final Object a() {
        switch (this.f29769b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // m90.a
    public final int b(Object obj) {
        switch (this.f29769b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // m90.a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // m90.a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // m90.a
    public final Object g(Object obj) {
        switch (this.f29769b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f29769b) {
        }
        return (c) this.f29770c;
    }

    @Override // m90.a
    public final Object h(Object obj) {
        switch (this.f29769b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // m90.s
    public final void i(int i11, Object obj, Object obj2) {
        switch (this.f29769b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i11, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
