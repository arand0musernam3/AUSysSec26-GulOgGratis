package z4;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w0, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f47248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.m f47249b;

    public y(u uVar, z5.m mVar) {
        this.f47248a = uVar;
        this.f47249b = mVar;
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f47248a.I(f11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f47248a.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return this.f47248a.R(f11);
    }

    @Override // z5.c
    public final float X() {
        return this.f47248a.X();
    }

    @Override // z4.u
    public final boolean Z() {
        return this.f47248a.Z();
    }

    @Override // z5.c
    public final float a() {
        return this.f47248a.a();
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f47248a.c0(f11);
    }

    @Override // z4.u
    public final z5.m getLayoutDirection() {
        return this.f47249b;
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f47248a.j0(j9);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f47248a.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f47248a.m(j9);
    }

    @Override // z4.w0
    public final v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if ((i11 & RoundCornerImageView.DEFAULT_STROKE_COLOR) != 0 || ((-16777216) & i12) != 0) {
            y4.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new x(i11, i12, map, function1);
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f47248a.q0(f11);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f47248a.t(j9);
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f47248a.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f47248a.z0(j9);
    }
}
