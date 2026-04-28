package atd.k;

import android.app.Application;
import atd.p.getSDKEphemeralPublicKey;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.d;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DefaultApplicationLocale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getLocales", "Ljava/util/Locale;", "position", "", "getLocale", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters implements getSDKReferenceNumber {
    private static int getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    @NotNull
    private final Application getSDKReferenceNumber;

    public AuthenticationRequestParameters(@NotNull Application application) {
        application.getClass();
        this.getSDKReferenceNumber = application;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getDeviceData;
        int i12 = ((i11 ^ 64) + ((i11 & 64) << 1)) - 1;
        getSDKTransactionID = i12 % 128;
        int i13 = i12 % 2;
        Locale locale = authenticationRequestParameters.getSDKReferenceNumber.getResources().getConfiguration().locale;
        locale.getClass();
        if (i13 == 0) {
            throw null;
        }
        int i14 = getSDKTransactionID;
        int i15 = (i14 ^ 80) + ((i14 & 80) << 1);
        getDeviceData = ((i15 ^ (-1)) + (i15 << 1)) % 128;
        return locale;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKTransactionID + 61;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        Locale locale = authenticationRequestParameters.getSDKReferenceNumber.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        int i13 = getSDKTransactionID;
        int i14 = ((i13 | 105) << 1) - (i13 ^ 105);
        getDeviceData = i14 % 128;
        if (i14 % 2 == 0) {
            return locale;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i14;
        int i18 = ~i15;
        int i19 = ~(i17 | i18);
        int i21 = ~(i17 | i12);
        int i22 = ~i12;
        int i23 = i22 | i14;
        int i24 = ~(i15 | i23);
        int i25 = i19 | i21 | i24;
        int i26 = i24 | (~(i17 | i22 | i18));
        int i27 = (~i23) | i21;
        int i28 = (833617920 * i11) + (1316749312 * i13) + ((-377225216) * i16) + ((-1410634874) * i27) + (1473697548 * i26) + ((-1473697548) * i25) + (1033409659 * i12) + ((-1787860089) * i14) + 959184896;
        int iC = a0.c(i11, -1595597844, ((-573665793) * i13) + i14 + i12 + i16);
        return a0.e(iC, 1827733504, (i11 * (-1943733020)) + ((i13 * 1405922725) + ((i16 * 2143800411) + ((i27 * 162) + ((i26 * 324) + ((i25 * (-324)) + ((i12 * 2143800249) + ((i14 * 2143800573) + (-1595758)))))))), -911933440, (497221632 * iC) + i28) != 1 ? getDeviceData(objArr) : getSDKAppID(objArr);
    }

    @Override // atd.k.getSDKReferenceNumber
    @d
    @NotNull
    public final Locale getSDKAppID() {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (Locale) getSDKReferenceNumber(getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), -853205831, new Object[]{this}, iAuthenticationRequestParameters3, 853205831, iAuthenticationRequestParameters, iAuthenticationRequestParameters2);
    }

    @Override // atd.k.getSDKReferenceNumber
    @NotNull
    public final Locale getDeviceData() {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (Locale) getSDKReferenceNumber(getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), 1012469691, new Object[]{this}, iAuthenticationRequestParameters3, -1012469690, iAuthenticationRequestParameters, iAuthenticationRequestParameters2);
    }
}
