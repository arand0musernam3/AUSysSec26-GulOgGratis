package o90;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.bouncycastle.crypto.hpke.HPKE;
import u70.c0;
import u70.f0;
import u70.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends na0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32156f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f32157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f32158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f32159i;

    public b(n nVar, String str) {
        this.f32157g = nVar;
        this.f32158h = str;
        this.f32159i = nVar.f32177b.f30750b;
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public void A(long j9) {
        switch (this.f32156f) {
            case 1:
                u70.b0 b0Var = c0.f40833b;
                x0(Long.toUnsignedString(j9));
                break;
            default:
                super.A(j9);
                break;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public void D(String str) {
        switch (this.f32156f) {
            case 0:
                str.getClass();
                this.f32157g.L(this.f32158h, new n90.v(str, false, (SerialDescriptor) this.f32159i));
                break;
            default:
                super.D(str);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final i2.x a() {
        switch (this.f32156f) {
            case 0:
                return this.f32157g.f32177b.f30750b;
            default:
                return (i2.x) this.f32159i;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public void h(short s7) {
        switch (this.f32156f) {
            case 1:
                f0 f0Var = g0.f40838b;
                x0(String.valueOf(s7 & HPKE.aead_EXPORT_ONLY));
                break;
            default:
                super.h(s7);
                break;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public void j(byte b8) {
        switch (this.f32156f) {
            case 1:
                u70.v vVar = u70.w.f40862b;
                x0(String.valueOf(b8 & 255));
                break;
            default:
                super.j(b8);
                break;
        }
    }

    @Override // na0.a, kotlinx.serialization.encoding.Encoder
    public void u(int i11) {
        switch (this.f32156f) {
            case 1:
                u70.y yVar = u70.z.f40865b;
                x0(Integer.toUnsignedString(i11));
                break;
            default:
                super.u(i11);
                break;
        }
    }

    public void x0(String str) {
        str.getClass();
        this.f32157g.L(this.f32158h, new n90.v(str, false, null));
    }

    public b(n nVar, String str, SerialDescriptor serialDescriptor) {
        this.f32157g = nVar;
        this.f32158h = str;
        this.f32159i = serialDescriptor;
    }
}
