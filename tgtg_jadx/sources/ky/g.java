package ky;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.d f26705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k8.d dVar, int i11) {
        super(0);
        this.f26704a = i11;
        this.f26705b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26704a) {
            case 0:
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f26705b.f26134b;
                devicePolicyManager.getClass();
                int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
                return storageEncryptionStatus != 0 ? storageEncryptionStatus != 1 ? storageEncryptionStatus != 2 ? storageEncryptionStatus != 3 ? storageEncryptionStatus != 5 ? "" : "active_per_user" : "active" : "activating" : "inactive" : "unsupported";
            default:
                KeyguardManager keyguardManager = (KeyguardManager) this.f26705b.f26135c;
                keyguardManager.getClass();
                return Boolean.valueOf(keyguardManager.isKeyguardSecure());
        }
    }
}
