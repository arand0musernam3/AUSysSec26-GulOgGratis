package com.tgtg.componentlibrary.component.p000switch;

import j5.b0;
import j5.z;
import k4.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lv.s;
import lv.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13311b;

    public /* synthetic */ e(boolean z11, int i11) {
        this.f13310a = i11;
        this.f13311b = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13310a) {
            case 0:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                z.o(this.f13311b ? "on" : "off", b0Var);
                break;
            case 1:
                d dVar = (d) obj;
                dVar.getClass();
                float f11 = 2;
                d.w0(dVar, this.f13311b ? s.E : s.f28217b, dVar.c0(t.f28249c), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() >> 32)) / f11)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / f11)) & 4294967295L), null, 120);
                break;
            default:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                z.o(this.f13311b ? "selected" : "not selected", b0Var2);
                break;
        }
        return Unit.f26487a;
    }
}
