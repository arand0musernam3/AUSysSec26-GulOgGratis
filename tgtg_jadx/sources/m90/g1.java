package m90;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.f29800b = serialDescriptor.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f29800b;
    }
}
