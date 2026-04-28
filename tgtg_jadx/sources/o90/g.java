package o90;

import org.bouncycastle.crypto.hpke.HPKE;
import u70.c0;
import u70.f0;
import u70.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends c40.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32167c;

    public g(androidx.constraintlayout.widget.z zVar, boolean z11) {
        super(zVar);
        this.f32167c = z11;
    }

    @Override // c40.i
    public final void i(byte b8) {
        if (this.f32167c) {
            u70.v vVar = u70.w.f40862b;
            o(String.valueOf(b8 & 255));
        } else {
            u70.v vVar2 = u70.w.f40862b;
            m(String.valueOf(b8 & 255));
        }
    }

    @Override // c40.i
    public final void k(int i11) {
        if (this.f32167c) {
            u70.y yVar = u70.z.f40865b;
            o(Integer.toUnsignedString(i11));
        } else {
            u70.y yVar2 = u70.z.f40865b;
            m(Integer.toUnsignedString(i11));
        }
    }

    @Override // c40.i
    public final void l(long j9) {
        if (this.f32167c) {
            u70.b0 b0Var = c0.f40833b;
            o(Long.toUnsignedString(j9));
        } else {
            u70.b0 b0Var2 = c0.f40833b;
            m(Long.toUnsignedString(j9));
        }
    }

    @Override // c40.i
    public final void n(short s7) {
        if (this.f32167c) {
            f0 f0Var = g0.f40838b;
            o(String.valueOf(s7 & HPKE.aead_EXPORT_ONLY));
        } else {
            f0 f0Var2 = g0.f40838b;
            m(String.valueOf(s7 & HPKE.aead_EXPORT_ONLY));
        }
    }
}
