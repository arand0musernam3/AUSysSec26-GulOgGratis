package w;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import b0.e2;
import e0.k1;
import e0.r1;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import s0.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements s0.y, r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f42796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.k0 f42797b;

    public y(k1 k1Var, e0.k0 k0Var) {
        k1Var.getClass();
        this.f42796a = k1Var;
        this.f42797b = k0Var;
    }

    @Override // s0.y
    public final k2 b() {
        return (k2) this.f42796a.b(e2.f5145a, k2.f38372b);
    }

    @Override // s0.y
    public final s0.x c() {
        f0.o metadata = this.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        Integer num = (Integer) metadata.c(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return s0.x.NONE;
        }
        if (num != null && num.intValue() == 2) {
            return s0.x.READY;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) {
            return s0.x.FIRED;
        }
        if (num == null) {
            return s0.x.UNKNOWN;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) e0.l0.a(metadata.f16792a.getFrameNumber())) + '!');
        }
        return s0.x.UNKNOWN;
    }

    @Override // s0.y
    public final void d(v0.i iVar) {
        super.d(iVar);
        ArrayList arrayList = iVar.f41611a;
        f0.o metadata = this.f42797b.getMetadata();
        try {
            CaptureResult.Key key = CaptureResult.JPEG_ORIENTATION;
            key.getClass();
            Integer num = (Integer) metadata.c(key);
            if (num != null) {
                iVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key2 = CaptureResult.SENSOR_EXPOSURE_TIME;
        key2.getClass();
        if (((Long) metadata.c(key2)) != null) {
            iVar.c("ExposureTime", String.valueOf(r2.longValue() / 1000000000), arrayList);
        }
        CaptureResult.Key key3 = CaptureResult.LENS_APERTURE;
        key3.getClass();
        Float f11 = (Float) metadata.c(key3);
        if (f11 != null) {
            iVar.c("FNumber", String.valueOf(f11.floatValue()), arrayList);
        }
        CaptureResult.Key key4 = CaptureResult.SENSOR_SENSITIVITY;
        key4.getClass();
        Integer num2 = (Integer) metadata.c(key4);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            iVar.c("SensitivityType", String.valueOf(3), arrayList);
            iVar.c("PhotographicSensitivity", String.valueOf(Math.min(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, iIntValue)), arrayList);
            CaptureResult.Key key5 = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            key5.getClass();
            if (((Integer) metadata.c(key5)) != null) {
                iVar.c("SensitivityType", String.valueOf(3), arrayList);
                iVar.c("PhotographicSensitivity", String.valueOf(Math.min(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, iIntValue * ((int) (r6.intValue() / 100.0f)))), arrayList);
            }
        }
        CaptureResult.Key key6 = CaptureResult.LENS_FOCAL_LENGTH;
        key6.getClass();
        Float f12 = (Float) metadata.c(key6);
        if (f12 != null) {
            iVar.c("FocalLength", ((long) (f12.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_MODE;
        key7.getClass();
        Integer num3 = (Integer) metadata.c(key7);
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            v0.j jVar = v0.j.AUTO;
            if (iIntValue2 == 0) {
                jVar = v0.j.MANUAL;
            }
            int iOrdinal = jVar.ordinal();
            iVar.c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // s0.y
    public final s0.w f() {
        f0.o metadata = this.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        Integer num = (Integer) metadata.c(key);
        if (num != null && num.intValue() == 0) {
            return s0.w.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return s0.w.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return s0.w.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return s0.w.LOCKED;
        }
        if (num == null) {
            return s0.w.UNKNOWN;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) e0.l0.a(metadata.f16792a.getFrameNumber())) + '!');
        }
        return s0.w.UNKNOWN;
    }

    @Override // s0.y
    public final long getTimestamp() {
        f0.o metadata = this.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        metadata.getClass();
        Object objC = metadata.c(key);
        return ((Number) (objC != null ? objC : -1L)).longValue();
    }

    @Override // s0.y
    public final s0.s h() {
        f0.o metadata = this.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        Integer num = (Integer) metadata.c(key);
        if (num != null && num.intValue() == 0) {
            return s0.s.INACTIVE;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return s0.s.SEARCHING;
        }
        if (num != null && num.intValue() == 4) {
            return s0.s.FLASH_REQUIRED;
        }
        if (num != null && num.intValue() == 2) {
            return s0.s.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return s0.s.LOCKED;
        }
        if (num == null) {
            return s0.s.UNKNOWN;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) e0.l0.a(metadata.f16792a.getFrameNumber())) + '!');
        }
        return s0.s.UNKNOWN;
    }

    @Override // s0.y
    public final CaptureResult i() {
        Object objT = t(Reflection.getOrCreateKotlinClass(TotalCaptureResult.class));
        if (objT != null) {
            return (CaptureResult) objT;
        }
        qc.y.j("Failed to unwrap ", this, " as TotalCaptureResult");
        return null;
    }

    @Override // s0.y
    public final s0.u l() {
        f0.o metadata = this.f42797b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        Integer num = (Integer) metadata.c(key);
        if (num != null && num.intValue() == 0) {
            return s0.u.INACTIVE;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return s0.u.SCANNING;
        }
        if (num != null && num.intValue() == 4) {
            return s0.u.LOCKED_FOCUSED;
        }
        if (num != null && num.intValue() == 5) {
            return s0.u.LOCKED_NOT_FOCUSED;
        }
        if (num != null && num.intValue() == 2) {
            return s0.u.PASSIVE_FOCUSED;
        }
        if (num != null && num.intValue() == 6) {
            return s0.u.PASSIVE_NOT_FOCUSED;
        }
        if (num == null) {
            return s0.u.UNKNOWN;
        }
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) e0.l0.a(metadata.f16792a.getFrameNumber())) + '!');
        }
        return s0.u.UNKNOWN;
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        boolean zD = r8.k.D(kClass, e0.k0.class, kClass);
        e0.k0 k0Var = this.f42797b;
        return zD ? k0Var : k0Var.t(kClass);
    }
}
