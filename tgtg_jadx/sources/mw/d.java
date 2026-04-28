package mw;

import com.braze.communication.dust.h;
import com.braze.communication.dust.i;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.ReflectionUtils;
import com.braze.support.ValidationUtils;
import com.braze.support.WebContentUtils;
import com.braze.support.k;
import com.braze.support.q;
import com.braze.support.s;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30224b;

    public /* synthetic */ d(String str, int i11) {
        this.f30223a = i11;
        this.f30224b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30223a) {
            case 0:
                return BrazeLogger.e$lambda$6(this.f30224b);
            case 1:
                return BrazeLogger.w$lambda$5(this.f30224b);
            case 2:
                return BrazeLogger.i$lambda$4(this.f30224b);
            case 3:
                return BrazeLogger.v$lambda$2(this.f30224b);
            case 4:
                return DateTimeUtils.parseDate$lambda$2(this.f30224b);
            case 5:
                return JsonUtils.mergeJsonObjects$lambda$3$lambda$2(this.f30224b);
            case 6:
                return JsonUtils.mergeJsonObjects$lambda$5$lambda$4(this.f30224b);
            case 7:
                return PermissionUtils.hasPermission$lambda$0(this.f30224b);
            case 8:
                return PermissionUtils.incrementPermissionRequestCount$lambda$11(this.f30224b);
            case 9:
                return ReflectionUtils.getDeclaredMethodQuietly$lambda$3(this.f30224b);
            case 10:
                return ValidationUtils.isValidLogCustomEventInput$lambda$9(this.f30224b);
            case 11:
                return ValidationUtils.isValidLogPurchaseInput$lambda$2(this.f30224b);
            case 12:
                return ValidationUtils.isValidLogPurchaseInput$lambda$4(this.f30224b);
            case 13:
                return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$12(this.f30224b);
            case 14:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(this.f30224b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(this.f30224b);
            case 16:
                return com.braze.support.c.a(this.f30224b);
            case 17:
                return com.braze.support.d.a(this.f30224b);
            case 18:
                return com.braze.support.d.b(this.f30224b);
            case 19:
                return k.a(this.f30224b);
            case 20:
                return q.b(this.f30224b);
            case 21:
                return s.a(this.f30224b);
            case 22:
                return h.a(this.f30224b);
            case 23:
                return i.a(this.f30224b);
            case 24:
                return i.b(this.f30224b);
            case 25:
                return i.c(this.f30224b);
            case 26:
                return i.d(this.f30224b);
            case 27:
                return com.braze.triggers.managers.a.a(this.f30224b);
            case 28:
                return com.braze.triggers.managers.b.f(this.f30224b);
            default:
                return com.braze.triggers.managers.b.e(this.f30224b);
        }
    }
}
