package com.braze.models;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import m90.m1;
import m90.r1;
import m90.v;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10135a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f10135a = cVar;
        e1 e1Var = new e1("com.braze.models.BrazeGeofence", cVar, 12);
        e1Var.j("id", false);
        e1Var.j("latitude", false);
        e1Var.j("longitude", false);
        e1Var.j(BrazeGeofence.RADIUS_METERS, false);
        e1Var.j(BrazeGeofence.COOLDOWN_ENTER_SECONDS, false);
        e1Var.j(BrazeGeofence.COOLDOWN_EXIT_SECONDS, false);
        e1Var.j(BrazeGeofence.ANALYTICS_ENABLED_ENTER, false);
        e1Var.j(BrazeGeofence.ANALYTICS_ENABLED_EXIT, false);
        e1Var.j(BrazeGeofence.ENTER_EVENTS, false);
        e1Var.j(BrazeGeofence.EXIT_EVENTS, false);
        e1Var.j(BrazeGeofence.NOTIFICATION_RESPONSIVENESS_MS, false);
        e1Var.j("distanceFromGeofenceRefresh", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        v vVar = v.f29868a;
        l0 l0Var = l0.f29821a;
        m90.g gVar = m90.g.f29797a;
        return new KSerializer[]{r1.f29848a, vVar, vVar, l0Var, l0Var, l0Var, gVar, gVar, gVar, gVar, l0Var, vVar};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        boolean zT4 = false;
        int iQ4 = 0;
        String strU = null;
        double dY = 0.0d;
        double dY2 = 0.0d;
        double dY3 = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strU = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    dY = aVarC.y(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    dY2 = aVarC.y(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iQ = aVarC.q(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    iQ2 = aVarC.q(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    iQ3 = aVarC.q(serialDescriptor, 5);
                    i11 |= 32;
                    break;
                case 6:
                    zT = aVarC.t(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    zT2 = aVarC.t(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                case 8:
                    zT3 = aVarC.t(serialDescriptor, 8);
                    i11 |= 256;
                    break;
                case 9:
                    zT4 = aVarC.t(serialDescriptor, 9);
                    i11 |= 512;
                    break;
                case 10:
                    iQ4 = aVarC.q(serialDescriptor, 10);
                    i11 |= 1024;
                    break;
                case 11:
                    dY3 = aVarC.y(serialDescriptor, 11);
                    i11 |= NewHope.SENDB_BYTES;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new BrazeGeofence(i11, strU, dY, dY2, iQ, iQ2, iQ3, zT, zT2, zT3, zT4, iQ4, dY3, (m1) null);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
        encoder.getClass();
        brazeGeofence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        BrazeGeofence.write$Self$android_sdk_base_release(brazeGeofence, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
