package com.braze.models;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f10155a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f10155a = iVar;
        e1 e1Var = new e1("com.braze.models.FeatureFlag", iVar, 4);
        e1Var.j("id", false);
        e1Var.j(FeatureFlag.ENABLED, false);
        e1Var.j("properties", false);
        e1Var.j(FeatureFlag.TRACKING_STRING, true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, m90.g.f29797a, r1Var, f0.B(r1Var)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        boolean zT = false;
        String strU = null;
        String strU2 = null;
        String str = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                zT = aVarC.t(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                strU2 = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            } else {
                if (iW != 3) {
                    w.e(iW);
                    return null;
                }
                str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                i11 |= 8;
            }
        }
        aVarC.b(serialDescriptor);
        return new FeatureFlag(i11, strU, zT, strU2, str, (m1) null);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FeatureFlag featureFlag = (FeatureFlag) obj;
        encoder.getClass();
        featureFlag.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        FeatureFlag.write$Self$android_sdk_base_release(featureFlag, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
