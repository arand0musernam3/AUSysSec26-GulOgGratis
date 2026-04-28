package ew;

import android.os.Bundle;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f16499c;

    public /* synthetic */ a(int i11, Bundle bundle, String str) {
        this.f16497a = i11;
        this.f16498b = str;
        this.f16499c = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16497a) {
            case 0:
                return BrazeNotificationPayload.Companion.parseObjectAsInteger$lambda$5(this.f16498b, this.f16499c);
            case 1:
                return BrazeNotificationPayload.Companion.parseStringAsLong$lambda$7(this.f16498b, this.f16499c);
            case 2:
                return BrazeNotificationPayload.Companion.parseStringAsColorInt$lambda$13(this.f16498b, this.f16499c);
            case 3:
                return BrazeNotificationPayload.Companion.parseLong$lambda$10(this.f16498b, this.f16499c);
            case 4:
                return BrazeNotificationPayload.Companion.parseString$lambda$11(this.f16498b, this.f16499c);
            case 5:
                return BrazeNotificationPayload.Companion.parseStringAsBoolean$lambda$9(this.f16498b, this.f16499c);
            case 6:
                return BrazeNotificationPayload.Companion.parseNonBlankString$lambda$14(this.f16498b, this.f16499c);
            default:
                return BrazeNotificationPayload.Companion.parseStringAsInteger$lambda$3(this.f16498b, this.f16499c);
        }
    }
}
