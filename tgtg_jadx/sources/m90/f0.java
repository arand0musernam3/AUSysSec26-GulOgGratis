package m90;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f29794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(KSerializer kSerializer, KSerializer kSerializer2, int i11) {
        super(kSerializer, kSerializer2);
        this.f29793c = i11;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i11) {
            case 1:
                super(kSerializer, kSerializer2);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.f29794d = new e0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.f29794d = new e0("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // m90.a
    public final Object a() {
        switch (this.f29793c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // m90.a
    public final int b(Object obj) {
        int size;
        switch (this.f29793c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // m90.a
    public final Iterator c(Object obj) {
        switch (this.f29793c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // m90.a
    public final int d(Object obj) {
        switch (this.f29793c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // m90.a
    public final Object g(Object obj) {
        switch (this.f29793c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f29793c) {
        }
        return this.f29794d;
    }

    @Override // m90.a
    public final Object h(Object obj) {
        switch (this.f29793c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }
}
