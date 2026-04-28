package m90;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f29806b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.f29806b = new g1(kSerializer.getDescriptor());
    }

    @Override // m90.a
    public final Object a() {
        return (f1) g(j());
    }

    @Override // m90.a
    public final int b(Object obj) {
        f1 f1Var = (f1) obj;
        f1Var.getClass();
        return f1Var.d();
    }

    @Override // m90.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // m90.a, i90.b
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return this.f29806b;
    }

    @Override // m90.a
    public final Object h(Object obj) {
        f1 f1Var = (f1) obj;
        f1Var.getClass();
        return f1Var.a();
    }

    @Override // m90.s
    public final void i(int i11, Object obj, Object obj2) {
        ((f1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(l90.b bVar, Object obj, int i11);

    @Override // m90.s, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int iD = d(obj);
        g1 g1Var = this.f29806b;
        l90.b bVarX = encoder.x(g1Var);
        k(bVarX, obj, iD);
        bVarX.b(g1Var);
    }
}
